package w3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;

/* JADX INFO: compiled from: Track.java */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f73454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f73455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f73456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Format f73457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f73458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final long[] f73459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final long[] f73460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f73461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final m[] f73462k;

    @Nullable
    public m a(int i10) {
        m[] mVarArr = this.f73462k;
        if (mVarArr == null) {
            return null;
        }
        return mVarArr[i10];
    }

    public l(int i10, int i11, long j10, long j11, long j12, Format format, int i12, @Nullable m[] mVarArr, int i13, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.f73452a = i10;
        this.f73453b = i11;
        this.f73454c = j10;
        this.f73455d = j11;
        this.f73456e = j12;
        this.f73457f = format;
        this.f73458g = i12;
        this.f73462k = mVarArr;
        this.f73461j = i13;
        this.f73459h = jArr;
        this.f73460i = jArr2;
    }
}
