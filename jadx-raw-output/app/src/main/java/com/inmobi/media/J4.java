package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class J4 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22892b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J4(long j10, rj.c cVar) {
        super(2, cVar);
        this.f22892b = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new J4(this.f22892b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new J4(this.f22892b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f22891a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C4 c10 = (C4) K4.f22997b.getValue();
            int maxAdRecords = K4.c().getContextualData().getMaxAdRecords();
            long j10 = this.f22892b;
            this.f22891a = 1;
            if (c10.a(maxAdRecords, j10, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
