package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4352lj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f57222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f57223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4427oj f57224d;

    public C4352lj(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, C4427oj c4427oj) {
        this.f57221a = str;
        this.f57222b = context;
        int i10 = AbstractC4326kj.f57130a[counterConfigurationReporterType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                this.f57223c = null;
            } else {
                this.f57223c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
            }
        } else {
            this.f57223c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        }
        this.f57224d = c4427oj;
    }
}
