package com.noonight.pc.tasks.base.preInterface.presenter;


public interface TaskPresenterViewI extends MainPresenterI {

    void addTask();

    void loadTasks();

    void loadTask();

    void deleteTask();

    void deleteTasks();

    void update();
}
