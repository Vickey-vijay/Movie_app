package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class Z6 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InMobiUserDataModel f23891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wk.a f23892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23894d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23893c = obj;
        this.f23894d |= Integer.MIN_VALUE;
        return C2722a7.a(null, this);
    }

    public Z6(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }
}
