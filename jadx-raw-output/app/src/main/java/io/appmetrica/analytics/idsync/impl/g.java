package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements ActivationBarrierCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f54875a;

    public g(h hVar) {
        this.f54875a = hVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        f fVar = this.f54875a.f54882g;
        if (fVar == null) {
            ck.p.B("syncRunnable");
            fVar = null;
        }
        fVar.run();
    }
}
