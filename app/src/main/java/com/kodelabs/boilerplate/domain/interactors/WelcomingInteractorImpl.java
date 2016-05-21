package com.kodelabs.boilerplate.domain.interactors;

import com.kodelabs.boilerplate.domain.interactors.base.AbstractInteractor;

/**
 * Created by huynhducthanhphong on 5/21/16.
 */

// TODO: 5/21/16 5 hiện thực Interactor interface bằng cách extend class AbstractInteractor và hiện thực run()
public class WelcomingInteractorImpl extends AbstractInteractor implements WelcomingInteractor{

    @Override
    public void run() {

        // TODO: 5/21/16 5_1 retrieve the message and sends the message or the error to the UI to display it.
        // retrieve the message
        final String message = mMessageRepository.getWelcomeMessage();

        // check if we have failed to retrieve our message
        if (message == null || message.length() == 0) {

            // notify the failure on the main thread
            notifyError();

            return;
        }

        // we have retrieved our message, notify the UI on the main thread
        postMessage(message);
    }

    // TODO: 5/21/16 6 mCallback: là biến hiện thực interface WelcomingInteractor
    private void notifyError() {
        mMainThread.post(new Runnable() {
            @Override
            public void run() {
                mCallback.onRetrievalFailed("Nothing to welcome you with :(");
            }
        });
    }

    // TODO: 5/21/16 7 
    private void postMessage(final String msg) {
        mMainThread.post(new Runnable() {
            @Override
            public void run() {
                mCallback.onMessageRetrieved(msg);
            }
        });
    }
}
