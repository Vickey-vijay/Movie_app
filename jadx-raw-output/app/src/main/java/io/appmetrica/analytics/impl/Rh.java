package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class Rh implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4682z0 f55824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f55825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f55826c;

    public Rh(C4682z0 c4682z0, Context context, ReporterConfig reporterConfig) {
        this.f55824a = c4682z0;
        this.f55825b = context;
        this.f55826c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        C4682z0 c4682z0 = this.f55824a;
        Context context = this.f55825b;
        ReporterConfig reporterConfig = this.f55826c;
        c4682z0.getClass();
        return C4657y0.a(context).f().c(reporterConfig);
    }
}
