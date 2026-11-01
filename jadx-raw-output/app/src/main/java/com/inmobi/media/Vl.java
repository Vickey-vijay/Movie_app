package com.inmobi.media;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Vl extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Wl f23714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23715c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vl(Wl wl2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23714b = wl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23713a = obj;
        this.f23715c |= Integer.MIN_VALUE;
        return this.f23714b.a((String) null, (ArrayList) null, this);
    }
}
