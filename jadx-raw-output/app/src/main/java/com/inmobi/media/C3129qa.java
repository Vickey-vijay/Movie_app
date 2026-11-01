package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3129qa extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3253va f25160a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3129qa(C3253va c3253va, rj.c cVar) {
        super(2, cVar);
        this.f25160a = c3253va;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3129qa(this.f25160a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3129qa(this.f25160a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        InterfaceC3028m9 interfaceC3028m9 = this.f25160a.f25560c;
        if (interfaceC3028m9 != null) {
            String str = AbstractC3278wa.f25629a;
            ck.p.i(str, "access$getTAG$p(...)");
            ((C3053n9) interfaceC3028m9).a(str, "destroyVideoPlayer is called");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25160a.f25558a;
        gestureDetectorOnGestureListenerC2785ci.f24144a1 = null;
        C3251v8 c3251v8 = gestureDetectorOnGestureListenerC2785ci.Y0;
        if (c3251v8 != null) {
            c3251v8.a();
        }
        return mj.r.f64562a;
    }
}
