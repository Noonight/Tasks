package com.noonight.pc.tasks.common.database.models;


public class Task {

    private long id;

    public Task(String title, String description, String type) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.type = type;
    }

    private String title;
    private String description;
    private String type;
    //private ArrayList<String> childTasks;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /*public ArrayList<String> getChildTasks() {
        return childTasks;
    }

    public void setChildTasks(ArrayList<String> childTasks) {
        this.childTasks = childTasks;
    }*/
}
