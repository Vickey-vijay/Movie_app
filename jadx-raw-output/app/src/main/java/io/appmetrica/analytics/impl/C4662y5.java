package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4662y5 implements G8, T8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M6 f58008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f58009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f58010c;

    @Override // io.appmetrica.analytics.impl.T8
    public final void a() {
        this.f58010c.set(this.f58008a.a(this.f58009b));
    }

    @Override // io.appmetrica.analytics.impl.G8
    public final boolean b() {
        return this.f58010c.get() > 0;
    }

    @Override // io.appmetrica.analytics.impl.T8
    public final void b(List<Integer> list) {
        int i10 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f58009b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i10 = i10 + 1) < 0) {
                    nj.s.t();
                }
            }
        }
        this.f58010c.addAndGet(-i10);
    }

    public C4662y5(M6 m10) {
        this.f58008a = m10;
        Set setJ = nj.q0.j(Integer.valueOf(EnumC4112cb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION.a()), Integer.valueOf(EnumC4112cb.EVENT_TYPE_APP_UPDATE.a()), Integer.valueOf(EnumC4112cb.EVENT_TYPE_FIRST_ACTIVATION.a()), Integer.valueOf(EnumC4112cb.EVENT_TYPE_INIT.a()), Integer.valueOf(EnumC4112cb.EVENT_TYPE_SEND_AD_REVENUE_EVENT.a()), Integer.valueOf(EnumC4112cb.EVENT_TYPE_SEND_ECOMMERCE_EVENT.a()), Integer.valueOf(EnumC4112cb.EVENT_TYPE_SEND_REFERRER.a()), Integer.valueOf(EnumC4112cb.EVENT_TYPE_SEND_REVENUE_EVENT.a()));
        this.f58009b = setJ;
        this.f58010c = new AtomicLong(m10.a(setJ));
        m10.a(this);
    }

    @Override // io.appmetrica.analytics.impl.T8
    public final void a(List<Integer> list) {
        int i10 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f58009b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i10 = i10 + 1) < 0) {
                    nj.s.t();
                }
            }
        }
        this.f58010c.addAndGet(i10);
    }
}
