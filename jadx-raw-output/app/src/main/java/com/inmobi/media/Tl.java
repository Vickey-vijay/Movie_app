package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Tl extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3140ql f23586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Wl f23588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tl(Wl wl2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23588c = wl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23587b = obj;
        this.f23589d |= Integer.MIN_VALUE;
        return this.f23588c.a(this);
    }
}
