package com.chenyingjie.okhttp.open;

import android.content.Context;

import com.chenyingjie.okhttp.inner.factory.AdFactory;
import com.chenyingjie.okhttp.inner.inter.IRewardAd;

/**
 * create by chenyingjie on 2020/6/9
 * desc
 */
public class LoadRewardAd {

    private AdFactory adFactory;

    public LoadRewardAd() {
        adFactory = new AdFactory();
    }

    public void loadAd(Context context) {
        IRewardAd rewardAd = adFactory.createRewardAd();
        rewardAd.loadReward(context);
    }
}
