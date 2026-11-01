package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.he, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2909he extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3207te f24505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24506c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2909he(C3207te c3207te, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24505b = c3207te;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24504a = obj;
        this.f24506c |= Integer.MIN_VALUE;
        return this.f24505b.a(this);
    }
}
