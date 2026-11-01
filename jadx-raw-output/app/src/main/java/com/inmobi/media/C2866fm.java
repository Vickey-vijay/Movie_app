package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.fm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2866fm extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qk.c f24388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3091om f24389d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2866fm(qk.c cVar, rj.c cVar2, C3091om c3091om) {
        super(2, cVar2);
        this.f24388c = cVar;
        this.f24389d = c3091om;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C2866fm c2866fm = new C2866fm(this.f24388c, cVar, this.f24389d);
        c2866fm.f24387b = obj;
        return c2866fm;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C2866fm) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24386a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.l0 l0Var = (nk.l0) this.f24387b;
            qk.c cVar = this.f24388c;
            C2840em c2840em = new C2840em(l0Var, this.f24389d);
            this.f24386a = 1;
            if (cVar.collect(c2840em, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
