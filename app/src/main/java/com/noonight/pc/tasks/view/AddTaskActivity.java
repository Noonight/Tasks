package com.noonight.pc.tasks.view;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.noonight.pc.tasks.R;
import com.noonight.pc.tasks.base.preInterface.view.AddView;

public class AddTaskActivity extends AppCompatActivity implements AddView{

    private ProgressDialog progressDialog;
    private Toolbar toolbar;
    private EditText mTitle;
    private EditText mDescription;
    private Button mSave;
    private Button mDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
    }

    void init() {

        initView();

    }

    void initView() {
        toolbar = (Toolbar) findViewById(R.id.single_task_toolbar);
        setSupportActionBar(toolbar);

        mTitle = (EditText) findViewById(R.id.single_task_et_title);
        mTitle = (EditText) findViewById(R.id.single_task_et_description);
        mSave = (Button) findViewById(R.id.single_task_btn_save);
        mDelete = (Button) findViewById(R.id.single_task_btn_delete);

        mSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public void showProgres() {

    }

    @Override
    public void hideProgres() {

    }

    @Override
    public void showTask() {

    }

    @Override
    public void showToast(String message) {

    }
}
