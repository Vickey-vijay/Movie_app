package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Hk extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignalsConfig.UnifiedIdServiceConfig f22822b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hk(SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig, rj.c cVar) {
        super(1, cVar);
        this.f22822b = unifiedIdServiceConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new Hk(this.f22822b, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new Hk(this.f22822b, (rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cb, code lost:
    
        if (r2.a(r4, r12) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e0, code lost:
    
        if (r1.a(r3, r13, r12) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Hk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
