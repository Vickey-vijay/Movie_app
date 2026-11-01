package io.bidmachine.utils.time;

import androidx.annotation.Nullable;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes11.dex */
public final class SystemTimeManagerInstance implements TimeManagerInstance {
    @Override // io.bidmachine.utils.time.TimeManagerInstance
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // io.bidmachine.utils.time.TimeManagerInstance
    @Nullable
    public String getTimeZoneId() {
        return TimeZone.getDefault().getID();
    }
}
