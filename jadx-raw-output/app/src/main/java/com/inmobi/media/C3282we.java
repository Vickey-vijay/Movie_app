package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.we, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3282we extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3332ye f25641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25642c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3282we(C3332ye c3332ye, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25641b = c3332ye;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25640a = obj;
        this.f25642c |= Integer.MIN_VALUE;
        return this.f25641b.a(this);
    }
}
