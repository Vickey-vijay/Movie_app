package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.f7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2851f7 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3026m7 f24354c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2851f7(C3026m7 c3026m7, rj.c cVar) {
        super(2, cVar);
        this.f24354c = c3026m7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C2851f7 c2851f7 = new C2851f7(this.f24354c, cVar);
        c2851f7.f24353b = obj;
        return c2851f7;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        C2851f7 c2851f7 = new C2851f7(this.f24354c, (rj.c) obj2);
        c2851f7.f24353b = (Xf) obj;
        return c2851f7.invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24352a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            Xf xf2 = (Xf) this.f24353b;
            C3026m7 c3026m7 = this.f24354c;
            this.f24352a = 1;
            Object objA = c3026m7.f23915b.a(xf2, this);
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
