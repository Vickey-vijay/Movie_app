package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.cn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2790cn extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2867fn f24204b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2790cn(C2867fn c2867fn, rj.c cVar) {
        super(2, cVar);
        this.f24204b = c2867fn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2790cn(this.f24204b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2790cn(this.f24204b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24203a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C2867fn c2867fn = this.f24204b;
            qk.k kVar = c2867fn.f24393d;
            Pl pl2 = new Pl(c2867fn.f24390a.getDuration());
            this.f24203a = 1;
            if (kVar.emit(pl2, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
