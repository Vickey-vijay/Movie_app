package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2899h4 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2924i4 f24480b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2899h4(C2924i4 c2924i4, rj.c cVar) {
        super(2, cVar);
        this.f24480b = c2924i4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2899h4(this.f24480b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2899h4(this.f24480b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24479a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C2924i4 c2924i4 = this.f24480b;
            this.f24479a = 1;
            Object objCollect = qk.e.t(new C3235uh(new C3260vh((C2719a4) c2924i4.f24534b.f24585b.getValue()), null)).collect(new C2822e4(c2924i4), this);
            if (objCollect != sj.a.f()) {
                objCollect = mj.r.f64562a;
            }
            if (objCollect == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
