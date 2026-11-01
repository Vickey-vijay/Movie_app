package m4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;

/* JADX INFO: compiled from: BaseMediaChunk.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f64032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f64033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f64034l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f64035m;

    public a(com.google.android.exoplayer2.upstream.a aVar, e5.h hVar, Format format, int i10, @Nullable Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(aVar, hVar, format, i10, obj, j10, j11, j14);
        this.f64032j = j12;
        this.f64033k = j13;
    }

    public final int g(int i10) {
        return this.f64035m[i10];
    }

    public final c h() {
        return this.f64034l;
    }

    public void i(c cVar) {
        this.f64034l = cVar;
        this.f64035m = cVar.a();
    }
}
