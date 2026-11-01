package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.jj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2963jj extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Cj f24623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3063nj f24625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3261vi f24626d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2963jj(C3063nj c3063nj, C3261vi c3261vi, rj.c cVar) {
        super(2, cVar);
        this.f24625c = c3063nj;
        this.f24626d = c3261vi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2963jj(this.f24625c, this.f24626d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2963jj(this.f24625c, this.f24626d, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24624b;
        if (i10 != 0) {
            if (i10 == 1) {
                Cj cj2 = this.f24623a;
                kotlin.c.b(obj);
                return cj2;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        Cj cj3 = new Cj(this.f24625c.f24906a);
        C3063nj c3063nj = this.f24625c;
        String str = this.f24626d.f25577a;
        this.f24623a = cj3;
        this.f24624b = 1;
        if (C3063nj.a(c3063nj, str, cj3, this) == objF) {
            return objF;
        }
        return cj3;
    }
}
