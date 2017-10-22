package com.noonight.pc.tasks.common.database.tables;


public class TaskTable {

    public static final String TABLE = "tasks";

    public static class COLUMN {
        public static final String ID = "_id";
        public static final String TITLE = "title";
        public static final String DESCRIPTION = "description";
        public static final String TYPE = "type";
        //public static final String CHILD_TASKS = "child_tasks";
    }

    public static final String CREATE_SCRIPT =
            String.format("CREATE TABLE %s (" +
                    "%s integer primary key autoincrement," +
                    "%s text," +
                    "%s text" +
                    "%s text" + ");",
                    TABLE, COLUMN.ID, COLUMN.TITLE, COLUMN.DESCRIPTION, COLUMN.TYPE);
}
