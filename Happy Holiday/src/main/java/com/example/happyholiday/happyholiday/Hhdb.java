package com.example.happyholiday.happyholiday;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by tharindu on 4/23/15.
 */
public class Hhdb extends SQLiteOpenHelper{

    SQLiteDatabase dbase;
    Context con;

    public Hhdb(Context context) {
        super(context, "hhdb.db", null, 1);
        con = context;
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        //create plan table
        String create_plan_query = "CREATE TABLE plan (p_id INTEGER PRIMARY KEY NOT NULL ,p_name VARCHAR(20),p_date date , p_time datetime , p_desc varchar(50))";
        database.execSQL(create_plan_query);
        dbase=database;
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
