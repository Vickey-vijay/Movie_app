package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3283wf extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3333yf f25644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25645c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3283wf(C3333yf c3333yf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25644b = c3333yf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25643a = obj;
        this.f25645c |= Integer.MIN_VALUE;
        return C3333yf.a(this.f25644b, this);
    }
}
