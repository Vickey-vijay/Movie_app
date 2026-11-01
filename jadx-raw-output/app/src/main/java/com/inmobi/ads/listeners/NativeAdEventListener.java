package com.inmobi.ads.listeners;

import ck.p;
import com.inmobi.ads.InMobiNative;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeAdEventListener extends AdEventListener<InMobiNative> {
    public void onAdClicked(InMobiNative inMobiNative) {
        p.j(inMobiNative, "ad");
    }

    public void onAdFullScreenDismissed(InMobiNative inMobiNative) {
        p.j(inMobiNative, "ad");
    }

    public void onAdFullScreenDisplayed(InMobiNative inMobiNative) {
        p.j(inMobiNative, "ad");
    }

    public void onUserWillLeaveApplication(InMobiNative inMobiNative) {
        p.j(inMobiNative, "ad");
    }
}
