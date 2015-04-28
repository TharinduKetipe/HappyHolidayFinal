package com.example.happyholiday.happyholiday;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

/**
 * Created by tharindu on 4/23/15.
 */
public class add_plan extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EditText pln_name_txt = (EditText)findViewById(R.id.ap_tf_pln_name);
        DatePicker pln_date = (DatePicker) findViewById(R.id.ap_pln_date);
        TimePicker pln_time = (TimePicker) findViewById(R.id.ap_pln_time);
        EditText pln_desc = (EditText) findViewById(R.id.ap_ti_desc);
        Button pln_bt_home = (Button) findViewById(R.id.ap_bt_home);
        Button pln_bt_add = (Button) findViewById(R.id.ap_bt_add);
        Button pln_bt_cancel = (Button) findViewById(R.id.ap_bt_cancel);


    }
}
