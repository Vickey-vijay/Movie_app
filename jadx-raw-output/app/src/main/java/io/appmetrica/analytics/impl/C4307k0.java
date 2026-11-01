package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4307k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f57064a = new HashMap();

    public final synchronized C4281j0 a(R4 r10, PublicLogger publicLogger, Xe xe2) {
        C4281j0 c4281j0;
        c4281j0 = (C4281j0) this.f57064a.get(r10.toString());
        if (c4281j0 == null) {
            C4256i0 c4256i0D = xe2.d();
            c4281j0 = new C4281j0(c4256i0D.f56933a, c4256i0D.f56934b, new C4528sl(publicLogger, "[App Environment]"));
            this.f57064a.put(r10.toString(), c4281j0);
        }
        return c4281j0;
    }

    public final synchronized void a(C4256i0 c4256i0, Xe xe2) {
        xe2.a(c4256i0).b();
    }
}
