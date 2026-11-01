package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class LocationDataCacheUpdateScheduler implements CacheUpdateScheduler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ICommonExecutor f54720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILastKnownUpdater f54721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final UpdateConditionsChecker f54722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f54723d = new a(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f54724e = new b(this);

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void onStateUpdated() {
        this.f54720a.remove(this.f54723d);
        this.f54720a.executeDelayed(this.f54723d, 90L, TimeUnit.SECONDS);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void scheduleUpdateIfNeededNow() {
        this.f54720a.execute(this.f54724e);
    }

    public void stopUpdates() {
        this.f54720a.remove(this.f54723d);
        this.f54720a.remove(this.f54724e);
    }

    public LocationDataCacheUpdateScheduler(@NonNull ICommonExecutor iCommonExecutor, @NonNull ILastKnownUpdater iLastKnownUpdater, @NonNull UpdateConditionsChecker updateConditionsChecker, @NonNull String str) {
        this.f54720a = iCommonExecutor;
        this.f54721b = iLastKnownUpdater;
        this.f54722c = updateConditionsChecker;
        String.format("[LocationDataCacheUpdateScheduler-%s]", str);
    }

    public void startUpdates() {
        onStateUpdated();
    }
}
