package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4476qi implements IExecutionPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataSendingRestrictionController f57573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57574b = "data restriction based";

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        return !this.f57573a.isRestrictedForSdk();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.f57574b;
    }

    public C4476qi(DataSendingRestrictionController dataSendingRestrictionController) {
        this.f57573a = dataSendingRestrictionController;
    }
}
