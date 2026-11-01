package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4694zc extends J2 {
    public C4694zc(Context context, Cf cf2, ReporterConfig reporterConfig, C4650xi c4650xi, N9 n10) {
        this(context, c4650xi, new Gh(cf2, new CounterConfiguration(reporterConfig), new E8(new C4528sl(LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey), "Crash Environment")), reporterConfig.userProfileID), n10, C4105c4.l().n(), new Sn(), new Fg(), new C4613w6(), new C4127d0(), new Ke(n10));
    }

    @Override // io.appmetrica.analytics.impl.J2
    public final String j() {
        return "[ManualReporter]";
    }

    public C4694zc(Context context, C4650xi c4650xi, Gh gh2, N9 n10, C4513s6 c4513s6, Sn sn2, Fg fg2, C4613w6 c4613w6, C4127d0 c4127d0, Ke ke2) {
        super(context, c4650xi, gh2, n10, c4513s6, sn2, fg2, c4613w6, c4127d0, ke2);
        C4105c4.l().getClass();
    }
}
