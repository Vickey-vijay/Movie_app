package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.b9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2750b9 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bk.l f24048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2879g9 f24050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24051d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2750b9(C2879g9 c2879g9, rj.c cVar) {
        super(cVar);
        this.f24050c = c2879g9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24049b = obj;
        this.f24051d |= Integer.MIN_VALUE;
        return this.f24050c.a((bk.l) null, this);
    }
}
