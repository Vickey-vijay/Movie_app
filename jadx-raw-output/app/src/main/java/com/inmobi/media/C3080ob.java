package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3080ob extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wk.a f24977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3105pb f24979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24980e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3080ob(C3105pb c3105pb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24979d = c3105pb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24978c = obj;
        this.f24980e |= Integer.MIN_VALUE;
        return this.f24979d.a(null, this);
    }
}
