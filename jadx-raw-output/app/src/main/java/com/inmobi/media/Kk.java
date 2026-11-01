package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Kk extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wk.a f23023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f23024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Mk f23025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23026f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kk(Mk mk2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23025e = mk2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23024d = obj;
        this.f23026f |= Integer.MIN_VALUE;
        return this.f23025e.a(0, null, this);
    }
}
