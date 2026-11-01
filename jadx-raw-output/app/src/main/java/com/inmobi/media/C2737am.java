package com.inmobi.media;

import android.widget.FrameLayout;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2737am extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3091om f24012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f24013b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2737am(C3091om c3091om, FrameLayout frameLayout, rj.c cVar) {
        super(2, cVar);
        this.f24012a = c3091om;
        this.f24013b = frameLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2737am(this.f24012a, this.f24013b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2737am(this.f24012a, this.f24013b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        C3053n9 c3053n9 = this.f24012a.f25012e;
        if (c3053n9 != null) {
            c3053n9.a("VideoExperienceManager", "inflate called - adding media player to parent layout");
        }
        AbstractC3266vn.a(this.f24012a.f25017j);
        this.f24013b.addView(this.f24012a.f25017j);
        return mj.r.f64562a;
    }
}
