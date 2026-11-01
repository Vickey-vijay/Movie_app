package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3088oj extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3113pj f25005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25006c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3088oj(C3113pj c3113pj, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25005b = c3113pj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25004a = obj;
        this.f25006c |= Integer.MIN_VALUE;
        return this.f25005b.a(this);
    }
}
