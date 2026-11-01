package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* JADX INFO: loaded from: classes.dex */
public final class On extends AbstractCallableC4674yh {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f55711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f55712f;

    @Override // io.appmetrica.analytics.impl.AbstractCallableC4674yh
    public final void a(IAppMetricaService iAppMetricaService) throws RemoteException {
        iAppMetricaService.reportData(this.f55711e, this.f55712f);
    }

    public On(C4433p0 c4433p0, InterfaceC4070al interfaceC4070al, int i10, Bundle bundle) {
        super(c4433p0, interfaceC4070al);
        this.f55711e = i10;
        this.f55712f = bundle;
    }
}
