package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class Cl extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fl f22478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22479c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cl(Fl fl2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22478b = fl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22477a = obj;
        this.f22479c |= Integer.MIN_VALUE;
        return this.f22478b.a((String) null, this);
    }
}
