package g0;

import java.io.File;

/* JADX INFO: compiled from: TotalSizeLruDiskUsage.java */
/* JADX INFO: loaded from: classes9.dex */
public class g extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f53012b;

    @Override // g0.e
    public boolean b(File file, long j10, int i10) {
        return j10 <= this.f53012b;
    }

    public g(long j10) {
        if (j10 > 0) {
            this.f53012b = j10;
            return;
        }
        throw new IllegalArgumentException("Max size must be positive number!");
    }
}
