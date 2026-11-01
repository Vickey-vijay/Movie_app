package nk;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sk.d0 f64791a = new sk.d0("REMOVED_TASK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final sk.d0 f64792b = new sk.d0("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j10;
    }
}
