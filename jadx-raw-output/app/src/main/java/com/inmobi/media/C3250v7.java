package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.v7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3250v7 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3275w7 f25538c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3250v7(C3275w7 c3275w7, rj.c cVar) {
        super(cVar);
        this.f25538c = c3275w7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25536a = obj;
        this.f25537b |= Integer.MIN_VALUE;
        return this.f25538c.emit(null, this);
    }
}
