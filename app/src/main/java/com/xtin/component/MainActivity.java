package com.xtin.component;

import android.os.Bundle;
import android.view.View;

import com.xtin.common.IntentUtil;
import com.xtin.common.base.BaseActivity;
import com.xtin.common.presenter.BasePresenter;

/**
 * Description:
 * Author:  tin
 * Date:  2020-05-28 14:35
 */

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.main_home_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentUtil.getInstance().skip(MainActivity.this, "com.xtin.home.HomeActivity");
            }
        });
        findViewById(R.id.main_mine_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentUtil.getInstance().skip(MainActivity.this, "com.xtin.mine.MineActivity");
            }
        });
    }

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

}
