package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC3563kg {
    void a() throws C3653pe;

    default void a(boolean z10, bk.a<? extends IronSourceError> aVar) {
        ck.p.j(aVar, "lazyError");
        if (!z10) {
            throw new C3653pe(aVar.invoke());
        }
    }
}
