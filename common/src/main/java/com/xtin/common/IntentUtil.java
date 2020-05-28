package com.xtin.common;

import android.content.Context;
import android.content.Intent;

/**
 * Description:module之间通信
 * Author:  tin
 * Date:  2020-05-28 14:35
 */
public class IntentUtil {

    private IntentUtil() {
    }

    private static class IntentUtilInstance {
        private static IntentUtil instance = new IntentUtil();
    }

    public static IntentUtil getInstance() {
        return IntentUtilInstance.instance;
    }

    public void skip(Context context, String className) {

        try {
            Class clazz = Class.forName(className);
            Intent intent = new Intent(context, clazz);
            context.startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
