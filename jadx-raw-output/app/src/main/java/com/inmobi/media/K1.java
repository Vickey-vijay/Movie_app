package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class K1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M1 f22976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22977c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K1(M1 m10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22976b = m10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22975a = obj;
        this.f22977c |= Integer.MIN_VALUE;
        return M1.a(this.f22976b, null, null, this);
    }
}
