package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* JADX INFO: loaded from: classes7.dex */
public final class Vh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f56033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4248hi f56034b;

    public Vh(C4248hi c4248hi, ReporterConfig reporterConfig) {
        this.f56034b = c4248hi;
        this.f56033a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f56034b;
        ReporterConfig reporterConfig = this.f56033a;
        C4682z0 c4682z0 = c4248hi.f56907a;
        Context context = c4248hi.f56910d;
        c4682z0.getClass();
        C4657y0.a(context).f().a(reporterConfig);
    }
}
