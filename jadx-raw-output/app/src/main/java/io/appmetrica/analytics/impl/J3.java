package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;

/* JADX INFO: loaded from: classes5.dex */
public final class J3 implements ModuleClientActivator {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator
    public final void activate(Context context) {
        C4075b0 c4075b0B = C4105c4.l().b();
        c4075b0B.f56390c.a().executeDelayed(new C4049a0(c4075b0B, context), c4075b0B.f56391d);
    }
}
