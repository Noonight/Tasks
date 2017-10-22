package com.noonight.pc.tasks.common.preInterface.presenter;


import com.noonight.pc.tasks.common.preInterface.view.MainView;

public interface MainPresenterI {

    void attachView(MainView mainView);

    void detachView();

    void viewIsReady();
}
