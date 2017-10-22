package com.noonight.pc.tasks.common.preInterface.model.task;


import android.content.ContentValues;

public interface TaskModelI{

    void loadTasks(LoadTaskCallback loadTaskCallback);

    void addTask(ContentValues cv, CompleteCallback callback);

    void deleteTasks(CompleteCallback callback);

    void deleteTask(ContentValues cv, CompleteCallback callback);

    void updateTask(ContentValues cv, CompleteCallback callback);
}
