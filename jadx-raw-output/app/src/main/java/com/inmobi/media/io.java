package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class io extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3028m9 f24571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nk.p0 f24573d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io(InterfaceC3028m9 interfaceC3028m9, String str, nk.p0 p0Var, rj.c cVar) {
        super(2, cVar);
        this.f24571b = interfaceC3028m9;
        this.f24572c = str;
        this.f24573d = p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new io(this.f24571b, this.f24572c, this.f24573d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((io) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24570a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        InterfaceC3028m9 interfaceC3028m9 = this.f24571b;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("WebResourceHandler", "Waiting for response to finish download: " + this.f24572c);
        }
        nk.p0 p0Var = this.f24573d;
        this.f24570a = 1;
        Object objY = p0Var.y(this);
        if (objY == objF) {
            return objF;
        }
        return objY;
    }
}
