package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.InlineParams;

/* JADX INFO: loaded from: classes7.dex */
public final class Va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InlineParams f23698e;

    public Va(boolean z10, String str, boolean z11, boolean z12, InlineParams inlineParams) {
        ck.p.j(str, "landingScheme");
        this.f23694a = z10;
        this.f23695b = str;
        this.f23696c = z11;
        this.f23697d = z12;
        this.f23698e = inlineParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Va)) {
            return false;
        }
        Va va2 = (Va) obj;
        return this.f23694a == va2.f23694a && ck.p.e(this.f23695b, va2.f23695b) && this.f23696c == va2.f23696c && this.f23697d == va2.f23697d && ck.p.e(this.f23698e, va2.f23698e);
    }

    public final int hashCode() {
        int iHashCode = (Boolean.hashCode(this.f23697d) + ((Boolean.hashCode(this.f23696c) + ((this.f23695b.hashCode() + (Boolean.hashCode(this.f23694a) * 31)) * 31)) * 31)) * 31;
        InlineParams inlineParams = this.f23698e;
        return iHashCode + (inlineParams == null ? 0 : inlineParams.hashCode());
    }

    public final String toString() {
        return "LandingPageState(isInAppBrowser=" + this.f23694a + ", landingScheme=" + this.f23695b + ", isCCTEnabled=" + this.f23696c + ", isPartialTabsEnabled=" + this.f23697d + ", inlineParams=" + this.f23698e + ")";
    }

    public /* synthetic */ Va(boolean z10, String str, boolean z11, int i10) {
        this(z10, (i10 & 2) != 0 ? "DEFAULT" : str, z11, false, null);
    }
}
