package com.google.android.gms.common.util;

import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes11.dex */
@ShowFirstParty
@KeepForSdk
public interface Clock {
    @KeepForSdk
    long currentTimeMillis();

    @KeepForSdk
    long elapsedRealtime();

    @KeepForSdk
    long nanoTime();

    @KeepForSdk
    default long currentThreadTimeMillis() {
        return SystemClock.currentThreadTimeMillis();
    }
}
