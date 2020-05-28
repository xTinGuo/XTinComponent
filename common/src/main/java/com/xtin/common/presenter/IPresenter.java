package com.xtin.common.presenter;

/**
 * Description:
 * Author:  tin
 * Date:  2020-05-28 15:54
 */
public interface IPresenter<V> {

    void register(V view);

    void unRegister();
}
