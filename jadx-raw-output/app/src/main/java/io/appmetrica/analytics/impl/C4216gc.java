package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4216gc extends Xn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppMetricaConfig f56807b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4216gc(@NonNull Ua ua2, @NonNull AppMetricaConfig appMetricaConfig) {
        super(ua2);
        String str = appMetricaConfig.apiKey;
        this.f56807b = appMetricaConfig;
    }

    @NonNull
    public final Va a() {
        return this.f56190a.a().a(this.f56807b);
    }
}
