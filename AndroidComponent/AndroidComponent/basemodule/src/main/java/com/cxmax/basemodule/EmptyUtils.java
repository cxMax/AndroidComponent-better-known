package com.cxmax.basemodule;

import android.text.TextUtils;

/**
 * @desribe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 18-5-1.
 */
public class EmptyUtils {

    public static boolean isEmpty(String target) {
        if (target != null && !TextUtils.isEmpty(target)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isNotEmpty(String target) {
        if (target != null && !TextUtils.isEmpty(target)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isNull(Object obj) {
        return null == obj;
    }

    public static String NullToEmpty(String obj) {
        if (isNull(obj))
            return "";
        else
            return obj;
    }


    public static String getNullString() {
        return "暂无";
    }

}
