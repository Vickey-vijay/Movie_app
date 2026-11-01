package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import yads.mq0;
import yads.re;

/* JADX INFO: loaded from: classes11.dex */
public final class re implements mq0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f82201p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f82202q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f82203r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f82204s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f82205t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f82208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f82209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f82210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f82211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f82212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f82213h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f82215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f82216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public pq0 f82217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m73 f82218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public vw2 f82219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f82220o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82207b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f82206a = new byte[1];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f82214i = -1;

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f82217l = pq0Var;
        this.f82218m = pq0Var.a(0, 1);
        pq0Var.a();
    }

    @Override // yads.mq0
    public final void release() {
    }

    static {
        new rq0() { // from class: cp.h9
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return re.a();
            }
        };
        f82201p = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f82202q = iArr;
        f82203r = ib3.c("#!AMR\n");
        f82204s = ib3.c("#!AMR-WB\n");
        f82205t = iArr[8];
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        this.f82209d = 0L;
        this.f82210e = 0;
        this.f82211f = 0;
        if (j10 != 0) {
            vw2 vw2Var = this.f82219n;
            if (vw2Var instanceof gz) {
                gz gzVar = (gz) vw2Var;
                this.f82216k = gz.a(gzVar.f77979e, j10, gzVar.f77976b);
                return;
            }
        }
        this.f82216k = 0L;
    }

    public final int a(ld0 ld0Var) throws ob2 {
        boolean z10;
        ld0Var.f79759f = 0;
        ld0Var.b(this.f82206a, 0, 1, false);
        byte b10 = this.f82206a[0];
        if ((b10 & 131) > 0) {
            throw new ob2(mg2.a("Invalid padding bits for frame header ", b10), null, true, 1);
        }
        int i10 = (b10 >> 3) & 15;
        if (i10 >= 0 && i10 <= 15 && (((z10 = this.f82208c) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
            return z10 ? f82202q[i10] : f82201p[i10];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f82208c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw new ob2(sb2.toString(), null, true, 1);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    @Override // yads.mq0
    public final int a(nq0 nq0Var, gg2 gg2Var) throws ob2, EOFException, InterruptedIOException {
        int i10;
        int i11;
        int iA;
        int i12;
        if (this.f82218m != null) {
            int i13 = ib3.f78556a;
            ld0 ld0Var = (ld0) nq0Var;
            if (ld0Var.f79757d == 0) {
                byte[] bArr = f82203r;
                ld0Var.f79759f = 0;
                byte[] bArr2 = new byte[bArr.length];
                ld0Var.b(bArr2, 0, bArr.length, false);
                if (Arrays.equals(bArr2, bArr)) {
                    this.f82208c = false;
                    ld0Var.a(bArr.length);
                } else {
                    byte[] bArr3 = f82204s;
                    ld0Var.f79759f = 0;
                    byte[] bArr4 = new byte[bArr3.length];
                    ld0Var.b(bArr4, 0, bArr3.length, false);
                    if (Arrays.equals(bArr4, bArr3)) {
                        this.f82208c = true;
                        ld0Var.a(bArr3.length);
                    } else {
                        throw new ob2("Could not find AMR header.", null, true, 1);
                    }
                }
            }
            if (!this.f82220o) {
                this.f82220o = true;
                boolean z10 = this.f82208c;
                String str = z10 ? "audio/amr-wb" : "audio/3gpp";
                int i14 = z10 ? 16000 : 8000;
                m73 m73Var = this.f82218m;
                lx0 lx0Var = new lx0();
                lx0Var.f79967k = str;
                lx0Var.f79968l = f82205t;
                lx0Var.f79980x = 1;
                lx0Var.f79981y = i14;
                m73Var.a(new mx0(lx0Var));
            }
            if (this.f82211f == 0) {
                try {
                    int iA2 = a((ld0) nq0Var);
                    this.f82210e = iA2;
                    this.f82211f = iA2;
                    if (this.f82214i == -1) {
                        this.f82213h = ld0Var.f79757d;
                        this.f82214i = iA2;
                    }
                    if (this.f82214i == iA2) {
                        this.f82215j++;
                    }
                    iA = this.f82218m.a(nq0Var, this.f82211f, true);
                    if (iA == -1) {
                        i10 = -1;
                    } else {
                        i12 = this.f82211f - iA;
                        this.f82211f = i12;
                        if (i12 <= 0) {
                            this.f82218m.a(this.f82216k + this.f82209d, 1, this.f82210e, 0, null);
                            this.f82209d += 20000;
                        }
                        i10 = 0;
                    }
                } catch (EOFException unused) {
                }
            } else {
                iA = this.f82218m.a(nq0Var, this.f82211f, true);
                if (iA == -1) {
                    i10 = -1;
                } else {
                    i12 = this.f82211f - iA;
                    this.f82211f = i12;
                    if (i12 <= 0) {
                        this.f82218m.a(this.f82216k + this.f82209d, 1, this.f82210e, 0, null);
                        this.f82209d += 20000;
                    }
                    i10 = 0;
                }
            }
            long j10 = ld0Var.f79756c;
            if (!this.f82212g) {
                int i15 = this.f82207b;
                if ((i15 & 1) != 0 && j10 != -1 && ((i11 = this.f82214i) == -1 || i11 == this.f82210e)) {
                    if (this.f82215j >= 20 || i10 == -1) {
                        gz gzVar = new gz((int) ((((long) i11) * 8000000) / 20000), i11, j10, this.f82213h, (i15 & 2) != 0);
                        this.f82219n = gzVar;
                        this.f82217l.a(gzVar);
                        this.f82212g = true;
                    }
                } else {
                    uw2 uw2Var = new uw2(-9223372036854775807L, 0L);
                    this.f82219n = uw2Var;
                    this.f82217l.a(uw2Var);
                    this.f82212g = true;
                }
            }
            return i10;
        }
        throw new IllegalStateException();
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) throws EOFException, InterruptedIOException {
        ld0 ld0Var = (ld0) nq0Var;
        byte[] bArr = f82203r;
        ld0Var.f79759f = 0;
        byte[] bArr2 = new byte[bArr.length];
        ld0Var.b(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f82208c = false;
            ld0Var.a(bArr.length);
        } else {
            byte[] bArr3 = f82204s;
            ld0Var.f79759f = 0;
            byte[] bArr4 = new byte[bArr3.length];
            ld0Var.b(bArr4, 0, bArr3.length, false);
            if (!Arrays.equals(bArr4, bArr3)) {
                return false;
            }
            this.f82208c = true;
            ld0Var.a(bArr3.length);
        }
        return true;
    }

    public static mq0[] a() {
        return new mq0[]{new re()};
    }
}
