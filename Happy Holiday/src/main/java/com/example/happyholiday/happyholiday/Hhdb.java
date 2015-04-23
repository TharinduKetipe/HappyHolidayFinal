package com.example.happyholiday.happyholiday;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by tharindu on 4/23/15.
 */
public class Hhdb extends SQLiteOpenHelper{

    public Hhdb(Context context) {
        super(context, "hh.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}
