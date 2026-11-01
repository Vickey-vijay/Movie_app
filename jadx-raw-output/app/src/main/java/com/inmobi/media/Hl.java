package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class Hl extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3065nl f22823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Il f22825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22826d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hl(Il il2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22825c = il2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22824b = obj;
        this.f22826d |= Integer.MIN_VALUE;
        return this.f22825c.a(null, null, null, this);
    }
}
