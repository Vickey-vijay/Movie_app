package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.u7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3225u7 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3300x7 f25446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N7 f25447d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3225u7(C3300x7 c3300x7, rj.c cVar, N7 n10) {
        super(2, cVar);
        this.f25446c = c3300x7;
        this.f25447d = n10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C3225u7 c3225u7 = new C3225u7(this.f25446c, cVar, this.f25447d);
        c3225u7.f25445b = obj;
        return c3225u7;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3225u7) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25444a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.l0 l0Var = (nk.l0) this.f25445b;
            C3300x7 c3300x7 = this.f25446c;
            C3200t7 c3200t7 = new C3200t7(l0Var, this.f25447d);
            this.f25444a = 1;
            if (c3300x7.collect(c3200t7, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
