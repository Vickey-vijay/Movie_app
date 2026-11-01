package com.yk.e.callBack;

import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes8.dex */
public interface MainFloatViewCallback extends MainAdCallBack {
    void onAdClose();

    void onAdHide();

    void onAdLoaded();

    void onAdShow(AdInfo adInfo);
}
