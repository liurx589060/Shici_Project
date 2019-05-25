package com.mmlm.shici.module.util.tools;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import com.mmlm.shici.module.util.AppConfig;
import com.mmlm.shici.module.util.Constant;


/**
 * Created by Administrator on 2019/4/14.
 */

public class SharedPreferenceUtil {
    public static void setSpIpAddress(Context context,String ipAddress) {
        SharedPreferences sp = context.getSharedPreferences(Constant.SP_NAME, Activity
                .MODE_PRIVATE);
        sp.edit().putString("ipAddress", ipAddress).commit();
    }

    public static void setSpRemoteIpFlag(Context context,boolean isRemote) {
        SharedPreferences sp = context.getSharedPreferences(Constant.SP_NAME, Activity
                .MODE_PRIVATE);
        sp.edit().putBoolean("isRemote", isRemote).commit();
    }

    public static String getSpIpAddress(Context context) {
        SharedPreferences sp = context.getSharedPreferences(Constant.SP_NAME, Activity
                .MODE_PRIVATE);
        return sp.getString("ipAddress", AppConfig.isRemote?Constant.CONSTANT_REMOTE_IP:Constant.CONSTANT_LOCOL_IP);
    }

    public static boolean getIsRemote(Context context) {
        SharedPreferences sp = context.getSharedPreferences(Constant.SP_NAME, Activity
                .MODE_PRIVATE);
        return sp.getBoolean("isRemote", AppConfig.isRemote);
    }

    public static String getUserName(Context context) {
        SharedPreferences sp = context.getSharedPreferences(Constant.SP_NAME, Activity
                .MODE_PRIVATE);
        return sp.getString("userName", "");
    }

    public static void setUserName(Context context,String userName) {
        SharedPreferences sp = context.getSharedPreferences(Constant.SP_NAME, Activity
                .MODE_PRIVATE);
        sp.edit().putString("userName", userName).commit();
    }

    public static String getPassword(Context context) {
        SharedPreferences sp = context.getSharedPreferences(Constant.SP_NAME, Activity
                .MODE_PRIVATE);
        return sp.getString("password", "");
    }

    public static void setPassword(Context context,String password) {
        SharedPreferences sp = context.getSharedPreferences(Constant.SP_NAME, Activity
                .MODE_PRIVATE);
        sp.edit().putString("password", password).commit();
    }
}
