package com.noonight.pc.tasks.presenter;


import com.noonight.pc.tasks.common.database.models.Task;
import com.noonight.pc.tasks.common.preInterface.model.task.LoadTaskCallback;
import com.noonight.pc.tasks.common.preInterface.presenter.TaskPresenterViewI;
import com.noonight.pc.tasks.common.preInterface.view.MainView;
import com.noonight.pc.tasks.common.preInterface.view.TasksView;
import com.noonight.pc.tasks.model.TaskModel;

import java.util.List;

public class TaskPresenterView implements TaskPresenterViewI {

    private TasksView view;
    private final TaskModel model;

    public TaskPresenterView(TaskModel model) {
        this.model = model;
    }

    @Override
    public void loadTasks() {
        model.loadTasks(new LoadTaskCallback() {
            @Override
            public void onLoad(List<Task> tasks) {
                view.showTasks();
            }
        });
    }

    @Override
    public void addTask() {

    }

    @Override
    public void deleteTask() {

    }

    @Override
    public void deleteTasks() {

    }

    @Override
    public void update() {

    }

    @Override
    public void attachView(MainView mainView) {
        view = (TasksView) mainView;
    }

    @Override
    public void detachView() {
        view = null;
    }

    @Override
    public void viewIsReady() {

    }
}
