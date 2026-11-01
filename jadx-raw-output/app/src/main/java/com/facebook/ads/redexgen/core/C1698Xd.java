package com.facebook.ads.redexgen.core;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1698Xd {
    public static C1698Xd A02;
    public final C1478Om A00;
    public final C1700Xf A01;

    public C1698Xd(C1977dL c1977dL, Executor executor, TE te2) {
        this.A01 = new C1700Xf(c1977dL);
        this.A00 = new C1478Om(executor, te2, c1977dL);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1977dL c1977dL, Executor executor, TE te2) {
        if (!U7.A1X(c1977dL)) {
            return;
        }
        if (A02 == null) {
            A02 = new C1698Xd(c1977dL, executor, te2);
            A02.A00();
        } else {
            A02.A02(te2);
        }
    }

    private void A02(TE te2) {
        this.A00.A07(te2);
    }
}
