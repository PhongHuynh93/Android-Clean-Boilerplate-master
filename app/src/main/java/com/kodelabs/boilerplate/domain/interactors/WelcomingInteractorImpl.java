package com.kodelabs.boilerplate.domain.interactors;

import com.kodelabs.boilerplate.domain.interactors.base.AbstractInteractor;

/**
 * Created by huynhducthanhphong on 5/21/16.
 */

// TODO: 5/21/16 5 hiện thực Interactor interface bằng cách extend class AbstractInteractor và hiện thực run()
public class WelcomingInteractorImpl extends AbstractInteractor implements WelcomingInteractor{

    @Override
    public void run() {
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
}
