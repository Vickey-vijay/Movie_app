package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2858fe extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qk.k f24371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3207te f24372d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2858fe(qk.k kVar, rj.c cVar, C3207te c3207te) {
        super(2, cVar);
        this.f24371c = kVar;
        this.f24372d = c3207te;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C2858fe c2858fe = new C2858fe(this.f24371c, cVar, this.f24372d);
        c2858fe.f24370b = obj;
        return c2858fe;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C2858fe) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24369a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.l0 l0Var = (nk.l0) this.f24370b;
            qk.k kVar = this.f24371c;
            C2832ee c2832ee = new C2832ee(l0Var, this.f24372d);
            this.f24369a = 1;
            if (kVar.collect(c2832ee, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
