package io.bidmachine.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.utils.time.SystemTimeManagerInstance;
import io.bidmachine.utils.time.TimeManagerInstance;

/* JADX INFO: loaded from: classes10.dex */
public final class TimeManager {

    @NonNull
    private static TimeManagerInstance instance = new SystemTimeManagerInstance();

    public static long currentTimeMillis() {
        return instance.currentTimeMillis();
    }

    @Nullable
    public static String getTimezoneId() {
        return instance.getTimeZoneId();
    }
}
