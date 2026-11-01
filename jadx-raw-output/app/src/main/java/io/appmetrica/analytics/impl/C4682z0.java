package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4682z0 {
    public static boolean a() {
        boolean z10;
        synchronized (C4657y0.class) {
            z10 = C4657y0.f57981f;
        }
        return z10;
    }

    public static void b() {
        synchronized (C4657y0.class) {
            C4657y0.f57981f = true;
        }
    }
}
