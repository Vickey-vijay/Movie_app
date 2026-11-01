package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivationBarrierCallback f54712a;

    public m(ActivationBarrierCallback activationBarrierCallback) {
        this.f54712a = activationBarrierCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f54712a.onWaitFinished();
    }
}
