package com.yandex.mobile.ads.common;

import ck.p;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class AdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSize f50967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f50968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f50969d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.e(AdInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.h(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.common.AdInfo");
        AdInfo adInfo = (AdInfo) obj;
        return p.e(this.f50966a, adInfo.f50966a) && p.e(this.f50967b, adInfo.f50967b) && p.e(this.f50968c, adInfo.f50968c) && p.e(this.f50969d, adInfo.f50969d);
    }

    public final String getAdUnitId() {
        return this.f50966a;
    }

    public int hashCode() {
        int iHashCode = this.f50966a.hashCode() * 31;
        AdSize adSize = this.f50967b;
        int iHashCode2 = (iHashCode + (adSize != null ? adSize.hashCode() : 0)) * 31;
        String str = this.f50968c;
        return this.f50969d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.f50966a;
        AdSize adSize = this.f50967b;
        String string = adSize != null ? adSize.toString() : null;
        if (string == null) {
            string = "";
        }
        String str2 = this.f50968c;
        return "AdSize (adUnitId: " + str + ", adSize: " + string + ", data: " + (str2 != null ? str2 : "") + ", creatives: " + this.f50969d.size() + ")";
    }

    public AdInfo(String str, AdSize adSize, String str2, List<Creative> list) {
        this.f50966a = str;
        this.f50967b = adSize;
        this.f50968c = str2;
        this.f50969d = list;
    }
}
