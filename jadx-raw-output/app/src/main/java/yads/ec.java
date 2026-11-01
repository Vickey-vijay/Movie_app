package yads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ec extends to {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final im f77010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f77011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f77012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f77013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f77014k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f77015l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f77016m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f77017n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p51 f77018o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xv f77019p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f77020q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f77021r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f77022s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f77023t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public jo f77024u;

    public ec(h73 h73Var, int[] iArr, int i10, im imVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, p51 p51Var, xv xvVar) {
        long j13;
        super(h73Var, iArr);
        if (j12 < j10) {
            ih1.d("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j10;
        } else {
            j13 = j12;
        }
        this.f77010g = imVar;
        this.f77011h = j10 * 1000;
        this.f77012i = j11 * 1000;
        this.f77013j = j13 * 1000;
        this.f77014k = i11;
        this.f77015l = i12;
        this.f77016m = f10;
        this.f77017n = f11;
        this.f77018o = p51.a((Collection) p51Var);
        this.f77019p = xvVar;
        this.f77020q = 1.0f;
        this.f77022s = 0;
        this.f77023t = -9223372036854775807L;
    }

    public static void a(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            l51 l51Var = (l51) arrayList.get(i10);
            if (l51Var != null) {
                l51Var.a(new cc(j10, jArr[i10]));
            }
        }
    }

    @Override // yads.to, yads.op0
    public final void disable() {
        this.f77024u = null;
    }

    @Override // yads.op0
    public final Object g() {
        return null;
    }

    @Override // yads.op0
    public final int d() {
        return this.f77022s;
    }

    @Override // yads.op0
    public final int e() {
        return this.f77021r;
    }

    public final int a(long j10) {
        long j11;
        dc0 dc0Var = (dc0) this.f77010g;
        synchronized (dc0Var) {
            j11 = dc0Var.f76629l;
        }
        long j12 = (long) (j11 * this.f77016m);
        this.f77010g.getClass();
        long j13 = (long) (j12 / this.f77020q);
        if (!this.f77018o.isEmpty()) {
            int i10 = 1;
            while (i10 < this.f77018o.size() - 1 && ((cc) this.f77018o.get(i10)).f76226a < j13) {
                i10++;
            }
            cc ccVar = (cc) this.f77018o.get(i10 - 1);
            cc ccVar2 = (cc) this.f77018o.get(i10);
            long j14 = ccVar.f76226a;
            float f10 = (j13 - j14) / (ccVar2.f76226a - j14);
            long j15 = ccVar.f76227b;
            j13 = j15 + ((long) (f10 * (ccVar2.f76227b - j15)));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f83121b; i12++) {
            if (j10 == Long.MIN_VALUE || !b(i12, j10)) {
                if (a(i12).f80425i <= j13) {
                    return i12;
                }
                i11 = i12;
            }
        }
        return i11;
    }

    @Override // yads.to, yads.op0
    public final void a() {
        this.f77023t = -9223372036854775807L;
        this.f77024u = null;
    }

    @Override // yads.to, yads.op0
    public final int a(long j10, List list) {
        int i10;
        int i11;
        ((f53) this.f77019p).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f77023t;
        if (j11 != -9223372036854775807L && jElapsedRealtime - j11 < 1000 && (list.isEmpty() || ((jo) vd1.a(list)).equals(this.f77024u))) {
            return list.size();
        }
        this.f77023t = jElapsedRealtime;
        this.f77024u = list.isEmpty() ? null : (jo) vd1.a(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jRound = ((jo) list.get(size - 1)).f76430g - j10;
        float f10 = this.f77020q;
        int i12 = ib3.f78556a;
        if (f10 != 1.0f) {
            jRound = Math.round(jRound / ((double) f10));
        }
        long j12 = this.f77013j;
        if (jRound < j12) {
            return size;
        }
        if (!list.isEmpty()) {
            long j13 = ((jo) vd1.a(list)).f76430g;
        }
        mx0 mx0Var = this.f83123d[a(jElapsedRealtime)];
        for (int i13 = 0; i13 < size; i13++) {
            jo joVar = (jo) list.get(i13);
            mx0 mx0Var2 = joVar.f76427d;
            long jRound2 = joVar.f76430g - j10;
            float f11 = this.f77020q;
            if (f11 != 1.0f) {
                jRound2 = Math.round(jRound2 / ((double) f11));
            }
            if (jRound2 >= j12 && mx0Var2.f80425i < mx0Var.f80425i && (i10 = mx0Var2.f80435s) != -1 && i10 <= this.f77015l && (i11 = mx0Var2.f80434r) != -1 && i11 <= this.f77014k && i10 < mx0Var.f80435s) {
                return i13;
            }
        }
        return size;
    }

    @Override // yads.to, yads.op0
    public final void a(float f10) {
        this.f77020q = f10;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005f A[EDGE_INSN: B:22:0x005f->B:23:0x0060 BREAK  A[LOOP:0: B:9:0x002d->B:13:0x0040]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce  */
    @Override // yads.op0
    public final void a(long j10, long j11, long j12, List list, yj1[] yj1VarArr) {
        long j13;
        long jA;
        long jB;
        int i10;
        int i11;
        int iA;
        int iA2;
        long jMin;
        int i12;
        int i13;
        ((f53) this.f77019p).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i14 = this.f77021r;
        if (i14 < yj1VarArr.length && yj1VarArr[i14].next()) {
            yj1 yj1Var = yj1VarArr[this.f77021r];
            jA = yj1Var.a();
            jB = yj1Var.b();
        } else {
            int length = yj1VarArr.length;
            int i15 = 0;
            while (true) {
                if (i15 < length) {
                    yj1 yj1Var2 = yj1VarArr[i15];
                    if (yj1Var2.next()) {
                        jA = yj1Var2.a();
                        jB = yj1Var2.b();
                    } else {
                        i15++;
                    }
                } else {
                    if (!list.isEmpty()) {
                        jo joVar = (jo) vd1.a(list);
                        long j14 = joVar.f76430g;
                        if (j14 == -9223372036854775807L) {
                            j13 = -9223372036854775807L;
                            break;
                        }
                        long j15 = joVar.f76431h;
                        if (j15 == -9223372036854775807L) {
                            j13 = -9223372036854775807L;
                            break;
                        } else {
                            j13 = j15 - j14;
                            break;
                        }
                    }
                    j13 = -9223372036854775807L;
                    break;
                }
            }
            i10 = this.f77022s;
            if (i10 == 0) {
                this.f77022s = 1;
                this.f77021r = a(jElapsedRealtime);
                return;
            }
            i11 = this.f77021r;
            if (list.isEmpty()) {
                iA = -1;
            } else {
                iA = a(((jo) vd1.a(list)).f76427d);
            }
            if (iA != -1) {
                i10 = ((jo) vd1.a(list)).f76428e;
                i11 = iA;
            }
            iA2 = a(jElapsedRealtime);
            if (!b(i11, jElapsedRealtime)) {
                mx0[] mx0VarArr = this.f83123d;
                mx0 mx0Var = mx0VarArr[i11];
                mx0 mx0Var2 = mx0VarArr[iA2];
                if (j12 == -9223372036854775807L) {
                    jMin = this.f77011h;
                } else {
                    if (j13 != -9223372036854775807L) {
                        j12 -= j13;
                    }
                    jMin = Math.min((long) (j12 * this.f77017n), this.f77011h);
                }
                i12 = mx0Var2.f80425i;
                i13 = mx0Var.f80425i;
                if ((i12 <= i13 && j11 < jMin) || (i12 < i13 && j11 >= this.f77012i)) {
                }
            }
            if (iA2 != i11) {
                i10 = 3;
            }
            this.f77022s = i10;
            this.f77021r = iA2;
        }
        j13 = jA - jB;
        i10 = this.f77022s;
        if (i10 == 0) {
            this.f77022s = 1;
            this.f77021r = a(jElapsedRealtime);
            return;
        }
        i11 = this.f77021r;
        if (list.isEmpty()) {
            iA = -1;
        } else {
            iA = a(((jo) vd1.a(list)).f76427d);
        }
        if (iA != -1) {
            i10 = ((jo) vd1.a(list)).f76428e;
            i11 = iA;
        }
        iA2 = a(jElapsedRealtime);
        if (!b(i11, jElapsedRealtime)) {
            mx0[] mx0VarArr2 = this.f83123d;
            mx0 mx0Var3 = mx0VarArr2[i11];
            mx0 mx0Var4 = mx0VarArr2[iA2];
            if (j12 == -9223372036854775807L) {
                jMin = this.f77011h;
            } else {
                if (j13 != -9223372036854775807L) {
                    j12 -= j13;
                }
                jMin = Math.min((long) (j12 * this.f77017n), this.f77011h);
            }
            i12 = mx0Var4.f80425i;
            i13 = mx0Var3.f80425i;
            iA2 = i12 <= i13 ? i11 : i11;
        }
        if (iA2 != i11) {
            i10 = 3;
        }
        this.f77022s = i10;
        this.f77021r = iA2;
    }

    public static sm2 a(mp0[] mp0VarArr) {
        int i10;
        int[] iArr;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = 1;
            if (i12 >= mp0VarArr.length) {
                break;
            }
            mp0 mp0Var = mp0VarArr[i12];
            if (mp0Var != null && mp0Var.f80314b.length > 1) {
                l51 l51VarF = p51.f();
                l51VarF.a(new cc(0L, 0L));
                arrayList.add(l51VarF);
            } else {
                arrayList.add(null);
            }
            i12++;
        }
        int length = mp0VarArr.length;
        long[][] jArr = new long[length][];
        for (int i13 = 0; i13 < mp0VarArr.length; i13++) {
            mp0 mp0Var2 = mp0VarArr[i13];
            if (mp0Var2 == null) {
                jArr[i13] = new long[0];
            } else {
                jArr[i13] = new long[mp0Var2.f80314b.length];
                int i14 = 0;
                while (true) {
                    int[] iArr2 = mp0Var2.f80314b;
                    if (i14 >= iArr2.length) {
                        break;
                    }
                    jArr[i13][i14] = mp0Var2.f80313a.f78090e[iArr2[i14]].f80425i;
                    i14++;
                }
                Arrays.sort(jArr[i13]);
            }
        }
        int[] iArr3 = new int[length];
        long[] jArr2 = new long[length];
        for (int i15 = 0; i15 < length; i15++) {
            long[] jArr3 = jArr[i15];
            jArr2[i15] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        a(arrayList, jArr2);
        y72 y72Var = y72.f84838b;
        y72Var.getClass();
        sx1 sx1VarB = new nx1(y72Var).a().b();
        int i16 = 0;
        while (i16 < length) {
            long[] jArr4 = jArr[i16];
            if (jArr4.length <= i10) {
                iArr = iArr3;
            } else {
                int length2 = jArr4.length;
                double[] dArr = new double[length2];
                int i17 = i11;
                while (true) {
                    long[] jArr5 = jArr[i16];
                    double dLog = 0.0d;
                    if (i17 >= jArr5.length) {
                        break;
                    }
                    int[] iArr4 = iArr3;
                    long j10 = jArr5[i17];
                    if (j10 != -1) {
                        dLog = Math.log(j10);
                    }
                    dArr[i17] = dLog;
                    i17++;
                    iArr3 = iArr4;
                }
                iArr = iArr3;
                int i18 = length2 - 1;
                double d10 = dArr[i18] - dArr[i11];
                int i19 = i11;
                while (i19 < i18) {
                    double d11 = dArr[i19];
                    i19++;
                    sx1VarB.a(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i19]) * 0.5d) - dArr[i11]) / d10), Integer.valueOf(i16));
                    i11 = 0;
                }
            }
            i16++;
            iArr3 = iArr;
            i11 = 0;
            i10 = 1;
        }
        int[] iArr5 = iArr3;
        d0 d0Var = sx1VarB.f76856d;
        if (d0Var == null) {
            d0Var = new d0(sx1VarB);
            sx1VarB.f76856d = d0Var;
        }
        p51 p51VarA = p51.a((Collection) d0Var);
        for (int i20 = 0; i20 < p51VarA.size(); i20++) {
            int iIntValue = ((Integer) p51VarA.get(i20)).intValue();
            int i21 = iArr5[iIntValue] + 1;
            iArr5[iIntValue] = i21;
            jArr2[iIntValue] = jArr[iIntValue][i21];
            a(arrayList, jArr2);
        }
        for (int i22 = 0; i22 < mp0VarArr.length; i22++) {
            if (arrayList.get(i22) != null) {
                jArr2[i22] = jArr2[i22] * 2;
            }
        }
        a(arrayList, jArr2);
        l51 l51VarF2 = p51.f();
        for (int i23 = 0; i23 < arrayList.size(); i23++) {
            l51 l51Var = (l51) arrayList.get(i23);
            l51VarF2.a((Object) (l51Var == null ? p51.g() : l51Var.a()));
        }
        return l51VarF2.a();
    }
}
