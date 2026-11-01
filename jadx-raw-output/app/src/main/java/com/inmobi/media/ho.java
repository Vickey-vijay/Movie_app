package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: classes9.dex */
public final class ho extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3028m9 f24520c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(String str, InterfaceC3028m9 interfaceC3028m9, rj.c cVar) {
        super(1, cVar);
        this.f24519b = str;
        this.f24520c = interfaceC3028m9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new ho(this.f24519b, this.f24520c, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new ho(this.f24519b, this.f24520c, (rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24518a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        jo joVar = jo.f24636a;
        String str = this.f24519b;
        InterfaceC3028m9 interfaceC3028m9 = this.f24520c;
        this.f24518a = 1;
        nk.p0 p0VarB = nk.j.b(A9.f22352d, null, CoroutineStart.UNDISPATCHED, new C2868fo(str, interfaceC3028m9, null), 1, null);
        if (p0VarB == objF) {
            return objF;
        }
        return p0VarB;
    }
}
