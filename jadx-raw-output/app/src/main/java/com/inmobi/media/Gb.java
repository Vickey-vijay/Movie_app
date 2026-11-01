package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class Gb extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Jb f22729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22730c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gb(Jb jb2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22729b = jb2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22728a = obj;
        this.f22730c |= Integer.MIN_VALUE;
        return this.f22729b.a(null, null, this);
    }
}
