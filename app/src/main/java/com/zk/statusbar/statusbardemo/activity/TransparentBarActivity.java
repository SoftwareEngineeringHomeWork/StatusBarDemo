package com.zk.statusbar.statusbardemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zk.statusbar.statusbardemo.utils.BarUtil;
import com.zk.statusbar.statusbardemo.R;
import com.zk.statusbar.statusbardemo.utils.ScrollActivityUtil;

/**
 * author: ZK.
 * date:   On 2017/8/5.
 * 透明状态栏
 *
 */
public class TransparentBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transparent);
        BarUtil.setStatusBarTransparency(this);
        ScrollActivityUtil.scrollActivity(this);
    }


}