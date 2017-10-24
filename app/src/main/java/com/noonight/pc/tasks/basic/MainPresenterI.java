package com.noonight.pc.tasks.basic;


import com.noonight.pc.tasks.basic.Mvp;

public interface MainPresenterI {

    void attachView(Mvp mvp);

    void detachView();

    void viewIsReady();
}
