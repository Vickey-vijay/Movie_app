package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4393na implements InterfaceC4378mk {
    @Override // io.appmetrica.analytics.impl.InterfaceC4378mk
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4378mk
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
