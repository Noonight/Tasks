package com.noonight.pc.tasks.view;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.noonight.pc.tasks.R;
import com.noonight.pc.tasks.base.preInterface.presenter.AddPresenter;
import com.noonight.pc.tasks.base.preInterface.view.AddView;
import com.noonight.pc.tasks.common.LocalVariable;
import com.noonight.pc.tasks.common.database.DBHelper;
import com.noonight.pc.tasks.common.database.models.Task;
import com.noonight.pc.tasks.model.TaskModel;
import com.noonight.pc.tasks.presenter.AddPresenterImpl;

/*
<<<<<<< HEAD:app/src/main/java/com/noonight/pc/tasks/view/AddTaskActivity.java
public class AddTaskActivity extends AppCompatActivity implements AddVgit iew{
=======*/
public class AddActivity extends AppCompatActivity implements AddView {
//>>>>>>> bf7a1af32f9597623f14b607ec8d0da82618d6c9:app/src/main/java/com/noonight/pc/tasks/view/AddActivity.java

    private ProgressDialog progressDialog;
    private Toolbar toolbar;
    private EditText mTitle;
    private EditText mDescription;
    private Button mSave;
    private Button mCancel;
    private AddPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        init();
    }

    void init() {

        initView();

        TaskModel model = new TaskModel(new DBHelper(this));
        presenter = new AddPresenterImpl(model);
        presenter.attachView(this);
        presenter.viewIsReady();
    }

    void initView() {
        toolbar = (Toolbar) findViewById(R.id.single_task_toolbar);
        setSupportActionBar(toolbar);

        mTitle = (EditText) findViewById(R.id.single_task_et_title);
        mDescription = (EditText) findViewById(R.id.single_task_et_description);
        mSave = (Button) findViewById(R.id.single_task_btn_save);
        mCancel = (Button) findViewById(R.id.single_task_btn_delete);

        mSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onSaveClicked();
            }
        });

        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    @Override
    public void onBackPressed() {
        presenter.onBackClicked();
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }

    @Override
    public void showProgres() {
        progressDialog = ProgressDialog.show(this, "", getString(R.string.please_wait));
    }

    @Override
    public void hideProgres() {
        progressDialog.dismiss();
    }

    @Override
    public Task getTaskData() {
        return new Task(mTitle.getText().toString(), mDescription.getText().toString(), LocalVariable.TASK_TYPE_NEW);
    }

    @Override
    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
