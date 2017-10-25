package com.noonight.pc.tasks.presenter;

import com.noonight.pc.tasks.base.preInterface.presenter.AddPresenter;
import com.noonight.pc.tasks.base.preInterface.view.AddView;
import com.noonight.pc.tasks.basic.Mvp;
import com.noonight.pc.tasks.model.TaskModel;

/**
 * Created by Admin on 25.10.2017.
 */

public class AddPresenterImpl implements AddPresenter {

    private final TaskModel model;
    private AddView view;

    public AddPresenterImpl(TaskModel model) {
        this.model = model;
    }


    @Override
    public void attachView(Mvp mvp) {
        view = (AddView) mvp;
    }

    @Override
    public void detachView() {
        view = null;
    }

    @Override
    public void viewIsReady() {

    }

    @Override
    public void addTask() {

    }

    @Override
    public void onSaveClicked() {

    }

    @Override
    public void onCancelClicked() {

    }

    @Override
    public void onBackClicked() {

    }
}
