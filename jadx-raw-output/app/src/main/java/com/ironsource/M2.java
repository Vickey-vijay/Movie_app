package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class M2 extends AbstractC3757w0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f27027z = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final J2 f27028t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f27029u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C3740v0 f27030v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final U2 f27031w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f27032x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f27033y;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        public final M2 a(J2 j10, C3379ab c3379ab, boolean z10) {
            List<C3803yc> listK;
            Ne neD;
            ck.p.j(j10, "adProperties");
            AbstractC3757w0.a aVar = AbstractC3757w0.f31502r;
            T3 t3C = (c3379ab == null || (neD = c3379ab.d()) == null) ? null : neD.c();
            U2 u2C = t3C != null ? t3C.c() : null;
            if (u2C == null) {
                throw new IllegalStateException("Error getting " + j10.a() + " configurations");
            }
            if (c3379ab == null || (listK = c3379ab.d(j10.e(), j10.c())) == null) {
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
            return new M2(j10, z10, new C3740v0(strF, arrayList, c3649paB), u2C);
        }
    }

    public final M2 a(J2 j10, boolean z10, C3740v0 c3740v0, U2 u10) {
        ck.p.j(j10, "adProperties");
        ck.p.j(c3740v0, "adUnitCommonData");
        ck.p.j(u10, C3537j8.f29262p);
        return new M2(j10, z10, c3740v0, u10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M2)) {
            return false;
        }
        M2 m10 = (M2) obj;
        return ck.p.e(this.f27028t, m10.f27028t) && this.f27029u == m10.f27029u && ck.p.e(this.f27030v, m10.f27030v) && ck.p.e(this.f27031w, m10.f27031w);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public M2(J2 j10, boolean z10, C3740v0 c3740v0, U2 u10) {
        ck.p.j(j10, "adProperties");
        ck.p.j(c3740v0, "adUnitCommonData");
        ck.p.j(u10, C3537j8.f29262p);
        String strF = c3740v0.f();
        List<NetworkSettings> listD = c3740v0.d();
        C3649pa c3649paE = c3740v0.e();
        C3641p2 c3641p2D = u10.d();
        ck.p.i(c3641p2D, "configs.bannerAuctionSettings");
        super(j10, z10, strF, listD, c3649paE, c3641p2D, u10.a(), (int) (u10.b() / ((long) 1000)), u10.c(), u10.f(), -1, new O0(O0.a.MANUAL_WITH_AUTOMATIC_RELOAD, u10.d().j(), u10.d().b(), 1000 * ((long) u10.h())), u10.e(), u10.l(), u10.n(), u10.m(), false, 65536, null);
        this.f27028t = j10;
        this.f27029u = z10;
        this.f27030v = c3740v0;
        this.f27031w = u10;
        this.f27032x = "BN";
        this.f27033y = C3397bb.f28232d;
    }

    public static /* synthetic */ M2 a(M2 m10, J2 j10, boolean z10, C3740v0 c3740v0, U2 u10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = m10.f27028t;
        }
        if ((i10 & 2) != 0) {
            z10 = m10.f27029u;
        }
        if ((i10 & 4) != 0) {
            c3740v0 = m10.f27030v;
        }
        if ((i10 & 8) != 0) {
            u10 = m10.f27031w;
        }
        return m10.a(j10, z10, c3740v0, u10);
    }

    @Override // com.ironsource.AbstractC3757w0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public J2 b() {
        return this.f27028t;
    }

    public final C3740v0 B() {
        return this.f27030v;
    }

    public final U2 C() {
        return this.f27031w;
    }

    @Override // com.ironsource.AbstractC3757w0
    public JSONObject b(NetworkSettings networkSettings) {
        ck.p.j(networkSettings, "providerSettings");
        JSONObject bannerSettings = networkSettings.getBannerSettings();
        ck.p.i(bannerSettings, "providerSettings.bannerSettings");
        return bannerSettings;
    }

    @Override // com.ironsource.AbstractC3757w0
    public String c() {
        return this.f27032x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.f27028t.hashCode() * 31;
        boolean z10 = this.f27029u;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return ((((iHashCode + r10) * 31) + this.f27030v.hashCode()) * 31) + this.f27031w.hashCode();
    }

    @Override // com.ironsource.AbstractC3757w0
    public String j() {
        return this.f27033y;
    }

    public String toString() {
        return "BannerAdUnitData(adProperties=" + this.f27028t + ", isPublisherLoad=" + this.f27029u + ", adUnitCommonData=" + this.f27030v + ", configs=" + this.f27031w + ")";
    }

    @Override // com.ironsource.AbstractC3757w0
    public boolean u() {
        return this.f27029u;
    }

    public final J2 w() {
        return this.f27028t;
    }

    public final boolean x() {
        return this.f27029u;
    }

    public final C3740v0 y() {
        return this.f27030v;
    }

    public final U2 z() {
        return this.f27031w;
    }

    @Override // com.ironsource.AbstractC3757w0
    public AdData a(NetworkSettings networkSettings) {
        ck.p.j(networkSettings, "providerSettings");
        AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(networkSettings), b().a(), r(), new com.ironsource.mediationsdk.q(ContextProvider.getInstance().getApplicationContext(), new C3565l0().b(b().h())));
        ck.p.i(adDataCreateAdDataForNetworkAdapter, "createAdDataForNetworkAd…ze(adProperties.adSize)))");
        return adDataCreateAdDataForNetworkAdapter;
    }
}
