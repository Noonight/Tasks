package com.noonight.pc.tasks.base.preInterface.model.task.callback;


import com.noonight.pc.tasks.common.database.models.Task;

import java.util.List;

public interface LoadTasksCallback {

    void onLoad(List<Task> tasks);

}
