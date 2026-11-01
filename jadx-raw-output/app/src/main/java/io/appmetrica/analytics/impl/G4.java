package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: loaded from: classes5.dex */
public final class G4 extends Gh {
    @Override // io.appmetrica.analytics.impl.Gh
    public final boolean f() {
        return true;
    }

    public G4(Cf cf2) {
        super(cf2, new CounterConfiguration(), new E8(new C4528sl(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment")));
        b().setReporterType(CounterConfigurationReporterType.COMMUTATION);
    }
}
