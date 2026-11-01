package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.kj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2988kj extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Cj f24690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3063nj f24692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24693e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2988kj(C3063nj c3063nj, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24692d = c3063nj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24691c = obj;
        this.f24693e |= Integer.MIN_VALUE;
        return C3063nj.a(this.f24692d, null, null, this);
    }
}
