package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class Yf extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rf f23849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bk.p f23850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Zf f23852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23853e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yf(Zf zf2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23852d = zf2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23851c = obj;
        this.f23853e |= Integer.MIN_VALUE;
        return this.f23852d.a(null, null, this);
    }
}
