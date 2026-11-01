package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2767c0 f23772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3019m0 f23773b;

    public X(C2767c0 c2767c0, C3019m0 c3019m0) {
        ck.p.j(c2767c0, "adLifecycleData");
        ck.p.j(c3019m0, "adManagerTelemetryHelper");
        this.f23772a = c2767c0;
        this.f23773b = c3019m0;
    }

    public final void a(W w10) {
        ck.p.j(w10, "adFetchEvent");
        if (w10 instanceof C2881gb) {
            C2767c0 c2767c0 = this.f23772a;
            c2767c0.getClass();
            c2767c0.f24103b = SystemClock.elapsedRealtime();
        } else if (w10 instanceof If) {
            C2767c0 c2767c1 = this.f23772a;
            c2767c1.getClass();
            c2767c1.f24107f = SystemClock.elapsedRealtime();
        } else {
            if (!(w10 instanceof Oi)) {
                throw new NoWhenBranchMatchedException();
            }
            C3019m0 c3019m0 = this.f23773b;
            Map map = ((Oi) w10).f23298a;
            c3019m0.getClass();
            ck.p.j(map, "payload");
            nk.j.d(c3019m0.f24793a, null, null, new C2969k0(c3019m0, map, null), 3, null);
        }
    }
}
