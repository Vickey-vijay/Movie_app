package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
public final class Fh extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f22654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3304xb f22655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Gh f22657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f22658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f22659f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fh(Gh gh2, long j10, boolean z10, rj.c cVar) {
        super(2, cVar);
        this.f22657d = gh2;
        this.f22658e = j10;
        this.f22659f = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Fh(this.f22657d, this.f22658e, this.f22659f, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((Fh) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00af  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        if (r2.b(r7, r19) == r1) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
