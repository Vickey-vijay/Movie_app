package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class F9 extends AbstractC3757w0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f26512z = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C3476g0 f26513t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f26514u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C3740v0 f26515v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final H9 f26516w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f26517x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f26518y;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        public final F9 a(C3476g0 c3476g0, C3379ab c3379ab, boolean z10) {
            List<C3803yc> listK;
            Ne neD;
            ck.p.j(c3476g0, "adProperties");
            AbstractC3757w0.a aVar = AbstractC3757w0.f31502r;
            T3 t3C = (c3379ab == null || (neD = c3379ab.d()) == null) ? null : neD.c();
            H9 h9D = t3C != null ? t3C.d() : null;
            if (h9D == null) {
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
            return new F9(c3476g0, z10, new C3740v0(strF, arrayList, c3649paB), h9D);
        }
    }

    public final F9 a(C3476g0 c3476g0, boolean z10, C3740v0 c3740v0, H9 h10) {
        ck.p.j(c3476g0, "adProperties");
        ck.p.j(c3740v0, "adUnitCommonData");
        ck.p.j(h10, C3537j8.f29262p);
        return new F9(c3476g0, z10, c3740v0, h10);
    }

    @Override // com.ironsource.AbstractC3757w0
    public C3476g0 b() {
        return this.f26513t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F9)) {
            return false;
        }
        F9 f10 = (F9) obj;
        return ck.p.e(this.f26513t, f10.f26513t) && this.f26514u == f10.f26514u && ck.p.e(this.f26515v, f10.f26515v) && ck.p.e(this.f26516w, f10.f26516w);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public F9(C3476g0 c3476g0, boolean z10, C3740v0 c3740v0, H9 h10) {
        ck.p.j(c3476g0, "adProperties");
        ck.p.j(c3740v0, "adUnitCommonData");
        ck.p.j(h10, C3537j8.f29262p);
        String strF = c3740v0.f();
        List<NetworkSettings> listD = c3740v0.d();
        C3649pa c3649paE = c3740v0.e();
        C3641p2 c3641p2G = h10.g();
        ck.p.i(c3641p2G, "configs.interstitialAuctionSettings");
        super(c3476g0, z10, strF, listD, c3649paE, c3641p2G, h10.c(), h10.d(), h10.f(), h10.b(), -1, new O0(O0.a.MANUAL, h10.g().j(), h10.g().b(), -1L), h10.h(), h10.k(), h10.m(), h10.l(), false, 65536, null);
        this.f26513t = c3476g0;
        this.f26514u = z10;
        this.f26515v = c3740v0;
        this.f26516w = h10;
        this.f26517x = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.f26518y = C3397bb.f28231c;
    }

    public static /* synthetic */ F9 a(F9 f10, C3476g0 c3476g0, boolean z10, C3740v0 c3740v0, H9 h10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c3476g0 = f10.f26513t;
        }
        if ((i10 & 2) != 0) {
            z10 = f10.f26514u;
        }
        if ((i10 & 4) != 0) {
            c3740v0 = f10.f26515v;
        }
        if ((i10 & 8) != 0) {
            h10 = f10.f26516w;
        }
        return f10.a(c3476g0, z10, c3740v0, h10);
    }

    public final C3740v0 A() {
        return this.f26515v;
    }

    public final H9 B() {
        return this.f26516w;
    }

    @Override // com.ironsource.AbstractC3757w0
    public JSONObject b(NetworkSettings networkSettings) {
        ck.p.j(networkSettings, "providerSettings");
        JSONObject interstitialSettings = networkSettings.getInterstitialSettings();
        ck.p.i(interstitialSettings, "providerSettings.interstitialSettings");
        return interstitialSettings;
    }

    @Override // com.ironsource.AbstractC3757w0
    public String c() {
        return this.f26517x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.f26513t.hashCode() * 31;
        boolean z10 = this.f26514u;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return ((((iHashCode + r10) * 31) + this.f26515v.hashCode()) * 31) + this.f26516w.hashCode();
    }

    @Override // com.ironsource.AbstractC3757w0
    public String j() {
        return this.f26518y;
    }

    public String toString() {
        return "InterstitialAdUnitData(adProperties=" + this.f26513t + ", isPublisherLoad=" + this.f26514u + ", adUnitCommonData=" + this.f26515v + ", configs=" + this.f26516w + ")";
    }

    @Override // com.ironsource.AbstractC3757w0
    public boolean u() {
        return this.f26514u;
    }

    public final C3476g0 w() {
        return this.f26513t;
    }

    public final boolean x() {
        return this.f26514u;
    }

    public final C3740v0 y() {
        return this.f26515v;
    }

    public final H9 z() {
        return this.f26516w;
    }
}
