package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.e7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2825e7 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f24298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3026m7 f24301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24302e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2825e7(C3026m7 c3026m7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24301d = c3026m7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24300c = obj;
        this.f24302e |= Integer.MIN_VALUE;
        return this.f24301d.c(this);
    }
}
