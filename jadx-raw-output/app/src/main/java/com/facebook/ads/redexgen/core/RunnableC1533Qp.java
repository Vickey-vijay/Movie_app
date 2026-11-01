package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1533Qp implements Runnable {
    public final /* synthetic */ C1534Qq A00;

    public RunnableC1533Qp(C1534Qq c1534Qq) {
        this.A00 = c1534Qq;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1656Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A05 = 0L;
            this.A00.A06 = false;
        } catch (Throwable th2) {
            AbstractC1656Vl.A00(th2, this);
        }
    }
}
