package sk;

import nk.k2;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.coroutines.d f71971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f71972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k2<Object>[] f71973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f71974d;

    public final void a(k2<?> k2Var, Object obj) {
        Object[] objArr = this.f71972b;
        int i10 = this.f71974d;
        objArr[i10] = obj;
        k2<Object>[] k2VarArr = this.f71973c;
        this.f71974d = i10 + 1;
        ck.p.h(k2Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        k2VarArr[i10] = k2Var;
    }

    public final void b(kotlin.coroutines.d dVar) {
        int length = this.f71973c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            k2<Object> k2Var = this.f71973c[length];
            ck.p.g(k2Var);
            k2Var.f(dVar, this.f71972b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }

    public o0(kotlin.coroutines.d dVar, int i10) {
        this.f71971a = dVar;
        this.f71972b = new Object[i10];
        this.f71973c = new k2[i10];
    }
}
