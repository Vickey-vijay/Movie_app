package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.k9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2978k9 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3003l9 f24661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3003l9 f24663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24664d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2978k9(C3003l9 c3003l9, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24663c = c3003l9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24662b = obj;
        this.f24664d |= Integer.MIN_VALUE;
        return this.f24663c.a(this);
    }
}
