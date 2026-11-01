package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.gg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2886gg extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Xf f24428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC2860fg f24429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rf f24430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC2935ig f24432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24433f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2886gg(AbstractC2935ig abstractC2935ig, rj.c cVar) {
        super(cVar);
        this.f24432e = abstractC2935ig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24431d = obj;
        this.f24433f |= Integer.MIN_VALUE;
        return this.f24432e.a(null, null, this);
    }
}
