package com.unity3d.ironsourceads.banner;

import ck.p;
import com.ironsource.sdk.controller.f;

/* JADX INFO: loaded from: classes10.dex */
public final class BannerAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45240b;

    public static /* synthetic */ BannerAdInfo copy$default(BannerAdInfo bannerAdInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bannerAdInfo.f45239a;
        }
        if ((i10 & 2) != 0) {
            str2 = bannerAdInfo.f45240b;
        }
        return bannerAdInfo.copy(str, str2);
    }

    public final String component1() {
        return this.f45239a;
    }

    public final String component2() {
        return this.f45240b;
    }

    public final BannerAdInfo copy(String str, String str2) {
        p.j(str, "instanceId");
        p.j(str2, f.b.f30919c);
        return new BannerAdInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAdInfo)) {
            return false;
        }
        BannerAdInfo bannerAdInfo = (BannerAdInfo) obj;
        return p.e(this.f45239a, bannerAdInfo.f45239a) && p.e(this.f45240b, bannerAdInfo.f45240b);
    }

    public int hashCode() {
        return (this.f45239a.hashCode() * 31) + this.f45240b.hashCode();
    }

    public BannerAdInfo(String str, String str2) {
        p.j(str, "instanceId");
        p.j(str2, f.b.f30919c);
        this.f45239a = str;
        this.f45240b = str2;
    }

    public final String getAdId() {
        return this.f45240b;
    }

    public final String getInstanceId() {
        return this.f45239a;
    }

    public String toString() {
        return "[instanceId: '" + this.f45239a + "', adId: '" + this.f45240b + "']";
    }
}
