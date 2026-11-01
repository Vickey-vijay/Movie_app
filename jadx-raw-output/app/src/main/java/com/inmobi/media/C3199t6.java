package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.t6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3199t6 extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3224u6 f25371b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3199t6(C3224u6 c3224u6, rj.c cVar) {
        super(1, cVar);
        this.f25371b = c3224u6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new C3199t6(this.f25371b, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new C3199t6(this.f25371b, (rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25370a;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                C3224u6 c3224u6 = this.f25371b;
                this.f25370a = 1;
                if (C3224u6.a(c3224u6, this) == objF) {
                    return objF;
                }
            }
        } catch (Exception e10) {
            e10.toString();
        }
        return mj.r.f64562a;
    }
}
