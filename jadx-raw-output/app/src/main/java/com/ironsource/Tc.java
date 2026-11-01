package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class Tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E0 f27710a;

    public final void a() {
        this.f27710a.a(B0.OPERATIONAL_LOAD_AD, new HashMap());
    }

    public Tc(E0 e10) {
        ck.p.j(e10, "eventsWrapper");
        this.f27710a = e10;
    }

    public final void b() {
        this.f27710a.a(B0.PAUSE_AD, null);
    }

    public final void c() {
        this.f27710a.a(B0.RESUME_AD, null);
    }

    public final void a(long j10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        this.f27710a.a(B0.OPERATIONAL_LOAD_SUCCESS, map);
    }

    public final void a(long j10, int i10, String str) {
        ck.p.j(str, "reason");
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        map.put("reason", str);
        map.put("duration", Long.valueOf(j10));
        this.f27710a.a(B0.OPERATIONAL_LOAD_FAILED, map);
    }

    public final void a(double d10) {
        this.f27710a.a(B0.OPERATIONAL_SET_CONFIGURATIONS, nj.l0.g(mj.h.a(IronSourceConstants.EVENTS_EXT1, "flooring=" + d10)));
    }
}
