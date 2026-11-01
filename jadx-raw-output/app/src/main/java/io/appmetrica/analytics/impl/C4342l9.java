package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4342l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xe f57180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yo f57181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sk f57182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M6 f57183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I8 f57184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Kk f57185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4281j0 f57186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C4054a5 f57187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TimeProvider f57188i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f57189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f57190k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f57191l;

    public final void a(Q5 q10, Uk uk2) {
        Map map = q10.f55788p;
        Kk kk2 = this.f57185f;
        kk2.getClass();
        map.putAll(new HashMap(kk2.f55482b));
        q10.c(this.f57180a.j());
        q10.f55787o = Integer.valueOf(this.f57181b.b());
        C4256i0 c4256i0A = this.f57186g.a();
        I8 i10 = this.f57184e;
        i10.getClass();
        H8 h10 = (H8) i10.f55341b.a(EnumC4112cb.a(q10.f55776d));
        M6 m10 = this.f57183d;
        A8 a8A = h10.a(q10);
        int i11 = q10.f55776d;
        yo yoVar = this.f57181b;
        C4263i7 c4263i7 = new C4263i7(m10.f55555g, uk2, i11, yoVar, a8A, (C4350lh) m10.f55556h.f56209k.a(), c4256i0A);
        Long lValueOf = Long.valueOf(uk2.f55996a);
        Wk wk2 = uk2.f55999d;
        Long lValueOf2 = Long.valueOf(uk2.f55997b);
        EnumC4112cb enumC4112cbA = EnumC4112cb.a(c4263i7.f56952h.f55776d);
        long jOptLong = 0;
        if (!AbstractC4641x9.f57924g.contains(EnumC4112cb.a(i11))) {
            synchronized (yoVar) {
                JSONObject jSONObjectA = yoVar.f58037a.a();
                jOptLong = jSONObjectA.optLong("global_number", 0L);
                yoVar.f58037a.a(jSONObjectA.put("global_number", 1 + jOptLong));
            }
        }
        m10.a(m10.f55560l.fromModel(new C4185f7(lValueOf, wk2, lValueOf2, enumC4112cbA, Long.valueOf(jOptLong), Long.valueOf(uk2.f55998c), c4263i7.a())));
        this.f57187h.f56320a.h();
    }

    public C4342l9(Xe xe2, yo yoVar, Sk sk2, M6 m10, C4281j0 c4281j0, I8 i10, Kk kk2, int i11, C4054a5 c4054a5, SystemTimeProvider systemTimeProvider) {
        this.f57180a = xe2;
        this.f57181b = yoVar;
        this.f57182c = sk2;
        this.f57183d = m10;
        this.f57186g = c4281j0;
        this.f57184e = i10;
        this.f57185f = kk2;
        this.f57189j = i11;
        this.f57188i = systemTimeProvider;
        this.f57187h = c4054a5;
        this.f57190k = xe2.i();
        this.f57191l = xe2.h();
    }
}
