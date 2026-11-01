package com.ironsource.mediationsdk.adunit.adapter.internal;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;

/* JADX INFO: loaded from: classes4.dex */
public interface AdapterAdFullScreenInterface<Listener extends AdapterAdListener> {
    void destroyAd(AdData adData);

    boolean isAdAvailable(AdData adData);

    void loadAd(AdData adData, Context context, Listener listener);

    void showAd(AdData adData, Activity activity, Listener listener);
}
