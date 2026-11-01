package com.yandex.div.core.dagger;

import android.content.Context;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.internal.viewpool.ViewCreator;

/* JADX INFO: compiled from: DivKitModule.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivKitModule {
    public static final DivKitModule INSTANCE = new DivKitModule();

    private DivKitModule() {
    }

    public static final ld.b provideSendBeaconManager(Context context, ld.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new ld.b(context, aVar);
    }

    public static final ViewCreator provideViewCreator(CpuUsageHistogramReporter cpuUsageHistogramReporter) {
        return new ViewCreator(cpuUsageHistogramReporter);
    }
}
