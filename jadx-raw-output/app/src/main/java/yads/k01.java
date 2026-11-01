package yads;

import android.util.SparseArray;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class k01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m73 f79258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f79259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f79260c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kb2 f79263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f79264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f79265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f79266i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f79267j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f79268k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f79269l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f79272o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f79273p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f79274q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f79275r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f79261d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f79262e = new SparseArray();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j01 f79270m = new j01();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j01 f79271n = new j01();

    /* JADX WARN: Code duplicated, block: B:53:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:58:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x0106  */
    /* JADX WARN: Code duplicated, block: B:60:0x010d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0112  */
    /* JADX WARN: Code duplicated, block: B:65:0x011c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x011d  */
    /* JADX WARN: Code duplicated, block: B:73:0x013d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0141  */
    /* JADX WARN: Code duplicated, block: B:88:0x0175  */
    public final void a(byte[] bArr, int i10, int i11) {
        boolean zC;
        boolean zC2;
        boolean z10;
        boolean z11;
        int iD;
        int i12;
        int iE;
        int iE2;
        int i13;
        int iB;
        if (this.f79268k) {
            int i14 = i11 - i10;
            byte[] bArr2 = this.f79264g;
            int length = bArr2.length;
            int i15 = this.f79265h + i14;
            if (length < i15) {
                this.f79264g = Arrays.copyOf(bArr2, i15 * 2);
            }
            System.arraycopy(bArr, i10, this.f79264g, this.f79265h, i14);
            int i16 = this.f79265h + i14;
            this.f79265h = i16;
            int i17 = 0;
            this.f79263f.a(this.f79264g, 0, i16);
            if (this.f79263f.a(8)) {
                this.f79263f.f();
                int iB2 = this.f79263f.b(2);
                this.f79263f.d(5);
                if (this.f79263f.b()) {
                    this.f79263f.d();
                    if (this.f79263f.b()) {
                        int iD2 = this.f79263f.d();
                        if (!this.f79260c) {
                            this.f79268k = false;
                            j01 j01Var = this.f79271n;
                            j01Var.f78874e = iD2;
                            j01Var.f78871b = true;
                            return;
                        }
                        if (this.f79263f.b()) {
                            int iD3 = this.f79263f.d();
                            if (this.f79262e.indexOfKey(iD3) < 0) {
                                this.f79268k = false;
                                return;
                            }
                            by1 by1Var = (by1) this.f79262e.get(iD3);
                            cy1 cy1Var = (cy1) this.f79261d.get(by1Var.f76012a);
                            if (cy1Var.f76479h) {
                                if (!this.f79263f.a(2)) {
                                    return;
                                } else {
                                    this.f79263f.d(2);
                                }
                            }
                            if (this.f79263f.a(cy1Var.f76481j)) {
                                int iB3 = this.f79263f.b(cy1Var.f76481j);
                                if (!cy1Var.f76480i) {
                                    if (this.f79263f.a(1)) {
                                        zC = this.f79263f.c();
                                        if (!zC) {
                                            zC2 = false;
                                        } else {
                                            if (!this.f79263f.a(1)) {
                                                return;
                                            }
                                            zC2 = this.f79263f.c();
                                            z10 = true;
                                        }
                                        if (this.f79266i == 5) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            iD = 0;
                                        } else if (!this.f79263f.b()) {
                                            return;
                                        } else {
                                            iD = this.f79263f.d();
                                        }
                                        i12 = cy1Var.f76482k;
                                        if (i12 == 0) {
                                            if (!this.f79263f.a(cy1Var.f76483l)) {
                                                return;
                                            }
                                            iB = this.f79263f.b(cy1Var.f76483l);
                                            if (by1Var.f76013b || zC) {
                                                iE = 0;
                                                i13 = iB;
                                                iE2 = 0;
                                            } else {
                                                if (!this.f79263f.b()) {
                                                    return;
                                                }
                                                iE = this.f79263f.e();
                                                i13 = iB;
                                                iE2 = 0;
                                            }
                                        } else if (i12 == 1 || cy1Var.f76484m) {
                                            iE = 0;
                                            iE2 = 0;
                                            i13 = 0;
                                        } else {
                                            if (!this.f79263f.b()) {
                                                return;
                                            }
                                            int iE3 = this.f79263f.e();
                                            if (!by1Var.f76013b || zC) {
                                                iE = 0;
                                                i13 = 0;
                                                i17 = iE3;
                                                iE2 = 0;
                                            } else {
                                                if (!this.f79263f.b()) {
                                                    return;
                                                }
                                                i13 = 0;
                                                i17 = iE3;
                                                iE2 = this.f79263f.e();
                                                iE = 0;
                                            }
                                        }
                                        j01 j01Var2 = this.f79271n;
                                        j01Var2.f78872c = cy1Var;
                                        j01Var2.f78873d = iB2;
                                        j01Var2.f78874e = iD2;
                                        j01Var2.f78875f = iB3;
                                        j01Var2.f78876g = iD3;
                                        j01Var2.f78877h = zC;
                                        j01Var2.f78878i = z10;
                                        j01Var2.f78879j = zC2;
                                        j01Var2.f78880k = z11;
                                        j01Var2.f78881l = iD;
                                        j01Var2.f78882m = i13;
                                        j01Var2.f78883n = iE;
                                        j01Var2.f78884o = i17;
                                        j01Var2.f78885p = iE2;
                                        j01Var2.f78870a = true;
                                        j01Var2.f78871b = true;
                                        this.f79268k = false;
                                    }
                                    return;
                                }
                                zC = false;
                                zC2 = false;
                                z10 = zC2;
                                if (this.f79266i == 5) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    iD = 0;
                                } else if (!this.f79263f.b()) {
                                    return;
                                } else {
                                    iD = this.f79263f.d();
                                }
                                i12 = cy1Var.f76482k;
                                if (i12 == 0) {
                                    if (!this.f79263f.a(cy1Var.f76483l)) {
                                        return;
                                    }
                                    iB = this.f79263f.b(cy1Var.f76483l);
                                    if (by1Var.f76013b) {
                                        iE = 0;
                                        i13 = iB;
                                        iE2 = 0;
                                    } else {
                                        iE = 0;
                                        i13 = iB;
                                        iE2 = 0;
                                    }
                                } else if (i12 == 1) {
                                    iE = 0;
                                    iE2 = 0;
                                    i13 = 0;
                                } else {
                                    iE = 0;
                                    iE2 = 0;
                                    i13 = 0;
                                }
                                j01 j01Var3 = this.f79271n;
                                j01Var3.f78872c = cy1Var;
                                j01Var3.f78873d = iB2;
                                j01Var3.f78874e = iD2;
                                j01Var3.f78875f = iB3;
                                j01Var3.f78876g = iD3;
                                j01Var3.f78877h = zC;
                                j01Var3.f78878i = z10;
                                j01Var3.f78879j = zC2;
                                j01Var3.f78880k = z11;
                                j01Var3.f78881l = iD;
                                j01Var3.f78882m = i13;
                                j01Var3.f78883n = iE;
                                j01Var3.f78884o = i17;
                                j01Var3.f78885p = iE2;
                                j01Var3.f78870a = true;
                                j01Var3.f78871b = true;
                                this.f79268k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public k01(m73 m73Var, boolean z10, boolean z11) {
        this.f79258a = m73Var;
        this.f79259b = z10;
        this.f79260c = z11;
        byte[] bArr = new byte[128];
        this.f79264g = bArr;
        this.f79263f = new kb2(bArr, 0, 0);
        a();
    }

    public final void a() {
        this.f79268k = false;
        this.f79272o = false;
        j01 j01Var = this.f79271n;
        j01Var.f78871b = false;
        j01Var.f78870a = false;
    }
}
