package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class W0 {
    public static final AtomicReference<InterfaceC1670Vz> A00 = new AtomicReference<>(null);

    public static InterfaceC1670Vz A00() {
        InterfaceC1670Vz errorLogger = A00.get();
        if (errorLogger == null) {
            return new PR();
        }
        return errorLogger;
    }

    public static void A01(InterfaceC1670Vz interfaceC1670Vz) {
        A00.set(interfaceC1670Vz);
    }
}
