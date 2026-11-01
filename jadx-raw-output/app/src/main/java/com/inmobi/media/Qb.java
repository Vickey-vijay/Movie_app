package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Qb extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3304xb f23381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f23382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qb(C3304xb c3304xb, long j10, int i10, rj.c cVar) {
        super(1, cVar);
        this.f23381a = c3304xb;
        this.f23382b = j10;
        this.f23383c = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new Qb(this.f23381a, this.f23382b, this.f23383c, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return ((Qb) create((rj.c) obj)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        nk.j.d(A9.f22351c, null, null, new Pb(this.f23381a, this.f23382b, this.f23383c, null), 3, null);
        return mj.r.f64562a;
    }
}
