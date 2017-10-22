package com.noonight.pc.tasks.common.adapters;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.noonight.pc.tasks.R;
import com.noonight.pc.tasks.common.database.models.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskHolder> {

    List<Task> data = new ArrayList<>();

    @Override
    public TaskAdapter.TaskHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item, parent, false);
        return new TaskHolder(view);
    }

    @Override
    public void onBindViewHolder(TaskAdapter.TaskHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<Task> tasks) {
        data.clear();
        data.addAll(tasks);
        notifyDataSetChanged();
    }

    static class TaskHolder extends RecyclerView.ViewHolder {

        private TextView mTaskTitle;
        private TextView mTaskDescription;

        public TaskHolder(View itemView) {
            super(itemView);
            mTaskTitle = (TextView) itemView.findViewById(R.id.task_title);
            mTaskDescription = (TextView) itemView.findViewById(R.id.task_description);
        }

        void bind(Task task) {
            mTaskTitle.setText(task.getTitle());
            mTaskDescription.setText(task.getDescription());
        }
    }
}
