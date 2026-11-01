package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes6.dex */
public interface M0 {
    default void a() {
    }

    void a(IronSourceError ironSourceError);

    void a(C3706t0 c3706t0);

    default void b(C3706t0 c3706t0) {
        ck.p.j(c3706t0, "adUnitCallback");
    }
}
