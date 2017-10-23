package com.noonight.pc.tasks.presenter;

import com.noonight.pc.tasks.base.preInterface.model.task.CompleteCallback;
import com.noonight.pc.tasks.base.preInterface.model.task.LoadTasksCallback;
import com.noonight.pc.tasks.base.preInterface.view.Mvp;
import com.noonight.pc.tasks.base.preInterface.view.ParentView;
import com.noonight.pc.tasks.base.preInterface.view.ToDoTasksFragmentView;
import com.noonight.pc.tasks.common.database.models.Task;
import com.noonight.pc.tasks.common.extensions.Log;
import com.noonight.pc.tasks.model.TaskModel;

import java.util.List;

/**
 * Created by Admin on 23.10.2017.
 */

public class ToDoTaskFragmentPresenter implements com.noonight.pc.tasks.base.preInterface.presenter.ToDoTaskFragmentPresenter {

    private ToDoTasksFragmentView view;
    private final TaskModel model;

    public ToDoTaskFragmentPresenter(TaskModel model) {
        this.model = model;
    }

    @Override
    public void attachView(Mvp mvp) {
        view = (ToDoTasksFragmentView) mvp;
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
