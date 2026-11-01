package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class H2 extends V {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f26701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List<NetworkSettings> f26702t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final U2 f26703u;

    public final H2 a(String str, List<? extends NetworkSettings> list, U2 u10) {
        ck.p.j(u10, C3537j8.f29262p);
        return new H2(str, list, u10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H2)) {
            return false;
        }
        H2 h10 = (H2) obj;
        return ck.p.e(this.f26701s, h10.f26701s) && ck.p.e(this.f26702t, h10.f26702t) && ck.p.e(this.f26703u, h10.f26703u);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public H2(String str, List<? extends NetworkSettings> list, U2 u10) {
        ck.p.j(u10, C3537j8.f29262p);
        IronSource.a aVar = IronSource.a.BANNER;
        C3641p2 c3641p2D = u10.d();
        ck.p.i(c3641p2D, "configs.bannerAuctionSettings");
        super(aVar, str, list, c3641p2D, u10.a(), (int) (u10.b() / ((long) 1000)), u10.c(), u10.f(), -1, I2.b(u10), new I0(u10.j()), u10.e(), u10.l(), u10.n(), u10.m(), false, 32768, null);
        this.f26701s = str;
        this.f26702t = list;
        this.f26703u = u10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ H2 a(H2 h10, String str, List list, U2 u10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = h10.f26701s;
        }
        if ((i10 & 2) != 0) {
            list = h10.f26702t;
        }
        if ((i10 & 4) != 0) {
            u10 = h10.f26703u;
        }
        return h10.a(str, list, u10);
    }

    public int hashCode() {
        String str = this.f26701s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f26702t;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f26703u.hashCode();
    }

    @Override // com.ironsource.V
    public List<NetworkSettings> j() {
        return this.f26702t;
    }

    @Override // com.ironsource.V
    public String o() {
        return this.f26701s;
    }

    public final String s() {
        return this.f26701s;
    }

    public final List<NetworkSettings> t() {
        return this.f26702t;
    }

    public String toString() {
        return "BannerAdManagerData(userId=" + this.f26701s + ", providerList=" + this.f26702t + ", configs=" + this.f26703u + ")";
    }

    public final U2 u() {
        return this.f26703u;
    }

    public final U2 v() {
        return this.f26703u;
    }
}
