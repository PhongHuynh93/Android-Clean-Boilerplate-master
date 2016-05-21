package com.kodelabs.boilerplate.domain.interactors;

import com.kodelabs.boilerplate.domain.interactors.base.Interactor;

/**
 * Created by huynhducthanhphong on 5/21/16.
 */
// TODO: 5/21/16 1 tạo Interface con, thường thì ta lập trình từ lớp trong ra lớp ngoài -> test kỹ -> sau đó mới hiện thực code Android
public interface WelcomingInteractor extends Interactor {

    // TODO: 5/21/16 2 ta lại tạo  1 interface con lý do trong interface -> lý do để cho method interface này ko cần đặt tên là WelcomingInteractor
    interface Callback {
        // TODO: 5/21/16 3 các hàm callback này for talking to the UI on the main thread
        void onMessageRetrieved(String message);

        void onRetrievalFailed(String error);
    }
}
