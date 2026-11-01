package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes.dex */
public final class Pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Revenue f55739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vm f55740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4175en f55741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4175en f55742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PublicLogger f55743e;

    public Pi(Revenue revenue, PublicLogger publicLogger) {
        this.f55743e = publicLogger;
        this.f55739a = revenue;
        this.f55740b = new Vm(30720, "revenue payload", publicLogger);
        this.f55741c = new C4175en(new Vm(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.f55742d = new C4175en(new Ym(1000, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
