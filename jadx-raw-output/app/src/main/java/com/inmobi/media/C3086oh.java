package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.oh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3086oh extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.coroutines.d f24998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3136qh f25000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25001d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3086oh(C3136qh c3136qh, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25000c = c3136qh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24999b = obj;
        this.f25001d |= Integer.MIN_VALUE;
        return this.f25000c.a(this);
    }
}
