package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Z2 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W2 f23884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdConfig.ImaiConfig f23885c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z2(W2 w10, AdConfig.ImaiConfig imaiConfig, rj.c cVar) {
        super(2, cVar);
        this.f23884b = w10;
        this.f23885c = imaiConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Z2(this.f23884b, this.f23885c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Z2(this.f23884b, this.f23885c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f23883a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            W2 w10 = this.f23884b;
            int maxEventBatch = this.f23885c.getMaxEventBatch();
            int pingInterval = this.f23885c.getPingInterval();
            this.f23883a = 1;
            obj = w10.a(maxEventBatch, pingInterval, this);
            if (obj == objF) {
                return objF;
            }
        }
        ck.p.h(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.inmobi.ads.core.Click>");
        return ck.x.c(obj);
    }
}
