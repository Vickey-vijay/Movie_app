package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes2.dex */
public final class A0 implements InterfaceC4644xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0 f54947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMetricaConfig f54948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PublicLogger f54949c;

    public A0(C0 c10, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f54947a = c10;
        this.f54948b = appMetricaConfig;
        this.f54949c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4644xc
    public final C4268ic a() {
        C0 c10 = this.f54947a;
        C4325ki c4325ki = c10.f55055g;
        AppMetricaConfig appMetricaConfig = this.f54948b;
        PublicLogger publicLogger = this.f54949c;
        E7 e10 = c10.f55057i;
        return c4325ki.a(appMetricaConfig, publicLogger, new C4333l0(e10.f55170j, e10.f55168h));
    }
}
