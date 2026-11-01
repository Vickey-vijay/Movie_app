package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2033eG implements Runnable {
    public final /* synthetic */ C2036eJ A00;

    public RunnableC2033eG(C2036eJ c2036eJ) {
        this.A00 = c2036eJ;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1656Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0A();
            this.A00.A01.removeCallbacks(this);
            this.A00.A01.postDelayed(this, 250L);
        } catch (Throwable th2) {
            AbstractC1656Vl.A00(th2, this);
        }
    }
}
