package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2730af extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2782cf f24005b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2730af(C2782cf c2782cf, rj.c cVar) {
        super(1, cVar);
        this.f24005b = c2782cf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new C2730af(this.f24005b, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new C2730af(this.f24005b, (rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24004a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C2782cf c2782cf = this.f24005b;
            this.f24004a = 1;
            if (c2782cf.b(this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
