package xm;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: Atomics.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static void a(AtomicLong atomicLong, long j10) {
        long j11 = atomicLong.get();
        while (j10 > j11 && !atomicLong.compareAndSet(j11, j10)) {
            j11 = atomicLong.get();
        }
    }
}
