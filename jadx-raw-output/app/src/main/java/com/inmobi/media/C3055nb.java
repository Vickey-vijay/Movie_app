package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3055nb extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f24883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wk.a f24884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3105pb f24886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24887f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3055nb(C3105pb c3105pb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24886e = c3105pb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24885d = obj;
        this.f24887f |= Integer.MIN_VALUE;
        return this.f24886e.a(null, null, this);
    }
}
