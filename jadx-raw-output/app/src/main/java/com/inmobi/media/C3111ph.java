package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.ph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3111ph extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f25081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3136qh f25083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25084d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3111ph(C3136qh c3136qh, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25083c = c3136qh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25082b = obj;
        this.f25084d |= Integer.MIN_VALUE;
        return this.f25083c.a(null, this);
    }
}
