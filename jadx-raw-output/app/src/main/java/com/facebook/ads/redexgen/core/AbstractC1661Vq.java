package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1661Vq extends FrameLayout {
    public static final AtomicBoolean A00 = new AtomicBoolean();
    public static final AtomicReference<InterfaceC1654Vj> A01 = new AtomicReference<>();

    public static void A00(boolean z10, InterfaceC1654Vj interfaceC1654Vj) {
        A00.set(z10);
        A01.set(interfaceC1654Vj);
    }
}
