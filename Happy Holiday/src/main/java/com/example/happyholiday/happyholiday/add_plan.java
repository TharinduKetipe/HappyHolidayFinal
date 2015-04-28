package com.example.happyholiday.happyholiday;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

/**
 * Created by tharindu on 4/23/15.
 */
public class add_plan extends Activity{

    Hhdb hhdb = new Hhdb(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final EditText pln_name_txt = (EditText)findViewById(R.id.ap_tf_pln_name);
        final DatePicker pln_date_dp = (DatePicker) findViewById(R.id.ap_pln_date);
        final TimePicker pln_time_tp = (TimePicker) findViewById(R.id.ap_pln_time);
        final EditText pln_desc_et = (EditText) findViewById(R.id.ap_ti_desc);
        Button pln_bt_home = (Button) findViewById(R.id.ap_bt_home);
        Button pln_bt_add = (Button) findViewById(R.id.ap_bt_add);
        Button pln_bt_cancel = (Button) findViewById(R.id.ap_bt_cancel);

        pln_bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pln_name = pln_name_txt.getText().toString();
                String pln_date = pln_date_dp.getDayOfMonth() + "/" + pln_date_dp.getMonth() + "/" + pln_date_dp.getYear();
                String pln_time = pln_time_tp.getCurrentHour() + ":" + pln_time_tp.getCurrentMinute();
                String pln_desc = pln_desc_et.getText().toString();

                hhdb.insetToPlan(pln_name,pln_date,pln_time,pln_desc);


            }
        });


    }

}
