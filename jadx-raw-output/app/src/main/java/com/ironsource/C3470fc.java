package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3470fc extends AbstractC3757w0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f28899y = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C3476g0 f28900t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final C3740v0 f28901u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Qb f28902v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f28903w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f28904x;

    /* JADX INFO: renamed from: com.ironsource.fc$a */
    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        public final C3470fc a(C3476g0 c3476g0, C3379ab c3379ab) {
            List<C3803yc> listK;
            Ne neD;
            ck.p.j(c3476g0, "adProperties");
            AbstractC3757w0.a aVar = AbstractC3757w0.f31502r;
            T3 t3C = (c3379ab == null || (neD = c3379ab.d()) == null) ? null : neD.c();
            Qb qbE = t3C != null ? t3C.e() : null;
            if (qbE == null) {
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
            return new C3470fc(c3476g0, new C3740v0(strF, arrayList, c3649paB), qbE);
        }
    }

    public final C3470fc a(C3476g0 c3476g0, C3740v0 c3740v0, Qb qb2) {
        ck.p.j(c3476g0, "adProperties");
        ck.p.j(c3740v0, "adUnitCommonData");
        ck.p.j(qb2, C3537j8.f29262p);
        return new C3470fc(c3476g0, c3740v0, qb2);
    }

    @Override // com.ironsource.AbstractC3757w0
    public C3476g0 b() {
        return this.f28900t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3470fc)) {
            return false;
        }
        C3470fc c3470fc = (C3470fc) obj;
        return ck.p.e(this.f28900t, c3470fc.f28900t) && ck.p.e(this.f28901u, c3470fc.f28901u) && ck.p.e(this.f28902v, c3470fc.f28902v);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3470fc(C3476g0 c3476g0, C3740v0 c3740v0, Qb qb2) {
        super(c3476g0, true, c3740v0.f(), c3740v0.d(), c3740v0.e(), qb2.d(), qb2.b(), (int) (qb2.c() / ((long) 1000)), qb2.a(), qb2.f(), -1, new O0(O0.a.MANUAL, qb2.d().j(), qb2.d().b(), -1L), qb2.h(), qb2.i(), qb2.k(), qb2.j(), false, 65536, null);
        ck.p.j(c3476g0, "adProperties");
        ck.p.j(c3740v0, "adUnitCommonData");
        ck.p.j(qb2, C3537j8.f29262p);
        this.f28900t = c3476g0;
        this.f28901u = c3740v0;
        this.f28902v = qb2;
        this.f28903w = "NA";
        this.f28904x = C3397bb.f28233e;
    }

    public static /* synthetic */ C3470fc a(C3470fc c3470fc, C3476g0 c3476g0, C3740v0 c3740v0, Qb qb2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c3476g0 = c3470fc.f28900t;
        }
        if ((i10 & 2) != 0) {
            c3740v0 = c3470fc.f28901u;
        }
        if ((i10 & 4) != 0) {
            qb2 = c3470fc.f28902v;
        }
        return c3470fc.a(c3476g0, c3740v0, qb2);
    }

    public final Qb A() {
        return this.f28902v;
    }

    @Override // com.ironsource.AbstractC3757w0
    public JSONObject b(NetworkSettings networkSettings) {
        ck.p.j(networkSettings, "providerSettings");
        JSONObject nativeAdSettings = networkSettings.getNativeAdSettings();
        ck.p.i(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }

    @Override // com.ironsource.AbstractC3757w0
    public String c() {
        return this.f28903w;
    }

    public int hashCode() {
        return (((this.f28900t.hashCode() * 31) + this.f28901u.hashCode()) * 31) + this.f28902v.hashCode();
    }

    @Override // com.ironsource.AbstractC3757w0
    public String j() {
        return this.f28904x;
    }

    public String toString() {
        return "NativeAdUnitData(adProperties=" + this.f28900t + ", adUnitCommonData=" + this.f28901u + ", configs=" + this.f28902v + ")";
    }

    public final C3476g0 w() {
        return this.f28900t;
    }

    public final C3740v0 x() {
        return this.f28901u;
    }

    public final Qb y() {
        return this.f28902v;
    }

    public final C3740v0 z() {
        return this.f28901u;
    }
}
