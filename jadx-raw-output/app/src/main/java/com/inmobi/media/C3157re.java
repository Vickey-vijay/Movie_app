package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3157re extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3207te f25264b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3157re(C3207te c3207te, rj.c cVar) {
        super(2, cVar);
        this.f25264b = c3207te;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3157re(this.f25264b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3157re(this.f25264b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25263a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            InterfaceC3028m9 interfaceC3028m9L = this.f25264b.l();
            if (interfaceC3028m9L != null) {
                ((C3053n9) interfaceC3028m9L).a("NativeRenderedState", "Track Views Attached to Telemetry Started - waiting for window state change");
            }
            qk.l lVar = ((yo) this.f25264b.f25388b.f25474l.getValue()).f25818b;
            C3133qe c3133qe = new C3133qe(null);
            this.f25263a = 1;
            if (qk.e.q(lVar, c3133qe, this) == objF) {
                return objF;
            }
        }
        C3232ue c3232ue = this.f25264b.f25388b;
        c3232ue.f25464b.f25340b = true;
        c3232ue.f25468f.f23238b.f23075e.a(Te.f23560a);
        C3207te c3207te = this.f25264b;
        Wc.a(c3207te.f25388b.f25465c, c3207te.l());
        C2767c0 c2767c0 = this.f25264b.f25754a.f25676a.f24940d;
        c2767c0.getClass();
        c2767c0.f24106e = SystemClock.elapsedRealtime();
        Dc dc2 = (Dc) this.f25264b.f25388b.f25469g.f22588f.getValue();
        Sg sg2 = this.f25264b.f25388b.f25465c;
        dc2.getClass();
        ck.p.j(sg2, "publisherNativeViewData");
        Map mapA = AbstractC2939ik.a(dc2.f22517a);
        ViewGroup parentView$media_release = sg2.f23523a.getParentView$media_release();
        int i11 = 0;
        for (Pair pair : Wc.a(sg2)) {
            View view = (View) pair.component1();
            short sShortValue = ((Number) pair.component2()).shortValue();
            if (view != null && view.getVisibility() == 0 && AbstractC3266vn.a(view, parentView$media_release)) {
                i11 |= 1 << sShortValue;
            }
        }
        mapA.put("viewState", Integer.valueOf(i11));
        Wj wj2 = Wj.f23753a;
        Wj.b("ViewStateOnParentAttached", mapA, EnumC2735ak.SDK);
        return mj.r.f64562a;
    }
}
