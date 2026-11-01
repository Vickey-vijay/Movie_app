package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class Ud extends V {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f27753s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List<NetworkSettings> f27754t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Zd f27755u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f27756v;

    public final Ud a(String str, List<? extends NetworkSettings> list, Zd zd2, boolean z10) {
        ck.p.j(zd2, C3537j8.f29262p);
        return new Ud(str, list, zd2, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ud)) {
            return false;
        }
        Ud ud2 = (Ud) obj;
        return ck.p.e(this.f27753s, ud2.f27753s) && ck.p.e(this.f27754t, ud2.f27754t) && ck.p.e(this.f27755u, ud2.f27755u) && this.f27756v == ud2.f27756v;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public Ud(String str, List<? extends NetworkSettings> list, Zd zd2, boolean z10) {
        ck.p.j(zd2, C3537j8.f29262p);
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        C3641p2 c3641p2K = zd2.k();
        ck.p.i(c3641p2K, "configs.rewardedVideoAuctionSettings");
        super(aVar, str, list, c3641p2K, zd2.g(), zd2.h(), zd2.j(), zd2.b(), zd2.c(), Vd.b(zd2, z10), new I0(-1L), zd2.l(), zd2.f(), zd2.o(), zd2.n(), false, 32768, null);
        this.f27753s = str;
        this.f27754t = list;
        this.f27755u = zd2;
        this.f27756v = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Ud a(Ud ud2, String str, List list, Zd zd2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ud2.f27753s;
        }
        if ((i10 & 2) != 0) {
            list = ud2.f27754t;
        }
        if ((i10 & 4) != 0) {
            zd2 = ud2.f27755u;
        }
        if ((i10 & 8) != 0) {
            z10 = ud2.f27756v;
        }
        return ud2.a(str, list, zd2, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        String str = this.f27753s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f27754t;
        int iHashCode2 = (((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f27755u.hashCode()) * 31;
        boolean z10 = this.f27756v;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode2 + r10;
    }

    @Override // com.ironsource.V
    public List<NetworkSettings> j() {
        return this.f27754t;
    }

    @Override // com.ironsource.V
    public String o() {
        return this.f27753s;
    }

    public final String s() {
        return this.f27753s;
    }

    public final List<NetworkSettings> t() {
        return this.f27754t;
    }

    public String toString() {
        return "RewardedVideoAdDataManager(userId=" + this.f27753s + ", providerList=" + this.f27754t + ", configs=" + this.f27755u + ", isManual=" + this.f27756v + ")";
    }

    public final Zd u() {
        return this.f27755u;
    }

    public final boolean v() {
        return this.f27756v;
    }

    public final Zd w() {
        return this.f27755u;
    }

    public final boolean x() {
        return this.f27756v;
    }
}
