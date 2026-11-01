package com.yandex.mobile.ads.nativeads;

import androidx.annotation.MainThread;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public interface NativeAd {
    void bindNativeAd(NativeAdViewBinder nativeAdViewBinder) throws NativeAdException;

    NativeAdAssets getAdAssets();

    void setNativeAdEventListener(NativeAdEventListener nativeAdEventListener);
}
