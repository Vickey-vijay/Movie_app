package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes9.dex */
public final class w0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f18317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j4 f18319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18321e;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f18318b - ((w0) obj).f18318b;
    }

    public w0(e1 e1Var, int i10, j4 j4Var, boolean z10, boolean z11) {
        this.f18317a = e1Var;
        this.f18318b = i10;
        this.f18319c = j4Var;
        this.f18320d = z10;
        this.f18321e = z11;
    }
}
