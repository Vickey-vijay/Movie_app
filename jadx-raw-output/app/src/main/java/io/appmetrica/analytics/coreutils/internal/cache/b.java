package io.appmetrica.analytics.coreutils.internal.cache;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationDataCacheUpdateScheduler f54726a;

    public b(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.f54726a = locationDataCacheUpdateScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f54726a.f54722c.shouldUpdate()) {
            this.f54726a.f54723d.f54725a.f54721b.updateLastKnown();
        }
    }
}
