package io.bidmachine.tracking;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TrackEventInfo {

    @Nullable
    private Map<String, Object> eventParameters;
    private long finishTimeMs;
    private final long startTimeMs;

    @Nullable
    public Map<String, Object> getEventParameters() {
        return this.eventParameters;
    }

    public long getFinishTimeMs() {
        return this.finishTimeMs;
    }

    public long getStartTimeMs() {
        return this.startTimeMs;
    }

    public void setFinishTimeMs(long j10) {
        this.finishTimeMs = Math.max(j10, this.startTimeMs);
    }

    @NonNull
    public TrackEventInfo withParameter(@NonNull String str, @NonNull Object obj) {
        if (this.eventParameters == null) {
            this.eventParameters = new HashMap();
        }
        this.eventParameters.put(str, obj);
        return this;
    }

    public TrackEventInfo() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.startTimeMs = jCurrentTimeMillis;
        this.finishTimeMs = jCurrentTimeMillis;
    }
}
