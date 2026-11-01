package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes9.dex */
public interface CachedDataProvider {

    public static class CachedData<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f54714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile long f54715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile long f54716c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f54717d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f54718e = null;

        @Nullable
        public T getData() {
            return (T) this.f54718e;
        }

        @VisibleForTesting
        public long getExpiryTime() {
            return this.f54716c;
        }

        @VisibleForTesting
        public long getRefreshTime() {
            return this.f54715b;
        }

        public final boolean isEmpty() {
            return this.f54718e == null;
        }

        public void setData(@Nullable T t10) {
            this.f54718e = t10;
            this.f54717d = System.currentTimeMillis();
        }

        public void setExpirationPolicy(long j10, long j11) {
            this.f54715b = j10;
            this.f54716c = j11;
        }

        public final boolean shouldClearData() {
            if (this.f54717d == 0) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f54717d;
            return jCurrentTimeMillis > this.f54716c || jCurrentTimeMillis < 0;
        }

        @NonNull
        public String toString() {
            return "CachedData{tag='" + this.f54714a + "', refreshTime=" + this.f54715b + ", expiryTime=" + this.f54716c + ", mCachedTime=" + this.f54717d + ", mCachedData=" + this.f54718e + '}';
        }

        public CachedData(long j10, long j11, @NonNull String str) {
            this.f54714a = String.format("[CachedData-%s]", str);
            this.f54715b = j10;
            this.f54716c = j11;
        }

        public final boolean shouldUpdateData() {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f54717d;
            if (jCurrentTimeMillis <= this.f54715b && jCurrentTimeMillis >= 0) {
                return false;
            }
            return true;
        }
    }
}
