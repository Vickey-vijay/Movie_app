package com.inmobi.media;

import android.app.Activity;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class Of extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pf f23288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f23289c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Of(Pf pf2, Activity activity, rj.c cVar) {
        super(2, cVar);
        this.f23288b = pf2;
        this.f23289c = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Of(this.f23288b, this.f23289c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Of(this.f23288b, this.f23289c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f23287a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            Pf pf2 = this.f23288b;
            Activity activity = this.f23289c;
            this.f23287a = 1;
            if (Pf.a(pf2, activity, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
