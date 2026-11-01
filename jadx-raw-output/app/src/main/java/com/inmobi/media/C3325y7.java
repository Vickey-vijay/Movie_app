package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.y7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3325y7 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f25772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25773b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3325y7(rj.c cVar, N7 n10, boolean z10) {
        super(2, cVar);
        this.f25772a = n10;
        this.f25773b = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3325y7(cVar, this.f25772a, this.f25773b);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3325y7((rj.c) obj2, this.f25772a, this.f25773b).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10;
        sj.a.f();
        kotlin.c.b(obj);
        G1 g10 = this.f25772a.f23209n;
        if (this.f25773b) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        g10.setVisibility(i10);
        return mj.r.f64562a;
    }
}
