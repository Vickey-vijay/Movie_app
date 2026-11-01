package com.inmobi.media;

import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3044n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f24860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f24864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f24865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f24866h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3044n0)) {
            return false;
        }
        C3044n0 c3044n0 = (C3044n0) obj;
        return ck.p.e(this.f24859a, c3044n0.f24859a) && ck.p.e("im", "im") && ck.p.e(this.f24860b, c3044n0.f24860b) && this.f24861c == c3044n0.f24861c && ck.p.e(this.f24862d, c3044n0.f24862d) && ck.p.e(this.f24863e, c3044n0.f24863e) && ck.p.e("unifiedSdkJson", "unifiedSdkJson") && ck.p.e(this.f24864f, c3044n0.f24864f) && ck.p.e(this.f24865g, c3044n0.f24865g) && this.f24866h == c3044n0.f24866h && ck.p.e(null, null);
    }

    public C3044n0(String str, Map map, long j10, String str2, String str3, Map map2, String str4, boolean z10) {
        ck.p.j(str, "clientRequestId");
        ck.p.j("im", "integrationTypeString");
        ck.p.j(str2, "monetizationContext");
        ck.p.j("unifiedSdkJson", "adFormat");
        this.f24859a = str;
        this.f24860b = map;
        this.f24861c = j10;
        this.f24862d = str2;
        this.f24863e = str3;
        this.f24864f = map2;
        this.f24865g = str4;
        this.f24866h = z10;
    }

    public final int hashCode() {
        int iHashCode = ((this.f24859a.hashCode() * 31) + 3364) * 31;
        Map map = this.f24860b;
        int iHashCode2 = (this.f24862d.hashCode() + ((Long.hashCode(this.f24861c) + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31)) * 31)) * 31;
        String str = this.f24863e;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + 1309392464) * 31;
        Map map2 = this.f24864f;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str2 = this.f24865g;
        return (Boolean.hashCode(this.f24866h) + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
    }

    public final String toString() {
        return "AdMetaData(clientRequestId=" + this.f24859a + ", integrationTypeString=im, extras=" + this.f24860b + ", imPlacementId=" + this.f24861c + ", monetizationContext=" + this.f24862d + ", adType=" + this.f24863e + ", adFormat=unifiedSdkJson, adSpecificRequestParams=" + this.f24864f + ", keywords=" + this.f24865g + ", isApplicationMutedByPub=" + this.f24866h + ", extraInfo=" + ((Object) null) + ")";
    }
}
