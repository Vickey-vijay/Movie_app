package com.ironsource;

import com.ironsource.C3642p3;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3624o3<Smash extends C3642p3<?>> extends AbstractC3568l3<Smash, AdapterAdRewardListener> implements V0 {
    @Override // com.ironsource.V0
    public void a(C3642p3<?> c3642p3, C3489gd c3489gd) {
        IronLog.INTERNAL.verbose(b(c3642p3.k()));
        this.f30254t.b(c3489gd, c3642p3.f());
    }

    public AbstractC3624o3(V v10, C3649pa c3649pa, C3450ea c3450ea) {
        super(v10, c3649pa, c3450ea);
    }
}
