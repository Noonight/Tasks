package com.noonight.pc.tasks.base.preInterface.view;

import com.noonight.pc.tasks.basic.Mvp;
import com.noonight.pc.tasks.common.database.models.Task;

import java.util.List;

public interface ArchiveView extends Mvp {

    void showTasks(List<Task> tasks);

}
