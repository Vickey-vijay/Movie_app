package com.ironsource;

import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.mediationsdk.IronSource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class E5 implements D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSource.a f26439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E0 f26440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<D0> f26441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3377a9 f26442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Ab f26443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Xf f26444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final R1 f26445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final N f26446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C3402bg f26447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Tc f26448j;

    public E5(IronSource.a aVar, E0.b bVar, List<? extends D0> list, AbstractC3692s3 abstractC3692s3) {
        ck.p.j(aVar, "adFormat");
        ck.p.j(bVar, AppLovinEventTypes.USER_COMPLETED_LEVEL);
        ck.p.j(list, "eventsInterfaces");
        this.f26439a = aVar;
        E0 e10 = new E0(aVar, bVar, this, abstractC3692s3);
        this.f26440b = e10;
        this.f26441c = nj.b0.R0(list);
        C3377a9 c3377a9 = e10.f26408e;
        ck.p.i(c3377a9, "wrapper.init");
        this.f26442d = c3377a9;
        Ab ab2 = e10.f26409f;
        ck.p.i(ab2, "wrapper.load");
        this.f26443e = ab2;
        Xf xf2 = e10.f26410g;
        ck.p.i(xf2, "wrapper.token");
        this.f26444f = xf2;
        R1 r10 = e10.f26411h;
        ck.p.i(r10, "wrapper.auction");
        this.f26445g = r10;
        N n10 = e10.f26412i;
        ck.p.i(n10, "wrapper.adInteraction");
        this.f26446h = n10;
        C3402bg c3402bg = e10.f26413j;
        ck.p.i(c3402bg, "wrapper.troubleshoot");
        this.f26447i = c3402bg;
        Tc tc2 = e10.f26414k;
        ck.p.i(tc2, "wrapper.operational");
        this.f26448j = tc2;
    }

    public final N a() {
        return this.f26446h;
    }

    @Override // com.ironsource.D0
    public Map<String, Object> a(B0 b10) {
        ck.p.j(b10, "event");
        HashMap map = new HashMap();
        Iterator<D0> it = this.f26441c.iterator();
        while (it.hasNext()) {
            Map<String, Object> mapA = it.next().a(b10);
            ck.p.i(mapA, "it.getEventsAdditionalDataMap(event)");
            map.putAll(mapA);
        }
        return map;
    }

    public final R1 b() {
        return this.f26445g;
    }

    public final List<D0> c() {
        return this.f26441c;
    }

    public final C3377a9 d() {
        return this.f26442d;
    }

    public final Ab e() {
        return this.f26443e;
    }

    public final Tc f() {
        return this.f26448j;
    }

    public final Xf g() {
        return this.f26444f;
    }

    public final C3402bg h() {
        return this.f26447i;
    }

    public final void a(D0 d10) {
        ck.p.j(d10, "eventInterface");
        this.f26441c.add(d10);
    }

    public final void a(boolean z10) {
        if (z10) {
            this.f26443e.a(true);
        } else {
            if (z10) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.f26439a == IronSource.a.BANNER) {
                this.f26443e.a();
            } else {
                this.f26443e.a(false);
            }
        }
    }

    public /* synthetic */ E5(IronSource.a aVar, E0.b bVar, List list, AbstractC3692s3 abstractC3692s3, int i10, ck.i iVar) {
        this(aVar, bVar, (i10 & 4) != 0 ? nj.s.k() : list, (i10 & 8) != 0 ? null : abstractC3692s3);
    }
}
