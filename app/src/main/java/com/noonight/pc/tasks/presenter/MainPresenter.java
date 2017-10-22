package com.noonight.pc.tasks.presenter;

import com.noonight.pc.tasks.base.preInterface.presenter.MainPresenterI;
import com.noonight.pc.tasks.base.preInterface.view.ParentView;
import com.noonight.pc.tasks.model.TaskModel;

public class MainPresenter implements MainPresenterI {

    private ParentView view;
    private final TaskModel model;

    public MainPresenter(TaskModel model) {
        this.model = model;
    }

    @Override
    public void attachView(ParentView parentView) {
        view = parentView;
    }

    @Override
    public void detachView() {
        view = null;
    }

    @Override
    public void viewIsReady() {

    }
}
