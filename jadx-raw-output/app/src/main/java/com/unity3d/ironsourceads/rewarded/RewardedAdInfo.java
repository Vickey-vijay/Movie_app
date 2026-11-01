package com.unity3d.ironsourceads.rewarded;

import ck.p;
import com.ironsource.sdk.controller.f;

/* JADX INFO: loaded from: classes9.dex */
public final class RewardedAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45287b;

    public RewardedAdInfo(String str, String str2) {
        p.j(str, "instanceId");
        p.j(str2, f.b.f30919c);
        this.f45286a = str;
        this.f45287b = str2;
    }

    public final String getAdId() {
        return this.f45287b;
    }

    public final String getInstanceId() {
        return this.f45286a;
    }

    public String toString() {
        return "[instanceId: '" + this.f45286a + "', adId: '" + this.f45287b + "']";
    }
}
