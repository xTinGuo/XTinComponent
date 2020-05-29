package com.xtin.component.presenter;

import com.xtin.common.base.BaseCallback;
import com.xtin.common.presenter.BasePresenter;
import com.xtin.component.model.MainModel;
import com.xtin.component.view.MainContract;

/**
 * Description:
 * Author:  tin
 * Date:  2020-05-29 09:38
 */
public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {

    protected MainModel mainModel;

    public MainPresenter() {
        mainModel = new MainModel();
    }

    @Override
    public void init() {
        mainModel.init(new BaseCallback() {
            @Override
            public void onSuccess(String data) {
                weakReference.get().onSuccess(data);
            }

            @Override
            public void onFailure(String msg) {
            }

            @Override
            public void onError() {
            }

            @Override
            public void onComplete() {

            }
        });
    }
}
