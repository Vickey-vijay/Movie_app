package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;

/* JADX INFO: loaded from: classes9.dex */
public class ExponentialBackoffDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimePassedChecker f58261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeProvider f58262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HostRetryInfoProvider f58263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f58264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f58265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f58266f;

    public ExponentialBackoffDataHolder(@NonNull HostRetryInfoProvider hostRetryInfoProvider, @NonNull String str) {
        this(hostRetryInfoProvider, new SystemTimeProvider(), new TimePassedChecker(), str);
    }

    public void reset() {
        this.f58265e = 1;
        this.f58264d = 0L;
        this.f58263c.saveNextSendAttemptNumber(1);
        this.f58263c.saveLastAttemptTimeSeconds(this.f58264d);
    }

    public boolean wasLastAttemptLongAgoEnough(@Nullable RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j10 = this.f58264d;
            if (j10 != 0) {
                TimePassedChecker timePassedChecker = this.f58261a;
                int i10 = ((1 << (this.f58265e - 1)) - 1) * retryPolicyConfig.exponentialMultiplier;
                int i11 = retryPolicyConfig.maxIntervalSeconds;
                if (i10 > i11) {
                    i10 = i11;
                }
                return timePassedChecker.didTimePassSeconds(j10, i10, this.f58266f);
            }
        }
        return true;
    }

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, SystemTimeProvider systemTimeProvider, TimePassedChecker timePassedChecker, String str) {
        this.f58263c = hostRetryInfoProvider;
        this.f58262b = systemTimeProvider;
        this.f58261a = timePassedChecker;
        this.f58264d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f58265e = hostRetryInfoProvider.getNextSendAttemptNumber();
        this.f58266f = String.format("[ExponentialBackoffDataHolder-%s]", str);
    }

    public void updateLastAttemptInfo() {
        long jCurrentTimeSeconds = this.f58262b.currentTimeSeconds();
        this.f58264d = jCurrentTimeSeconds;
        this.f58265e++;
        this.f58263c.saveLastAttemptTimeSeconds(jCurrentTimeSeconds);
        this.f58263c.saveNextSendAttemptNumber(this.f58265e);
    }
}
