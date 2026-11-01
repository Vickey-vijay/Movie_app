package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class BinderC4683z1 extends IAppMetricaService.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B1 f58039a;

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(Bundle bundle) {
        ((C1) this.f58039a).pauseUserSession(bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int i10, Bundle bundle) {
        ((C1) this.f58039a).reportData(i10, bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(Bundle bundle) {
        ((C1) this.f58039a).resumeUserSession(bundle);
    }

    public BinderC4683z1(B1 b10) {
        this.f58039a = b10;
    }
}
