package com.noonight.pc.tasks.base.preInterface.presenter;


import com.noonight.pc.tasks.basic.MainPresenterI;

public interface ArchivePresenter extends MainPresenterI {

    void loadTasks();

    void deleteTask();

    void onItemClicked();
}
