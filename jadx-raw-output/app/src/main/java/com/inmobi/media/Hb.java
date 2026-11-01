package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Hb extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3130qb f22800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3130qb f22801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f22802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Jb f22803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22804f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hb(Jb jb2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22803e = jb2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22802d = obj;
        this.f22804f |= Integer.MIN_VALUE;
        return this.f22803e.b(null, null, this);
    }
}
