package com.example.androidsmartrefreshlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

public class SmartRefreshDemo1Activity extends AppCompatActivity {
    private static final String TAG = "RefreshDemo1Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart_refresh_demo1);

        setRefreshLayout();
    }

    private void setRefreshLayout () {
        RefreshLayout refreshLayout = findViewById(R.id.refreshLayout);
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                Log.d(TAG, "onRefresh");
                refreshlayout.finishRefresh(2000);
//                refreshlayout.finishRefresh(false);//传入false表示刷新失败
            }
        });
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshlayout) {
                Log.d(TAG, "onLoadMore");
                refreshlayout.finishLoadMore(2000);
//                refreshlayout.finishLoadMore(false);//传入false表示加载失败
            }
        });
    }
}