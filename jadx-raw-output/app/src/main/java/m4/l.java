package m4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;

/* JADX INFO: compiled from: MediaChunk.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class l extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f64108i;

    public l(com.google.android.exoplayer2.upstream.a aVar, e5.h hVar, Format format, int i10, @Nullable Object obj, long j10, long j11, long j12) {
        super(aVar, hVar, 1, format, i10, obj, j10, j11);
        g5.a.e(format);
        this.f64108i = j12;
    }

    public abstract boolean f();

    public long e() {
        long j10 = this.f64108i;
        if (j10 != -1) {
            return 1 + j10;
        }
        return -1L;
    }
}
