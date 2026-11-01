package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes9.dex */
public final class x0 extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f18331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d2 f18333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w0 f18334d;

    public x0(d2 d2Var, Object obj, d2 d2Var2, w0 w0Var) {
        if (d2Var != null) {
            if (w0Var.f18319c == j4.MESSAGE && d2Var2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f18331a = d2Var;
            this.f18332b = obj;
            this.f18333c = d2Var2;
            this.f18334d = w0Var;
            return;
        }
        throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }
}
