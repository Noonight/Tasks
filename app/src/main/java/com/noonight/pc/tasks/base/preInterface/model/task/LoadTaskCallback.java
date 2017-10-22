package com.noonight.pc.tasks.base.preInterface.model.task;


import com.noonight.pc.tasks.common.database.models.Task;

public interface LoadTaskCallback {

    void onLoad(Task task);

}
