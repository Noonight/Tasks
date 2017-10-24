package com.noonight.pc.tasks.base.preInterface.model.task;


import android.content.ContentValues;

import com.noonight.pc.tasks.base.preInterface.model.task.callback.CompleteCallback;
import com.noonight.pc.tasks.base.preInterface.model.task.callback.LoadTaskCallback;
import com.noonight.pc.tasks.base.preInterface.model.task.callback.LoadTasksCallback;

public interface TaskModelI{

    void loadTasks(LoadTasksCallback loadTasksCallback);

    void loadTask(Integer id, LoadTaskCallback loadTaskCallback);

    void addTask(ContentValues cv, CompleteCallback callback);

    void deleteTasks(CompleteCallback callback);

    void deleteTask(Integer id, CompleteCallback callback);

    void updateTask(ContentValues cv, CompleteCallback callback);
}
