package com.unity3d.services.core.di;

import bk.a;
import ck.p;
import mj.g;

/* JADX INFO: compiled from: ServiceFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ServiceFactoryKt {
    public static final <T> g<T> factoryOf(a<? extends T> aVar) {
        p.j(aVar, "initializer");
        return new Factory(aVar);
    }
}
