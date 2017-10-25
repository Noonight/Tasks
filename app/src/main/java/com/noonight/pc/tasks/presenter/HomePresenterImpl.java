package com.noonight.pc.tasks.presenter;

import com.noonight.pc.tasks.base.preInterface.model.task.callback.CompleteCallback;
import com.noonight.pc.tasks.base.preInterface.presenter.HomePresenter;
import com.noonight.pc.tasks.basic.Mvp;
import com.noonight.pc.tasks.base.preInterface.view.HomeView;
import com.noonight.pc.tasks.common.extensions.Log;
import com.noonight.pc.tasks.model.TaskModel;

public class HomePresenterImpl implements HomePresenter {

    private HomeView view;
    private final TaskModel model;

    public HomePresenterImpl(TaskModel model) {
        this.model = model;
    }

    @Override
    public void attachView(Mvp mvp) {
        view = (HomeView) mvp;
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
    public void onMenuDeleteClicked() {

    }

    @Override
    public void deleteTasks() {
        model.deleteTasks(new CompleteCallback() {
            @Override
            public void onComplete() {

            }
        });
    }
}
