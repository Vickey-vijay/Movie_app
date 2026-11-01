package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2816dn extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2867fn f24267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24268e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2816dn(C2867fn c2867fn, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24267d = c2867fn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24266c = obj;
        this.f24268e |= Integer.MIN_VALUE;
        return C2867fn.a(this.f24267d, this);
    }
}
