package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.El, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RunnableC1221El implements Runnable {
    public final InterfaceC1220Ek A00;

    public RunnableC1221El(InterfaceC1220Ek interfaceC1220Ek) {
        this.A00 = interfaceC1220Ek;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1656Vl.A02(this)) {
            return;
        }
        try {
            this.A00.AE4();
        } catch (Throwable th2) {
            AbstractC1656Vl.A00(th2, this);
        }
    }
}
