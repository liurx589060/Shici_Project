package com.mmlm.shici.module.util.base;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;

import com.trello.rxlifecycle2.components.support.RxFragment;

/**
 * Created by Administrator on 2018/11/11.
 */

public class BaseFragment extends RxFragment {
    protected View mRootView;
    private Dialog mLoadingDialog;

    public int getStatusColor() {
        return Color.parseColor("#ffa07a");
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {}

    public void onLogin() {}

//    public Dialog getLoadingDialog() {
//        if(mLoadingDialog == null) {
//            mLoadingDialog = DialogFactory.createLoadingDialog(getActivity());
//        }
//        return mLoadingDialog;
//    }
}
