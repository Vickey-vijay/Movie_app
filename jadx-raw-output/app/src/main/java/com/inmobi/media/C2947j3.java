package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2947j3 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S2 f24580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2972k3 f24582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24583d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2947j3(C2972k3 c2972k3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24582c = c2972k3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24581b = obj;
        this.f24583d |= Integer.MIN_VALUE;
        return this.f24582c.a(null, this);
    }
}
