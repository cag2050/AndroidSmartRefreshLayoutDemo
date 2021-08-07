package com.example.androidsmartrefreshlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    private Button btnDemo1;
    private Button btnDemo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        btnDemo1 = (Button) findViewById(R.id.btn_demo1);
        btnDemo1.setOnClickListener(this);

        btnDemo2 = (Button) findViewById(R.id.btn_demo2);
        btnDemo2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_demo1:
                Log.d(TAG, "进入 SmartRefreshDemo1Activity");
                Intent intent = new Intent(this, SmartRefreshDemo1Activity.class);
                startActivity(intent);
                break;
        }
    }
}