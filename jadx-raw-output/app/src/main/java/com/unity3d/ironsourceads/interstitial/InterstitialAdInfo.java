package com.unity3d.ironsourceads.interstitial;

import ck.p;
import com.ironsource.sdk.controller.f;

/* JADX INFO: loaded from: classes10.dex */
public final class InterstitialAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45274b;

    public InterstitialAdInfo(String str, String str2) {
        p.j(str, "instanceId");
        p.j(str2, f.b.f30919c);
        this.f45273a = str;
        this.f45274b = str2;
    }

    public final String getAdId() {
        return this.f45274b;
    }

    public final String getInstanceId() {
        return this.f45273a;
    }

    public String toString() {
        return "[instanceId: '" + this.f45273a + "', adId: '" + this.f45274b + "']";
    }
}
