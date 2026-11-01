package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Ha extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ La f22797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L2 f22798c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ha(La la2, L2 l10, rj.c cVar) {
        super(1, cVar);
        this.f22797b = la2;
        this.f22798c = l10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new Ha(this.f22797b, this.f22798c, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new Ha(this.f22797b, this.f22798c, (rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f22796a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            La la2 = this.f22797b;
            L2 l10 = this.f22798c;
            this.f22796a = 1;
            if (La.a(la2, l10, this) == objF) {
                return objF;
            }
        }
        this.f22797b.a();
        return mj.r.f64562a;
    }
}
