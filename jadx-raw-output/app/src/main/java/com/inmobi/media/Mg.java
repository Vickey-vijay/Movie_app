package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class Mg extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f23168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f23170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SignalsConfig.PublisherConfig f23171d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mg(Map map, SignalsConfig.PublisherConfig publisherConfig, rj.c cVar) {
        super(2, cVar);
        this.f23170c = map;
        this.f23171d = publisherConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Mg(this.f23170c, this.f23171d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Mg(this.f23170c, this.f23171d, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0178, code lost:
    
        if (com.inmobi.media.Og.b(r13, r2, r0, r12) == r1) goto L70;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Mg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
