package com.noonight.pc.tasks.view;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.noonight.pc.tasks.R;
import com.noonight.pc.tasks.base.preInterface.view.MainView;
import com.noonight.pc.tasks.base.preInterface.view.ParentView;
import com.noonight.pc.tasks.base.preInterface.view.TasksView;
import com.noonight.pc.tasks.common.adapters.PagerAdapter;
import com.noonight.pc.tasks.common.database.DBHelper;
import com.noonight.pc.tasks.common.extensions.Log;
import com.noonight.pc.tasks.model.TaskModel;
import com.noonight.pc.tasks.presenter.MainPresenter;

public class ParentActivity extends AppCompatActivity implements MainView{

    private ProgressDialog progress;
    private MainPresenter presenter;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        initView();

        DBHelper dbHelper = new DBHelper(this);
        TaskModel taskModel = new TaskModel(dbHelper);
        presenter = new MainPresenter(taskModel);
        presenter.attachView(this);
        //presenter.viewIsReady();
    }

    private void initView() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.to_do_tasks_title));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.archive_tasks_title));

        final ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        pagerAdapter = PagerAdapter.newInstance(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        findViewById(R.id.toolbar_add_new).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddActivity();
            }
        });
    }

    @Override
    public void showProgres() {
        progress = ProgressDialog.show(this, "", getString(R.string.please_wait));
    }

    @Override
    public void hideProgres() {
        if (progress != null) {
            progress.dismiss();
        }
    }

    @Override
    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    @Override
    public void openAddActivity() {
        startActivity(new Intent(this, AddTaskActivity.class));
        Log.d("start Activty {AddTaskActivity}");
    }
}
