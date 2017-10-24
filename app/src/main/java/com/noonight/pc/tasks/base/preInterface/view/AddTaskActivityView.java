package com.noonight.pc.tasks.base.preInterface.view;

/**
 * Created by Admin on 23.10.2017.
 */

public interface AddTaskActivityView extends ParentView {
    void getTaskData();
    void showTask();
    void addTask();
    void deleteTask();
    int getCurId();
}
