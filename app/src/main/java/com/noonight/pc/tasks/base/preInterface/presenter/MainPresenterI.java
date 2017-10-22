package com.noonight.pc.tasks.base.preInterface.presenter;


import com.noonight.pc.tasks.base.preInterface.view.ParentView;

public interface MainPresenterI {

    void attachView(ParentView parentView);

    void detachView();

    void viewIsReady();
}
