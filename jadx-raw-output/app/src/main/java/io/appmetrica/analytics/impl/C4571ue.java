package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4571ue implements T8, InterfaceC4596ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M6 f57768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f57769b;

    @Override // io.appmetrica.analytics.impl.T8
    public final void a(List<Integer> list) {
        this.f57769b.addAndGet(list.size());
    }

    @Override // io.appmetrica.analytics.impl.T8
    public final void b(List<Integer> list) {
        this.f57769b.addAndGet(-list.size());
    }

    @Override // io.appmetrica.analytics.impl.T8
    public final void a() {
        this.f57769b.set(this.f57768a.b());
    }

    public final long b() {
        return this.f57769b.get();
    }

    public C4571ue(M6 m10) {
        this.f57768a = m10;
        this.f57769b = new AtomicLong(m10.b());
        m10.a(this);
    }
}
