package com.example.hp.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.hp.android.util.Base64Util;
import com.example.hp.android.util.SharedPreferencesHelper;

public class MainActivity extends AppCompatActivity {
    private SharedPreferencesHelper sharedPreferencesHelper;
    private static  final String FILE_NAME = Base64Util.encode("START_UP".getBytes());
    private boolean isFirstRun;
    private String KEY ="NOT_FIRST_RUN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();;

    }
    private void init(){
        sharedPreferencesHelper = new SharedPreferencesHelper(this.getApplicationContext());
        sharedPreferencesHelper.open(FILE_NAME);
        isFirstRun = ! sharedPreferencesHelper.getBoolean(KEY);
        if(isFirstRun){
            //第一次运行
            Intent intent = new Intent();
            intent.setAction("android.new.contact");
            startActivityForResult(intent,1024);
            sharedPreferencesHelper.putBoolean(KEY,isFirstRun);
            finish();
        }
    }

}
