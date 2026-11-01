package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f18158a;

    public final void a(int i10, float f10) {
        b0 b0Var = this.f18158a;
        b0Var.getClass();
        b0Var.a(i10, Float.floatToRawIntBits(f10));
    }

    public c0(b0 b0Var) {
        Charset charset = l1.f18232a;
        if (b0Var != null) {
            this.f18158a = b0Var;
            b0Var.f18153a = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public final void a(int i10, double d10) {
        b0 b0Var = this.f18158a;
        b0Var.getClass();
        b0Var.a(i10, Double.doubleToRawLongBits(d10));
    }

    public final void a(int i10, int i11) {
        this.f18158a.d(i10, b0.d(i11));
    }

    public final void a(int i10, long j10) {
        this.f18158a.b(i10, b0.b(j10));
    }

    public final void a(int i10, Object obj, t2 t2Var) {
        b0 b0Var = this.f18158a;
        b0Var.c(i10, 3);
        t2Var.a(obj, b0Var.f18153a);
        b0Var.c(i10, 4);
    }
}
