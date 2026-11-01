package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C09222i extends IOException {
    public int A00;
    public boolean A01;

    @Deprecated
    public C09222i() {
    }

    @Deprecated
    public C09222i(String str) {
        super(str);
    }

    public C09222i(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.A01 = z10;
        this.A00 = i10;
    }

    public static C09222i A00(String str) {
        return new C09222i(str, null, false, 1);
    }

    public static C09222i A01(String str, Throwable th2) {
        return new C09222i(str, th2, true, 1);
    }

    public static C09222i A02(String str, Throwable th2) {
        return new C09222i(str, th2, true, 0);
    }
}
