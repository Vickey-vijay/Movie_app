package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f58103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f58104b;

    public j(k kVar, i iVar) {
        this.f58104b = kVar;
        this.f58103a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f58104b.f58107c;
        i iVar = this.f58103a;
        pVar.f58124a = iVar;
        CacheArguments cacheArguments = iVar.f58102b;
        pVar.f58125b.updateCacheControl(cacheArguments.getRefreshPeriod(), cacheArguments.getOutdatedTimeInterval());
    }
}
