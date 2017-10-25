package com.noonight.pc.tasks.presenter;

import com.noonight.pc.tasks.base.preInterface.model.task.callback.CompleteCallback;
import com.noonight.pc.tasks.base.preInterface.model.task.callback.LoadTasksCallback;
import com.noonight.pc.tasks.base.preInterface.presenter.ToDoPresenter;
import com.noonight.pc.tasks.basic.Mvp;
import com.noonight.pc.tasks.base.preInterface.view.ToDoView;
import com.noonight.pc.tasks.common.database.models.Task;
import com.noonight.pc.tasks.common.extensions.Log;
import com.noonight.pc.tasks.model.TaskModel;

import java.util.List;

public class ToDoPresenterImpl implements ToDoPresenter {

    private ToDoView view;
    private final TaskModel model;

    public ToDoPresenterImpl(TaskModel model) {
        this.model = model;
    }

    @Override
    public void attachView(Mvp mvp) {
        view = (ToDoView) mvp;
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
    public void loadTasks() {
        model.loadTasks(new LoadTasksCallback() {
            @Override
            public void onLoad(List<Task> tasks) {
                view.showTasks(tasks);
            }
        });
    }

    @Override
    public void deleteTask() {
        model.deleteTask(view.getCurId(), new CompleteCallback() {
            @Override
            public void onComplete() {
                //view.deleteTask();
                Log.d("Task deleted");
            }
        });
    }
}
