package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.o5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3074o5 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rf f24952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3099p5 f24954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24955d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3074o5(C3099p5 c3099p5, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24954c = c3099p5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24953b = obj;
        this.f24955d |= Integer.MIN_VALUE;
        return this.f24954c.a((Rf) null, this);
    }
}
