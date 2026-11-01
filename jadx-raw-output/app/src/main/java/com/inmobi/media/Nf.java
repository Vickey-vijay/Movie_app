package com.inmobi.media;

import android.app.Activity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class Nf extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f23240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wk.a f23241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Pf f23243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23244e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nf(Pf pf2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23243d = pf2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23242c = obj;
        this.f23244e |= Integer.MIN_VALUE;
        return Pf.a(this.f23243d, null, this);
    }
}
