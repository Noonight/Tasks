package com.noonight.pc.tasks.common.preInterface.model.task;


import com.noonight.pc.tasks.common.database.models.Task;

import java.util.List;

public interface LoadTaskCallback {

    void onLoad(List<Task> tasks);

}
