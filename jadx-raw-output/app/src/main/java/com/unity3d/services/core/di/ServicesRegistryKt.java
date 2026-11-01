package com.unity3d.services.core.di;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: ServicesRegistry.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ServicesRegistryKt {
    public static final ServicesRegistry registry(l<? super ServicesRegistry, r> lVar) {
        p.j(lVar, "registry");
        ServicesRegistry servicesRegistry = new ServicesRegistry();
        lVar.invoke(servicesRegistry);
        return servicesRegistry;
    }
}
