package com.noonight.pc.tasks.presenter;

import com.noonight.pc.tasks.common.preInterface.presenter.MainPresenterI;
import com.noonight.pc.tasks.common.preInterface.view.MainView;
import com.noonight.pc.tasks.model.TaskModel;

public class MainPresenter implements MainPresenterI {

    private MainView view;
    private final TaskModel model;

    public MainPresenter(TaskModel model) {
        this.model = model;
    }

    @Override
    public void attachView(MainView mainView) {
        view = mainView;
    }

    @Override
    public void detachView() {
        view = null;
    }

    @Override
    public void viewIsReady() {

    }
}
