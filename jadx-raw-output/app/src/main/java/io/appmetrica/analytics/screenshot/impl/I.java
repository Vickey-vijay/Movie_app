package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class I implements InterfaceC4714i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f58373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f58374b;

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC4714i
    public final List<T> a() {
        return nj.s.n(new C4726v(this.f58373a, this.f58374b), new g0(this.f58373a, this.f58374b));
    }

    public I(ClientContext clientContext, U u10) {
        this.f58373a = clientContext;
        this.f58374b = u10;
    }
}
