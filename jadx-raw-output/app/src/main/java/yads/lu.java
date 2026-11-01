package yads;

import android.net.Uri;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class lu implements ns2, rx2, yf1, cg1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f79912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mx0[] f79913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f79914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b30 f79915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qx2 f79916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bn1 f79917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ae0 f79918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fg1 f79919j = new fg1("ChunkSampleStream");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final gu f79920k = new gu();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f79921l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f79922m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ms2 f79923n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ms2[] f79924o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lo f79925p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public cu f79926q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public mx0 f79927r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ku f79928s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f79929t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f79930u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f79931v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public jo f79932w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f79933x;

    public final jo a(int i10) {
        jo joVar = (jo) this.f79921l.get(i10);
        ArrayList arrayList = this.f79921l;
        int size = arrayList.size();
        int i11 = ib3.f78556a;
        if (i10 < 0 || size > arrayList.size() || i10 > size) {
            throw new IllegalArgumentException();
        }
        if (i10 != size) {
            arrayList.subList(i10, size).clear();
        }
        this.f79931v = Math.max(this.f79931v, this.f79921l.size());
        int i12 = 0;
        this.f79923n.c(joVar.a(0));
        while (true) {
            ms2[] ms2VarArr = this.f79924o;
            if (i12 >= ms2VarArr.length) {
                return joVar;
            }
            ms2 ms2Var = ms2VarArr[i12];
            i12++;
            ms2Var.c(joVar.a(i12));
        }
    }

    public final boolean b(int i10) {
        ms2 ms2Var;
        jo joVar = (jo) this.f79921l.get(i10);
        ms2 ms2Var2 = this.f79923n;
        if (ms2Var2.f80366q + ms2Var2.f80368s > joVar.a(0)) {
            return true;
        }
        int i11 = 0;
        do {
            ms2[] ms2VarArr = this.f79924o;
            if (i11 >= ms2VarArr.length) {
                return false;
            }
            ms2Var = ms2VarArr[i11];
            i11++;
        } while (ms2Var.f80366q + ms2Var.f80368s <= joVar.a(i11));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0319  */
    /* JADX WARN: Code duplicated, block: B:101:0x0321  */
    /* JADX WARN: Code duplicated, block: B:154:0x0461  */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:86:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:88:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:89:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:92:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:94:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:96:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:97:0x02fe  */
    @Override // yads.rx2
    public final boolean continueLoading(long j10) {
        List listEmptyList;
        long j11;
        boolean z10;
        long j12;
        long jMax;
        long j13;
        boolean z11;
        long jC;
        long jE;
        long jMax2;
        cu jzVar;
        List list;
        boolean z12;
        int i10;
        gu guVar;
        long jMax3;
        lc0 lc0Var;
        lu luVar = this;
        if (luVar.f79933x || luVar.f79919j.b() || luVar.f79919j.f77392c != null) {
            return false;
        }
        boolean zC = c();
        if (zC) {
            listEmptyList = Collections.emptyList();
            j11 = luVar.f79929t;
        } else {
            listEmptyList = luVar.f79922m;
            ArrayList arrayList = luVar.f79921l;
            j11 = ((jo) arrayList.get(arrayList.size() - 1)).f76431h;
        }
        List list2 = listEmptyList;
        long j14 = j11;
        b30 b30Var = luVar.f79915f;
        gu guVar2 = luVar.f79920k;
        nc0 nc0Var = (nc0) b30Var;
        if (nc0Var.f80633l != null) {
            z10 = zC;
        } else {
            long j15 = j14 - j10;
            long jA = ib3.a(((fc2) nc0Var.f80631j.f76137m.get(nc0Var.f80632k)).f77350b) + ib3.a(nc0Var.f80631j.f76125a) + j14;
            te2 te2Var = nc0Var.f80628g;
            if (te2Var == null || !te2Var.f83006e.a(jA)) {
                long j16 = nc0Var.f80627f;
                long jA2 = ib3.a(j16 == -9223372036854775807L ? System.currentTimeMillis() : j16 + SystemClock.elapsedRealtime());
                c30 c30Var = nc0Var.f80631j;
                long j17 = c30Var.f76125a;
                long jA3 = j17 == -9223372036854775807L ? -9223372036854775807L : jA2 - ib3.a(j17 + ((fc2) c30Var.f76137m.get(nc0Var.f80632k)).f77350b);
                jo joVar = list2.isEmpty() ? null : (jo) list2.get(list2.size() - 1);
                int iF = nc0Var.f80630i.f();
                yj1[] yj1VarArr = new yj1[iF];
                int i11 = 0;
                while (i11 < iF) {
                    lc0 lc0Var2 = nc0Var.f80629h[i11];
                    i30 i30Var = lc0Var2.f79746d;
                    if (i30Var == null) {
                        yj1VarArr[i11] = yj1.f85011a;
                        i10 = iF;
                        guVar = guVar2;
                        z12 = zC;
                        list = list2;
                        j14 = j14;
                    } else {
                        list = list2;
                        z12 = zC;
                        long jC2 = i30Var.c(lc0Var2.f79747e, jA2) + lc0Var2.f79748f;
                        i10 = iF;
                        nc0 nc0Var2 = nc0Var;
                        guVar = guVar2;
                        long jE2 = (lc0Var2.f79746d.e(lc0Var2.f79747e, jA2) + (lc0Var2.f79746d.c(lc0Var2.f79747e, jA2) + lc0Var2.f79748f)) - 1;
                        if (joVar != null) {
                            jMax3 = joVar.c();
                        } else {
                            long jA4 = lc0Var2.f79746d.a(j14, lc0Var2.f79747e) + lc0Var2.f79748f;
                            int i12 = ib3.f78556a;
                            jMax3 = Math.max(jC2, Math.min(jA4, jE2));
                        }
                        long j18 = jMax3;
                        if (j18 < jC2) {
                            yj1VarArr[i11] = yj1.f85011a;
                            j14 = j14;
                            nc0Var = nc0Var2;
                            i10 = i10;
                        } else {
                            nc0Var = nc0Var2;
                            lc0 lc0Var3 = nc0Var.f80629h[i11];
                            uo uoVarB = nc0Var.f80623b.b(lc0Var3.f79744b.f79869b);
                            if (uoVarB == null || uoVarB.equals(lc0Var3.f79745c)) {
                                lc0Var = lc0Var3;
                            } else {
                                lc0 lc0Var4 = new lc0(lc0Var3.f79747e, lc0Var3.f79744b, uoVarB, lc0Var3.f79743a, lc0Var3.f79748f, lc0Var3.f79746d);
                                nc0Var.f80629h[i11] = lc0Var4;
                                lc0Var = lc0Var4;
                            }
                            yj1VarArr[i11] = new mc0(lc0Var, j18, jE2);
                        }
                    }
                    i11++;
                    list2 = list;
                    zC = z12;
                    guVar2 = guVar;
                    iF = i10;
                    j14 = j14;
                }
                gu guVar3 = guVar2;
                z10 = zC;
                List list3 = list2;
                long j19 = j14;
                if (nc0Var.f80631j.f76128d) {
                    lc0 lc0Var5 = nc0Var.f80629h[0];
                    long jA5 = nc0Var.f80629h[0].a((lc0Var5.f79746d.e(lc0Var5.f79747e, jA2) + (lc0Var5.f79746d.c(lc0Var5.f79747e, jA2) + lc0Var5.f79748f)) - 1);
                    c30 c30Var2 = nc0Var.f80631j;
                    long j20 = c30Var2.f76125a;
                    j12 = -9223372036854775807L;
                    jMax = Math.max(0L, Math.min(j20 == -9223372036854775807L ? -9223372036854775807L : jA2 - ib3.a(j20 + ((fc2) c30Var2.f76137m.get(nc0Var.f80632k)).f77350b), jA5) - j10);
                } else {
                    j12 = -9223372036854775807L;
                    jMax = -9223372036854775807L;
                }
                long j21 = j12;
                nc0 nc0Var3 = nc0Var;
                nc0Var.f80630i.a(j10, j15, jMax, list3, yj1VarArr);
                int iE = nc0Var3.f80630i.e();
                lc0 lc0Var6 = nc0Var3.f80629h[iE];
                uo uoVarB2 = nc0Var3.f80623b.b(lc0Var6.f79744b.f79869b);
                if (uoVarB2 != null && !uoVarB2.equals(lc0Var6.f79745c)) {
                    lc0 lc0Var7 = new lc0(lc0Var6.f79747e, lc0Var6.f79744b, uoVarB2, lc0Var6.f79743a, lc0Var6.f79748f, lc0Var6.f79746d);
                    nc0Var3.f80629h[iE] = lc0Var7;
                    lc0Var6 = lc0Var7;
                }
                fu fuVar = lc0Var6.f79743a;
                if (fuVar != null) {
                    lo2 lo2Var = lc0Var6.f79744b;
                    pl2 pl2Var = ((ar) fuVar).f75607j == null ? lo2Var.f79872e : null;
                    pl2 pl2VarE = lc0Var6.f79746d == null ? lo2Var.e() : null;
                    if (pl2Var == null && pl2VarE == null) {
                        j13 = lc0Var6.f79747e;
                        if (j13 != j21) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (lc0Var6.f79746d.c(j13) == 0) {
                            guVar3.f77937b = z11;
                        } else {
                            jC = lc0Var6.f79746d.c(lc0Var6.f79747e, jA2) + lc0Var6.f79748f;
                            jE = (lc0Var6.f79746d.e(lc0Var6.f79747e, jA2) + (lc0Var6.f79746d.c(lc0Var6.f79747e, jA2) + lc0Var6.f79748f)) - 1;
                            if (joVar != null) {
                                jMax2 = joVar.c();
                            } else {
                                long jA6 = lc0Var6.f79746d.a(j19, lc0Var6.f79747e) + lc0Var6.f79748f;
                                int i13 = ib3.f78556a;
                                jMax2 = Math.max(jC, Math.min(jA6, jE));
                            }
                            if (jMax2 < jC) {
                                nc0Var3.f80633l = new zo();
                            } else if (jMax2 <= jE || (nc0Var3.f80634m && jMax2 >= jE)) {
                                guVar3.f77937b = z11;
                            } else if (!z11 || lc0Var6.f79746d.a(jMax2 - lc0Var6.f79748f) < j13) {
                                int iMin = (int) Math.min(1, (jE - jMax2) + 1);
                                if (j13 != j21) {
                                    for (int i14 = 1; iMin > i14 && lc0Var6.f79746d.a(((((long) iMin) + jMax2) - 1) - lc0Var6.f79748f) >= j13; i14 = 1) {
                                        iMin--;
                                    }
                                }
                                long j22 = list3.isEmpty() ? j19 : -9223372036854775807L;
                                p30 p30Var = nc0Var3.f80626e;
                                int i15 = nc0Var3.f80625d;
                                mx0 mx0VarC = nc0Var3.f80630i.c();
                                int iD = nc0Var3.f80630i.d();
                                Object objG = nc0Var3.f80630i.g();
                                lo2 lo2Var2 = lc0Var6.f79744b;
                                long jA7 = lc0Var6.f79746d.a(jMax2 - lc0Var6.f79748f);
                                pl2 pl2VarB = lc0Var6.f79746d.b(jMax2 - lc0Var6.f79748f);
                                if (lc0Var6.f79743a == null) {
                                    jzVar = new qz2(p30Var, j30.a(lo2Var2, lc0Var6.f79745c.f83549a, pl2VarB, (lc0Var6.f79746d.a() || jA3 == -9223372036854775807L || lc0Var6.a(jMax2) <= jA3) ? 0 : 8), mx0VarC, iD, objG, jA7, lc0Var6.a(jMax2), jMax2, i15, mx0VarC);
                                } else {
                                    int i16 = 1;
                                    int i17 = 1;
                                    while (i16 < iMin) {
                                        pl2 pl2VarA = pl2VarB.a(lc0Var6.f79746d.b((((long) i16) + jMax2) - lc0Var6.f79748f), lc0Var6.f79745c.f83549a);
                                        if (pl2VarA == null) {
                                            break;
                                        }
                                        i17++;
                                        i16++;
                                        pl2VarB = pl2VarA;
                                    }
                                    long j23 = (((long) i17) + jMax2) - 1;
                                    long jA8 = lc0Var6.a(j23);
                                    long j24 = lc0Var6.f79747e;
                                    jzVar = new jz(p30Var, j30.a(lo2Var2, lc0Var6.f79745c.f83549a, pl2VarB, (lc0Var6.f79746d.a() || jA3 == -9223372036854775807L || lc0Var6.a(j23) <= jA3) ? 0 : 8), mx0VarC, iD, objG, jA7, jA8, j22, (j24 == -9223372036854775807L || j24 > jA8) ? -9223372036854775807L : j24, jMax2, i17, -lo2Var2.f79870c, lc0Var6.f79743a);
                                }
                                guVar3.f77936a = jzVar;
                            } else {
                                guVar3.f77937b = true;
                            }
                        }
                    } else {
                        p30 p30Var2 = nc0Var3.f80626e;
                        mx0 mx0VarC2 = nc0Var3.f80630i.c();
                        int iD2 = nc0Var3.f80630i.d();
                        Object objG2 = nc0Var3.f80630i.g();
                        lo2 lo2Var3 = lc0Var6.f79744b;
                        if (pl2Var == null || (pl2VarE = pl2Var.a(pl2VarE, lc0Var6.f79745c.f83549a)) != null) {
                            pl2Var = pl2VarE;
                        }
                        guVar3.f77936a = new r61(p30Var2, j30.a(lo2Var3, lc0Var6.f79745c.f83549a, pl2Var, 0), mx0VarC2, iD2, objG2, lc0Var6.f79743a);
                    }
                } else {
                    j13 = lc0Var6.f79747e;
                    if (j13 != j21) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (lc0Var6.f79746d.c(j13) == 0) {
                        guVar3.f77937b = z11;
                    } else {
                        jC = lc0Var6.f79746d.c(lc0Var6.f79747e, jA2) + lc0Var6.f79748f;
                        jE = (lc0Var6.f79746d.e(lc0Var6.f79747e, jA2) + (lc0Var6.f79746d.c(lc0Var6.f79747e, jA2) + lc0Var6.f79748f)) - 1;
                        if (joVar != null) {
                            jMax2 = joVar.c();
                        } else {
                            long jA9 = lc0Var6.f79746d.a(j19, lc0Var6.f79747e) + lc0Var6.f79748f;
                            int i18 = ib3.f78556a;
                            jMax2 = Math.max(jC, Math.min(jA9, jE));
                        }
                        if (jMax2 < jC) {
                            nc0Var3.f80633l = new zo();
                        } else if (jMax2 <= jE) {
                            guVar3.f77937b = z11;
                        } else {
                            guVar3.f77937b = z11;
                        }
                    }
                }
                luVar = this;
            } else {
                z10 = zC;
            }
        }
        gu guVar4 = luVar.f79920k;
        boolean z13 = guVar4.f77937b;
        cu cuVar = guVar4.f77936a;
        guVar4.f77936a = null;
        guVar4.f77937b = false;
        if (z13) {
            luVar.f79929t = -9223372036854775807L;
            luVar.f79933x = true;
            return true;
        }
        if (cuVar == null) {
            return false;
        }
        luVar.f79926q = cuVar;
        if (cuVar instanceof jo) {
            jo joVar2 = (jo) cuVar;
            if (z10) {
                long j25 = joVar2.f76430g;
                long j26 = luVar.f79929t;
                if (j25 != j26) {
                    luVar.f79923n.f80369t = j26;
                    for (ms2 ms2Var : luVar.f79924o) {
                        ms2Var.f80369t = luVar.f79929t;
                    }
                }
                luVar.f79929t = -9223372036854775807L;
            }
            lo loVar = luVar.f79925p;
            joVar2.f79133m = loVar;
            int[] iArr = new int[loVar.f79867b.length];
            int i19 = 0;
            while (true) {
                ms2[] ms2VarArr = loVar.f79867b;
                if (i19 >= ms2VarArr.length) {
                    break;
                }
                ms2 ms2Var2 = ms2VarArr[i19];
                iArr[i19] = ms2Var2.f80366q + ms2Var2.f80365p;
                i19++;
            }
            joVar2.f79134n = iArr;
            luVar.f79921l.add(joVar2);
        } else if (cuVar instanceof r61) {
            ((r61) cuVar).f82110k = luVar.f79925p;
        }
        luVar.f79919j.a(cuVar, luVar, luVar.f79918i.a(cuVar.f76426c));
        bn1 bn1Var = luVar.f79917h;
        Uri uri = cuVar.f76425b.f83341a;
        Collections.emptyMap();
        bn1Var.c(new vf1(), new hm1(cuVar.f76426c, luVar.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var.a(cuVar.f76430g), bn1Var.a(cuVar.f76431h)));
        return true;
    }

    @Override // yads.rx2
    public final void reevaluateBuffer(long j10) {
        if (this.f79919j.f77392c == null && !c()) {
            if (this.f79919j.b()) {
                cu cuVar = this.f79926q;
                cuVar.getClass();
                boolean z10 = cuVar instanceof jo;
                if (z10 && b(this.f79921l.size() - 1)) {
                    return;
                }
                b30 b30Var = this.f79915f;
                List list = this.f79922m;
                nc0 nc0Var = (nc0) b30Var;
                if (nc0Var.f80633l == null && nc0Var.f80630i.a(j10, cuVar, list)) {
                    ag1 ag1Var = this.f79919j.f77391b;
                    if (ag1Var == null) {
                        throw new IllegalStateException();
                    }
                    ag1Var.a(false);
                    if (z10) {
                        this.f79932w = (jo) cuVar;
                        return;
                    }
                    return;
                }
                return;
            }
            b30 b30Var2 = this.f79915f;
            List list2 = this.f79922m;
            nc0 nc0Var2 = (nc0) b30Var2;
            int size = (nc0Var2.f80633l != null || nc0Var2.f80630i.f() < 2) ? list2.size() : nc0Var2.f80630i.a(j10, list2);
            if (size < this.f79921l.size()) {
                if (!(!this.f79919j.b())) {
                    throw new IllegalStateException();
                }
                int size2 = this.f79921l.size();
                while (true) {
                    if (size >= size2) {
                        size = -1;
                        break;
                    } else if (!b(size)) {
                        break;
                    } else {
                        size++;
                    }
                }
                if (size == -1) {
                    return;
                }
                ArrayList arrayList = this.f79921l;
                long j11 = ((jo) arrayList.get(arrayList.size() - 1)).f76431h;
                jo joVarA = a(size);
                if (this.f79921l.isEmpty()) {
                    this.f79929t = this.f79930u;
                }
                this.f79933x = false;
                bn1 bn1Var = this.f79917h;
                bn1Var.b(new hm1(1, this.f79911b, null, 3, null, bn1Var.a(joVarA.f76430g), bn1Var.a(j11)));
            }
        }
    }

    public final boolean c() {
        return this.f79929t != -9223372036854775807L;
    }

    public final void d() {
        ms2 ms2Var = this.f79923n;
        int iA = a(ms2Var.f80366q + ms2Var.f80368s, this.f79931v - 1);
        while (true) {
            int i10 = this.f79931v;
            if (i10 > iA) {
                return;
            }
            this.f79931v = i10 + 1;
            jo joVar = (jo) this.f79921l.get(i10);
            mx0 mx0Var = joVar.f76427d;
            if (!mx0Var.equals(this.f79927r)) {
                bn1 bn1Var = this.f79917h;
                bn1Var.a(new hm1(1, this.f79911b, mx0Var, joVar.f76428e, joVar.f76429f, bn1Var.a(joVar.f76430g), -9223372036854775807L));
            }
            this.f79927r = mx0Var;
        }
    }

    @Override // yads.rx2
    public final long getBufferedPositionUs() {
        long j10;
        if (this.f79933x) {
            return Long.MIN_VALUE;
        }
        if (c()) {
            return this.f79929t;
        }
        long jMax = this.f79930u;
        ArrayList arrayList = this.f79921l;
        jo joVar = (jo) arrayList.get(arrayList.size() - 1);
        if (!joVar.d()) {
            if (this.f79921l.size() > 1) {
                ArrayList arrayList2 = this.f79921l;
                joVar = (jo) arrayList2.get(arrayList2.size() - 2);
            } else {
                joVar = null;
            }
        }
        if (joVar != null) {
            jMax = Math.max(jMax, joVar.f76431h);
        }
        ms2 ms2Var = this.f79923n;
        synchronized (ms2Var) {
            j10 = ms2Var.f80371v;
        }
        return Math.max(jMax, j10);
    }

    @Override // yads.rx2
    public final boolean isLoading() {
        return this.f79919j.b();
    }

    public lu(int i10, int[] iArr, mx0[] mx0VarArr, nc0 nc0Var, qx2 qx2Var, qe qeVar, long j10, sk0 sk0Var, ok0 ok0Var, ae0 ae0Var, bn1 bn1Var) {
        this.f79911b = i10;
        this.f79912c = iArr;
        this.f79913d = mx0VarArr;
        this.f79915f = nc0Var;
        this.f79916g = qx2Var;
        this.f79917h = bn1Var;
        this.f79918i = ae0Var;
        ArrayList arrayList = new ArrayList();
        this.f79921l = arrayList;
        this.f79922m = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f79924o = new ms2[length];
        this.f79914e = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        ms2[] ms2VarArr = new ms2[i11];
        ms2 ms2VarA = ms2.a(qeVar, sk0Var, ok0Var);
        this.f79923n = ms2VarA;
        int i12 = 0;
        iArr2[0] = i10;
        ms2VarArr[0] = ms2VarA;
        while (i12 < length) {
            ms2 ms2VarA2 = ms2.a(qeVar);
            this.f79924o[i12] = ms2VarA2;
            int i13 = i12 + 1;
            ms2VarArr[i13] = ms2VarA2;
            iArr2[i13] = this.f79912c[i12];
            i12 = i13;
        }
        this.f79925p = new lo(iArr2, ms2VarArr);
        this.f79929t = j10;
        this.f79930u = j10;
    }

    @Override // yads.rx2
    public final long getNextLoadPositionUs() {
        if (c()) {
            return this.f79929t;
        }
        if (this.f79933x) {
            return Long.MIN_VALUE;
        }
        ArrayList arrayList = this.f79921l;
        return ((jo) arrayList.get(arrayList.size() - 1)).f76431h;
    }

    @Override // yads.ns2
    public final boolean isReady() {
        if (!c() && this.f79923n.a(this.f79933x)) {
            return true;
        }
        return false;
    }

    @Override // yads.ns2
    public final void a() throws IOException {
        this.f79919j.a(Integer.MIN_VALUE);
        ms2 ms2Var = this.f79923n;
        mk0 mk0Var = ms2Var.f80357h;
        if (mk0Var != null && mk0Var.getState() == 1) {
            lk0 lk0VarC = ms2Var.f80357h.c();
            lk0VarC.getClass();
            throw lk0VarC;
        }
        if (this.f79919j.b()) {
            return;
        }
        nc0 nc0Var = (nc0) this.f79915f;
        zo zoVar = nc0Var.f80633l;
        if (zoVar == null) {
            nc0Var.f80622a.a();
            return;
        }
        throw zoVar;
    }

    @Override // yads.cg1
    public final void b() {
        ms2 ms2Var = this.f79923n;
        ms2Var.b(true);
        ms2Var.d();
        for (ms2 ms2Var2 : this.f79924o) {
            ms2Var2.b(true);
            ms2Var2.d();
        }
        for (lc0 lc0Var : ((nc0) this.f79915f).f80629h) {
            fu fuVar = lc0Var.f79743a;
            if (fuVar != null) {
                ((ar) fuVar).f75599b.release();
            }
        }
        ku kuVar = this.f79928s;
        if (kuVar != null) {
            h30 h30Var = (h30) kuVar;
            synchronized (h30Var) {
                te2 te2Var = (te2) h30Var.f78039o.remove(this);
                if (te2Var != null) {
                    ms2 ms2Var3 = te2Var.f83002a;
                    ms2Var3.b(true);
                    ms2Var3.d();
                }
            }
        }
    }

    @Override // yads.yf1
    public final void a(bg1 bg1Var, long j10, long j11, boolean z10) {
        cu cuVar = (cu) bg1Var;
        this.f79926q = null;
        this.f79932w = null;
        long j12 = cuVar.f76424a;
        Uri uri = cuVar.f76432i.f82098c;
        vf1 vf1Var = new vf1();
        this.f79918i.getClass();
        bn1 bn1Var = this.f79917h;
        bn1Var.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var.a(cuVar.f76430g), bn1Var.a(cuVar.f76431h)));
        if (z10) {
            return;
        }
        if (c()) {
            this.f79923n.b(false);
            for (ms2 ms2Var : this.f79924o) {
                ms2Var.b(false);
            }
        } else if (cuVar instanceof jo) {
            a(this.f79921l.size() - 1);
            if (this.f79921l.isEmpty()) {
                this.f79929t = this.f79930u;
            }
        }
        this.f79916g.a(this);
    }

    @Override // yads.yf1
    public final void a(bg1 bg1Var, long j10, long j11) {
        hu huVarB;
        cu cuVar = (cu) bg1Var;
        this.f79926q = null;
        nc0 nc0Var = (nc0) this.f79915f;
        nc0Var.getClass();
        if (cuVar instanceof r61) {
            int iA = nc0Var.f80630i.a(((r61) cuVar).f76427d);
            lc0 lc0Var = nc0Var.f80629h[iA];
            if (lc0Var.f79746d == null && (huVarB = ((ar) lc0Var.f79743a).b()) != null) {
                lc0[] lc0VarArr = nc0Var.f80629h;
                lo2 lo2Var = lc0Var.f79744b;
                lc0VarArr[iA] = new lc0(lc0Var.f79747e, lo2Var, lc0Var.f79745c, lc0Var.f79743a, lc0Var.f79748f, new k30(huVarB, lo2Var.f79870c));
            }
        }
        te2 te2Var = nc0Var.f80628g;
        if (te2Var != null) {
            long j12 = te2Var.f83005d;
            if (j12 == -9223372036854775807L || cuVar.f76431h > j12) {
                te2Var.f83005d = cuVar.f76431h;
            }
            te2Var.f83006e.f83450h = true;
        }
        long j13 = cuVar.f76424a;
        Uri uri = cuVar.f76432i.f82098c;
        vf1 vf1Var = new vf1();
        this.f79918i.getClass();
        bn1 bn1Var = this.f79917h;
        bn1Var.b(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var.a(cuVar.f76430g), bn1Var.a(cuVar.f76431h)));
        this.f79916g.a(this);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:105:0x0205  */
    /* JADX WARN: Code duplicated, block: B:106:0x0216  */
    /* JADX WARN: Code duplicated, block: B:109:0x0224  */
    /* JADX WARN: Code duplicated, block: B:111:0x0230  */
    /* JADX WARN: Code duplicated, block: B:113:0x0247 A[DONT_INVERT, PHI: r16
  0x0247: PHI (r16v2 yads.vf1) = (r16v0 yads.vf1), (r16v0 yads.vf1), (r16v0 yads.vf1), (r16v3 yads.vf1) binds: [B:108:0x0222, B:112:0x0240, B:99:0x01e7, B:50:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x0249  */
    /* JADX WARN: Code duplicated, block: B:116:0x024d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0253  */
    /* JADX WARN: Code duplicated, block: B:120:0x025b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0260  */
    /* JADX WARN: Code duplicated, block: B:123:0x0266  */
    /* JADX WARN: Code duplicated, block: B:126:0x0270  */
    /* JADX WARN: Code duplicated, block: B:128:0x0279  */
    /* JADX WARN: Code duplicated, block: B:143:0x02aa A[EDGE_INSN: B:143:0x02aa->B:144:0x02af BREAK  A[LOOP:0: B:135:0x0288->B:141:0x0298]] */
    /* JADX WARN: Code duplicated, block: B:146:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:147:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:148:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:151:0x02ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:157:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:165:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0113  */
    /* JADX WARN: Code duplicated, block: B:55:0x0119  */
    /* JADX WARN: Code duplicated, block: B:60:0x012a A[LOOP:2: B:58:0x0124->B:60:0x012a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0159 A[LOOP:3: B:62:0x0153->B:64:0x0159, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x017b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0184  */
    /* JADX WARN: Code duplicated, block: B:73:0x018c  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d9  */
    @Override // yads.yf1
    public final zf1 a(bg1 bg1Var, long j10, long j11, IOException iOException, int i10) {
        lc0 lc0Var;
        uo uoVarB;
        op0 op0Var;
        p51 p51Var;
        long jElapsedRealtime;
        int iF;
        int i11;
        int i12;
        HashSet hashSet;
        int i13;
        tf1 tf1Var;
        HashSet hashSet2;
        ArrayList arrayListA;
        vf1 vf1Var;
        int i14;
        uf1 uf1Var;
        int i15;
        vo voVar;
        long jElapsedRealtime2;
        String str;
        HashMap map;
        long jMax;
        int i16;
        Integer numValueOf;
        HashMap map2;
        op0 op0Var2;
        int i17;
        zf1 zf1Var;
        boolean z10;
        int i18;
        boolean z11;
        boolean z12;
        long jMin;
        cu cuVar = (cu) bg1Var;
        long j12 = cuVar.f76432i.f82097b;
        boolean z13 = cuVar instanceof jo;
        int size = this.f79921l.size() - 1;
        boolean z14 = (j12 != 0 && z13 && b(size)) ? false : true;
        Uri uri = cuVar.f76432i.f82098c;
        vf1 vf1Var2 = new vf1();
        long j13 = cuVar.f76430g;
        int i19 = ib3.f78556a;
        b30 b30Var = this.f79915f;
        ae0 ae0Var = this.f79918i;
        nc0 nc0Var = (nc0) b30Var;
        if (z14) {
            te2 te2Var = nc0Var.f80628g;
            if (te2Var != null) {
                long j14 = te2Var.f83005d;
                boolean z15 = j14 != -9223372036854775807L && j14 < j13;
                ue2 ue2Var = te2Var.f83006e;
                if (ue2Var.f83449g.f76128d) {
                    if (!ue2Var.f83451i) {
                        if (z15) {
                            if (ue2Var.f83450h) {
                                ue2Var.f83451i = true;
                                ue2Var.f83450h = false;
                                com.monetization.ads.exo.source.dash.i iVar = ((com.monetization.ads.exo.source.dash.c) ue2Var.f83445c).f42926a;
                                iVar.D.removeCallbacks(iVar.f42946w);
                                iVar.h();
                            }
                        } else if (nc0Var.f80631j.f76128d && z13 && (iOException instanceof s11) && ((s11) iOException).f82491e == 404) {
                            lc0 lc0Var2 = nc0Var.f80629h[nc0Var.f80630i.a(cuVar.f76427d)];
                            long jC = lc0Var2.f79746d.c(lc0Var2.f79747e);
                            if (jC == -1 || jC == 0) {
                                lc0Var = nc0Var.f80629h[nc0Var.f80630i.a(cuVar.f76427d)];
                                uoVarB = nc0Var.f80623b.b(lc0Var.f79744b.f79869b);
                                if (uoVarB != null) {
                                }
                                op0Var = nc0Var.f80630i;
                                p51Var = lc0Var.f79744b.f79869b;
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                iF = op0Var.f();
                                i12 = 0;
                                for (i11 = 0; i11 < iF; i11++) {
                                    if (op0Var.b(i11, jElapsedRealtime)) {
                                        i12++;
                                    }
                                }
                                hashSet = new HashSet();
                                for (i13 = 0; i13 < p51Var.size(); i13++) {
                                    hashSet.add(Integer.valueOf(((uo) p51Var.get(i13)).f83551c));
                                }
                                int size2 = hashSet.size();
                                vo voVar2 = nc0Var.f80623b;
                                voVar2.getClass();
                                hashSet2 = new HashSet();
                                arrayListA = voVar2.a(p51Var);
                                vf1Var = vf1Var2;
                                for (i14 = 0; i14 < arrayListA.size(); i14++) {
                                    hashSet2.add(Integer.valueOf(((uo) arrayListA.get(i14)).f83551c));
                                }
                                tf1Var = new tf1(size2, size2 - hashSet2.size(), iF, i12);
                                if (!tf1Var.a(2)) {
                                    ae0Var.getClass();
                                    if (iOException instanceof s11) {
                                        uf1Var = null;
                                    } else if (tf1Var.a(1)) {
                                        uf1Var = new uf1(1, 300000L);
                                    } else if (tf1Var.a(2)) {
                                        uf1Var = new uf1(2, 60000L);
                                    } else {
                                        uf1Var = null;
                                    }
                                    if (uf1Var != null) {
                                        i15 = uf1Var.f83457a;
                                        if (i15 == 2) {
                                            op0Var2 = nc0Var.f80630i;
                                            if (op0Var2.a(op0Var2.a(cuVar.f76427d), uf1Var.f83458b)) {
                                                if (z14) {
                                                    zf1Var = fg1.f77388d;
                                                    if (z13) {
                                                        if (a(size) == cuVar) {
                                                            if (this.f79921l.isEmpty()) {
                                                                this.f79929t = this.f79930u;
                                                            }
                                                        } else {
                                                            throw new IllegalStateException();
                                                        }
                                                    }
                                                } else {
                                                    ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                                                }
                                            }
                                            if (zf1Var == null) {
                                                this.f79918i.getClass();
                                                if (!(iOException instanceof ob2)) {
                                                    jMin = -9223372036854775807L;
                                                    break;
                                                }
                                                jMin = -9223372036854775807L;
                                                break;
                                                if (jMin != -9223372036854775807L) {
                                                    z10 = false;
                                                    zf1Var = new zf1(0, jMin);
                                                } else {
                                                    z10 = false;
                                                    zf1Var = fg1.f77389e;
                                                }
                                            } else {
                                                z10 = false;
                                            }
                                            i18 = zf1Var.f85378a;
                                            if (i18 != 0) {
                                                z11 = true;
                                            } else {
                                                z11 = true;
                                            }
                                            z12 = !z11;
                                            bn1 bn1Var = this.f79917h;
                                            bn1Var.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var.a(cuVar.f76430g), bn1Var.a(cuVar.f76431h)), iOException, z12);
                                            if (z12) {
                                                this.f79926q = null;
                                                this.f79918i.getClass();
                                                this.f79916g.a(this);
                                            }
                                            return zf1Var;
                                        }
                                        if (i15 == 1) {
                                            voVar = nc0Var.f80623b;
                                            uo uoVar = lc0Var.f79745c;
                                            long j15 = uf1Var.f83458b;
                                            voVar.getClass();
                                            jElapsedRealtime2 = SystemClock.elapsedRealtime() + j15;
                                            str = uoVar.f83550b;
                                            map = voVar.f83966a;
                                            if (map.containsKey(str)) {
                                                Long l10 = (Long) map.get(str);
                                                int i20 = ib3.f78556a;
                                                jMax = Math.max(jElapsedRealtime2, l10.longValue());
                                            } else {
                                                jMax = jElapsedRealtime2;
                                            }
                                            map.put(str, Long.valueOf(jMax));
                                            i16 = uoVar.f83551c;
                                            if (i16 != Integer.MIN_VALUE) {
                                                numValueOf = Integer.valueOf(i16);
                                                map2 = voVar.f83967b;
                                                if (map2.containsKey(numValueOf)) {
                                                    Long l11 = (Long) map2.get(numValueOf);
                                                    int i21 = ib3.f78556a;
                                                    jElapsedRealtime2 = Math.max(jElapsedRealtime2, l11.longValue());
                                                }
                                                map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                            }
                                            if (z14) {
                                                zf1Var = fg1.f77388d;
                                                if (z13) {
                                                    if (a(size) == cuVar) {
                                                        if (this.f79921l.isEmpty()) {
                                                            this.f79929t = this.f79930u;
                                                        }
                                                    } else {
                                                        throw new IllegalStateException();
                                                    }
                                                }
                                            } else {
                                                ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                                            }
                                        }
                                        if (zf1Var == null) {
                                            this.f79918i.getClass();
                                            if (!(iOException instanceof ob2)) {
                                                jMin = -9223372036854775807L;
                                                break;
                                            }
                                            jMin = -9223372036854775807L;
                                            break;
                                            if (jMin != -9223372036854775807L) {
                                                z10 = false;
                                                zf1Var = new zf1(0, jMin);
                                            } else {
                                                z10 = false;
                                                zf1Var = fg1.f77389e;
                                            }
                                        } else {
                                            z10 = false;
                                        }
                                        i18 = zf1Var.f85378a;
                                        if (i18 != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = true;
                                        }
                                        z12 = !z11;
                                        bn1 bn1Var2 = this.f79917h;
                                        bn1Var2.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var2.a(cuVar.f76430g), bn1Var2.a(cuVar.f76431h)), iOException, z12);
                                        if (z12) {
                                            this.f79926q = null;
                                            this.f79918i.getClass();
                                            this.f79916g.a(this);
                                        }
                                        return zf1Var;
                                    }
                                } else {
                                    ae0Var.getClass();
                                    if (iOException instanceof s11) {
                                        uf1Var = null;
                                    } else if (tf1Var.a(1)) {
                                        uf1Var = new uf1(1, 300000L);
                                    } else if (tf1Var.a(2)) {
                                        uf1Var = new uf1(2, 60000L);
                                    } else {
                                        uf1Var = null;
                                    }
                                    if (uf1Var != null) {
                                        i15 = uf1Var.f83457a;
                                        if (i15 == 2) {
                                            op0Var2 = nc0Var.f80630i;
                                            if (op0Var2.a(op0Var2.a(cuVar.f76427d), uf1Var.f83458b)) {
                                                if (z14) {
                                                    zf1Var = fg1.f77388d;
                                                    if (z13) {
                                                        if (a(size) == cuVar) {
                                                            if (this.f79921l.isEmpty()) {
                                                                this.f79929t = this.f79930u;
                                                            }
                                                        } else {
                                                            throw new IllegalStateException();
                                                        }
                                                    }
                                                } else {
                                                    ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                                                }
                                            }
                                            if (zf1Var == null) {
                                                this.f79918i.getClass();
                                                if (!(iOException instanceof ob2)) {
                                                    jMin = -9223372036854775807L;
                                                    break;
                                                }
                                                jMin = -9223372036854775807L;
                                                break;
                                                if (jMin != -9223372036854775807L) {
                                                    z10 = false;
                                                    zf1Var = new zf1(0, jMin);
                                                } else {
                                                    z10 = false;
                                                    zf1Var = fg1.f77389e;
                                                }
                                            } else {
                                                z10 = false;
                                            }
                                            i18 = zf1Var.f85378a;
                                            if (i18 != 0) {
                                                z11 = true;
                                            } else {
                                                z11 = true;
                                            }
                                            z12 = !z11;
                                            bn1 bn1Var3 = this.f79917h;
                                            bn1Var3.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var3.a(cuVar.f76430g), bn1Var3.a(cuVar.f76431h)), iOException, z12);
                                            if (z12) {
                                                this.f79926q = null;
                                                this.f79918i.getClass();
                                                this.f79916g.a(this);
                                            }
                                            return zf1Var;
                                        }
                                        if (i15 == 1) {
                                            voVar = nc0Var.f80623b;
                                            uo uoVar2 = lc0Var.f79745c;
                                            long j16 = uf1Var.f83458b;
                                            voVar.getClass();
                                            jElapsedRealtime2 = SystemClock.elapsedRealtime() + j16;
                                            str = uoVar2.f83550b;
                                            map = voVar.f83966a;
                                            if (map.containsKey(str)) {
                                                Long l12 = (Long) map.get(str);
                                                int i22 = ib3.f78556a;
                                                jMax = Math.max(jElapsedRealtime2, l12.longValue());
                                            } else {
                                                jMax = jElapsedRealtime2;
                                            }
                                            map.put(str, Long.valueOf(jMax));
                                            i16 = uoVar2.f83551c;
                                            if (i16 != Integer.MIN_VALUE) {
                                                numValueOf = Integer.valueOf(i16);
                                                map2 = voVar.f83967b;
                                                if (map2.containsKey(numValueOf)) {
                                                    Long l13 = (Long) map2.get(numValueOf);
                                                    int i23 = ib3.f78556a;
                                                    jElapsedRealtime2 = Math.max(jElapsedRealtime2, l13.longValue());
                                                }
                                                map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                            }
                                            if (z14) {
                                                zf1Var = fg1.f77388d;
                                                if (z13) {
                                                    if (a(size) == cuVar) {
                                                        if (this.f79921l.isEmpty()) {
                                                            this.f79929t = this.f79930u;
                                                        }
                                                    } else {
                                                        throw new IllegalStateException();
                                                    }
                                                }
                                            } else {
                                                ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                                            }
                                        }
                                        if (zf1Var == null) {
                                            this.f79918i.getClass();
                                            if (!(iOException instanceof ob2)) {
                                                jMin = -9223372036854775807L;
                                                break;
                                            }
                                            jMin = -9223372036854775807L;
                                            break;
                                            if (jMin != -9223372036854775807L) {
                                                z10 = false;
                                                zf1Var = new zf1(0, jMin);
                                            } else {
                                                z10 = false;
                                                zf1Var = fg1.f77389e;
                                            }
                                        } else {
                                            z10 = false;
                                        }
                                        i18 = zf1Var.f85378a;
                                        if (i18 != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = true;
                                        }
                                        z12 = !z11;
                                        bn1 bn1Var4 = this.f79917h;
                                        bn1Var4.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var4.a(cuVar.f76430g), bn1Var4.a(cuVar.f76431h)), iOException, z12);
                                        if (z12) {
                                            this.f79926q = null;
                                            this.f79918i.getClass();
                                            this.f79916g.a(this);
                                        }
                                        return zf1Var;
                                    }
                                }
                            } else if (((jo) cuVar).c() > ((lc0Var2.f79746d.b() + lc0Var2.f79748f) + jC) - 1) {
                                nc0Var.f80634m = true;
                            } else {
                                lc0Var = nc0Var.f80629h[nc0Var.f80630i.a(cuVar.f76427d)];
                                uoVarB = nc0Var.f80623b.b(lc0Var.f79744b.f79869b);
                                if (uoVarB != null) {
                                }
                                op0Var = nc0Var.f80630i;
                                p51Var = lc0Var.f79744b.f79869b;
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                iF = op0Var.f();
                                i12 = 0;
                                while (i11 < iF) {
                                    if (op0Var.b(i11, jElapsedRealtime)) {
                                        i12++;
                                    }
                                }
                                hashSet = new HashSet();
                                while (i13 < p51Var.size()) {
                                    hashSet.add(Integer.valueOf(((uo) p51Var.get(i13)).f83551c));
                                }
                                int size3 = hashSet.size();
                                vo voVar3 = nc0Var.f80623b;
                                voVar3.getClass();
                                hashSet2 = new HashSet();
                                arrayListA = voVar3.a(p51Var);
                                vf1Var = vf1Var2;
                                while (i14 < arrayListA.size()) {
                                    hashSet2.add(Integer.valueOf(((uo) arrayListA.get(i14)).f83551c));
                                }
                                tf1Var = new tf1(size3, size3 - hashSet2.size(), iF, i12);
                                if (!tf1Var.a(2)) {
                                    ae0Var.getClass();
                                    if (iOException instanceof s11) {
                                        uf1Var = null;
                                    } else if (tf1Var.a(1)) {
                                        uf1Var = new uf1(1, 300000L);
                                    } else if (tf1Var.a(2)) {
                                        uf1Var = new uf1(2, 60000L);
                                    } else {
                                        uf1Var = null;
                                    }
                                    if (uf1Var != null) {
                                        i15 = uf1Var.f83457a;
                                        if (i15 == 2) {
                                            op0Var2 = nc0Var.f80630i;
                                            if (op0Var2.a(op0Var2.a(cuVar.f76427d), uf1Var.f83458b)) {
                                                if (z14) {
                                                    zf1Var = fg1.f77388d;
                                                    if (z13) {
                                                        if (a(size) == cuVar) {
                                                            if (this.f79921l.isEmpty()) {
                                                                this.f79929t = this.f79930u;
                                                            }
                                                        } else {
                                                            throw new IllegalStateException();
                                                        }
                                                    }
                                                } else {
                                                    ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                                                }
                                            }
                                            if (zf1Var == null) {
                                                this.f79918i.getClass();
                                                if (!(iOException instanceof ob2)) {
                                                    jMin = -9223372036854775807L;
                                                    break;
                                                }
                                                jMin = -9223372036854775807L;
                                                break;
                                                if (jMin != -9223372036854775807L) {
                                                    z10 = false;
                                                    zf1Var = new zf1(0, jMin);
                                                } else {
                                                    z10 = false;
                                                    zf1Var = fg1.f77389e;
                                                }
                                            } else {
                                                z10 = false;
                                            }
                                            i18 = zf1Var.f85378a;
                                            if (i18 != 0) {
                                                z11 = true;
                                            } else {
                                                z11 = true;
                                            }
                                            z12 = !z11;
                                            bn1 bn1Var5 = this.f79917h;
                                            bn1Var5.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var5.a(cuVar.f76430g), bn1Var5.a(cuVar.f76431h)), iOException, z12);
                                            if (z12) {
                                                this.f79926q = null;
                                                this.f79918i.getClass();
                                                this.f79916g.a(this);
                                            }
                                            return zf1Var;
                                        }
                                        if (i15 == 1) {
                                            voVar = nc0Var.f80623b;
                                            uo uoVar3 = lc0Var.f79745c;
                                            long j17 = uf1Var.f83458b;
                                            voVar.getClass();
                                            jElapsedRealtime2 = SystemClock.elapsedRealtime() + j17;
                                            str = uoVar3.f83550b;
                                            map = voVar.f83966a;
                                            if (map.containsKey(str)) {
                                                Long l14 = (Long) map.get(str);
                                                int i24 = ib3.f78556a;
                                                jMax = Math.max(jElapsedRealtime2, l14.longValue());
                                            } else {
                                                jMax = jElapsedRealtime2;
                                            }
                                            map.put(str, Long.valueOf(jMax));
                                            i16 = uoVar3.f83551c;
                                            if (i16 != Integer.MIN_VALUE) {
                                                numValueOf = Integer.valueOf(i16);
                                                map2 = voVar.f83967b;
                                                if (map2.containsKey(numValueOf)) {
                                                    Long l15 = (Long) map2.get(numValueOf);
                                                    int i25 = ib3.f78556a;
                                                    jElapsedRealtime2 = Math.max(jElapsedRealtime2, l15.longValue());
                                                }
                                                map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                            }
                                            if (z14) {
                                                zf1Var = fg1.f77388d;
                                                if (z13) {
                                                    if (a(size) == cuVar) {
                                                        if (this.f79921l.isEmpty()) {
                                                            this.f79929t = this.f79930u;
                                                        }
                                                    } else {
                                                        throw new IllegalStateException();
                                                    }
                                                }
                                            } else {
                                                ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                                            }
                                        }
                                        if (zf1Var == null) {
                                            this.f79918i.getClass();
                                            if (!(iOException instanceof ob2)) {
                                                jMin = -9223372036854775807L;
                                                break;
                                            }
                                            jMin = -9223372036854775807L;
                                            break;
                                            if (jMin != -9223372036854775807L) {
                                                z10 = false;
                                                zf1Var = new zf1(0, jMin);
                                            } else {
                                                z10 = false;
                                                zf1Var = fg1.f77389e;
                                            }
                                        } else {
                                            z10 = false;
                                        }
                                        i18 = zf1Var.f85378a;
                                        if (i18 != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = true;
                                        }
                                        z12 = !z11;
                                        bn1 bn1Var6 = this.f79917h;
                                        bn1Var6.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var6.a(cuVar.f76430g), bn1Var6.a(cuVar.f76431h)), iOException, z12);
                                        if (z12) {
                                            this.f79926q = null;
                                            this.f79918i.getClass();
                                            this.f79916g.a(this);
                                        }
                                        return zf1Var;
                                    }
                                } else {
                                    ae0Var.getClass();
                                    if (iOException instanceof s11) {
                                        uf1Var = null;
                                    } else if (tf1Var.a(1)) {
                                        uf1Var = new uf1(1, 300000L);
                                    } else if (tf1Var.a(2)) {
                                        uf1Var = new uf1(2, 60000L);
                                    } else {
                                        uf1Var = null;
                                    }
                                    if (uf1Var != null) {
                                        i15 = uf1Var.f83457a;
                                        if (i15 == 2) {
                                            op0Var2 = nc0Var.f80630i;
                                            if (op0Var2.a(op0Var2.a(cuVar.f76427d), uf1Var.f83458b)) {
                                                if (z14) {
                                                    zf1Var = fg1.f77388d;
                                                    if (z13) {
                                                        if (a(size) == cuVar) {
                                                            if (this.f79921l.isEmpty()) {
                                                                this.f79929t = this.f79930u;
                                                            }
                                                        } else {
                                                            throw new IllegalStateException();
                                                        }
                                                    }
                                                } else {
                                                    ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                                                }
                                            }
                                            if (zf1Var == null) {
                                                this.f79918i.getClass();
                                                if (!(iOException instanceof ob2)) {
                                                    jMin = -9223372036854775807L;
                                                    break;
                                                }
                                                jMin = -9223372036854775807L;
                                                break;
                                                if (jMin != -9223372036854775807L) {
                                                    z10 = false;
                                                    zf1Var = new zf1(0, jMin);
                                                } else {
                                                    z10 = false;
                                                    zf1Var = fg1.f77389e;
                                                }
                                            } else {
                                                z10 = false;
                                            }
                                            i18 = zf1Var.f85378a;
                                            if (i18 != 0) {
                                                z11 = true;
                                            } else {
                                                z11 = true;
                                            }
                                            z12 = !z11;
                                            bn1 bn1Var7 = this.f79917h;
                                            bn1Var7.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var7.a(cuVar.f76430g), bn1Var7.a(cuVar.f76431h)), iOException, z12);
                                            if (z12) {
                                                this.f79926q = null;
                                                this.f79918i.getClass();
                                                this.f79916g.a(this);
                                            }
                                            return zf1Var;
                                        }
                                        if (i15 == 1) {
                                            voVar = nc0Var.f80623b;
                                            uo uoVar4 = lc0Var.f79745c;
                                            long j18 = uf1Var.f83458b;
                                            voVar.getClass();
                                            jElapsedRealtime2 = SystemClock.elapsedRealtime() + j18;
                                            str = uoVar4.f83550b;
                                            map = voVar.f83966a;
                                            if (map.containsKey(str)) {
                                                Long l16 = (Long) map.get(str);
                                                int i26 = ib3.f78556a;
                                                jMax = Math.max(jElapsedRealtime2, l16.longValue());
                                            } else {
                                                jMax = jElapsedRealtime2;
                                            }
                                            map.put(str, Long.valueOf(jMax));
                                            i16 = uoVar4.f83551c;
                                            if (i16 != Integer.MIN_VALUE) {
                                                numValueOf = Integer.valueOf(i16);
                                                map2 = voVar.f83967b;
                                                if (map2.containsKey(numValueOf)) {
                                                    Long l17 = (Long) map2.get(numValueOf);
                                                    int i27 = ib3.f78556a;
                                                    jElapsedRealtime2 = Math.max(jElapsedRealtime2, l17.longValue());
                                                }
                                                map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                            }
                                            if (z14) {
                                                zf1Var = fg1.f77388d;
                                                if (z13) {
                                                    if (a(size) == cuVar) {
                                                        if (this.f79921l.isEmpty()) {
                                                            this.f79929t = this.f79930u;
                                                        }
                                                    } else {
                                                        throw new IllegalStateException();
                                                    }
                                                }
                                            } else {
                                                ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                                            }
                                        }
                                        if (zf1Var == null) {
                                            this.f79918i.getClass();
                                            if (!(iOException instanceof ob2)) {
                                                jMin = -9223372036854775807L;
                                                break;
                                            }
                                            jMin = -9223372036854775807L;
                                            break;
                                            if (jMin != -9223372036854775807L) {
                                                z10 = false;
                                                zf1Var = new zf1(0, jMin);
                                            } else {
                                                z10 = false;
                                                zf1Var = fg1.f77389e;
                                            }
                                        } else {
                                            z10 = false;
                                        }
                                        i18 = zf1Var.f85378a;
                                        if (i18 != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = true;
                                        }
                                        z12 = !z11;
                                        bn1 bn1Var8 = this.f79917h;
                                        bn1Var8.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var8.a(cuVar.f76430g), bn1Var8.a(cuVar.f76431h)), iOException, z12);
                                        if (z12) {
                                            this.f79926q = null;
                                            this.f79918i.getClass();
                                            this.f79916g.a(this);
                                        }
                                        return zf1Var;
                                    }
                                }
                            }
                        } else {
                            lc0Var = nc0Var.f80629h[nc0Var.f80630i.a(cuVar.f76427d)];
                            uoVarB = nc0Var.f80623b.b(lc0Var.f79744b.f79869b);
                            if (uoVarB != null || lc0Var.f79745c.equals(uoVarB)) {
                                op0Var = nc0Var.f80630i;
                                p51Var = lc0Var.f79744b.f79869b;
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                iF = op0Var.f();
                                i12 = 0;
                                while (i11 < iF) {
                                    if (op0Var.b(i11, jElapsedRealtime)) {
                                        i12++;
                                    }
                                }
                                hashSet = new HashSet();
                                while (i13 < p51Var.size()) {
                                    hashSet.add(Integer.valueOf(((uo) p51Var.get(i13)).f83551c));
                                }
                                int size4 = hashSet.size();
                                vo voVar4 = nc0Var.f80623b;
                                voVar4.getClass();
                                hashSet2 = new HashSet();
                                arrayListA = voVar4.a(p51Var);
                                vf1Var = vf1Var2;
                                while (i14 < arrayListA.size()) {
                                    hashSet2.add(Integer.valueOf(((uo) arrayListA.get(i14)).f83551c));
                                }
                                tf1Var = new tf1(size4, size4 - hashSet2.size(), iF, i12);
                                if (!tf1Var.a(2) || tf1Var.a(1)) {
                                    ae0Var.getClass();
                                    if ((iOException instanceof s11) || !((i17 = ((s11) iOException).f82491e) == 403 || i17 == 404 || i17 == 410 || i17 == 416 || i17 == 500 || i17 == 503)) {
                                        uf1Var = null;
                                    } else if (tf1Var.a(1)) {
                                        uf1Var = new uf1(1, 300000L);
                                    } else if (tf1Var.a(2)) {
                                        uf1Var = new uf1(2, 60000L);
                                    } else {
                                        uf1Var = null;
                                    }
                                    if (uf1Var != null && tf1Var.a(uf1Var.f83457a)) {
                                        i15 = uf1Var.f83457a;
                                        if (i15 == 2) {
                                            op0Var2 = nc0Var.f80630i;
                                            if (op0Var2.a(op0Var2.a(cuVar.f76427d), uf1Var.f83458b)) {
                                            }
                                            if (zf1Var == null) {
                                                this.f79918i.getClass();
                                                if (!(iOException instanceof ob2) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof p11) && !(iOException instanceof eg1)) {
                                                    int i28 = q30.f81691c;
                                                    Throwable cause = iOException;
                                                    while (true) {
                                                        if (cause != null) {
                                                            if ((cause instanceof q30) && ((q30) cause).f81692b == 2008) {
                                                                jMin = -9223372036854775807L;
                                                                break;
                                                            }
                                                            cause = cause.getCause();
                                                        } else {
                                                            jMin = Math.min((i10 - 1) * 1000, 5000);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    jMin = -9223372036854775807L;
                                                    break;
                                                }
                                                if (jMin != -9223372036854775807L) {
                                                    z10 = false;
                                                    zf1Var = new zf1(0, jMin);
                                                } else {
                                                    z10 = false;
                                                    zf1Var = fg1.f77389e;
                                                }
                                            } else {
                                                z10 = false;
                                            }
                                            i18 = zf1Var.f85378a;
                                            if (i18 != 0 || i18 == 1) {
                                                z11 = true;
                                            } else {
                                                z11 = z10;
                                            }
                                            z12 = !z11;
                                            bn1 bn1Var9 = this.f79917h;
                                            bn1Var9.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var9.a(cuVar.f76430g), bn1Var9.a(cuVar.f76431h)), iOException, z12);
                                            if (z12) {
                                                this.f79926q = null;
                                                this.f79918i.getClass();
                                                this.f79916g.a(this);
                                            }
                                            return zf1Var;
                                        }
                                        if (i15 == 1) {
                                            voVar = nc0Var.f80623b;
                                            uo uoVar5 = lc0Var.f79745c;
                                            long j19 = uf1Var.f83458b;
                                            voVar.getClass();
                                            jElapsedRealtime2 = SystemClock.elapsedRealtime() + j19;
                                            str = uoVar5.f83550b;
                                            map = voVar.f83966a;
                                            if (map.containsKey(str)) {
                                                Long l18 = (Long) map.get(str);
                                                int i29 = ib3.f78556a;
                                                jMax = Math.max(jElapsedRealtime2, l18.longValue());
                                            } else {
                                                jMax = jElapsedRealtime2;
                                            }
                                            map.put(str, Long.valueOf(jMax));
                                            i16 = uoVar5.f83551c;
                                            if (i16 != Integer.MIN_VALUE) {
                                                numValueOf = Integer.valueOf(i16);
                                                map2 = voVar.f83967b;
                                                if (map2.containsKey(numValueOf)) {
                                                    Long l19 = (Long) map2.get(numValueOf);
                                                    int i210 = ib3.f78556a;
                                                    jElapsedRealtime2 = Math.max(jElapsedRealtime2, l19.longValue());
                                                }
                                                map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                            }
                                        }
                                        if (zf1Var == null) {
                                            this.f79918i.getClass();
                                            if (!(iOException instanceof ob2)) {
                                                jMin = -9223372036854775807L;
                                                break;
                                            }
                                            jMin = -9223372036854775807L;
                                            break;
                                            if (jMin != -9223372036854775807L) {
                                                z10 = false;
                                                zf1Var = new zf1(0, jMin);
                                            } else {
                                                z10 = false;
                                                zf1Var = fg1.f77389e;
                                            }
                                        } else {
                                            z10 = false;
                                        }
                                        i18 = zf1Var.f85378a;
                                        if (i18 != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = true;
                                        }
                                        z12 = !z11;
                                        bn1 bn1Var10 = this.f79917h;
                                        bn1Var10.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var10.a(cuVar.f76430g), bn1Var10.a(cuVar.f76431h)), iOException, z12);
                                        if (z12) {
                                            this.f79926q = null;
                                            this.f79918i.getClass();
                                            this.f79916g.a(this);
                                        }
                                        return zf1Var;
                                    }
                                }
                            }
                            if (z14) {
                                zf1Var = fg1.f77388d;
                                if (z13) {
                                    if (a(size) == cuVar) {
                                        if (this.f79921l.isEmpty()) {
                                            this.f79929t = this.f79930u;
                                        }
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                }
                            } else {
                                ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                            }
                            if (zf1Var == null) {
                                this.f79918i.getClass();
                                if (!(iOException instanceof ob2)) {
                                    jMin = -9223372036854775807L;
                                    break;
                                }
                                jMin = -9223372036854775807L;
                                break;
                                if (jMin != -9223372036854775807L) {
                                    z10 = false;
                                    zf1Var = new zf1(0, jMin);
                                } else {
                                    z10 = false;
                                    zf1Var = fg1.f77389e;
                                }
                            } else {
                                z10 = false;
                            }
                            i18 = zf1Var.f85378a;
                            if (i18 != 0) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            z12 = !z11;
                            bn1 bn1Var11 = this.f79917h;
                            bn1Var11.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var11.a(cuVar.f76430g), bn1Var11.a(cuVar.f76431h)), iOException, z12);
                            if (z12) {
                                this.f79926q = null;
                                this.f79918i.getClass();
                                this.f79916g.a(this);
                            }
                            return zf1Var;
                        }
                    }
                    vf1Var = vf1Var2;
                    if (z14) {
                        zf1Var = fg1.f77388d;
                        if (z13) {
                            if (a(size) == cuVar) {
                                if (this.f79921l.isEmpty()) {
                                    this.f79929t = this.f79930u;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                    } else {
                        ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                    }
                    if (zf1Var == null) {
                        this.f79918i.getClass();
                        if (!(iOException instanceof ob2)) {
                            jMin = -9223372036854775807L;
                            break;
                        }
                        jMin = -9223372036854775807L;
                        break;
                        if (jMin != -9223372036854775807L) {
                            z10 = false;
                            zf1Var = new zf1(0, jMin);
                        } else {
                            z10 = false;
                            zf1Var = fg1.f77389e;
                        }
                    } else {
                        z10 = false;
                    }
                    i18 = zf1Var.f85378a;
                    if (i18 != 0) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    z12 = !z11;
                    bn1 bn1Var12 = this.f79917h;
                    bn1Var12.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var12.a(cuVar.f76430g), bn1Var12.a(cuVar.f76431h)), iOException, z12);
                    if (z12) {
                        this.f79926q = null;
                        this.f79918i.getClass();
                        this.f79916g.a(this);
                    }
                    return zf1Var;
                }
                if (nc0Var.f80631j.f76128d) {
                    lc0Var = nc0Var.f80629h[nc0Var.f80630i.a(cuVar.f76427d)];
                    uoVarB = nc0Var.f80623b.b(lc0Var.f79744b.f79869b);
                    if (uoVarB != null) {
                    }
                    op0Var = nc0Var.f80630i;
                    p51Var = lc0Var.f79744b.f79869b;
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    iF = op0Var.f();
                    i12 = 0;
                    while (i11 < iF) {
                        if (op0Var.b(i11, jElapsedRealtime)) {
                            i12++;
                        }
                    }
                    hashSet = new HashSet();
                    while (i13 < p51Var.size()) {
                        hashSet.add(Integer.valueOf(((uo) p51Var.get(i13)).f83551c));
                    }
                    int size5 = hashSet.size();
                    vo voVar5 = nc0Var.f80623b;
                    voVar5.getClass();
                    hashSet2 = new HashSet();
                    arrayListA = voVar5.a(p51Var);
                    vf1Var = vf1Var2;
                    while (i14 < arrayListA.size()) {
                        hashSet2.add(Integer.valueOf(((uo) arrayListA.get(i14)).f83551c));
                    }
                    tf1Var = new tf1(size5, size5 - hashSet2.size(), iF, i12);
                    if (!tf1Var.a(2)) {
                        ae0Var.getClass();
                        if (iOException instanceof s11) {
                            uf1Var = null;
                        } else if (tf1Var.a(1)) {
                            uf1Var = new uf1(1, 300000L);
                        } else if (tf1Var.a(2)) {
                            uf1Var = new uf1(2, 60000L);
                        } else {
                            uf1Var = null;
                        }
                        if (uf1Var != null) {
                            i15 = uf1Var.f83457a;
                            if (i15 == 2) {
                                op0Var2 = nc0Var.f80630i;
                                if (op0Var2.a(op0Var2.a(cuVar.f76427d), uf1Var.f83458b)) {
                                    if (z14) {
                                        zf1Var = fg1.f77388d;
                                        if (z13) {
                                            if (a(size) == cuVar) {
                                                if (this.f79921l.isEmpty()) {
                                                    this.f79929t = this.f79930u;
                                                }
                                            } else {
                                                throw new IllegalStateException();
                                            }
                                        }
                                    } else {
                                        ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                                    }
                                }
                                if (zf1Var == null) {
                                    this.f79918i.getClass();
                                    if (!(iOException instanceof ob2)) {
                                        jMin = -9223372036854775807L;
                                        break;
                                    }
                                    jMin = -9223372036854775807L;
                                    break;
                                    if (jMin != -9223372036854775807L) {
                                        z10 = false;
                                        zf1Var = new zf1(0, jMin);
                                    } else {
                                        z10 = false;
                                        zf1Var = fg1.f77389e;
                                    }
                                } else {
                                    z10 = false;
                                }
                                i18 = zf1Var.f85378a;
                                if (i18 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = true;
                                }
                                z12 = !z11;
                                bn1 bn1Var13 = this.f79917h;
                                bn1Var13.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var13.a(cuVar.f76430g), bn1Var13.a(cuVar.f76431h)), iOException, z12);
                                if (z12) {
                                    this.f79926q = null;
                                    this.f79918i.getClass();
                                    this.f79916g.a(this);
                                }
                                return zf1Var;
                            }
                            if (i15 == 1) {
                                voVar = nc0Var.f80623b;
                                uo uoVar6 = lc0Var.f79745c;
                                long j110 = uf1Var.f83458b;
                                voVar.getClass();
                                jElapsedRealtime2 = SystemClock.elapsedRealtime() + j110;
                                str = uoVar6.f83550b;
                                map = voVar.f83966a;
                                if (map.containsKey(str)) {
                                    Long l110 = (Long) map.get(str);
                                    int i211 = ib3.f78556a;
                                    jMax = Math.max(jElapsedRealtime2, l110.longValue());
                                } else {
                                    jMax = jElapsedRealtime2;
                                }
                                map.put(str, Long.valueOf(jMax));
                                i16 = uoVar6.f83551c;
                                if (i16 != Integer.MIN_VALUE) {
                                    numValueOf = Integer.valueOf(i16);
                                    map2 = voVar.f83967b;
                                    if (map2.containsKey(numValueOf)) {
                                        Long l111 = (Long) map2.get(numValueOf);
                                        int i212 = ib3.f78556a;
                                        jElapsedRealtime2 = Math.max(jElapsedRealtime2, l111.longValue());
                                    }
                                    map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                }
                                if (z14) {
                                    zf1Var = fg1.f77388d;
                                    if (z13) {
                                        if (a(size) == cuVar) {
                                            if (this.f79921l.isEmpty()) {
                                                this.f79929t = this.f79930u;
                                            }
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    }
                                } else {
                                    ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                                }
                            }
                            if (zf1Var == null) {
                                this.f79918i.getClass();
                                if (!(iOException instanceof ob2)) {
                                    jMin = -9223372036854775807L;
                                    break;
                                }
                                jMin = -9223372036854775807L;
                                break;
                                if (jMin != -9223372036854775807L) {
                                    z10 = false;
                                    zf1Var = new zf1(0, jMin);
                                } else {
                                    z10 = false;
                                    zf1Var = fg1.f77389e;
                                }
                            } else {
                                z10 = false;
                            }
                            i18 = zf1Var.f85378a;
                            if (i18 != 0) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            z12 = !z11;
                            bn1 bn1Var14 = this.f79917h;
                            bn1Var14.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var14.a(cuVar.f76430g), bn1Var14.a(cuVar.f76431h)), iOException, z12);
                            if (z12) {
                                this.f79926q = null;
                                this.f79918i.getClass();
                                this.f79916g.a(this);
                            }
                            return zf1Var;
                        }
                    } else {
                        ae0Var.getClass();
                        if (iOException instanceof s11) {
                            uf1Var = null;
                        } else if (tf1Var.a(1)) {
                            uf1Var = new uf1(1, 300000L);
                        } else if (tf1Var.a(2)) {
                            uf1Var = new uf1(2, 60000L);
                        } else {
                            uf1Var = null;
                        }
                        if (uf1Var != null) {
                            i15 = uf1Var.f83457a;
                            if (i15 == 2) {
                                op0Var2 = nc0Var.f80630i;
                                if (op0Var2.a(op0Var2.a(cuVar.f76427d), uf1Var.f83458b)) {
                                    if (z14) {
                                        zf1Var = fg1.f77388d;
                                        if (z13) {
                                            if (a(size) == cuVar) {
                                                if (this.f79921l.isEmpty()) {
                                                    this.f79929t = this.f79930u;
                                                }
                                            } else {
                                                throw new IllegalStateException();
                                            }
                                        }
                                    } else {
                                        ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                                    }
                                }
                                if (zf1Var == null) {
                                    this.f79918i.getClass();
                                    if (!(iOException instanceof ob2)) {
                                        jMin = -9223372036854775807L;
                                        break;
                                    }
                                    jMin = -9223372036854775807L;
                                    break;
                                    if (jMin != -9223372036854775807L) {
                                        z10 = false;
                                        zf1Var = new zf1(0, jMin);
                                    } else {
                                        z10 = false;
                                        zf1Var = fg1.f77389e;
                                    }
                                } else {
                                    z10 = false;
                                }
                                i18 = zf1Var.f85378a;
                                if (i18 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = true;
                                }
                                z12 = !z11;
                                bn1 bn1Var15 = this.f79917h;
                                bn1Var15.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var15.a(cuVar.f76430g), bn1Var15.a(cuVar.f76431h)), iOException, z12);
                                if (z12) {
                                    this.f79926q = null;
                                    this.f79918i.getClass();
                                    this.f79916g.a(this);
                                }
                                return zf1Var;
                            }
                            if (i15 == 1) {
                                voVar = nc0Var.f80623b;
                                uo uoVar7 = lc0Var.f79745c;
                                long j111 = uf1Var.f83458b;
                                voVar.getClass();
                                jElapsedRealtime2 = SystemClock.elapsedRealtime() + j111;
                                str = uoVar7.f83550b;
                                map = voVar.f83966a;
                                if (map.containsKey(str)) {
                                    Long l112 = (Long) map.get(str);
                                    int i213 = ib3.f78556a;
                                    jMax = Math.max(jElapsedRealtime2, l112.longValue());
                                } else {
                                    jMax = jElapsedRealtime2;
                                }
                                map.put(str, Long.valueOf(jMax));
                                i16 = uoVar7.f83551c;
                                if (i16 != Integer.MIN_VALUE) {
                                    numValueOf = Integer.valueOf(i16);
                                    map2 = voVar.f83967b;
                                    if (map2.containsKey(numValueOf)) {
                                        Long l113 = (Long) map2.get(numValueOf);
                                        int i214 = ib3.f78556a;
                                        jElapsedRealtime2 = Math.max(jElapsedRealtime2, l113.longValue());
                                    }
                                    map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                }
                                if (z14) {
                                    zf1Var = fg1.f77388d;
                                    if (z13) {
                                        if (a(size) == cuVar) {
                                            if (this.f79921l.isEmpty()) {
                                                this.f79929t = this.f79930u;
                                            }
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    }
                                } else {
                                    ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                                }
                            }
                            if (zf1Var == null) {
                                this.f79918i.getClass();
                                if (!(iOException instanceof ob2)) {
                                    jMin = -9223372036854775807L;
                                    break;
                                }
                                jMin = -9223372036854775807L;
                                break;
                                if (jMin != -9223372036854775807L) {
                                    z10 = false;
                                    zf1Var = new zf1(0, jMin);
                                } else {
                                    z10 = false;
                                    zf1Var = fg1.f77389e;
                                }
                            } else {
                                z10 = false;
                            }
                            i18 = zf1Var.f85378a;
                            if (i18 != 0) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            z12 = !z11;
                            bn1 bn1Var16 = this.f79917h;
                            bn1Var16.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var16.a(cuVar.f76430g), bn1Var16.a(cuVar.f76431h)), iOException, z12);
                            if (z12) {
                                this.f79926q = null;
                                this.f79918i.getClass();
                                this.f79916g.a(this);
                            }
                            return zf1Var;
                        }
                    }
                } else {
                    lc0Var = nc0Var.f80629h[nc0Var.f80630i.a(cuVar.f76427d)];
                    uoVarB = nc0Var.f80623b.b(lc0Var.f79744b.f79869b);
                    if (uoVarB != null) {
                    }
                    op0Var = nc0Var.f80630i;
                    p51Var = lc0Var.f79744b.f79869b;
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    iF = op0Var.f();
                    i12 = 0;
                    while (i11 < iF) {
                        if (op0Var.b(i11, jElapsedRealtime)) {
                            i12++;
                        }
                    }
                    hashSet = new HashSet();
                    while (i13 < p51Var.size()) {
                        hashSet.add(Integer.valueOf(((uo) p51Var.get(i13)).f83551c));
                    }
                    int size6 = hashSet.size();
                    vo voVar6 = nc0Var.f80623b;
                    voVar6.getClass();
                    hashSet2 = new HashSet();
                    arrayListA = voVar6.a(p51Var);
                    vf1Var = vf1Var2;
                    while (i14 < arrayListA.size()) {
                        hashSet2.add(Integer.valueOf(((uo) arrayListA.get(i14)).f83551c));
                    }
                    tf1Var = new tf1(size6, size6 - hashSet2.size(), iF, i12);
                    if (!tf1Var.a(2)) {
                        ae0Var.getClass();
                        if (iOException instanceof s11) {
                            uf1Var = null;
                        } else if (tf1Var.a(1)) {
                            uf1Var = new uf1(1, 300000L);
                        } else if (tf1Var.a(2)) {
                            uf1Var = new uf1(2, 60000L);
                        } else {
                            uf1Var = null;
                        }
                        if (uf1Var != null) {
                            i15 = uf1Var.f83457a;
                            if (i15 == 2) {
                                op0Var2 = nc0Var.f80630i;
                                if (op0Var2.a(op0Var2.a(cuVar.f76427d), uf1Var.f83458b)) {
                                    if (z14) {
                                        zf1Var = fg1.f77388d;
                                        if (z13) {
                                            if (a(size) == cuVar) {
                                                if (this.f79921l.isEmpty()) {
                                                    this.f79929t = this.f79930u;
                                                }
                                            } else {
                                                throw new IllegalStateException();
                                            }
                                        }
                                    } else {
                                        ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                                    }
                                }
                                if (zf1Var == null) {
                                    this.f79918i.getClass();
                                    if (!(iOException instanceof ob2)) {
                                        jMin = -9223372036854775807L;
                                        break;
                                    }
                                    jMin = -9223372036854775807L;
                                    break;
                                    if (jMin != -9223372036854775807L) {
                                        z10 = false;
                                        zf1Var = new zf1(0, jMin);
                                    } else {
                                        z10 = false;
                                        zf1Var = fg1.f77389e;
                                    }
                                } else {
                                    z10 = false;
                                }
                                i18 = zf1Var.f85378a;
                                if (i18 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = true;
                                }
                                z12 = !z11;
                                bn1 bn1Var17 = this.f79917h;
                                bn1Var17.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var17.a(cuVar.f76430g), bn1Var17.a(cuVar.f76431h)), iOException, z12);
                                if (z12) {
                                    this.f79926q = null;
                                    this.f79918i.getClass();
                                    this.f79916g.a(this);
                                }
                                return zf1Var;
                            }
                            if (i15 == 1) {
                                voVar = nc0Var.f80623b;
                                uo uoVar8 = lc0Var.f79745c;
                                long j112 = uf1Var.f83458b;
                                voVar.getClass();
                                jElapsedRealtime2 = SystemClock.elapsedRealtime() + j112;
                                str = uoVar8.f83550b;
                                map = voVar.f83966a;
                                if (map.containsKey(str)) {
                                    Long l114 = (Long) map.get(str);
                                    int i215 = ib3.f78556a;
                                    jMax = Math.max(jElapsedRealtime2, l114.longValue());
                                } else {
                                    jMax = jElapsedRealtime2;
                                }
                                map.put(str, Long.valueOf(jMax));
                                i16 = uoVar8.f83551c;
                                if (i16 != Integer.MIN_VALUE) {
                                    numValueOf = Integer.valueOf(i16);
                                    map2 = voVar.f83967b;
                                    if (map2.containsKey(numValueOf)) {
                                        Long l115 = (Long) map2.get(numValueOf);
                                        int i216 = ib3.f78556a;
                                        jElapsedRealtime2 = Math.max(jElapsedRealtime2, l115.longValue());
                                    }
                                    map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                }
                                if (z14) {
                                    zf1Var = fg1.f77388d;
                                    if (z13) {
                                        if (a(size) == cuVar) {
                                            if (this.f79921l.isEmpty()) {
                                                this.f79929t = this.f79930u;
                                            }
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    }
                                } else {
                                    ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                                }
                            }
                            if (zf1Var == null) {
                                this.f79918i.getClass();
                                if (!(iOException instanceof ob2)) {
                                    jMin = -9223372036854775807L;
                                    break;
                                }
                                jMin = -9223372036854775807L;
                                break;
                                if (jMin != -9223372036854775807L) {
                                    z10 = false;
                                    zf1Var = new zf1(0, jMin);
                                } else {
                                    z10 = false;
                                    zf1Var = fg1.f77389e;
                                }
                            } else {
                                z10 = false;
                            }
                            i18 = zf1Var.f85378a;
                            if (i18 != 0) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            z12 = !z11;
                            bn1 bn1Var18 = this.f79917h;
                            bn1Var18.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var18.a(cuVar.f76430g), bn1Var18.a(cuVar.f76431h)), iOException, z12);
                            if (z12) {
                                this.f79926q = null;
                                this.f79918i.getClass();
                                this.f79916g.a(this);
                            }
                            return zf1Var;
                        }
                    } else {
                        ae0Var.getClass();
                        if (iOException instanceof s11) {
                            uf1Var = null;
                        } else if (tf1Var.a(1)) {
                            uf1Var = new uf1(1, 300000L);
                        } else if (tf1Var.a(2)) {
                            uf1Var = new uf1(2, 60000L);
                        } else {
                            uf1Var = null;
                        }
                        if (uf1Var != null) {
                            i15 = uf1Var.f83457a;
                            if (i15 == 2) {
                                op0Var2 = nc0Var.f80630i;
                                if (op0Var2.a(op0Var2.a(cuVar.f76427d), uf1Var.f83458b)) {
                                    if (z14) {
                                        zf1Var = fg1.f77388d;
                                        if (z13) {
                                            if (a(size) == cuVar) {
                                                if (this.f79921l.isEmpty()) {
                                                    this.f79929t = this.f79930u;
                                                }
                                            } else {
                                                throw new IllegalStateException();
                                            }
                                        }
                                    } else {
                                        ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                                    }
                                }
                                if (zf1Var == null) {
                                    this.f79918i.getClass();
                                    if (!(iOException instanceof ob2)) {
                                        jMin = -9223372036854775807L;
                                        break;
                                    }
                                    jMin = -9223372036854775807L;
                                    break;
                                    if (jMin != -9223372036854775807L) {
                                        z10 = false;
                                        zf1Var = new zf1(0, jMin);
                                    } else {
                                        z10 = false;
                                        zf1Var = fg1.f77389e;
                                    }
                                } else {
                                    z10 = false;
                                }
                                i18 = zf1Var.f85378a;
                                if (i18 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = true;
                                }
                                z12 = !z11;
                                bn1 bn1Var19 = this.f79917h;
                                bn1Var19.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var19.a(cuVar.f76430g), bn1Var19.a(cuVar.f76431h)), iOException, z12);
                                if (z12) {
                                    this.f79926q = null;
                                    this.f79918i.getClass();
                                    this.f79916g.a(this);
                                }
                                return zf1Var;
                            }
                            if (i15 == 1) {
                                voVar = nc0Var.f80623b;
                                uo uoVar9 = lc0Var.f79745c;
                                long j113 = uf1Var.f83458b;
                                voVar.getClass();
                                jElapsedRealtime2 = SystemClock.elapsedRealtime() + j113;
                                str = uoVar9.f83550b;
                                map = voVar.f83966a;
                                if (map.containsKey(str)) {
                                    Long l116 = (Long) map.get(str);
                                    int i217 = ib3.f78556a;
                                    jMax = Math.max(jElapsedRealtime2, l116.longValue());
                                } else {
                                    jMax = jElapsedRealtime2;
                                }
                                map.put(str, Long.valueOf(jMax));
                                i16 = uoVar9.f83551c;
                                if (i16 != Integer.MIN_VALUE) {
                                    numValueOf = Integer.valueOf(i16);
                                    map2 = voVar.f83967b;
                                    if (map2.containsKey(numValueOf)) {
                                        Long l117 = (Long) map2.get(numValueOf);
                                        int i218 = ib3.f78556a;
                                        jElapsedRealtime2 = Math.max(jElapsedRealtime2, l117.longValue());
                                    }
                                    map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                }
                                if (z14) {
                                    zf1Var = fg1.f77388d;
                                    if (z13) {
                                        if (a(size) == cuVar) {
                                            if (this.f79921l.isEmpty()) {
                                                this.f79929t = this.f79930u;
                                            }
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    }
                                } else {
                                    ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                                }
                            }
                            if (zf1Var == null) {
                                this.f79918i.getClass();
                                if (!(iOException instanceof ob2)) {
                                    jMin = -9223372036854775807L;
                                    break;
                                }
                                jMin = -9223372036854775807L;
                                break;
                                if (jMin != -9223372036854775807L) {
                                    z10 = false;
                                    zf1Var = new zf1(0, jMin);
                                } else {
                                    z10 = false;
                                    zf1Var = fg1.f77389e;
                                }
                            } else {
                                z10 = false;
                            }
                            i18 = zf1Var.f85378a;
                            if (i18 != 0) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            z12 = !z11;
                            bn1 bn1Var110 = this.f79917h;
                            bn1Var110.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var110.a(cuVar.f76430g), bn1Var110.a(cuVar.f76431h)), iOException, z12);
                            if (z12) {
                                this.f79926q = null;
                                this.f79918i.getClass();
                                this.f79916g.a(this);
                            }
                            return zf1Var;
                        }
                    }
                }
            } else if (nc0Var.f80631j.f76128d) {
                lc0Var = nc0Var.f80629h[nc0Var.f80630i.a(cuVar.f76427d)];
                uoVarB = nc0Var.f80623b.b(lc0Var.f79744b.f79869b);
                if (uoVarB != null) {
                }
                op0Var = nc0Var.f80630i;
                p51Var = lc0Var.f79744b.f79869b;
                jElapsedRealtime = SystemClock.elapsedRealtime();
                iF = op0Var.f();
                i12 = 0;
                while (i11 < iF) {
                    if (op0Var.b(i11, jElapsedRealtime)) {
                        i12++;
                    }
                }
                hashSet = new HashSet();
                while (i13 < p51Var.size()) {
                    hashSet.add(Integer.valueOf(((uo) p51Var.get(i13)).f83551c));
                }
                int size7 = hashSet.size();
                vo voVar7 = nc0Var.f80623b;
                voVar7.getClass();
                hashSet2 = new HashSet();
                arrayListA = voVar7.a(p51Var);
                vf1Var = vf1Var2;
                while (i14 < arrayListA.size()) {
                    hashSet2.add(Integer.valueOf(((uo) arrayListA.get(i14)).f83551c));
                }
                tf1Var = new tf1(size7, size7 - hashSet2.size(), iF, i12);
                if (!tf1Var.a(2)) {
                    ae0Var.getClass();
                    if (iOException instanceof s11) {
                        uf1Var = null;
                    } else if (tf1Var.a(1)) {
                        uf1Var = new uf1(1, 300000L);
                    } else if (tf1Var.a(2)) {
                        uf1Var = new uf1(2, 60000L);
                    } else {
                        uf1Var = null;
                    }
                    if (uf1Var != null) {
                        i15 = uf1Var.f83457a;
                        if (i15 == 2) {
                            op0Var2 = nc0Var.f80630i;
                            if (op0Var2.a(op0Var2.a(cuVar.f76427d), uf1Var.f83458b)) {
                                if (z14) {
                                    zf1Var = fg1.f77388d;
                                    if (z13) {
                                        if (a(size) == cuVar) {
                                            if (this.f79921l.isEmpty()) {
                                                this.f79929t = this.f79930u;
                                            }
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    }
                                } else {
                                    ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                                }
                            }
                            if (zf1Var == null) {
                                this.f79918i.getClass();
                                if (!(iOException instanceof ob2)) {
                                    jMin = -9223372036854775807L;
                                    break;
                                }
                                jMin = -9223372036854775807L;
                                break;
                                if (jMin != -9223372036854775807L) {
                                    z10 = false;
                                    zf1Var = new zf1(0, jMin);
                                } else {
                                    z10 = false;
                                    zf1Var = fg1.f77389e;
                                }
                            } else {
                                z10 = false;
                            }
                            i18 = zf1Var.f85378a;
                            if (i18 != 0) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            z12 = !z11;
                            bn1 bn1Var111 = this.f79917h;
                            bn1Var111.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var111.a(cuVar.f76430g), bn1Var111.a(cuVar.f76431h)), iOException, z12);
                            if (z12) {
                                this.f79926q = null;
                                this.f79918i.getClass();
                                this.f79916g.a(this);
                            }
                            return zf1Var;
                        }
                        if (i15 == 1) {
                            voVar = nc0Var.f80623b;
                            uo uoVar10 = lc0Var.f79745c;
                            long j114 = uf1Var.f83458b;
                            voVar.getClass();
                            jElapsedRealtime2 = SystemClock.elapsedRealtime() + j114;
                            str = uoVar10.f83550b;
                            map = voVar.f83966a;
                            if (map.containsKey(str)) {
                                Long l118 = (Long) map.get(str);
                                int i219 = ib3.f78556a;
                                jMax = Math.max(jElapsedRealtime2, l118.longValue());
                            } else {
                                jMax = jElapsedRealtime2;
                            }
                            map.put(str, Long.valueOf(jMax));
                            i16 = uoVar10.f83551c;
                            if (i16 != Integer.MIN_VALUE) {
                                numValueOf = Integer.valueOf(i16);
                                map2 = voVar.f83967b;
                                if (map2.containsKey(numValueOf)) {
                                    Long l119 = (Long) map2.get(numValueOf);
                                    int i2110 = ib3.f78556a;
                                    jElapsedRealtime2 = Math.max(jElapsedRealtime2, l119.longValue());
                                }
                                map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                            }
                            if (z14) {
                                zf1Var = fg1.f77388d;
                                if (z13) {
                                    if (a(size) == cuVar) {
                                        if (this.f79921l.isEmpty()) {
                                            this.f79929t = this.f79930u;
                                        }
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                }
                            } else {
                                ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                            }
                        }
                        if (zf1Var == null) {
                            this.f79918i.getClass();
                            if (!(iOException instanceof ob2)) {
                                jMin = -9223372036854775807L;
                                break;
                            }
                            jMin = -9223372036854775807L;
                            break;
                            if (jMin != -9223372036854775807L) {
                                z10 = false;
                                zf1Var = new zf1(0, jMin);
                            } else {
                                z10 = false;
                                zf1Var = fg1.f77389e;
                            }
                        } else {
                            z10 = false;
                        }
                        i18 = zf1Var.f85378a;
                        if (i18 != 0) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        z12 = !z11;
                        bn1 bn1Var112 = this.f79917h;
                        bn1Var112.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var112.a(cuVar.f76430g), bn1Var112.a(cuVar.f76431h)), iOException, z12);
                        if (z12) {
                            this.f79926q = null;
                            this.f79918i.getClass();
                            this.f79916g.a(this);
                        }
                        return zf1Var;
                    }
                } else {
                    ae0Var.getClass();
                    if (iOException instanceof s11) {
                        uf1Var = null;
                    } else if (tf1Var.a(1)) {
                        uf1Var = new uf1(1, 300000L);
                    } else if (tf1Var.a(2)) {
                        uf1Var = new uf1(2, 60000L);
                    } else {
                        uf1Var = null;
                    }
                    if (uf1Var != null) {
                        i15 = uf1Var.f83457a;
                        if (i15 == 2) {
                            op0Var2 = nc0Var.f80630i;
                            if (op0Var2.a(op0Var2.a(cuVar.f76427d), uf1Var.f83458b)) {
                                if (z14) {
                                    zf1Var = fg1.f77388d;
                                    if (z13) {
                                        if (a(size) == cuVar) {
                                            if (this.f79921l.isEmpty()) {
                                                this.f79929t = this.f79930u;
                                            }
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    }
                                } else {
                                    ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                                }
                            }
                            if (zf1Var == null) {
                                this.f79918i.getClass();
                                if (!(iOException instanceof ob2)) {
                                    jMin = -9223372036854775807L;
                                    break;
                                }
                                jMin = -9223372036854775807L;
                                break;
                                if (jMin != -9223372036854775807L) {
                                    z10 = false;
                                    zf1Var = new zf1(0, jMin);
                                } else {
                                    z10 = false;
                                    zf1Var = fg1.f77389e;
                                }
                            } else {
                                z10 = false;
                            }
                            i18 = zf1Var.f85378a;
                            if (i18 != 0) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            z12 = !z11;
                            bn1 bn1Var113 = this.f79917h;
                            bn1Var113.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var113.a(cuVar.f76430g), bn1Var113.a(cuVar.f76431h)), iOException, z12);
                            if (z12) {
                                this.f79926q = null;
                                this.f79918i.getClass();
                                this.f79916g.a(this);
                            }
                            return zf1Var;
                        }
                        if (i15 == 1) {
                            voVar = nc0Var.f80623b;
                            uo uoVar11 = lc0Var.f79745c;
                            long j115 = uf1Var.f83458b;
                            voVar.getClass();
                            jElapsedRealtime2 = SystemClock.elapsedRealtime() + j115;
                            str = uoVar11.f83550b;
                            map = voVar.f83966a;
                            if (map.containsKey(str)) {
                                Long l1110 = (Long) map.get(str);
                                int i2111 = ib3.f78556a;
                                jMax = Math.max(jElapsedRealtime2, l1110.longValue());
                            } else {
                                jMax = jElapsedRealtime2;
                            }
                            map.put(str, Long.valueOf(jMax));
                            i16 = uoVar11.f83551c;
                            if (i16 != Integer.MIN_VALUE) {
                                numValueOf = Integer.valueOf(i16);
                                map2 = voVar.f83967b;
                                if (map2.containsKey(numValueOf)) {
                                    Long l1111 = (Long) map2.get(numValueOf);
                                    int i2112 = ib3.f78556a;
                                    jElapsedRealtime2 = Math.max(jElapsedRealtime2, l1111.longValue());
                                }
                                map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                            }
                            if (z14) {
                                zf1Var = fg1.f77388d;
                                if (z13) {
                                    if (a(size) == cuVar) {
                                        if (this.f79921l.isEmpty()) {
                                            this.f79929t = this.f79930u;
                                        }
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                }
                            } else {
                                ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                            }
                        }
                        if (zf1Var == null) {
                            this.f79918i.getClass();
                            if (!(iOException instanceof ob2)) {
                                jMin = -9223372036854775807L;
                                break;
                            }
                            jMin = -9223372036854775807L;
                            break;
                            if (jMin != -9223372036854775807L) {
                                z10 = false;
                                zf1Var = new zf1(0, jMin);
                            } else {
                                z10 = false;
                                zf1Var = fg1.f77389e;
                            }
                        } else {
                            z10 = false;
                        }
                        i18 = zf1Var.f85378a;
                        if (i18 != 0) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        z12 = !z11;
                        bn1 bn1Var114 = this.f79917h;
                        bn1Var114.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var114.a(cuVar.f76430g), bn1Var114.a(cuVar.f76431h)), iOException, z12);
                        if (z12) {
                            this.f79926q = null;
                            this.f79918i.getClass();
                            this.f79916g.a(this);
                        }
                        return zf1Var;
                    }
                }
            } else {
                lc0Var = nc0Var.f80629h[nc0Var.f80630i.a(cuVar.f76427d)];
                uoVarB = nc0Var.f80623b.b(lc0Var.f79744b.f79869b);
                if (uoVarB != null) {
                }
                op0Var = nc0Var.f80630i;
                p51Var = lc0Var.f79744b.f79869b;
                jElapsedRealtime = SystemClock.elapsedRealtime();
                iF = op0Var.f();
                i12 = 0;
                while (i11 < iF) {
                    if (op0Var.b(i11, jElapsedRealtime)) {
                        i12++;
                    }
                }
                hashSet = new HashSet();
                while (i13 < p51Var.size()) {
                    hashSet.add(Integer.valueOf(((uo) p51Var.get(i13)).f83551c));
                }
                int size8 = hashSet.size();
                vo voVar8 = nc0Var.f80623b;
                voVar8.getClass();
                hashSet2 = new HashSet();
                arrayListA = voVar8.a(p51Var);
                vf1Var = vf1Var2;
                while (i14 < arrayListA.size()) {
                    hashSet2.add(Integer.valueOf(((uo) arrayListA.get(i14)).f83551c));
                }
                tf1Var = new tf1(size8, size8 - hashSet2.size(), iF, i12);
                if (!tf1Var.a(2)) {
                    ae0Var.getClass();
                    if (iOException instanceof s11) {
                        uf1Var = null;
                    } else if (tf1Var.a(1)) {
                        uf1Var = new uf1(1, 300000L);
                    } else if (tf1Var.a(2)) {
                        uf1Var = new uf1(2, 60000L);
                    } else {
                        uf1Var = null;
                    }
                    if (uf1Var != null) {
                        i15 = uf1Var.f83457a;
                        if (i15 == 2) {
                            op0Var2 = nc0Var.f80630i;
                            if (op0Var2.a(op0Var2.a(cuVar.f76427d), uf1Var.f83458b)) {
                                if (z14) {
                                    zf1Var = fg1.f77388d;
                                    if (z13) {
                                        if (a(size) == cuVar) {
                                            if (this.f79921l.isEmpty()) {
                                                this.f79929t = this.f79930u;
                                            }
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    }
                                } else {
                                    ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                                }
                            }
                            if (zf1Var == null) {
                                this.f79918i.getClass();
                                if (!(iOException instanceof ob2)) {
                                    jMin = -9223372036854775807L;
                                    break;
                                }
                                jMin = -9223372036854775807L;
                                break;
                                if (jMin != -9223372036854775807L) {
                                    z10 = false;
                                    zf1Var = new zf1(0, jMin);
                                } else {
                                    z10 = false;
                                    zf1Var = fg1.f77389e;
                                }
                            } else {
                                z10 = false;
                            }
                            i18 = zf1Var.f85378a;
                            if (i18 != 0) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            z12 = !z11;
                            bn1 bn1Var115 = this.f79917h;
                            bn1Var115.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var115.a(cuVar.f76430g), bn1Var115.a(cuVar.f76431h)), iOException, z12);
                            if (z12) {
                                this.f79926q = null;
                                this.f79918i.getClass();
                                this.f79916g.a(this);
                            }
                            return zf1Var;
                        }
                        if (i15 == 1) {
                            voVar = nc0Var.f80623b;
                            uo uoVar12 = lc0Var.f79745c;
                            long j116 = uf1Var.f83458b;
                            voVar.getClass();
                            jElapsedRealtime2 = SystemClock.elapsedRealtime() + j116;
                            str = uoVar12.f83550b;
                            map = voVar.f83966a;
                            if (map.containsKey(str)) {
                                Long l1112 = (Long) map.get(str);
                                int i2113 = ib3.f78556a;
                                jMax = Math.max(jElapsedRealtime2, l1112.longValue());
                            } else {
                                jMax = jElapsedRealtime2;
                            }
                            map.put(str, Long.valueOf(jMax));
                            i16 = uoVar12.f83551c;
                            if (i16 != Integer.MIN_VALUE) {
                                numValueOf = Integer.valueOf(i16);
                                map2 = voVar.f83967b;
                                if (map2.containsKey(numValueOf)) {
                                    Long l1113 = (Long) map2.get(numValueOf);
                                    int i2114 = ib3.f78556a;
                                    jElapsedRealtime2 = Math.max(jElapsedRealtime2, l1113.longValue());
                                }
                                map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                            }
                            if (z14) {
                                zf1Var = fg1.f77388d;
                                if (z13) {
                                    if (a(size) == cuVar) {
                                        if (this.f79921l.isEmpty()) {
                                            this.f79929t = this.f79930u;
                                        }
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                }
                            } else {
                                ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                            }
                        }
                        if (zf1Var == null) {
                            this.f79918i.getClass();
                            if (!(iOException instanceof ob2)) {
                                jMin = -9223372036854775807L;
                                break;
                            }
                            jMin = -9223372036854775807L;
                            break;
                            if (jMin != -9223372036854775807L) {
                                z10 = false;
                                zf1Var = new zf1(0, jMin);
                            } else {
                                z10 = false;
                                zf1Var = fg1.f77389e;
                            }
                        } else {
                            z10 = false;
                        }
                        i18 = zf1Var.f85378a;
                        if (i18 != 0) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        z12 = !z11;
                        bn1 bn1Var116 = this.f79917h;
                        bn1Var116.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var116.a(cuVar.f76430g), bn1Var116.a(cuVar.f76431h)), iOException, z12);
                        if (z12) {
                            this.f79926q = null;
                            this.f79918i.getClass();
                            this.f79916g.a(this);
                        }
                        return zf1Var;
                    }
                } else {
                    ae0Var.getClass();
                    if (iOException instanceof s11) {
                        uf1Var = null;
                    } else if (tf1Var.a(1)) {
                        uf1Var = new uf1(1, 300000L);
                    } else if (tf1Var.a(2)) {
                        uf1Var = new uf1(2, 60000L);
                    } else {
                        uf1Var = null;
                    }
                    if (uf1Var != null) {
                        i15 = uf1Var.f83457a;
                        if (i15 == 2) {
                            op0Var2 = nc0Var.f80630i;
                            if (op0Var2.a(op0Var2.a(cuVar.f76427d), uf1Var.f83458b)) {
                                if (z14) {
                                    zf1Var = fg1.f77388d;
                                    if (z13) {
                                        if (a(size) == cuVar) {
                                            if (this.f79921l.isEmpty()) {
                                                this.f79929t = this.f79930u;
                                            }
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    }
                                } else {
                                    ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                                }
                            }
                            if (zf1Var == null) {
                                this.f79918i.getClass();
                                if (!(iOException instanceof ob2)) {
                                    jMin = -9223372036854775807L;
                                    break;
                                }
                                jMin = -9223372036854775807L;
                                break;
                                if (jMin != -9223372036854775807L) {
                                    z10 = false;
                                    zf1Var = new zf1(0, jMin);
                                } else {
                                    z10 = false;
                                    zf1Var = fg1.f77389e;
                                }
                            } else {
                                z10 = false;
                            }
                            i18 = zf1Var.f85378a;
                            if (i18 != 0) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            z12 = !z11;
                            bn1 bn1Var117 = this.f79917h;
                            bn1Var117.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var117.a(cuVar.f76430g), bn1Var117.a(cuVar.f76431h)), iOException, z12);
                            if (z12) {
                                this.f79926q = null;
                                this.f79918i.getClass();
                                this.f79916g.a(this);
                            }
                            return zf1Var;
                        }
                        if (i15 == 1) {
                            voVar = nc0Var.f80623b;
                            uo uoVar13 = lc0Var.f79745c;
                            long j117 = uf1Var.f83458b;
                            voVar.getClass();
                            jElapsedRealtime2 = SystemClock.elapsedRealtime() + j117;
                            str = uoVar13.f83550b;
                            map = voVar.f83966a;
                            if (map.containsKey(str)) {
                                Long l1114 = (Long) map.get(str);
                                int i2115 = ib3.f78556a;
                                jMax = Math.max(jElapsedRealtime2, l1114.longValue());
                            } else {
                                jMax = jElapsedRealtime2;
                            }
                            map.put(str, Long.valueOf(jMax));
                            i16 = uoVar13.f83551c;
                            if (i16 != Integer.MIN_VALUE) {
                                numValueOf = Integer.valueOf(i16);
                                map2 = voVar.f83967b;
                                if (map2.containsKey(numValueOf)) {
                                    Long l1115 = (Long) map2.get(numValueOf);
                                    int i2116 = ib3.f78556a;
                                    jElapsedRealtime2 = Math.max(jElapsedRealtime2, l1115.longValue());
                                }
                                map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                            }
                            if (z14) {
                                zf1Var = fg1.f77388d;
                                if (z13) {
                                    if (a(size) == cuVar) {
                                        if (this.f79921l.isEmpty()) {
                                            this.f79929t = this.f79930u;
                                        }
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                }
                            } else {
                                ih1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                            }
                        }
                        if (zf1Var == null) {
                            this.f79918i.getClass();
                            if (!(iOException instanceof ob2)) {
                                jMin = -9223372036854775807L;
                                break;
                            }
                            jMin = -9223372036854775807L;
                            break;
                            if (jMin != -9223372036854775807L) {
                                z10 = false;
                                zf1Var = new zf1(0, jMin);
                            } else {
                                z10 = false;
                                zf1Var = fg1.f77389e;
                            }
                        } else {
                            z10 = false;
                        }
                        i18 = zf1Var.f85378a;
                        if (i18 != 0) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        z12 = !z11;
                        bn1 bn1Var118 = this.f79917h;
                        bn1Var118.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var118.a(cuVar.f76430g), bn1Var118.a(cuVar.f76431h)), iOException, z12);
                        if (z12) {
                            this.f79926q = null;
                            this.f79918i.getClass();
                            this.f79916g.a(this);
                        }
                        return zf1Var;
                    }
                }
            }
        } else {
            nc0Var.getClass();
            vf1Var = vf1Var2;
        }
        zf1Var = null;
        if (zf1Var == null) {
            this.f79918i.getClass();
            if (!(iOException instanceof ob2)) {
                jMin = -9223372036854775807L;
                break;
            }
            jMin = -9223372036854775807L;
            break;
            if (jMin != -9223372036854775807L) {
                z10 = false;
                zf1Var = new zf1(0, jMin);
            } else {
                z10 = false;
                zf1Var = fg1.f77389e;
            }
        } else {
            z10 = false;
        }
        i18 = zf1Var.f85378a;
        if (i18 != 0) {
            z11 = true;
        } else {
            z11 = true;
        }
        z12 = !z11;
        bn1 bn1Var119 = this.f79917h;
        bn1Var119.a(vf1Var, new hm1(cuVar.f76426c, this.f79911b, cuVar.f76427d, cuVar.f76428e, cuVar.f76429f, bn1Var119.a(cuVar.f76430g), bn1Var119.a(cuVar.f76431h)), iOException, z12);
        if (z12) {
            this.f79926q = null;
            this.f79918i.getClass();
            this.f79916g.a(this);
        }
        return zf1Var;
    }

    public final int a(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f79921l.size()) {
                return this.f79921l.size() - 1;
            }
        } while (((jo) this.f79921l.get(i11)).a(0) <= i10);
        return i11 - 1;
    }

    @Override // yads.ns2
    public final int a(nx0 nx0Var, sa0 sa0Var, int i10) {
        if (c()) {
            return -3;
        }
        jo joVar = this.f79932w;
        if (joVar != null) {
            int iA = joVar.a(0);
            ms2 ms2Var = this.f79923n;
            if (iA <= ms2Var.f80366q + ms2Var.f80368s) {
                return -3;
            }
        }
        d();
        return this.f79923n.a(nx0Var, sa0Var, i10, this.f79933x);
    }

    @Override // yads.ns2
    public final int a(long j10) {
        if (c()) {
            return 0;
        }
        int iA = this.f79923n.a(j10, this.f79933x);
        jo joVar = this.f79932w;
        if (joVar != null) {
            int iA2 = joVar.a(0);
            ms2 ms2Var = this.f79923n;
            iA = Math.min(iA, iA2 - (ms2Var.f80366q + ms2Var.f80368s));
        }
        ms2 ms2Var2 = this.f79923n;
        synchronized (ms2Var2) {
            if (iA >= 0) {
                int i10 = ms2Var2.f80368s + iA;
                if (i10 <= ms2Var2.f80365p) {
                    ms2Var2.f80368s = i10;
                }
            }
            throw new IllegalArgumentException();
        }
        d();
        return iA;
    }
}
