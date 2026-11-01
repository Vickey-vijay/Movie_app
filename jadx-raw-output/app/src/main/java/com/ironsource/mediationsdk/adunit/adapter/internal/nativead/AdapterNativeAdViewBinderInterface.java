package com.ironsource.mediationsdk.adunit.adapter.internal.nativead;

import android.view.View;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;

/* JADX INFO: loaded from: classes4.dex */
public interface AdapterNativeAdViewBinderInterface extends NativeAdViewBinderInterface {
    ViewGroup getNetworkNativeAdView();

    void setNativeAdView(View view);
}
