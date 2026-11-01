package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class I4 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W5 f22843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22844c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I4(W5 w10, long j10, rj.c cVar) {
        super(2, cVar);
        this.f22843b = w10;
        this.f22844c = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new I4(this.f22843b, this.f22844c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new I4(this.f22843b, this.f22844c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f22842a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            K4 k10 = K4.f22996a;
            W5 w10 = this.f22843b;
            int maxAdRecords = K4.c().getContextualData().getMaxAdRecords();
            long j10 = this.f22844c;
            this.f22842a = 1;
            ck.p.i("K4", "TAG");
            C4 c10 = (C4) K4.f22997b.getValue();
            C2879g9 c2879g9 = c10.f22449a;
            B4 b10 = new B4(c10, w10, j10, maxAdRecords, null);
            c2879g9.getClass();
            Object objA = c2879g9.a(new C2853f9(c2879g9, b10, null), this);
            if (objA != sj.a.f()) {
                objA = mj.r.f64562a;
            }
            if (objA != sj.a.f()) {
                objA = mj.r.f64562a;
            }
            if (objA == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
