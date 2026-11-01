package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3231ud extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3306xd f25462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Dd f25463d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3231ud(C3306xd c3306xd, rj.c cVar, Dd dd2) {
        super(2, cVar);
        this.f25462c = c3306xd;
        this.f25463d = dd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C3231ud c3231ud = new C3231ud(this.f25462c, cVar, this.f25463d);
        c3231ud.f25461b = obj;
        return c3231ud;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3231ud) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25460a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.l0 l0Var = (nk.l0) this.f25461b;
            C3306xd c3306xd = this.f25462c;
            C3206td c3206td = new C3206td(l0Var, this.f25463d);
            this.f25460a = 1;
            if (c3306xd.collect(c3206td, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
