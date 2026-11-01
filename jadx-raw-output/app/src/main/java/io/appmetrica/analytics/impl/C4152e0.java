package io.appmetrica.analytics.impl;

import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4152e0 implements Dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4178f0 f56625a;

    public C4152e0(C4178f0 c4178f0) {
        this.f56625a = c4178f0;
    }

    @Override // io.appmetrica.analytics.impl.Dn
    public final Thread a() {
        return this.f56625a.f56705b;
    }

    @Override // io.appmetrica.analytics.impl.Dn
    public final StackTraceElement[] b() {
        C4178f0 c4178f0 = this.f56625a;
        return (StackTraceElement[]) c4178f0.f56704a.get(c4178f0.f56705b);
    }

    @Override // io.appmetrica.analytics.impl.Dn
    public final Map<Thread, StackTraceElement[]> c() {
        return this.f56625a.f56704a;
    }
}
