package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3247v4 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3297x4 f25527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25528d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3247v4(C3297x4 c3297x4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25527c = c3297x4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25526b = obj;
        this.f25528d |= Integer.MIN_VALUE;
        return this.f25527c.a(null, null, null, this);
    }
}
