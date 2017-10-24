package com.noonight.pc.tasks.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.noonight.pc.tasks.R;
import com.noonight.pc.tasks.base.preInterface.presenter.ToDoTaskFragmentPresenter;
import com.noonight.pc.tasks.base.preInterface.view.ToDoTasksFragmentView;
import com.noonight.pc.tasks.common.adapters.TaskAdapter;
import com.noonight.pc.tasks.common.database.models.Task;

import java.util.List;

public class ToDoTasksFragment extends Fragment implements ToDoTasksFragmentView {

    private ToDoTaskFragmentPresenter presenter;
    private TaskAdapter adapter;
    private static ParentActivity parent;

    public static ToDoTasksFragment newInstance(ParentActivity parentActivity, Bundle bundle) {
        ToDoTasksFragment newThis = new ToDoTasksFragment();
        parent = parentActivity;
        newThis.setArguments(bundle);
        return newThis;
    }

    private void init() {

    }

    private void initView() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_to_do_tasks, container, false);
    }

    @Override
    public void showTasks(List<Task> tasks) {
        adapter.setData(tasks);
    }

    @Override
    public void openUpdateActivty() {
        parent.openAddActivty();
    }

    @Override
    public void deleteTask() {

    }

    @Override
    public int getCurId() {
        return 0;
    }
}
