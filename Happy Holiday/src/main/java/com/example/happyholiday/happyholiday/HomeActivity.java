package com.example.happyholiday.happyholiday;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class HomeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Button add_btn=(Button)findViewById(R.id.hm_bt_ad_pln);
        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ap = new Intent(HomeActivity.this, add_plan.class);
                startActivity(ap);
            }
        });
        Button view_btn = (Button) findViewById(R.id.hm_bt_vw_pln);
        view_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vp = new Intent(HomeActivity.this, view_plan.class);
                startActivity(vp);
            }
        });

        Button direction_btn = (Button) findViewById(R.id.hm_bt_dr);
        direction_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dr= new Intent(HomeActivity.this,Directions.class);
                startActivity(dr);
            }
        });

        Button resvation_btn = (Button) findViewById(R.id.hm_bt_rsv);
        resvation_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rs= new Intent(HomeActivity.this,reservations.class);
                startActivity(rs);
            }
        });

        Button hm_exit = (Button) findViewById(R.id.hm_bt_ext);
        hm_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);

            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
