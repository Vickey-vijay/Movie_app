package io.appmetrica.analytics.impl;

import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* JADX INFO: loaded from: classes.dex */
public class Qg extends AbstractCallableC4674yh {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4624wh f55802e;

    @Override // io.appmetrica.analytics.impl.AbstractCallableC4674yh
    public final void a(Throwable th2) {
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC4674yh
    public final void a(IAppMetricaService iAppMetricaService) throws RemoteException {
        C4624wh c4624wh = this.f55802e;
        iAppMetricaService.reportData(c4624wh.f57889c, c4624wh.f57887a.d(c4624wh.f57891e.c()));
    }

    public Qg(C4433p0 c4433p0, InterfaceC4070al interfaceC4070al, C4624wh c4624wh) {
        super(c4433p0, interfaceC4070al);
        this.f55802e = c4624wh;
    }
}
