package com.fyber.inneractive.sdk.util;

/* JADX INFO: loaded from: classes4.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18584b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h1.class != obj.getClass()) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f18583a == h1Var.f18583a && this.f18584b == h1Var.f18584b;
    }

    public final int hashCode() {
        return (this.f18583a * 31) + this.f18584b;
    }

    public h1(int i10, int i11) {
        this.f18583a = i10;
        this.f18584b = i11;
    }
}
