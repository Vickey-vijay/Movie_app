package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;

/* JADX INFO: loaded from: classes7.dex */
public final class Wc implements ModuleEventServiceHandlerReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f56083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4342l9 f56084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q5 f56085c;

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final boolean isMain() {
        return this.f56083a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(CounterReportApi counterReportApi) {
        Q5 q5D = Q5.d(this.f56085c);
        q5D.f55776d = counterReportApi.getType();
        q5D.f55777e = counterReportApi.getCustomType();
        q5D.setName(counterReportApi.getName());
        String value = counterReportApi.getValue();
        if (value != null) {
            q5D.setValue(value);
        }
        byte[] valueBytes = counterReportApi.getValueBytes();
        if (valueBytes != null) {
            q5D.setValueBytes(valueBytes);
        }
        q5D.f55779g = counterReportApi.getBytesTruncated();
        C4342l9 c4342l9 = this.f56084b;
        c4342l9.a(q5D, Sk.a(c4342l9.f57182c.b(q5D), q5D.f55781i));
    }

    public Wc(boolean z10, C4342l9 c4342l9, Q5 q10) {
        this.f56083a = z10;
        this.f56084b = c4342l9;
        this.f56085c = q10;
    }
}
