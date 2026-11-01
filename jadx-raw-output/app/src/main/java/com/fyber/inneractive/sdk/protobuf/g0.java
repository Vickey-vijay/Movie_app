package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18187b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f18186a == g0Var.f18186a && this.f18187b == g0Var.f18187b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f18186a) * 65535) + this.f18187b;
    }

    public g0(int i10, Object obj) {
        this.f18186a = obj;
        this.f18187b = i10;
    }
}
