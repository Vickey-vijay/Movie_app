package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.InlineParams;

/* JADX INFO: renamed from: com.inmobi.media.gi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2888gi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3243v0 f24434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f24439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f24440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f24441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24442i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3120q1 f24443j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3012li f24444k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f24445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InlineParams f24446m;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2888gi)) {
            return false;
        }
        C2888gi c2888gi = (C2888gi) obj;
        return ck.p.e(this.f24434a, c2888gi.f24434a) && ck.p.e(this.f24435b, c2888gi.f24435b) && ck.p.e(this.f24436c, c2888gi.f24436c) && ck.p.e(this.f24437d, c2888gi.f24437d) && this.f24438e == c2888gi.f24438e && ck.p.e(this.f24439f, c2888gi.f24439f) && ck.p.e(this.f24440g, c2888gi.f24440g) && this.f24441h == c2888gi.f24441h && this.f24442i == c2888gi.f24442i && ck.p.e(this.f24443j, c2888gi.f24443j) && ck.p.e(this.f24444k, c2888gi.f24444k) && ck.p.e(this.f24445l, c2888gi.f24445l) && ck.p.e(this.f24446m, c2888gi.f24446m);
    }

    public C2888gi(C3243v0 c3243v0, String str, String str2, String str3, int i10, String str4, String str5, boolean z10, int i11, C3120q1 c3120q1, C3012li c3012li, String str6, InlineParams inlineParams) {
        ck.p.j(c3243v0, "placement");
        ck.p.j(str, "markupType");
        ck.p.j(str2, "impressionId");
        ck.p.j(str3, "telemetryMetadataBlob");
        ck.p.j(str4, "creativeType");
        ck.p.j(str5, "creativeId");
        this.f24434a = c3243v0;
        this.f24435b = str;
        this.f24436c = str2;
        this.f24437d = str3;
        this.f24438e = i10;
        this.f24439f = str4;
        this.f24440g = str5;
        this.f24441h = z10;
        this.f24442i = i11;
        this.f24443j = c3120q1;
        this.f24444k = c3012li;
        this.f24445l = str6;
        this.f24446m = inlineParams;
    }

    public final int hashCode() {
        int iA = AbstractC2862fi.a(this.f24442i, (Boolean.hashCode(this.f24441h) + ((this.f24440g.hashCode() + ((this.f24439f.hashCode() + AbstractC2862fi.a(this.f24438e, (this.f24437d.hashCode() + ((this.f24436c.hashCode() + ((this.f24435b.hashCode() + (this.f24434a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31, 31);
        C3120q1 c3120q1 = this.f24443j;
        int iHashCode = (iA + (c3120q1 == null ? 0 : c3120q1.hashCode())) * 31;
        C3012li c3012li = this.f24444k;
        int iHashCode2 = (iHashCode + (c3012li == null ? 0 : Integer.hashCode(c3012li.f24779a))) * 31;
        String str = this.f24445l;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        InlineParams inlineParams = this.f24446m;
        return iHashCode3 + (inlineParams != null ? inlineParams.hashCode() : 0);
    }

    public final String toString() {
        return "RenderViewMetaData(placement=" + this.f24434a + ", markupType=" + this.f24435b + ", impressionId=" + this.f24436c + ", telemetryMetadataBlob=" + this.f24437d + ", internetAvailabilityAdRetryCount=" + this.f24438e + ", creativeType=" + this.f24439f + ", creativeId=" + this.f24440g + ", isRewarded=" + this.f24441h + ", adIndex=" + this.f24442i + ", adUnitTelemetryData=" + this.f24443j + ", renderViewTelemetryData=" + this.f24444k + ", renderViewId=" + this.f24445l + ", inlineParams=" + this.f24446m + ")";
    }
}
