package com.mmlm.shici.module.util.base;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.mmlm.shici.module.util.tools.StatusBarCompat;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

/**
 * Created by Administrator on 2018/10/28.
 */

public class BaseActivity extends RxAppCompatActivity {
    private Dialog mLoadingDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN|
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    protected boolean isTranslucentStatusBar() {
        return false;
    }

    private void toSetSatusBar() {
//        if(isTranslucentStatusBar())
//        {
//            translucentStatusBar(true);
//        }else {
//            setStatusBarColor(getStatusBarColor());
//        }
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        toSetSatusBar();
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        toSetSatusBar();
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
        toSetSatusBar();
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        super.addContentView(view, params);
        toSetSatusBar();
    }

    public int getStatusBarColor(){
        return Color.parseColor("#ffa07a");
    }

    public void setStatusBarColor(int color) {
        StatusBarCompat.setStatusBarColor(this,color);
    }

    public void setStatusBarColor(int color,int alpha) {
        StatusBarCompat.setStatusBarColor(this,color,alpha);
    }

    public void translucentStatusBar(boolean hideStatusBarBackground) {
        StatusBarCompat.translucentStatusBar(this,hideStatusBarBackground);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

//    public Dialog getLoadingDialog() {
//        if(mLoadingDialog == null) {
//            mLoadingDialog = DialogFactory.createLoadingDialog(this);
//        }
//        return mLoadingDialog;
//    }
}
