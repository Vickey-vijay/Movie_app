package com.facebook.ads.redexgen.core;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1505Pn implements Runnable {
    public final /* synthetic */ C10276j A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC1505Pn(C10276j c10276j, ArrayList arrayList) {
        this.A00 = c10276j;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (C1514Pw c1514Pw : this.A01) {
            this.A00.A0e(c1514Pw.A04, c1514Pw.A00, c1514Pw.A01, c1514Pw.A02, c1514Pw.A03);
        }
        this.A01.clear();
        this.A00.A05.remove(this.A01);
    }
}
