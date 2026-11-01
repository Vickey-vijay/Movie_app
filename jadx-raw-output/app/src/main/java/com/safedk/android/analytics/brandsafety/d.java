package com.safedk.android.analytics.brandsafety;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f44387j = "AdInfoKey";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f44388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f44389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f44390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f44391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f44392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    BrandSafetyUtils.AdType f44393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f44394g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f44395h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f44396i = false;

    public d(String str, String str2, String str3, String str4, String str5, BrandSafetyUtils.AdType adType) {
        this.f44388a = str;
        this.f44389b = str2;
        this.f44390c = str3;
        this.f44391d = str4;
        this.f44392e = str5;
        this.f44393f = adType;
    }

    private boolean a(BrandSafetyUtils.AdType adType) {
        return (adType == BrandSafetyUtils.AdType.BANNER || adType == BrandSafetyUtils.AdType.MREC) ? false : true;
    }

    public boolean equals(Object o10) {
        Logger.d(f44387j, "equals started with this: " + this + " and that: " + o10);
        if (this == o10) {
            return true;
        }
        if (o10 == null || getClass() != o10.getClass()) {
            return false;
        }
        d dVar = (d) o10;
        boolean zEquals = this.f44388a.equals(dVar.f44388a);
        boolean z10 = this.f44389b != null && this.f44389b.equals(dVar.f44389b);
        boolean zEquals2 = zEquals && this.f44391d.equals(dVar.f44391d) && ((this.f44392e != null && this.f44392e.equals(dVar.f44392e)) || (this.f44392e == null && dVar.f44392e == null));
        if (this.f44390c != null) {
            zEquals2 &= this.f44390c.equals(dVar.f44390c);
            String strA = CreativeInfoManager.a(this.f44391d, AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, "");
            if (this.f44392e != null && this.f44392e.equals(strA) && !a(this.f44393f)) {
                Logger.d(f44387j, "not using placement id - equals result is: " + zEquals2);
                return zEquals2;
            }
        }
        return zEquals2 && z10;
    }

    public int hashCode() {
        int iHashCode = this.f44388a.hashCode() * this.f44391d.hashCode();
        String strA = CreativeInfoManager.a(this.f44391d, AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, "");
        if (a(this.f44393f) || this.f44392e == null || !this.f44392e.equals(strA)) {
            iHashCode *= this.f44389b.hashCode();
        }
        if (this.f44390c != null) {
            return iHashCode * this.f44390c.hashCode();
        }
        return iHashCode;
    }

    public String toString() {
        return "AdInfoKey{adUnitId=" + this.f44388a + ", placementId=" + this.f44389b + ", eventId=" + com.safedk.android.utils.k.b((Object) this.f44390c) + ", sdk=" + this.f44391d + ", maxNetwork=" + com.safedk.android.utils.k.b((Object) this.f44392e) + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
    }

    public String a() {
        return (this.f44388a != null ? this.f44388a : "") + "_" + (this.f44389b != null ? this.f44389b : "") + "_" + (this.f44390c != null ? this.f44390c : "") + "_" + (this.f44391d != null ? this.f44391d : "");
    }

    public boolean a(d dVar, CreativeInfo creativeInfo) {
        if (!dVar.equals(this)) {
            return false;
        }
        if (TextUtils.isEmpty(this.f44389b)) {
            creativeInfo.h(dVar.f44389b);
            this.f44389b = dVar.f44389b;
        }
        return true;
    }
}
