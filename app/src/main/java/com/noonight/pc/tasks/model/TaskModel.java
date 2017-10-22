package com.noonight.pc.tasks.model;


import android.content.ContentValues;
import android.database.Cursor;
import android.os.AsyncTask;

import com.noonight.pc.tasks.common.database.DBHelper;
import com.noonight.pc.tasks.common.database.models.Task;
import com.noonight.pc.tasks.common.database.tables.TaskTable;
import com.noonight.pc.tasks.common.preInterface.model.task.CompleteCallback;
import com.noonight.pc.tasks.common.preInterface.model.task.LoadTaskCallback;
import com.noonight.pc.tasks.common.preInterface.model.task.TaskModelI;

import java.util.LinkedList;
import java.util.List;

public class TaskModel implements TaskModelI{
    private final DBHelper dbHelper;

    public TaskModel(DBHelper dbHelper) {
        this.dbHelper = dbHelper;
    }

    @Override
    public void loadTasks(LoadTaskCallback loadTaskCallback) {
        LoadTasks loadTasks = new LoadTasks(loadTaskCallback);
        loadTasks.execute();
    }

    @Override
    public void addTask(ContentValues cv, CompleteCallback callback) {
        AddTask addTask = new AddTask(callback);
        addTask.execute(cv);
    }

    @Override
    public void deleteTasks(CompleteCallback callback) {
        DeleteTasks deleteTasks = new DeleteTasks(callback);
        deleteTasks.execute();
    }

    @Override
    public void deleteTask(ContentValues cv, CompleteCallback callback) {
        DeleteTask deleteTask = new DeleteTask(callback);
        deleteTask.execute(cv);
    }

    @Override
    public void updateTask(ContentValues cv, CompleteCallback callback) {
        UpdateTask updateTask = new UpdateTask(callback);
        updateTask.execute(cv);
    }

    class UpdateTask extends AsyncTask<ContentValues, Void, Void> {

        private final CompleteCallback callback;

        UpdateTask(CompleteCallback callback) {
            this.callback = callback;
        }

        @Override
        protected Void doInBackground(ContentValues... contentValues) {
            ContentValues cvTask = contentValues[0];
            dbHelper.getWritableDatabase().update(TaskTable.TABLE, cvTask, "id = ?", new String[] {(String) cvTask.get(TaskTable.COLUMN.ID)});
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            if (callback != null) {
                callback.onComplete();
            }
        }
    }

    class DeleteTask extends AsyncTask<ContentValues, Void, Void> {

        private final CompleteCallback callback;

        DeleteTask(CompleteCallback callback) {
            this.callback = callback;
        }

        @Override
        protected Void doInBackground(ContentValues... contentValues) {
            ContentValues cvTask = contentValues[0];
            dbHelper.getWritableDatabase().delete(TaskTable.TABLE, "id = " + cvTask.get(TaskTable.COLUMN.ID), null);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            if (callback != null) {
                callback.onComplete();
            }
        }
    }

    class DeleteTasks extends AsyncTask<Void, Void, Void> {

        private final CompleteCallback callback;

        DeleteTasks(CompleteCallback callback) {
            this.callback = callback;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            dbHelper.getWritableDatabase().delete(TaskTable.TABLE, null, null);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            if (callback != null) {
                callback.onComplete();
            }
        }
    }

    class LoadTasks extends AsyncTask<Void, Void, List<Task>> {

        private final LoadTaskCallback callback;

        LoadTasks(LoadTaskCallback callback) {
            this.callback = callback;
        }

        @Override
        protected List<Task> doInBackground(Void... params) {
            List<Task> tasks = new LinkedList<>();
            Cursor cursor = dbHelper.getReadableDatabase().query(TaskTable.TABLE, null, null, null, null, null, null);
            while (cursor.moveToNext()) {
                Task task = new Task();
                task.setId(cursor.getLong(cursor.getColumnIndex(TaskTable.COLUMN.ID)));
                task.setTitle(cursor.getString(cursor.getColumnIndex(TaskTable.COLUMN.TITLE)));
                task.setDescription(cursor.getString(cursor.getColumnIndex(TaskTable.COLUMN.DESCRIPTION)));
                task.setType(cursor.getString(cursor.getColumnIndex(TaskTable.COLUMN.TYPE)));
                tasks.add(task);
            }
            cursor.close();
            return tasks;
        }

        @Override
        protected void onPostExecute(List<Task> tasks) {
            if (callback != null) {
                callback.onLoad(tasks);
            }
        }
    }

    class AddTask extends AsyncTask<ContentValues, Void, Void> {

        private final CompleteCallback callback;

        AddTask(CompleteCallback callback) {
            this.callback = callback;
        }

        @Override
        protected Void doInBackground(ContentValues... params) {
            ContentValues cvTask = params[0];
            dbHelper.getWritableDatabase().insert(TaskTable.TABLE, null, cvTask);
            /*try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            if (callback != null) {
                callback.onComplete();
            }
        }
    }
}
