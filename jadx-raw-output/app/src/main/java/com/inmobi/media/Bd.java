package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class Bd extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Dd f22416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22417c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bd(Dd dd2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22416b = dd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22415a = obj;
        this.f22417c |= Integer.MIN_VALUE;
        return this.f22416b.a(null, this);
    }
}
