package com.facebook.ads.redexgen.core;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Po, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1506Po implements Runnable {
    public final /* synthetic */ C10276j A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC1506Po(C10276j c10276j, ArrayList arrayList) {
        this.A00 = c10276j;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (C1513Pv change : this.A01) {
            this.A00.A0c(change);
        }
        this.A01.clear();
        this.A00.A03.remove(this.A01);
    }
}
