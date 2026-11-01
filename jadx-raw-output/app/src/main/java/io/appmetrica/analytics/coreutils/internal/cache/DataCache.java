package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;

/* JADX INFO: loaded from: classes8.dex */
public abstract class DataCache<T> implements UpdateConditionsChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CacheUpdateScheduler f54719a;

    @NonNull
    public final CachedDataProvider.CachedData<T> mCachedData;

    public abstract boolean shouldUpdate(@NonNull T t10);

    @NonNull
    @VisibleForTesting
    public CachedDataProvider.CachedData<T> getCachedData() {
        return this.mCachedData;
    }

    public void setUpdateScheduler(@NonNull CacheUpdateScheduler cacheUpdateScheduler) {
        this.f54719a = cacheUpdateScheduler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker
    public boolean shouldUpdate() {
        return this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData();
    }

    public void updateCacheControl(long j10, long j11) {
        this.mCachedData.setExpirationPolicy(j10, j11);
    }

    public DataCache(long j10, long j11, @NonNull String str) {
        String.format("[DataCache-%s]", str);
        this.mCachedData = new CachedDataProvider.CachedData<>(j10, j11, str);
    }

    @Nullable
    public T getData() {
        CacheUpdateScheduler cacheUpdateScheduler;
        if (shouldUpdate() && (cacheUpdateScheduler = this.f54719a) != null) {
            cacheUpdateScheduler.scheduleUpdateIfNeededNow();
        }
        if (this.mCachedData.shouldClearData()) {
            this.mCachedData.setData(null);
        }
        return this.mCachedData.getData();
    }

    public void updateData(@NonNull T t10) {
        if (shouldUpdate(t10)) {
            this.mCachedData.setData(t10);
            CacheUpdateScheduler cacheUpdateScheduler = this.f54719a;
            if (cacheUpdateScheduler != null) {
                cacheUpdateScheduler.onStateUpdated();
            }
        }
    }
}
