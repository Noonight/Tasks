package com.noonight.pc.tasks.view;


import android.icu.util.TimeUnit;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.noonight.pc.tasks.R;

public class ArchiveTasksFragment extends Fragment {

    public static ArchiveTasksFragment newInstance(Bundle bundle) {
        ArchiveTasksFragment newThis = new ArchiveTasksFragment();
        newThis.setArguments(bundle);
        return newThis;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_archive_tasks, container, false);
    }
}
