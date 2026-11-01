package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3124q5 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3148r5 f25141b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3124q5(C3148r5 c3148r5, rj.c cVar) {
        super(2, cVar);
        this.f25141b = c3148r5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3124q5(this.f25141b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3124q5(this.f25141b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25140a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            AbstractC3169s1 abstractC3169s1 = this.f25141b.f25234b;
            if (abstractC3169s1 != null) {
                abstractC3169s1.a();
            }
            Fc fc2 = this.f25141b.f25233a;
            if (fc2 != null) {
                this.f25140a = 1;
                if (fc2.a(this) == objF) {
                    return objF;
                }
            }
        }
        return mj.r.f64562a;
    }
}
