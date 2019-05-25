package com.mmlm.shici.module.util.manager;

import com.mmlm.shici.module.util.beans.BAppSettings;
import com.mmlm.shici.module.util.beans.BUserInfo;

/**
 * Created by Administrator on 2018/5/15.
 */

public class DataManager {
    private static DataManager instance = new DataManager();
    private BUserInfo userInfo;
    private BAppSettings appSettings;

    private DataManager(){}

    public static DataManager getInstance() {
        return instance;
    }

    public BUserInfo getUserInfo() {
        if(userInfo == null) {
            userInfo = new BUserInfo();
        }
        return userInfo;
    }

    public void setUserInfo(BUserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public BAppSettings getAppSettings() {
        if(appSettings == null) {
            appSettings = new BAppSettings();
        }
        return appSettings;
    }

    public void setAppSettings(BAppSettings appSettings) {
        this.appSettings = appSettings;
    }
}
