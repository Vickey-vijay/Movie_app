package yads;

import android.content.Context;
import android.os.StatFs;

/* JADX INFO: loaded from: classes5.dex */
public abstract class is1 {
    public static long a(Context context, long j10, long j11) {
        long availableBlocks;
        long jH = ik.k.h(j10, j11);
        try {
            StatFs statFs = new StatFs(ug0.a(context, "").getAbsolutePath());
            availableBlocks = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (IllegalArgumentException unused) {
            boolean z10 = ad1.f75480a;
            availableBlocks = jH;
        }
        long j12 = 100;
        return ik.k.e(ik.k.h((((long) 2) * availableBlocks) / j12, j11), ik.k.h(jH, (availableBlocks * ((long) 50)) / j12));
    }
}
