package com.inmobi.media;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.sk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3188sk extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bk.a f25351c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3188sk(long j10, bk.a aVar, rj.c cVar) {
        super(2, cVar);
        this.f25350b = j10;
        this.f25351c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3188sk(this.f25350b, this.f25351c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3188sk(this.f25350b, this.f25351c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25349a;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                long j10 = this.f25350b;
                this.f25349a = 1;
                if (nk.s0.a(j10, this) == objF) {
                    return objF;
                }
            }
            this.f25351c.invoke();
        } catch (CancellationException unused) {
        }
        return mj.r.f64562a;
    }
}
