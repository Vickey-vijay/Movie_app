package com.inmobi.media;

import androidx.webkit.Profile;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class Zh extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wk.a f23920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC2785ci f23921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f23923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC2785ci f23924e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zh(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, rj.c cVar) {
        super(2, cVar);
        this.f23924e = gestureDetectorOnGestureListenerC2785ci;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        Zh zh2 = new Zh(this.f23924e, cVar);
        zh2.f23923d = obj;
        return zh2;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        Zh zh2 = new Zh(this.f23924e, (rj.c) obj2);
        zh2.f23923d = (nk.l0) obj;
        return zh2.invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        nk.l0 l0Var;
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci;
        wk.a aVar;
        Object objF = sj.a.f();
        int i10 = this.f23922c;
        if (i10 != 0) {
            if (i10 == 1) {
                gestureDetectorOnGestureListenerC2785ci = this.f23921b;
                aVar = this.f23920a;
                l0Var = (nk.l0) this.f23923d;
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.l0 l0Var2 = (nk.l0) this.f23923d;
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = this.f23924e;
            wk.a aVar2 = gestureDetectorOnGestureListenerC2785ci2.f24194y;
            this.f23923d = l0Var2;
            this.f23920a = aVar2;
            this.f23921b = gestureDetectorOnGestureListenerC2785ci2;
            this.f23922c = 1;
            if (aVar2.a(null, this) == objF) {
                return objF;
            }
            l0Var = l0Var2;
            gestureDetectorOnGestureListenerC2785ci = gestureDetectorOnGestureListenerC2785ci2;
            aVar = aVar2;
        }
        try {
            if (ck.p.e("Loading", gestureDetectorOnGestureListenerC2785ci.f24196z)) {
                InterfaceC3028m9 interfaceC3028m9 = gestureDetectorOnGestureListenerC2785ci.f24162i;
                if (interfaceC3028m9 != null) {
                    String str = GestureDetectorOnGestureListenerC2785ci.f24141g1;
                    ck.p.i(str, "access$getTAG$cp(...)");
                    ((C3053n9) interfaceC3028m9).a(str, "updateWebViewLoaded " + l0Var);
                }
                gestureDetectorOnGestureListenerC2785ci.getListener().g(gestureDetectorOnGestureListenerC2785ci);
                gestureDetectorOnGestureListenerC2785ci.setAndUpdateViewState(Profile.DEFAULT_PROFILE_NAME);
                InterfaceC3028m9 interfaceC3028m10 = gestureDetectorOnGestureListenerC2785ci.f24162i;
                if (interfaceC3028m10 != null) {
                    String str2 = GestureDetectorOnGestureListenerC2785ci.f24141g1;
                    ck.p.i(str2, "access$getTAG$cp(...)");
                    ((C3053n9) interfaceC3028m10).a(str2, "updateWebViewLoaded state changed to " + gestureDetectorOnGestureListenerC2785ci.getViewState());
                }
            }
            return mj.r.f64562a;
        } finally {
            aVar.b(null);
        }
    }
}
