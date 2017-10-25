package com.noonight.pc.tasks.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.noonight.pc.tasks.R;
import com.noonight.pc.tasks.base.preInterface.view.ArchiveView;
import com.noonight.pc.tasks.common.database.models.Task;

import java.util.List;

public class ArchiveFragment extends Fragment implements ArchiveView{

    private RecyclerView list;

    public static ArchiveFragment newInstance(Bundle bundle) {
        ArchiveFragment newThis = new ArchiveFragment();
        newThis.setArguments(bundle);
        return newThis;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_archive_tasks, container, false);
    }

    @Override
    public void showTasks(List<Task> tasks) {

    }
}
