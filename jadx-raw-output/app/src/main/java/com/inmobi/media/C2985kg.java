package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2985kg extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rf f24678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3085og f24680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24681d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2985kg(C3085og c3085og, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24680c = c3085og;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24679b = obj;
        this.f24681d |= Integer.MIN_VALUE;
        return this.f24680c.a((String) null, this);
    }
}
