package com.xtin.common.presenter;

import java.lang.ref.WeakReference;

/**
 * Description:
 * Author:  tin
 * Date:  2020-05-28 15:53
 */
public class BasePresenter<V> implements IPresenter<V> {

    protected WeakReference<V> weakReference;

    @Override
    public void register(V view) {
        weakReference = new WeakReference<>(view);
    }

    @Override
    public void unRegister() {
        if (weakReference != null) {
            weakReference.clear();
        }
    }
}
