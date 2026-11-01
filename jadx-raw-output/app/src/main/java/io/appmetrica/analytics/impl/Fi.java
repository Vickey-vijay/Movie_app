package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* JADX INFO: loaded from: classes5.dex */
public final class Fi extends AbstractCallableC4674yh {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Cf f55240e;

    @Override // io.appmetrica.analytics.impl.AbstractCallableC4674yh
    public final void a(IAppMetricaService iAppMetricaService) throws RemoteException {
        Bundle bundle = new Bundle();
        Cf cf2 = this.f55240e;
        synchronized (cf2) {
            bundle.putParcelable("PROCESS_CFG_OBJ", cf2);
        }
        iAppMetricaService.resumeUserSession(bundle);
    }

    public Fi(C4433p0 c4433p0, InterfaceC4070al interfaceC4070al, Cf cf2) {
        super(c4433p0, interfaceC4070al);
        this.f55240e = cf2;
    }
}
