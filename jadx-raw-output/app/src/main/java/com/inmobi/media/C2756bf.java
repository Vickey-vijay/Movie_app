package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2756bf extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wk.a f24071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2782cf f24073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24074d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2756bf(C2782cf c2782cf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24073c = c2782cf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24072b = obj;
        this.f24074d |= Integer.MIN_VALUE;
        return this.f24073c.d(this);
    }
}
