package com.inmobi.media;

import android.widget.FrameLayout;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3138qj extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3287wj f25190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f25191b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3138qj(C3287wj c3287wj, FrameLayout frameLayout, rj.c cVar) {
        super(2, cVar);
        this.f25190a = c3287wj;
        this.f25191b = frameLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3138qj(this.f25190a, this.f25191b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3138qj(this.f25190a, this.f25191b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        C3053n9 c3053n9 = this.f25190a.f25663e;
        if (c3053n9 != null) {
            c3053n9.a("StaticExperienceManager", "inflate called - adding ImageView to parent layout");
        }
        AbstractC3266vn.a(this.f25190a.f25665g);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f25191b.addView(this.f25190a.f25665g, layoutParams);
        return mj.r.f64562a;
    }
}
