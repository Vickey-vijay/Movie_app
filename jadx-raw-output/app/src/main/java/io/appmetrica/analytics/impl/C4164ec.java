package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4164ec implements InterfaceC4516s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4338l5 f56667a;

    @Override // io.appmetrica.analytics.impl.InterfaceC4516s9
    public final InterfaceC4491r9 a() {
        return this.f56667a;
    }

    public final C4338l5 b() {
        return this.f56667a;
    }

    public C4164ec(InterfaceC4616w9 interfaceC4616w9, M6 m10, Rg rg2, C4437p4 c4437p4, R4 r10, Xe xe2) {
        C4139dc c4139dc = new C4139dc(m10, rg2, this, c4437p4, xe2);
        this.f56667a = new C4338l5(interfaceC4616w9, c4139dc.a(), c4139dc.b(), r10);
    }
}
