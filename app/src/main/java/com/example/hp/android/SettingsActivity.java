package com.example.hp.android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;

public class SettingsActivity extends AppCompatActivity {
    CheckBox btnName,btnTel,btnMsg;
    LinearLayout nameDetail,telDetail,msgDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        btnName = (CheckBox) findViewById(R.id.btn_show_name);
        btnTel = (CheckBox) findViewById(R.id.btn_show_tel);
        btnMsg = (CheckBox) findViewById(R.id.btn_show_msg);

        nameDetail  = (LinearLayout) findViewById(R.id.name_detail);
        telDetail = (LinearLayout) findViewById(R.id.tel_detail);
        msgDetail = (LinearLayout) findViewById(R.id.msg_detail);

        btnName.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                nameDetail.setVisibility(isChecked?LinearLayout.VISIBLE:LinearLayout.GONE);
            }
        });
        btnTel.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                telDetail.setVisibility(isChecked?LinearLayout.VISIBLE:LinearLayout.GONE);
            }
        });
        btnMsg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                msgDetail.setVisibility(isChecked?LinearLayout.VISIBLE:LinearLayout.GONE);
            }
        });

    }
}
