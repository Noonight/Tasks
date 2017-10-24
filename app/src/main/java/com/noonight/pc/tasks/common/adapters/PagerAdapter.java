package com.noonight.pc.tasks.common.adapters;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.noonight.pc.tasks.view.ArchiveFragment;
import com.noonight.pc.tasks.view.ToDoFragment;

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
                ToDoFragment toDoTasksFragment = ToDoFragment.newInstance(new Bundle());
                return toDoTasksFragment;
            case 1:
                ArchiveFragment archiveFragment = ArchiveFragment.newInstance(new Bundle());
                return archiveFragment;
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
