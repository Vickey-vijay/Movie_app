package com.yandex.div.internal.viewpool;

import androidx.annotation.VisibleForTesting;
import com.unity3d.services.core.di.ServiceProvider;

/* JADX INFO: compiled from: ProfilingSession.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ProfilingSessionKt {
    private static final long floorTo(long j10, long j11) {
        return (j10 / j11) * j11;
    }

    @VisibleForTesting
    public static final long roundRoughly(long j10) {
        if (j10 < 0) {
            return 0L;
        }
        if (j10 < 100) {
            return floorTo(j10, 20L);
        }
        if (j10 < 1000) {
            return floorTo(j10, 100L);
        }
        if (j10 < 2000) {
            return floorTo(j10, 200L);
        }
        if (j10 < 5000) {
            return floorTo(j10, 500L);
        }
        if (j10 < 10000) {
            return floorTo(j10, 1000L);
        }
        if (j10 < 20000) {
            return floorTo(j10, 2000L);
        }
        return j10 < ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT ? floorTo(j10, 5000L) : ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT;
    }
}
