package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2975k6 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f24653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f24654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3000l6 f24656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24657e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2975k6(C3000l6 c3000l6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24656d = c3000l6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24655c = obj;
        this.f24657e |= Integer.MIN_VALUE;
        return this.f24656d.a(0L, 0L, this);
    }
}
