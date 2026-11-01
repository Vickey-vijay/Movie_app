package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.impl.J5;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class J5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f55414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f55415b = C4418oa.k().w().a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WaitForActivationDelayBarrier f55416c = C4418oa.k().a();

    public static final void a(J5 j10) {
        Iterator it = j10.f55414a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f55416c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.f55415b, new ActivationBarrierCallback() { // from class: af.d
            @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
            public final void onWaitFinished() {
                J5.a(this.f3551a);
            }
        });
    }

    public J5(List list) {
        this.f55414a = list;
    }
}
