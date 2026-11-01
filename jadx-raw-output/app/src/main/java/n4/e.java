package n4;

import com.google.android.exoplayer2.Format;
import g5.k0;
import java.io.IOException;
import k3.f0;
import k4.i0;

/* JADX INFO: compiled from: EventSampleStream.java */
/* JADX INFO: loaded from: classes6.dex */
public final class e implements i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Format f64676b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f64678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f64679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o4.e f64680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f64681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f64682h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4.b f64677c = new d4.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f64683i = -9223372036854775807L;

    @Override // k4.i0
    public int b(f0 f0Var, o3.e eVar, boolean z10) {
        if (z10 || !this.f64681g) {
            f0Var.f62129c = this.f64676b;
            this.f64681g = true;
            return -5;
        }
        int i10 = this.f64682h;
        if (i10 == this.f64678d.length) {
            if (this.f64679e) {
                return -3;
            }
            eVar.setFlags(4);
            return -4;
        }
        this.f64682h = i10 + 1;
        byte[] bArrA = this.f64677c.a(this.f64680f.f65020a[i10]);
        if (bArrA == null) {
            return -3;
        }
        eVar.b(bArrA.length);
        eVar.f64969c.put(bArrA);
        eVar.f64971e = this.f64678d[i10];
        eVar.setFlags(1);
        return -4;
    }

    @Override // k4.i0
    public boolean isReady() {
        return true;
    }

    @Override // k4.i0
    public void maybeThrowError() throws IOException {
    }

    public String a() {
        return this.f64680f.a();
    }

    public void c(long j10) {
        int iE = k0.e(this.f64678d, j10, true, false);
        this.f64682h = iE;
        if (!(this.f64679e && iE == this.f64678d.length)) {
            j10 = -9223372036854775807L;
        }
        this.f64683i = j10;
    }

    public void d(o4.e eVar, boolean z10) {
        int i10 = this.f64682h;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f64678d[i10 - 1];
        this.f64679e = z10;
        this.f64680f = eVar;
        long[] jArr = eVar.f65021b;
        this.f64678d = jArr;
        long j11 = this.f64683i;
        if (j11 != -9223372036854775807L) {
            c(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f64682h = k0.e(jArr, j10, false, false);
        }
    }

    @Override // k4.i0
    public int skipData(long j10) {
        int iMax = Math.max(this.f64682h, k0.e(this.f64678d, j10, true, false));
        int i10 = iMax - this.f64682h;
        this.f64682h = iMax;
        return i10;
    }

    public e(o4.e eVar, Format format, boolean z10) {
        this.f64676b = format;
        this.f64680f = eVar;
        this.f64678d = eVar.f65021b;
        d(eVar, z10);
    }
}
