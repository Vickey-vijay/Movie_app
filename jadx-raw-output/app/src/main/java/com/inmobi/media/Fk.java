package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class Fk extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Jk f22665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22666c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fk(Jk jk2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22665b = jk2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22664a = obj;
        this.f22666c |= Integer.MIN_VALUE;
        return this.f22665b.a((ContinuationImpl) this);
    }
}
