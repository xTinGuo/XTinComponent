package com.xtin.component.view;

import com.xtin.common.base.BaseCallback;
import com.xtin.common.view.IView;

/**
 * Description:
 * Author:  tin
 * Date:  2020-05-29 09:51
 */
public interface MainContract {

    interface View extends IView {

        void onSuccess(String message);
    }

    interface Presenter {

        void init();
    }

    interface Model {

        void init(BaseCallback callback);
    }
}
