package com.example.happyholiday.happyholiday;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

/**
 * Created by tharindu on 5/1/15.
 */
public class reservations extends Activity {

    private WebView rs_wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reservations);

        /*rs_wv = new WebView(this);
        rs_wv.getSettings().setJavaScriptEnabled(true);
        final Activity activity = this;

        rs_wv.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });
        rs_wv.loadUrl("http://asiatravel.com/");
        setContentView(rs_wv);*/

        Button rs_ext = (Button) findViewById(R.id.rs_bt_exit);
        rs_ext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
        Button rs_home = (Button) findViewById(R.id.rs_bt_home);
        rs_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hm = new Intent(reservations.this, HomeActivity.class);
                startActivity(hm);
            }
        });
        
    }
}
