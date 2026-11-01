package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2763bm extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3091om f24084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3091om f24086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24087d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2763bm(C3091om c3091om, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24086c = c3091om;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24085b = obj;
        this.f24087d |= Integer.MIN_VALUE;
        return this.f24086c.a(this);
    }
}
