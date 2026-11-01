package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Xk extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23804a;

    public Xk(rj.c cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Xk(cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Xk((rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f23804a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            String strB = Ji.b();
            if (strB == null) {
                return mj.r.f64562a;
            }
            if (!ck.p.e(strB, Ji.f22953c)) {
                C2924i4 c2924i4 = Y3.f23815a;
                this.f23804a = 1;
                Object objA = C2879g9.a(((C2719a4) Y3.f23815a.f24534b.f24585b.getValue()).f23940a, "config_db", null, this, 6);
                if (objA != sj.a.f()) {
                    objA = mj.r.f64562a;
                }
                if (objA != sj.a.f()) {
                    objA = mj.r.f64562a;
                }
                if (objA != sj.a.f()) {
                    objA = mj.r.f64562a;
                }
                if (objA == objF) {
                    return objF;
                }
            }
        }
        return mj.r.f64562a;
    }
}
