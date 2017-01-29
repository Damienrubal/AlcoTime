package com.example.damin.myapplication.DataBase;

import android.provider.BaseColumns;

/**
 * Created by damin on 25/01/2017.
 */

public class DataBase {

    public DataBase() {}

    private static final String SQL_CREATE_PERSON_TABLE =
            "CREATE TABLE " + PersonTable.TABLE_NAME + " (" +
                    PersonTable._ID + " INTEGER PRIMARY KEY," +
                    PersonTable.COLUMN_FIRST_NAME + " TEXT," + PersonTable.COLUMN_LAST_NAME +" TEXT,"+ PersonTable.COLUMN_WEIGHT+"INTEGER"+
                    PersonTable.COLUMN_SEXE + " TEXT)";
    private static final String SQL_DELETE_PERSON_TABLE =
            "DROP TABLE IF EXISTS " + PersonTable.TABLE_NAME;



    public static class PersonTable implements BaseColumns {
        public static final String TABLE_NAME = "features";
        public static final String COLUMN_FIRST_NAME = "FirstName";
        public static final String COLUMN_LAST_NAME = "name";
        public static final String COLUMN_WEIGHT = "weight";
        public static final String COLUMN_SEXE = "sexe";

    }



    public static String getSqlCreatePersonnTable() {
        return SQL_CREATE_PERSON_TABLE;
    }

    public static String getSqlDeletePersonnTable() {
        return SQL_DELETE_PERSON_TABLE;
    }
}
