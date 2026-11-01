package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4727w implements InterfaceC4714i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f58464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f58465b;

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC4714i
    public final List<T> a() {
        return nj.s.n(new C4709d(this.f58464a, this.f58465b), new C4726v(this.f58464a, this.f58465b), new g0(this.f58464a, this.f58465b));
    }

    public C4727w(ClientContext clientContext, U u10) {
        this.f58464a = clientContext;
        this.f58465b = u10;
    }
}
