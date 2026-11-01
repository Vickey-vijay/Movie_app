package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2087f9 implements Runnable {
    public final /* synthetic */ C1155Bw A00;

    public RunnableC2087f9(C1155Bw c1155Bw) {
        this.A00 = c1155Bw;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1656Vl.A02(this)) {
            return;
        }
        try {
            C1155Bw.A03(this.A00);
            throw null;
        } catch (Throwable th2) {
            AbstractC1656Vl.A00(th2, this);
        }
    }
}
