package com.inmobi.media;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.sd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3181sd extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dd f25320a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3181sd(Dd dd2, rj.c cVar) {
        super(2, cVar);
        this.f25320a = dd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3181sd(this.f25320a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3181sd(this.f25320a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        int i10 = AbstractC2984kf.f24677a;
        Context applicationContext = this.f25320a.f25754a.f25676a.f24938b.getApplicationContext();
        ck.p.i(applicationContext, "getApplicationContext(...)");
        return tj.a.a(AbstractC2984kf.a(applicationContext));
    }
}
