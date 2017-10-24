package com.noonight.pc.tasks.presenter;

import com.noonight.pc.tasks.base.preInterface.presenter.ParentTaskActivityPresenterI;
import com.noonight.pc.tasks.base.preInterface.view.Mvp;
import com.noonight.pc.tasks.base.preInterface.view.ParentView;
import com.noonight.pc.tasks.common.extensions.Log;
import com.noonight.pc.tasks.model.TaskModel;

public class ParentActivityPresenterI implements ParentTaskActivityPresenterI {

    private ParentView view;
    private final TaskModel model;

    public ParentActivityPresenterI(TaskModel model) {
        this.model = model;
    }

    @Override
    public void attachView(Mvp mvp) {
        view = (ParentView) mvp;
    }

    @Override
    public void detachView() {
        view = null;
    }

    @Override
    public void viewIsReady() {
        Log.d("View is ready");
    }

    @Override
    public void openAddActivity() {
        view.openAddActivty();
    }

    @Override
    public ParentActivityPresenterI getThis() {
        return this;
    }

    @Override
    public void deleteTasks() {
        view.deleteTasks();
    }
}
