package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.t9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3202t9 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3227u9 f25376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Me f25377c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3202t9(C3227u9 c3227u9, Me me2, rj.c cVar) {
        super(2, cVar);
        this.f25376b = c3227u9;
        this.f25377c = me2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3202t9(this.f25376b, this.f25377c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3202t9(this.f25376b, this.f25377c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25375a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        C3297x4 c3297x4 = this.f25376b.f25449a;
        Me me2 = this.f25377c;
        this.f25375a = 1;
        Object objA = c3297x4.a(me2, this);
        if (objA == objF) {
            return objF;
        }
        return objA;
    }
}
