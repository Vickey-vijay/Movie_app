package io.appmetrica.analytics.coreutils.internal.services.frequency;

import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u0010"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyOverWindowLimitDetector;", "", "", C3426d4.i.W, "", "detect", "", "window", "", "limitPerWindow", "Lmj/r;", "updateParameters", "Lio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyStorage;", C3426d4.a.f28418k, "<init>", "(JILio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyStorage;)V", "core-utils_release"}, k = 1, mv = {1, 6, 0})
public final class EventFrequencyOverWindowLimitDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f54766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventFrequencyStorage f54768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SystemTimeProvider f54769d = new SystemTimeProvider();

    public final synchronized void updateParameters(long j10, int i10) {
        this.f54766a = j10;
        this.f54767b = i10;
    }

    public final boolean detect(String key) {
        long jLongValue;
        long jUptimeMillis = this.f54769d.uptimeMillis();
        EventFrequencyStorage eventFrequencyStorage = this.f54768c;
        Long windowStart = eventFrequencyStorage.getWindowStart(key);
        if (windowStart == null) {
            eventFrequencyStorage.putWindowStart(key, jUptimeMillis);
            jLongValue = jUptimeMillis;
        } else {
            jLongValue = windowStart.longValue();
        }
        long j10 = jUptimeMillis - jLongValue;
        if (j10 < 0 || j10 > this.f54766a) {
            this.f54768c.putWindowStart(key, jUptimeMillis);
            this.f54768c.putWindowOccurrencesCount(key, 1);
            return false;
        }
        Integer windowOccurrencesCount = this.f54768c.getWindowOccurrencesCount(key);
        int iIntValue = (windowOccurrencesCount != null ? windowOccurrencesCount.intValue() : 0) + 1;
        this.f54768c.putWindowOccurrencesCount(key, iIntValue);
        return iIntValue > this.f54767b;
    }

    public EventFrequencyOverWindowLimitDetector(long j10, int i10, EventFrequencyStorage eventFrequencyStorage) {
        this.f54766a = j10;
        this.f54767b = i10;
        this.f54768c = eventFrequencyStorage;
    }
}
