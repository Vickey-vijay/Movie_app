package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3190sm extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25354b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25353a = obj;
        this.f25354b |= Integer.MIN_VALUE;
        return AbstractC3290wm.a(null, null, this);
    }

    public C3190sm(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }
}
