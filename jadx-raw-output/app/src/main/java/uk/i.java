package uk;

import java.util.concurrent.TimeUnit;
import sk.e0;
import sk.g0;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f72904a = e0.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f72905b = g0.f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f72906c = g0.e("kotlinx.coroutines.scheduler.core.pool.size", ik.k.d(e0.a(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f72907d = g0.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f72908e = TimeUnit.SECONDS.toNanos(g0.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static f f72909f = d.f72895a;

    public static final String c(boolean z10) {
        return z10 ? "Blocking" : "Non-blocking";
    }

    public static final g b(Runnable runnable, long j10, boolean z10) {
        return new h(runnable, j10, z10);
    }
}
