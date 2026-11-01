package o8;

import android.os.SystemClock;

/* JADX INFO: compiled from: DoubleUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f65138a;

    public static boolean a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f65138a < 600) {
            return true;
        }
        f65138a = jElapsedRealtime;
        return false;
    }
}
