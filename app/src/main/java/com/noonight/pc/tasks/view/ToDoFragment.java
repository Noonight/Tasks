package com.noonight.pc.tasks.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.noonight.pc.tasks.R;
import com.noonight.pc.tasks.base.preInterface.presenter.ToDoPresenter;
import com.noonight.pc.tasks.base.preInterface.view.ToDoView;
import com.noonight.pc.tasks.common.adapters.TaskAdapter;
import com.noonight.pc.tasks.common.database.models.Task;

import java.util.List;

public class ToDoFragment extends Fragment implements ToDoView {

    private ToDoPresenter presenter;
    private TaskAdapter adapter;

    public static ToDoFragment newInstance(Bundle bundle) {
        ToDoFragment newThis = new ToDoFragment();
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
    public void deleteTask() {

    }

    @Override
    public int getCurId() {
        return 0;
    }
}
