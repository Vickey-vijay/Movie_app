package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class Zl extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3091om f23925a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zl(C3091om c3091om, rj.c cVar) {
        super(2, cVar);
        this.f23925a = c3091om;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Zl(this.f23925a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Zl(this.f23925a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        ViewGroup viewGroup = this.f23925a.f25017j;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(null);
        }
        return mj.r.f64562a;
    }
}
