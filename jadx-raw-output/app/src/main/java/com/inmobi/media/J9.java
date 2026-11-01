package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.inmobi.unifiedId.InMobiUserDataModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class J9 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22913b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22912a = obj;
        this.f22913b |= Integer.MIN_VALUE;
        return InMobiUnifiedIdService.a((InMobiUserDataModel) null, this);
    }

    public J9(rj.c cVar) {
        super(cVar);
    }
}
