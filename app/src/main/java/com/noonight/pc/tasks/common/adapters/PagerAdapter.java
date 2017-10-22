package com.noonight.pc.tasks.common.adapters;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.noonight.pc.tasks.view.ArchiveTasksFragment;
import com.noonight.pc.tasks.view.TasksFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {
    private int mCountTabs;

    public static PagerAdapter newInstance(FragmentManager fm, int number) {
        PagerAdapter newThis = new PagerAdapter(fm);
        newThis.setmCountTabs(number);
        return newThis;
    }


    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TasksFragment toDoTasksFragment = TasksFragment.newInstance(new Bundle());
                return toDoTasksFragment;
            case 1:
                ArchiveTasksFragment archiveTasksFragment = ArchiveTasksFragment.newInstance(new Bundle());
                return archiveTasksFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mCountTabs;
    }

    public int getmCountTabs() {
        return mCountTabs;
    }

    public void setmCountTabs(int mCountTabs) {
        this.mCountTabs = mCountTabs;
    }
}
