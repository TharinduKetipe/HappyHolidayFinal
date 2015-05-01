package com.example.happyholiday.happyholiday;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.os.Handler;


/**
 * Created by tharindu on 5/1/15.
 */
public class view_plan extends Activity {




    private view_plan_adapter vp_adapter;
    private Hhdb hhdb;
    private ListView vp_listView;
    private static final int ENTER_DATA_REQUEST_CODE = 1;
    private static final String TAG = view_plan.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_plan);

        ListView plans = (ListView) findViewById(R.id.vp_lv_plans);

        hhdb = new Hhdb(this);
        vp_listView = (ListView) findViewById(R.id.vp_lv_plans);
        vp_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG, "clicked on item: " + position);
            }
        });



        new Handler().post(new Runnable() {
            @Override
            public void run() {
                vp_adapter = new view_plan_adapter(view_plan.this, hhdb.getAllPlans());
                vp_listView.setAdapter(vp_adapter);

            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == ENTER_DATA_REQUEST_CODE && resultCode == RESULT_OK) {

            vp_adapter.changeCursor(hhdb.getAllPlans());


        }
    }


    }

