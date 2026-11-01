package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class Md extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Nd f23162c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Md(Nd nd2, rj.c cVar) {
        super(cVar);
        this.f23162c = nd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23160a = obj;
        this.f23161b |= Integer.MIN_VALUE;
        return this.f23162c.emit(null, this);
    }
}
