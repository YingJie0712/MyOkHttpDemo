package com.chenyingjie.okhttp.inner.factory;

import com.chenyingjie.okhttp.inner.imp.RewardAdImp;
import com.chenyingjie.okhttp.inner.inter.IRewardAd;

/**
 * create by chenyingjie on 2020/6/9
 * desc
 */
public class AdFactory {

    public IRewardAd createRewardAd() {
        return new RewardAdImp();
    }
}
