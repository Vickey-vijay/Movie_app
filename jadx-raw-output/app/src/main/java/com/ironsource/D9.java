package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class D9 extends V {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f26330s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List<NetworkSettings> f26331t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final H9 f26332u;

    public final D9 a(String str, List<? extends NetworkSettings> list, H9 h10) {
        ck.p.j(h10, C3537j8.f29262p);
        return new D9(str, list, h10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D9)) {
            return false;
        }
        D9 d10 = (D9) obj;
        return ck.p.e(this.f26330s, d10.f26330s) && ck.p.e(this.f26331t, d10.f26331t) && ck.p.e(this.f26332u, d10.f26332u);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public D9(String str, List<? extends NetworkSettings> list, H9 h10) {
        ck.p.j(h10, C3537j8.f29262p);
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        C3641p2 c3641p2G = h10.g();
        ck.p.i(c3641p2G, "configs.interstitialAuctionSettings");
        super(aVar, str, list, c3641p2G, h10.c(), h10.d(), h10.f(), h10.b(), -1, new O0(O0.a.MANUAL, h10.g().j(), h10.g().b(), -1L), new I0(-1L), h10.h(), h10.k(), h10.m(), h10.l(), false, 32768, null);
        this.f26330s = str;
        this.f26331t = list;
        this.f26332u = h10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ D9 a(D9 d10, String str, List list, H9 h10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = d10.f26330s;
        }
        if ((i10 & 2) != 0) {
            list = d10.f26331t;
        }
        if ((i10 & 4) != 0) {
            h10 = d10.f26332u;
        }
        return d10.a(str, list, h10);
    }

    public int hashCode() {
        String str = this.f26330s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f26331t;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f26332u.hashCode();
    }

    @Override // com.ironsource.V
    public List<NetworkSettings> j() {
        return this.f26331t;
    }

    @Override // com.ironsource.V
    public String o() {
        return this.f26330s;
    }

    public final String s() {
        return this.f26330s;
    }

    public final List<NetworkSettings> t() {
        return this.f26331t;
    }

    public String toString() {
        return "InterstitialAdManagerData(userId=" + this.f26330s + ", providerList=" + this.f26331t + ", configs=" + this.f26332u + ")";
    }

    public final H9 u() {
        return this.f26332u;
    }

    public final H9 v() {
        return this.f26332u;
    }
}
