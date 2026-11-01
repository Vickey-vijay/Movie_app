package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1837b4 implements Runnable {
    public final /* synthetic */ JU A00;

    public RunnableC1837b4(JU ju) {
        this.A00 = ju;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1656Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0Q) {
                this.A00.A0N();
            }
        } catch (Throwable th2) {
            AbstractC1656Vl.A00(th2, this);
        }
    }
}
