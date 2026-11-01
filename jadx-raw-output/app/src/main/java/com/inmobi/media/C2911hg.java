package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2911hg extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC2935ig f24510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24511d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2911hg(AbstractC2935ig abstractC2935ig, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24510c = abstractC2935ig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24509b = obj;
        this.f24511d |= Integer.MIN_VALUE;
        return this.f24510c.a((String) null, this);
    }
}
