package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3122q3 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S2 f25132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2715a0 f25133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC3028m9 f25134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f25135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3271w3 f25136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25137f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3122q3(C3271w3 c3271w3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25136e = c3271w3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25135d = obj;
        this.f25137f |= Integer.MIN_VALUE;
        return this.f25136e.a(null, null, null, this);
    }
}
