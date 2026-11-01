package com.fyber.inneractive.sdk.network;

/* JADX INFO: loaded from: classes2.dex */
public class k1 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16038a;

    @Override // java.lang.Throwable
    public final String toString() {
        return String.valueOf(this.f16038a);
    }

    public k1(String str, int i10) {
        super(str);
        this.f16038a = i10;
    }
}
