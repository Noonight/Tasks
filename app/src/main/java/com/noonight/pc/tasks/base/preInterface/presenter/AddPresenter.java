package com.noonight.pc.tasks.base.preInterface.presenter;

import com.noonight.pc.tasks.basic.MainPresenterI;

/**
 * Created by Admin on 25.10.2017.
 */

public interface AddPresenter extends MainPresenterI {

    void addTask();

    void onSaveClicked();

    void onCancelClicked();

    void onBackClicked();

}
