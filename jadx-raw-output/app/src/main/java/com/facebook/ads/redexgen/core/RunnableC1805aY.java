package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1805aY implements Runnable {
    public final /* synthetic */ C1362Jx A00;

    public RunnableC1805aY(C1362Jx c1362Jx) {
        this.A00 = c1362Jx;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1656Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A02 = true;
            if (((AbstractC1811ae) this.A00).A06.A0E() != null) {
                ((AbstractC1811ae) this.A00).A06.A0E().AFE(true);
            }
        } catch (Throwable th2) {
            AbstractC1656Vl.A00(th2, this);
        }
    }
}
