package com.unity3d.ads.core.domain;

import com.unity3d.services.core.log.DeviceLog;
import kotlin.coroutines.d;
import nk.i0;

/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 extends kotlin.coroutines.a implements i0 {
    @Override // nk.i0
    public void handleException(d dVar, Throwable th2) {
        DeviceLog.debug("CleanUpExpiredOpportunity: " + th2.getMessage());
    }

    public CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1(i0.b bVar) {
        super(bVar);
    }
}
