package wk;

import sk.d0;
import sk.g0;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f74146a = g0.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f74147b = new d0("PERMIT");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f74148c = new d0("TAKEN");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d0 f74149d = new d0("BROKEN");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d0 f74150e = new d0("CANCELLED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f74151f = g0.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    public static final j h(long j10, j jVar) {
        return new j(j10, jVar, 0);
    }
}
