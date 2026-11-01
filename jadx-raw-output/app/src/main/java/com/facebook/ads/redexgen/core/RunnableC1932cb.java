package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1932cb implements Runnable {
    public final /* synthetic */ C09573r A00;

    public RunnableC1932cb(C09573r c09573r) {
        this.A00 = c09573r;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1656Vl.A02(this)) {
            return;
        }
        try {
            ((G2) this.A00).A09.A4b(((G2) this.A00).A0A.A7o());
        } catch (Throwable th2) {
            AbstractC1656Vl.A00(th2, this);
        }
    }
}
