package com.yk.e.callBack;

import android.view.View;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes11.dex */
public interface MainNativeAdCallBack extends MainAdCallBack {
    void onAdClose();

    void onAdLoaded(View view);

    void onAdShow(AdInfo adInfo);

    void onAdVideoComplete();

    void onAdVideoStart();
}
