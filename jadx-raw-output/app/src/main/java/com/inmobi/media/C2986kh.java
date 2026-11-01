package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.kh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2986kh extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3011lh f24683b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2986kh(C3011lh c3011lh, rj.c cVar) {
        super(2, cVar);
        this.f24683b = c3011lh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2986kh(this.f24683b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2986kh(this.f24683b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f24682a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            H0 h10 = (H0) E0.f22556a.getValue();
            AdQualityResult adQualityResult = this.f24683b.f24778a;
            this.f24682a = 1;
            if (h10.a(adQualityResult, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
