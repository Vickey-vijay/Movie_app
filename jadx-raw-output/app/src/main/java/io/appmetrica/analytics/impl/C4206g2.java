package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.impl.C4206g2;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4206g2 {
    public static final boolean a(Throwable th2) {
        return true;
    }

    public final Ga a(Context context, AppMetricaConfig appMetricaConfig, Ua ua2) {
        return new Ch(new C4216gc(ua2, appMetricaConfig), new InterfaceC4287j6() { // from class: af.f0
            @Override // io.appmetrica.analytics.impl.InterfaceC4287j6
            public final boolean a(Throwable th2) {
                return C4206g2.a(th2);
            }
        }, appMetricaConfig.crashTransformer, new N9(context));
    }
}
