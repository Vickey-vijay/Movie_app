package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Wh extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC2785ci f23751b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wh(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, rj.c cVar) {
        super(2, cVar);
        this.f23751b = gestureDetectorOnGestureListenerC2785ci;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Wh(this.f23751b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Wh(this.f23751b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC3028m9 interfaceC3028m9;
        Object objF = sj.a.f();
        int i10 = this.f23750a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            this.f23750a = 1;
            if (nk.s0.a(1000L, this) == objF) {
                return objF;
            }
        }
        if (!this.f23751b.isAttachedToWindow() && (interfaceC3028m9 = this.f23751b.f24162i) != null) {
            ((C3053n9) interfaceC3028m9).a();
        }
        return mj.r.f64562a;
    }
}
