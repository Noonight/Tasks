package com.noonight.pc.tasks.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.noonight.pc.tasks.R;
import com.noonight.pc.tasks.common.preInterface.view.TasksView;

public class TasksFragment extends Fragment implements TasksView {

    public static TasksFragment newInstance(Bundle bundle) {
        TasksFragment newThis = new TasksFragment();
        newThis.setArguments(bundle);
        return newThis;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_to_do_tasks, container, false);
    }

    @Override
    public void showTasks() {

    }
}
