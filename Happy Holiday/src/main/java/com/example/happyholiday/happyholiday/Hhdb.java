package com.example.happyholiday.happyholiday;

import android.content.ContentValues;
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
        String create_plan_query = "CREATE TABLE plan (p_id INTEGER PRIMARY KEY NOT NULL ,p_name VARCHAR(20),p_date VARCHAR(20) , p_time VARCHAR(20) , p_desc varchar(50))";
        database.execSQL(create_plan_query);
        dbase=database;
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void insetToPlan(String pln_name , String pln_date , String pln_time,String pln_desc){
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("p_name",pln_name);
        values.put("p_date",pln_date);
        values.put("p_time",pln_time);
        values.put("p_desc",pln_desc);

        database.insert("plan",null,values);




    }

}
