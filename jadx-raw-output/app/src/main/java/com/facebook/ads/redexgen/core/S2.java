package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class S2 extends Thread {
    public final long A00;

    public S2(long j10) {
        this.A00 = j10;
        start();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0011 */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            r3 = this;
            boolean r0 = com.facebook.ads.redexgen.core.AbstractC1656Vl.A02(r3)
            if (r0 == 0) goto L7
            return
        L7:
            r2 = r3
        L8:
            long r0 = r2.A00     // Catch: java.lang.InterruptedException -> Ld java.lang.Throwable -> L11
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> Ld java.lang.Throwable -> L11
        Ld:
            com.facebook.ads.redexgen.core.S0.A01()     // Catch: java.lang.Throwable -> L11
            goto L8
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.core.AbstractC1656Vl.A00(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.S2.run():void");
    }
}
