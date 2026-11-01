package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1752Zf implements Runnable {
    public final /* synthetic */ C1753Zg A00;
    public final /* synthetic */ InterfaceC1754Zh A01;

    public RunnableC1752Zf(C1753Zg c1753Zg, InterfaceC1754Zh interfaceC1754Zh) {
        this.A00 = c1753Zg;
        this.A01 = interfaceC1754Zh;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1656Vl.A02(this)) {
            return;
        }
        try {
            this.A01.ACO();
        } catch (Throwable th2) {
            AbstractC1656Vl.A00(th2, this);
        }
    }
}
