package yads;

import android.content.Context;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.SimpleCache;

/* JADX INFO: loaded from: classes10.dex */
public final class cp0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f76378c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile cp0 f76379d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yo0 f76380a = new yo0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SimpleCache f76381b;

    public final Cache a(Context context) {
        SimpleCache simpleCacheA;
        synchronized (f76378c) {
            simpleCacheA = this.f76381b;
            if (simpleCacheA == null) {
                simpleCacheA = this.f76380a.a(context);
                this.f76381b = simpleCacheA;
            }
        }
        return simpleCacheA;
    }
}
