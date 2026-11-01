package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Td extends AbstractC3757w0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f27711z = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C3476g0 f27712t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f27713u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C3740v0 f27714v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Zd f27715w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f27716x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f27717y;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        public final Td a(C3476g0 c3476g0, C3379ab c3379ab, boolean z10) {
            List<C3803yc> listK;
            Ne neD;
            ck.p.j(c3476g0, "adProperties");
            AbstractC3757w0.a aVar = AbstractC3757w0.f31502r;
            T3 t3C = (c3379ab == null || (neD = c3379ab.d()) == null) ? null : neD.c();
            Zd zdF = t3C != null ? t3C.f() : null;
            if (zdF == null) {
                throw new IllegalStateException("Error getting " + c3476g0.a() + " configurations");
            }
            if (c3379ab == null || (listK = c3379ab.d(c3476g0.e(), c3476g0.c())) == null) {
                listK = nj.s.k();
            }
            String strF = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(nj.t.v(listK, 10));
            Iterator<T> it = listK.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3803yc) it.next()).f());
            }
            C3649pa c3649paB = C3649pa.b();
            ck.p.i(c3649paB, "getInstance()");
            return new Td(c3476g0, z10, new C3740v0(strF, arrayList, c3649paB), zdF);
        }
    }

    public final Td a(C3476g0 c3476g0, boolean z10, C3740v0 c3740v0, Zd zd2) {
        ck.p.j(c3476g0, "adProperties");
        ck.p.j(c3740v0, "adUnitCommonData");
        ck.p.j(zd2, C3537j8.f29262p);
        return new Td(c3476g0, z10, c3740v0, zd2);
    }

    @Override // com.ironsource.AbstractC3757w0
    public C3476g0 b() {
        return this.f27712t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Td)) {
            return false;
        }
        Td td2 = (Td) obj;
        return ck.p.e(this.f27712t, td2.f27712t) && this.f27713u == td2.f27713u && ck.p.e(this.f27714v, td2.f27714v) && ck.p.e(this.f27715w, td2.f27715w);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Td(C3476g0 c3476g0, boolean z10, C3740v0 c3740v0, Zd zd2) {
        ck.p.j(c3476g0, "adProperties");
        ck.p.j(c3740v0, "adUnitCommonData");
        ck.p.j(zd2, C3537j8.f29262p);
        String strF = c3740v0.f();
        List<NetworkSettings> listD = c3740v0.d();
        C3649pa c3649paE = c3740v0.e();
        C3641p2 c3641p2K = zd2.k();
        ck.p.i(c3641p2K, "configs.rewardedVideoAuctionSettings");
        super(c3476g0, z10, strF, listD, c3649paE, c3641p2K, zd2.g(), zd2.h(), zd2.j(), zd2.b(), zd2.c(), new O0(O0.a.MANUAL, zd2.k().j(), zd2.k().b(), -1L), zd2.l(), zd2.f(), zd2.o(), zd2.n(), false, 65536, null);
        this.f27712t = c3476g0;
        this.f27713u = z10;
        this.f27714v = c3740v0;
        this.f27715w = zd2;
        this.f27716x = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.f27717y = C3397bb.f28230b;
    }

    public static /* synthetic */ Td a(Td td2, C3476g0 c3476g0, boolean z10, C3740v0 c3740v0, Zd zd2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c3476g0 = td2.f27712t;
        }
        if ((i10 & 2) != 0) {
            z10 = td2.f27713u;
        }
        if ((i10 & 4) != 0) {
            c3740v0 = td2.f27714v;
        }
        if ((i10 & 8) != 0) {
            zd2 = td2.f27715w;
        }
        return td2.a(c3476g0, z10, c3740v0, zd2);
    }

    public final C3740v0 A() {
        return this.f27714v;
    }

    public final Zd B() {
        return this.f27715w;
    }

    @Override // com.ironsource.AbstractC3757w0
    public JSONObject b(NetworkSettings networkSettings) {
        ck.p.j(networkSettings, "providerSettings");
        JSONObject rewardedVideoSettings = networkSettings.getRewardedVideoSettings();
        ck.p.i(rewardedVideoSettings, "providerSettings.rewardedVideoSettings");
        return rewardedVideoSettings;
    }

    @Override // com.ironsource.AbstractC3757w0
    public String c() {
        return this.f27716x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.f27712t.hashCode() * 31;
        boolean z10 = this.f27713u;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return ((((iHashCode + r10) * 31) + this.f27714v.hashCode()) * 31) + this.f27715w.hashCode();
    }

    @Override // com.ironsource.AbstractC3757w0
    public String j() {
        return this.f27717y;
    }

    public String toString() {
        return "RewardedAdUnitData(adProperties=" + this.f27712t + ", isPublisherLoad=" + this.f27713u + ", adUnitCommonData=" + this.f27714v + ", configs=" + this.f27715w + ")";
    }

    @Override // com.ironsource.AbstractC3757w0
    public boolean u() {
        return this.f27713u;
    }

    public final C3476g0 w() {
        return this.f27712t;
    }

    public final boolean x() {
        return this.f27713u;
    }

    public final C3740v0 y() {
        return this.f27714v;
    }

    public final Zd z() {
        return this.f27715w;
    }
}
