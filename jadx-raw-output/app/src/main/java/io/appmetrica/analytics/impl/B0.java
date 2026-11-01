package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes2.dex */
public final class B0 implements InterfaceC4644xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0 f54972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMetricaConfig f54973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PublicLogger f54974c;

    public B0(C0 c10, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f54972a = c10;
        this.f54973b = appMetricaConfig;
        this.f54974c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4644xc
    public final C4268ic a() {
        C0 c10 = this.f54972a;
        C4325ki c4325ki = c10.f55055g;
        AppMetricaConfig appMetricaConfig = this.f54973b;
        PublicLogger publicLogger = this.f54974c;
        E7 e10 = c10.f55057i;
        return c4325ki.b(appMetricaConfig, publicLogger, new C4333l0(e10.f55170j, e10.f55168h));
    }
}
