package com.xtin.component;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.xtin.common.IntentUtil;
import com.xtin.common.base.BaseActivity;
import com.xtin.component.presenter.MainPresenter;
import com.xtin.component.view.MainContract;

/**
 * Description:
 * Author:  tin
 * Date:  2020-05-28 14:35
 */

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

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
        findViewById(R.id.main_mvp_get).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.init();
            }
        });
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    public void onSuccess(String message) {

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
