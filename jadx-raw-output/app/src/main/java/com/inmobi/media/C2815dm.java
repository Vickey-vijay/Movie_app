package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2815dm extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3091om f24260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3091om f24262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24263d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2815dm(C3091om c3091om, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24262c = c3091om;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24261b = obj;
        this.f24263d |= Integer.MIN_VALUE;
        return this.f24262c.b(this);
    }
}
