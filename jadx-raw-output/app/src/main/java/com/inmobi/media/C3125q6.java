package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.q6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3125q6 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3224u6 f25143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25144c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3125q6(C3224u6 c3224u6, long j10, rj.c cVar) {
        super(2, cVar);
        this.f25143b = c3224u6;
        this.f25144c = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3125q6(this.f25143b, this.f25144c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3125q6(this.f25143b, this.f25144c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25142a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            qk.k kVar = this.f25143b.f25434c;
            Pl pl2 = new Pl(this.f25144c);
            this.f25142a = 1;
            if (kVar.emit(pl2, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
