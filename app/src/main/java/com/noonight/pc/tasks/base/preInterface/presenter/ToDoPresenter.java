package com.noonight.pc.tasks.base.preInterface.presenter;

import com.noonight.pc.tasks.basic.MainPresenterI;

/**
 * Created by Admin on 23.10.2017.
 */

public interface ToDoPresenter extends MainPresenterI {
    void loadTasks();
    void deleteTask();
}
