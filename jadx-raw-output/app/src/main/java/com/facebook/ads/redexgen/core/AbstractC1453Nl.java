package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1453Nl {

    @Nullable
    public static HandlerC1452Nk A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static HandlerC1452Nk A00(C1951cu c1951cu) {
        if (A00 == null) {
            A00 = new HandlerC1452Nk(c1951cu);
        }
        return A00;
    }

    public static void A01(C1951cu c1951cu) {
        if (UA.A0F(c1951cu)) {
            A03(c1951cu);
        }
    }

    public static void A02(C1951cu c1951cu) {
        if (UA.A0E(c1951cu)) {
            A03(c1951cu);
        }
    }

    public static void A03(C1951cu c1951cu) {
        if (A01.compareAndSet(false, true)) {
            XJ.A01.execute(new C2187go(c1951cu));
        }
    }
}
