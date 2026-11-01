package sg.bigo.ads.ad.interstitial;

import android.os.SystemClock;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68619a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f68620b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f68621c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f68622d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f68623e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f68624f = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f68625g = 7;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f68626h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f68627i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f68628j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f68629k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f68630l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f68631m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f68632n = new int[10];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long[] f68633o = new long[10];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long[] f68634p = new long[10];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean[][] f68635q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean[][] f68636r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f68637s;

    public l() {
        Class cls = Boolean.TYPE;
        this.f68635q = (boolean[][]) Array.newInstance((Class<?>) cls, 10, 10);
        this.f68636r = (boolean[][]) Array.newInstance((Class<?>) cls, 10, 10);
        this.f68637s = false;
    }

    private int a() {
        return (this.f68629k == 0 || SystemClock.elapsedRealtime() - this.f68629k > 5000) ? this.f68628j : this.f68627i;
    }

    private void a(sg.bigo.ads.api.core.b bVar, int i10, int i11) {
        try {
            if (this.f68637s) {
                return;
            }
            boolean[] zArr = this.f68635q[i11];
            if (zArr[i10]) {
                return;
            }
            zArr[i10] = true;
            sg.bigo.ads.core.d.b.a(bVar, i10, i11, SystemClock.elapsedRealtime() - this.f68633o[i10], i10 == this.f68619a ? SystemClock.elapsedRealtime() - this.f68633o[i10] : SystemClock.elapsedRealtime() - this.f68630l);
        } catch (Exception unused) {
        }
    }

    private void b(sg.bigo.ads.api.core.b bVar, int i10, int i11) {
        try {
            boolean[] zArr = this.f68636r[i11];
            if (zArr[i10]) {
                return;
            }
            zArr[i10] = true;
            sg.bigo.ads.core.d.b.a(bVar, i10, i11, SystemClock.elapsedRealtime() - this.f68634p[i10]);
        } catch (Exception unused) {
        }
    }

    public final void a(int i10) {
        try {
            long[] jArr = this.f68633o;
            if (jArr[i10] == 0) {
                jArr[i10] = SystemClock.elapsedRealtime();
            }
        } catch (Exception unused) {
        }
    }

    public final void a(sg.bigo.ads.api.core.b bVar, int i10) {
        try {
            this.f68634p[i10] = SystemClock.elapsedRealtime();
            this.f68632n[i10] = a();
            a(bVar, i10, this.f68632n[i10]);
        } catch (Exception unused) {
        }
    }

    public final void b(sg.bigo.ads.api.core.b bVar, int i10) {
        try {
            long[] jArr = this.f68633o;
            if (jArr[i10] == 0) {
                jArr[i10] = SystemClock.elapsedRealtime();
            }
            if (this.f68634p[i10] != 0) {
                int[] iArr = this.f68632n;
                int i11 = iArr[i10];
                iArr[i10] = 0;
                b(bVar, i10, i11);
            }
        } catch (Exception unused) {
        }
    }
}
