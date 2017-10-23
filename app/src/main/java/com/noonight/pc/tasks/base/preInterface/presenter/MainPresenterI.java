package com.noonight.pc.tasks.base.preInterface.presenter;


import com.noonight.pc.tasks.base.preInterface.view.Mvp;
import com.noonight.pc.tasks.base.preInterface.view.ParentView;

public interface MainPresenterI {

    void attachView(Mvp mvp);

    void detachView();

    void viewIsReady();
}
