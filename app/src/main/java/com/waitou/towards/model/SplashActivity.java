package com.waitou.towards.model;

import android.os.Bundle;

import com.waitou.wt_library.base.UIPresent;
import com.waitou.wt_library.base.XActivity;


/**
 * Created by waitou on 17/2/3.
 */

public class SplashActivity extends XActivity {

    @Override
    protected UIPresent createPresenter() {
        return null;
    }

    @Override
    public boolean initXView() {
        return false;
    }

    @Override
    public int getContentViewId() {
        return 0;
    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }

    @Override
    public void reloadData() {

    }

    @Override
    public void setPresenter(Object presenter) {

    }
}
