package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter;

/* JADX INFO: loaded from: classes2.dex */
public interface Ba extends SimpleAdvertisingIdGetter, InterfaceC4355lm {
    AdvertisingIdsHolder a();

    AdvertisingIdsHolder a(Hi hi2);

    @Override // io.appmetrica.analytics.impl.InterfaceC4355lm
    /* synthetic */ void a(@NonNull C4226gm c4226gm);

    void b(boolean z10);

    void c(boolean z10);

    AdvertisingIdsHolder getIdentifiers();

    void init();
}
