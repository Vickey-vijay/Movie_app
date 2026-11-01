package com.yk.e.callBack;

import android.view.View;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes9.dex */
public interface MainBannerCallBack extends MainAdCallBack {
    void onAdClose();

    void onAdLoaded(View view);

    void onAdShow(AdInfo adInfo);
}
