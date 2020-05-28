package com.xtin.common.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.xtin.common.presenter.BasePresenter;
import com.xtin.common.view.IView;

/**
 * Description:
 * Author:  tin
 * Date:  2020-05-28 15:49
 */
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements IView {

    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindView();
    }

    @Override
    public void bindView() {
        mPresenter = createPresenter();
        if (mPresenter != null) {
            mPresenter.register(this);
        }
    }

    @Override
    public void unBindView() {
        if (mPresenter != null) {
            mPresenter.unRegister();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unBindView();
    }

    protected abstract P createPresenter();
}
