package ql;

import android.os.SystemClock;

/* JADX INFO: compiled from: SystemClock.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {
    public static final void a(long j10) {
        SystemClock.sleep(j10);
    }

    public static final long b() {
        return SystemClock.elapsedRealtime();
    }
}
