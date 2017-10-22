package com.noonight.pc.tasks.presenter;


import com.noonight.pc.tasks.common.database.models.Task;
import com.noonight.pc.tasks.base.preInterface.model.task.LoadTasksCallback;
import com.noonight.pc.tasks.base.preInterface.presenter.TaskPresenterViewI;
import com.noonight.pc.tasks.base.preInterface.view.ParentView;
import com.noonight.pc.tasks.base.preInterface.view.TasksView;
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
        model.loadTasks(new LoadTasksCallback() {
            @Override
            public void onLoad(List<Task> tasks) {
                view.showTasks();
            }
        });
    }

    @Override
    public void loadTask() {

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
    public void attachView(ParentView parentView) {
        view = (TasksView) parentView;
    }

    @Override
    public void detachView() {
        view = null;
    }

    @Override
    public void viewIsReady() {

    }
}
