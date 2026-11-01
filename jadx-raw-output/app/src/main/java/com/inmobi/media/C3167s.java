package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C3167s extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3267w f25285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25286c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3167s(C3267w c3267w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25285b = c3267w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25284a = obj;
        this.f25286c |= Integer.MIN_VALUE;
        return C3267w.a(this.f25285b, null, null, 0, this);
    }
}
