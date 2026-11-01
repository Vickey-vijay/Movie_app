package q5;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: OverflowAvoidingLockSupport.java */
/* JADX INFO: loaded from: classes10.dex */
public final class m {
    public static void a(Object obj, long j10) {
        LockSupport.parkNanos(obj, Math.min(j10, 2147483647999999999L));
    }
}
