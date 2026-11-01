package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
public final class G7 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N7 f22719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rl f22720c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G7(N7 n10, Rl rl2, rj.c cVar) {
        super(2, cVar);
        this.f22719b = n10;
        this.f22720c = rl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new G7(this.f22719b, this.f22720c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new G7(this.f22719b, this.f22720c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f22718a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            qk.k kVar = this.f22719b.f23208m;
            Rl rl2 = this.f22720c;
            this.f22718a = 1;
            if (kVar.emit(rl2, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
