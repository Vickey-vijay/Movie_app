package com.yandex.mobile.ads.interstitial;

import android.app.Activity;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@MainThread
public interface InterstitialAd {
    List<Object> getAdAttributes();

    AdInfo getInfo();

    void setAdEventListener(InterstitialAdEventListener interstitialAdEventListener);

    void show(Activity activity);
}
