package com.yk.e.callBack;

import android.view.View;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes10.dex */
public interface MainThirdBannerCallBack extends MainAdCallBack {
    void onAdClose();

    void onAdLoaded(View view);

    void onAdShow(AdInfo adInfo);
}
