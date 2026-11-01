package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1901c6 implements Runnable {
    public final /* synthetic */ C09794n A00;

    public RunnableC1901c6(C09794n c09794n) {
        this.A00 = c09794n;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1656Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A07 = true;
            this.A00.A0M.AFE(true);
        } catch (Throwable th2) {
            AbstractC1656Vl.A00(th2, this);
        }
    }
}
