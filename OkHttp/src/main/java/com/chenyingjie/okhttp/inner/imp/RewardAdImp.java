package com.chenyingjie.okhttp.inner.imp;

import android.content.Context;
import android.content.Intent;

import com.chenyingjie.okhttp.inner.inter.IRewardAd;
import com.chenyingjie.okhttp.ui.RewardVideoActivity;

/**
 * create by chenyingjie on 2020/6/9
 * desc
 */
public class RewardAdImp implements IRewardAd {
    @Override
    public void loadReward(Context context) {
        if (context != null) context.startActivity(new Intent(context, RewardVideoActivity.class));
    }
}
