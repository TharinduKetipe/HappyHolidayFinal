package com.example.happyholiday.happyholiday;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by tharindu on 5/1/15.
 */
public class reservations extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reservations);

        Button rs_ext = (Button) findViewById(R.id.rs_bt_exit);
        rs_ext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                System.exit(0);
            }
        });
        
    }
}
