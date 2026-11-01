package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;

/* JADX INFO: loaded from: classes.dex */
public final class Ol implements B6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f55706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pl f55707b;

    public Ol(Pl pl2, StartupParamsCallback startupParamsCallback) {
        this.f55707b = pl2;
        this.f55706a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.B6
    public final void a(int i10, Bundle bundle) {
        this.f55707b.b(bundle, this.f55706a);
    }
}
