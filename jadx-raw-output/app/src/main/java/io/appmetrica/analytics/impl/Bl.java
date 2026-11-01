package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class Bl implements L2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55041a;

    @Override // io.appmetrica.analytics.impl.L2, io.appmetrica.analytics.impl.InterfaceC4355lm
    public final void a(C4226gm c4226gm) {
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }

    public final Context b() {
        return this.f55041a;
    }

    public Bl(Context context) {
        this.f55041a = context;
    }
}
