package com.kodelabs.boilerplate.domain.interactors.base;


/**
 * This is the main interface of an interactor. Each interactor serves a specific use case.
 */
// TODO: 5/21/16 4 interface cha này có 1 hàm execute() để chạy trong background.
public interface Interactor {

    /**
     * This is the main method that starts an interactor. It will make sure that the interactor operation is done on a
     * background thread.
     */
    void execute();
}
