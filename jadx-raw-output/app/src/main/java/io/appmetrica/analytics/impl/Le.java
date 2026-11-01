package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class Le implements InterfaceC4594vc, ActivationBarrierCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4516s9 f55516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4569uc f55517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4569uc f55518c;

    @Override // io.appmetrica.analytics.impl.InterfaceC4594vc
    public final G8 a() {
        return this.f55518c;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.f55517b.a();
        ((C4338l5) this.f55516a.a()).e();
    }

    public Le(InterfaceC4516s9 interfaceC4516s9, Rg rg2, C4437p4 c4437p4, Xe xe2) {
        this.f55516a = interfaceC4516s9;
        C4569uc c4569uc = new C4569uc(rg2, c4437p4, xe2);
        this.f55517b = c4569uc;
        this.f55518c = c4569uc;
        if (!c4569uc.b()) {
            C4418oa.k().a().subscribe(TimeUnit.SECONDS.toMillis(J7.f55417a.longValue()), C4418oa.k().w().d(), this);
        }
    }
}
