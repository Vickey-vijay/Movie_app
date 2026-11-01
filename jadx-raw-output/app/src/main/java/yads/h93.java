package yads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import yads.h93;
import yads.mq0;

/* JADX INFO: loaded from: classes8.dex */
public final class h93 implements mq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f78129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jb2 f78130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseIntArray f78131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k93 f78132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray f78133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f78134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f78135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e93 f78136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d93 f78137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public pq0 f78138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f78139m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f78140n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f78141o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f78142p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m93 f78143q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f78144r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f78145s;

    public h93(int i10) {
        this(new y63(0L), new jf0());
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f78138l = pq0Var;
    }

    @Override // yads.mq0
    public final void release() {
    }

    static {
        new rq0() { // from class: cp.i2
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return h93.a();
            }
        };
    }

    public h93(y63 y63Var, jf0 jf0Var) {
        this.f78132f = (k93) ni.a(jf0Var);
        this.f78128b = 112800;
        this.f78127a = 1;
        this.f78129c = Collections.singletonList(y63Var);
        this.f78130d = new jb2(0, new byte[9400]);
        this.f78134h = new SparseBooleanArray();
        this.f78135i = new SparseBooleanArray();
        this.f78133g = new SparseArray();
        this.f78131e = new SparseIntArray();
        this.f78136j = new e93();
        this.f78138l = pq0.f81537a;
        this.f78145s = -1;
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [yads.m93] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // yads.mq0
    public final int a(nq0 nq0Var, gg2 gg2Var) throws ob2, EOFException, InterruptedIOException {
        ld0 ld0Var;
        ?? r10;
        ?? r15;
        int i10;
        m93 m93Var;
        long j10;
        boolean z10;
        long j11;
        long j12;
        ld0 ld0Var2 = (ld0) nq0Var;
        long j13 = ld0Var2.f79756c;
        if (this.f78140n) {
            if (j13 != -1 && this.f78127a != 2) {
                e93 e93Var = this.f78136j;
                if (!e93Var.f76994d) {
                    int i11 = this.f78145s;
                    if (i11 <= 0) {
                        e93Var.f76993c.a(ib3.f78561f);
                        e93Var.f76994d = true;
                        ld0Var2.f79759f = 0;
                    } else if (!e93Var.f76996f) {
                        int iMin = (int) Math.min(e93Var.f76991a, j13);
                        long j14 = j13 - ((long) iMin);
                        if (ld0Var2.f79757d != j14) {
                            gg2Var.f77799a = j14;
                            return 1;
                        }
                        e93Var.f76993c.c(iMin);
                        ld0Var2.f79759f = 0;
                        ld0Var2.b(e93Var.f76993c.f78966a, 0, iMin, false);
                        jb2 jb2Var = e93Var.f76993c;
                        int i12 = jb2Var.f78967b;
                        int i13 = jb2Var.f78968c;
                        int i14 = i13 - 188;
                        while (true) {
                            if (i14 < i12) {
                                j12 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr = jb2Var.f78966a;
                            int i15 = 0;
                            for (int i16 = -4; i16 <= 4; i16++) {
                                int i17 = (i16 * 188) + i14;
                                if (i17 >= i12 && i17 < i13 && bArr[i17] == 71) {
                                    i15++;
                                    if (i15 == 5) {
                                        long jA = n93.a(i14, i11, jb2Var);
                                        if (jA == -9223372036854775807L) {
                                            break;
                                        }
                                        j12 = jA;
                                        break;
                                    }
                                } else {
                                    i15 = 0;
                                }
                            }
                            i14--;
                        }
                        e93Var.f76998h = j12;
                        e93Var.f76996f = true;
                    } else if (e93Var.f76998h == -9223372036854775807L) {
                        e93Var.f76993c.a(ib3.f78561f);
                        e93Var.f76994d = true;
                        ld0Var2.f79759f = 0;
                    } else if (e93Var.f76995e) {
                        long j15 = e93Var.f76997g;
                        if (j15 == -9223372036854775807L) {
                            e93Var.f76993c.a(ib3.f78561f);
                            e93Var.f76994d = true;
                            ld0Var2.f79759f = 0;
                        } else {
                            long jB = e93Var.f76992b.b(e93Var.f76998h) - e93Var.f76992b.b(j15);
                            e93Var.f76999i = jB;
                            if (jB < 0) {
                                ih1.d("TsDurationReader", "Invalid duration: " + e93Var.f76999i + ". Using TIME_UNSET instead.");
                                e93Var.f76999i = -9223372036854775807L;
                            }
                            e93Var.f76993c.a(ib3.f78561f);
                            e93Var.f76994d = true;
                            ld0Var2.f79759f = 0;
                        }
                    } else {
                        int iMin2 = (int) Math.min(e93Var.f76991a, j13);
                        long j16 = 0;
                        if (ld0Var2.f79757d != j16) {
                            gg2Var.f77799a = j16;
                            return 1;
                        }
                        e93Var.f76993c.c(iMin2);
                        ld0Var2.f79759f = 0;
                        ld0Var2.b(e93Var.f76993c.f78966a, 0, iMin2, false);
                        jb2 jb2Var2 = e93Var.f76993c;
                        int i18 = jb2Var2.f78967b;
                        int i19 = jb2Var2.f78968c;
                        while (true) {
                            if (i18 >= i19) {
                                j11 = -9223372036854775807L;
                                break;
                            }
                            if (jb2Var2.f78966a[i18] == 71) {
                                long jA2 = n93.a(i18, i11, jb2Var2);
                                if (jA2 != -9223372036854775807L) {
                                    j11 = jA2;
                                    break;
                                }
                            }
                            i18++;
                        }
                        e93Var.f76997g = j11;
                        e93Var.f76995e = true;
                    }
                    return 0;
                }
            }
            if (this.f78141o) {
                j10 = 0;
                z10 = false;
            } else {
                this.f78141o = true;
                e93 e93Var2 = this.f78136j;
                long j17 = e93Var2.f76999i;
                if (j17 != -9223372036854775807L) {
                    j10 = 0;
                    d93 d93Var = new d93(e93Var2.f76992b, j17, j13, this.f78145s, this.f78128b);
                    this.f78137k = d93Var;
                    this.f78138l.a(d93Var.f83130a);
                    z10 = false;
                } else {
                    j10 = 0;
                    z10 = false;
                    this.f78138l.a(new uw2(j17, 0L));
                }
            }
            if (this.f78142p) {
                this.f78142p = z10;
                seek(j10, j10);
                ld0Var = ld0Var2;
                if (ld0Var.f79757d != j10) {
                    gg2Var.f77799a = j10;
                    return 1;
                }
            } else {
                ld0Var = ld0Var2;
            }
            d93 d93Var2 = this.f78137k;
            r10 = z10;
            if (d93Var2 != null && d93Var2.f83132c != null) {
                r10 = z10;
                return d93Var2.a(ld0Var, gg2Var);
            }
        } else {
            ld0Var = ld0Var2;
            r10 = 0;
            r15 = 1;
        }
        r10 = z10;
        jb2 jb2Var3 = this.f78130d;
        byte[] bArr2 = jb2Var3.f78966a;
        int i20 = jb2Var3.f78967b;
        if (9400 - i20 < 188) {
            int i21 = jb2Var3.f78968c - i20;
            if (i21 > 0) {
                System.arraycopy(bArr2, i20, bArr2, r10, i21);
            }
            jb2 jb2Var4 = this.f78130d;
            jb2Var4.f78966a = bArr2;
            jb2Var4.f78968c = i21;
            jb2Var4.f78967b = r10;
        }
        while (true) {
            jb2 jb2Var5 = this.f78130d;
            int i22 = jb2Var5.f78968c;
            int i23 = jb2Var5.f78967b;
            if (i22 - i23 >= 188) {
                byte[] bArr3 = jb2Var5.f78966a;
                int i24 = i23;
                while (i24 < i22 && bArr3[i24] != 71) {
                    i24++;
                }
                this.f78130d.e(i24);
                int i25 = i24 + 188;
                ?? r11 = 0;
                if (i25 > i22) {
                    int i26 = (i24 - i23) + this.f78144r;
                    this.f78144r = i26;
                    i10 = 2;
                    if (this.f78127a == 2 && i26 > 376) {
                        throw new ob2("Cannot find sync byte. Most likely not a Transport Stream.", null, r15, r15);
                    }
                } else {
                    i10 = 2;
                    this.f78144r = r10;
                }
                jb2 jb2Var6 = this.f78130d;
                int i27 = jb2Var6.f78968c;
                if (i25 > i27) {
                    return r10;
                }
                int iB = jb2Var6.b();
                if ((8388608 & iB) != 0) {
                    this.f78130d.e(i25);
                    return r10;
                }
                ?? r12 = (4194304 & iB) != 0 ? r15 : r10;
                int i28 = (2096896 & iB) >> 8;
                ?? r13 = (iB & 32) != 0 ? r15 : r10;
                if ((iB & 16) != 0) {
                    m93Var = (m93) this.f78133g.get(i28);
                }
                if (r11 == 0) {
                    r11 = m93Var;
                    this.f78130d.e(i25);
                    return r10;
                }
                if (this.f78127a != i10) {
                    int i29 = iB & 15;
                    int i30 = this.f78131e.get(i28, i29 - 1);
                    this.f78131e.put(i28, i29);
                    if (i30 == i29) {
                        r11 = m93Var;
                        this.f78130d.e(i25);
                        return r10;
                    }
                    if (i29 != ((i30 + r15) & 15)) {
                        r11 = m93Var;
                        r11.a();
                    }
                }
                if (r13 != 0) {
                    int iM = this.f78130d.m();
                    r12 = (r12 == true ? 1 : 0) | ((this.f78130d.m() & 64) != 0 ? i10 : r10);
                    jb2 jb2Var7 = this.f78130d;
                    jb2Var7.e(jb2Var7.f78967b + (iM - r15));
                }
                boolean z11 = this.f78140n;
                if (this.f78127a == i10 || z11 || !this.f78135i.get(i28, r10)) {
                    this.f78130d.d(i25);
                    r11.a(r12, this.f78130d);
                    this.f78130d.d(i27);
                }
                if (this.f78127a != i10 && !z11 && this.f78140n && j13 != -1) {
                    this.f78142p = r15;
                }
                this.f78130d.e(i25);
                return r10;
            }
            int i31 = ld0Var.read(bArr2, i22, 9400 - i22);
            if (i31 == -1) {
                return -1;
            }
            this.f78130d.d(i22 + i31);
        }
    }

    public final void b() {
        this.f78134h.clear();
        this.f78133g.clear();
        ((jf0) this.f78132f).getClass();
        SparseArray sparseArray = new SparseArray();
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f78133g.put(sparseArray.keyAt(i10), (m93) sparseArray.valueAt(i10));
        }
        this.f78133g.put(0, new sw2(new f93(this)));
        this.f78143q = null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        d93 d93Var;
        long j12;
        if (this.f78127a == 2) {
            throw new IllegalStateException();
        }
        int size = this.f78129c.size();
        for (int i10 = 0; i10 < size; i10++) {
            y63 y63Var = (y63) this.f78129c.get(i10);
            synchronized (y63Var) {
                j12 = y63Var.f84834b;
            }
            boolean z10 = j12 == -9223372036854775807L;
            if (!z10) {
                long jA = y63Var.a();
                if (jA != -9223372036854775807L && jA != 0 && jA != j11) {
                    y63Var.c(j11);
                }
            } else if (z10) {
                y63Var.c(j11);
            }
        }
        if (j11 != 0 && (d93Var = this.f78137k) != null) {
            d93Var.a(j11);
        }
        this.f78130d.c(0);
        this.f78131e.clear();
        for (int i11 = 0; i11 < this.f78133g.size(); i11++) {
            ((m93) this.f78133g.valueAt(i11)).a();
        }
        this.f78144r = 0;
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) throws EOFException, InterruptedIOException {
        byte[] bArr = this.f78130d.f78966a;
        ld0 ld0Var = (ld0) nq0Var;
        ld0Var.b(bArr, 0, 940, false);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 < 5) {
                    if (bArr[(i11 * 188) + i10] != 71) {
                        break;
                    }
                    i11++;
                } else {
                    ld0Var.a(i10);
                    return true;
                }
            }
        }
        return false;
    }

    public static mq0[] a() {
        return new mq0[]{new h93(0)};
    }
}
