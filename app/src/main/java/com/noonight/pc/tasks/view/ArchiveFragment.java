package com.noonight.pc.tasks.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.noonight.pc.tasks.R;

public class ArchiveFragment extends Fragment {

    public static ArchiveFragment newInstance(Bundle bundle) {
        ArchiveFragment newThis = new ArchiveFragment();
        newThis.setArguments(bundle);
        return newThis;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_archive_tasks, container, false);
    }
}
