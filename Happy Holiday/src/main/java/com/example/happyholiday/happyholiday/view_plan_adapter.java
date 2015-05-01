package com.example.happyholiday.happyholiday;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tharindu on 5/1/15.
 */
public class view_plan_adapter extends CursorAdapter {

    public view_plan_adapter(Context context, Cursor c) {
        super(context, c);
    }



    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        // when the view will be created for first time,
        // we need to tell the adapters, how each item will look
        LayoutInflater vpinflater = LayoutInflater.from(parent.getContext());
        View vpretView = vpinflater.inflate(R.layout.list_item_vp, parent, false);
        return vpretView;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

        // here we are setting our data
        // that means, take the data from the cursor and put it in views

        TextView tvpln_name = (TextView) view.findViewById(R.id.li_vp_name);
        tvpln_name.setText(cursor.getString(cursor.getColumnIndex("p_name")));
        //textViewPersonName.setText(cursor.getString(cursor.getColumnIndex(cursor.getColumnName(1))));

        //TextView textViewPersonPIN = (TextView) view.findViewById(R.id.tv_person_pin);
        //textViewPersonPIN.setText(cursor.getString(cursor.getColumnIndex(cursor.getColumnName(2))));
        Button planview = (Button) view.findViewById(R.id.li_vp_btn);

    }



}
