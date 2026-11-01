package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.ej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2837ej extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC2786cj f24317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC2786cj f24318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wk.a f24319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC2863fj f24321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24322f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2837ej(AbstractC2863fj abstractC2863fj, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24321e = abstractC2863fj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24320d = obj;
        this.f24322f |= Integer.MIN_VALUE;
        return this.f24321e.a(null, null, this);
    }
}
