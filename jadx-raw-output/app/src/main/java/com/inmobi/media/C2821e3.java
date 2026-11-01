package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2821e3 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S2 f24289b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2821e3(S2 s10, rj.c cVar) {
        super(2, cVar);
        this.f24289b = s10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2821e3(this.f24289b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2821e3(this.f24289b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24288a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            W2 w10 = (W2) C3271w3.f25611b.getValue();
            int i11 = this.f24289b.f23478a;
            this.f24288a = 1;
            Object objA = w10.f23722a.a("click", "id=?", new String[]{String.valueOf(i11)}, this);
            if (objA != sj.a.f()) {
                objA = mj.r.f64562a;
            }
            if (objA == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
