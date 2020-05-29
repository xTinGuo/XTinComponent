package com.xtin.component.model;

import android.os.Handler;

import com.xtin.common.base.BaseCallback;
import com.xtin.common.model.BaseModel;
import com.xtin.component.view.MainContract;


/**
 * Description:
 * Author:  tin
 * Date:  2020-05-29 09:40
 */
public class MainModel extends BaseModel implements MainContract.Model {

    public MainModel() {
    }

    @Override
    public void init(final BaseCallback baseCallback) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (baseCallback != null) {
                    baseCallback.onSuccess("success");
                }
            }
        }, 2000);
    }
}
