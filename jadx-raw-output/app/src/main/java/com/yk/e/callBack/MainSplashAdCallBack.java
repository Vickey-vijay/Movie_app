package com.yk.e.callBack;

import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes11.dex */
public interface MainSplashAdCallBack extends MainAdCallBack {
    void onAdClose();

    void onAdComplete();

    void onAdLoaded();

    void onAdShow(AdInfo adInfo);

    void onAdSkipped();
}
