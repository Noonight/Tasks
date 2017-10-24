package com.noonight.pc.tasks.base.preInterface.presenter;


public interface ParentTaskActivityPresenterI extends MainPresenterI {
    void openAddActivity();
    ParentTaskActivityPresenterI getThis();
    void deleteTasks();
}
