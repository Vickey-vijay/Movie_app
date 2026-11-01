package yads;

import android.os.Handler;
import android.util.Pair;
import java.util.Collection;

/* JADX INFO: loaded from: classes11.dex */
public final class tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p63 f83086a = new p63();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r63 f83087b = new r63();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final se f83088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f83089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f83090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f83091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f83092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public qm1 f83093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public qm1 f83094i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qm1 f83095j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f83096k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f83097l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f83098m;

    public final qm1 a() {
        qm1 qm1Var = this.f83093h;
        if (qm1Var == null) {
            return null;
        }
        if (qm1Var == this.f83094i) {
            this.f83094i = qm1Var.f81899l;
        }
        qm1Var.b();
        int i10 = this.f83096k - 1;
        this.f83096k = i10;
        if (i10 == 0) {
            this.f83095j = null;
            qm1 qm1Var2 = this.f83093h;
            this.f83097l = qm1Var2.f81889b;
            this.f83098m = qm1Var2.f81893f.f82688a.f82314d;
        }
        this.f83093h = this.f83093h.f81899l;
        c();
        return this.f83093h;
    }

    public final void b() {
        if (this.f83096k == 0) {
            return;
        }
        qm1 qm1Var = this.f83093h;
        if (qm1Var == null) {
            throw new IllegalStateException();
        }
        this.f83097l = qm1Var.f81889b;
        this.f83098m = qm1Var.f81893f.f82688a.f82314d;
        while (qm1Var != null) {
            qm1Var.b();
            qm1Var = qm1Var.f81899l;
        }
        this.f83093h = null;
        this.f83095j = null;
        this.f83094i = null;
        this.f83096k = 0;
        c();
    }

    public tm1(se seVar, Handler handler) {
        this.f83088c = seVar;
        this.f83089d = handler;
    }

    public final void c() {
        final ym1 ym1Var;
        final l51 l51VarF = p51.f();
        for (qm1 qm1Var = this.f83093h; qm1Var != null; qm1Var = qm1Var.f81899l) {
            l51VarF.a(qm1Var.f81893f.f82688a);
        }
        qm1 qm1Var2 = this.f83094i;
        if (qm1Var2 == null) {
            ym1Var = null;
        } else {
            ym1Var = qm1Var2.f81893f.f82688a;
        }
        this.f83089d.post(new Runnable() { // from class: cp.ka
            @Override // java.lang.Runnable
            public final void run() {
                this.f51412b.a(l51VarF, ym1Var);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e3  */
    public final sm1 a(s63 s63Var, qm1 qm1Var, long j10) {
        boolean z10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        boolean z11;
        long j16;
        sm1 sm1Var = qm1Var.f81893f;
        long j17 = (qm1Var.f81902o + sm1Var.f82692e) - j10;
        if (sm1Var.f82694g) {
            int iA = s63Var.a(s63Var.a(sm1Var.f82688a.f82311a), this.f83086a, this.f83087b, this.f83091f, this.f83092g);
            if (iA == -1) {
                return null;
            }
            int i10 = s63Var.a(iA, this.f83086a, true).f81268d;
            Object obj = this.f83086a.f81267c;
            obj.getClass();
            long j18 = sm1Var.f82688a.f82314d;
            long j19 = 0;
            if (s63Var.a(i10, this.f83087b, 0L).f82132p == iA) {
                Pair pairA = s63Var.a(this.f83087b, this.f83086a, i10, -9223372036854775807L, Math.max(0L, j17));
                if (pairA == null) {
                    return null;
                }
                obj = pairA.first;
                long jLongValue = ((Long) pairA.second).longValue();
                qm1 qm1Var2 = qm1Var.f81899l;
                if (qm1Var2 != null && qm1Var2.f81889b.equals(obj)) {
                    j16 = qm1Var2.f81893f.f82688a.f82314d;
                } else {
                    j16 = this.f83090e;
                    this.f83090e = 1 + j16;
                }
                j13 = jLongValue;
                j19 = -9223372036854775807L;
                j18 = j16;
            } else {
                j13 = 0;
            }
            ym1 ym1VarA = a(s63Var, obj, j13, j18, this.f83087b, this.f83086a);
            if (j19 == -9223372036854775807L || sm1Var.f82690c == -9223372036854775807L) {
                j14 = j19;
                j15 = j13;
            } else {
                if (s63Var.a(sm1Var.f82688a.f82311a, this.f83086a).f81272h.f76929c > 0) {
                    e6 e6Var = this.f83086a.f81272h;
                    if (e6Var.a(e6Var.f76932f).f76586h) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                if (ym1VarA.a() && z11) {
                    j14 = sm1Var.f82690c;
                    j15 = j13;
                } else if (z11) {
                    j15 = sm1Var.f82690c;
                    j14 = j19;
                } else {
                    j14 = j19;
                    j15 = j13;
                }
            }
            s63Var.a(ym1VarA.f82311a, this.f83086a);
            if (ym1VarA.a()) {
                return a(s63Var, ym1VarA.f82311a, ym1VarA.f82312b, ym1VarA.f82313c, j14, ym1VarA.f82314d);
            }
            return a(s63Var, ym1VarA.f82311a, j15, j14, ym1VarA.f82314d);
        }
        ym1 ym1Var = sm1Var.f82688a;
        s63Var.a(ym1Var.f82311a, this.f83086a);
        if (ym1Var.a()) {
            int i11 = ym1Var.f82312b;
            int i12 = this.f83086a.f81272h.a(i11).f76581c;
            if (i12 == -1) {
                return null;
            }
            int iA2 = this.f83086a.f81272h.a(i11).a(ym1Var.f82313c);
            if (iA2 < i12) {
                return a(s63Var, ym1Var.f82311a, i11, iA2, sm1Var.f82690c, ym1Var.f82314d);
            }
            long jLongValue2 = sm1Var.f82690c;
            if (jLongValue2 == -9223372036854775807L) {
                r63 r63Var = this.f83087b;
                p63 p63Var = this.f83086a;
                Pair pairA2 = s63Var.a(r63Var, p63Var, p63Var.f81268d, -9223372036854775807L, Math.max(0L, j17));
                if (pairA2 == null) {
                    return null;
                }
                jLongValue2 = ((Long) pairA2.second).longValue();
            }
            Object obj2 = ym1Var.f82311a;
            int i13 = ym1Var.f82312b;
            s63Var.a(obj2, this.f83086a);
            long j20 = this.f83086a.f81272h.a(i13).f76580b;
            if (j20 == Long.MIN_VALUE) {
                j12 = this.f83086a.f81269e;
            } else {
                j12 = this.f83086a.f81272h.a(i13).f76585g + j20;
            }
            return a(s63Var, ym1Var.f82311a, Math.max(j12, jLongValue2), sm1Var.f82690c, ym1Var.f82314d);
        }
        int iA3 = this.f83086a.a(ym1Var.f82315e);
        if (this.f83086a.f81272h.a(ym1Var.f82315e).f76586h) {
            d6 d6VarA = this.f83086a.f81272h.a(ym1Var.f82315e);
            if (d6VarA.f76581c == -1 || d6VarA.f76583e[iA3] != 3) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        if (iA3 != this.f83086a.f81272h.a(ym1Var.f82315e).f76581c && !z10) {
            return a(s63Var, ym1Var.f82311a, ym1Var.f82315e, iA3, sm1Var.f82692e, ym1Var.f82314d);
        }
        Object obj3 = ym1Var.f82311a;
        int i14 = ym1Var.f82315e;
        s63Var.a(obj3, this.f83086a);
        long j21 = this.f83086a.f81272h.a(i14).f76580b;
        if (j21 == Long.MIN_VALUE) {
            j11 = this.f83086a.f81269e;
        } else {
            j11 = j21 + this.f83086a.f81272h.a(i14).f76585g;
        }
        return a(s63Var, ym1Var.f82311a, j11, sm1Var.f82692e, ym1Var.f82314d);
    }

    public final sm1 a(s63 s63Var, Object obj, int i10, int i11, long j10, long j11) {
        ym1 ym1Var = new ym1(obj, i10, i11, j11);
        long jA = s63Var.a(obj, this.f83086a).a(i10, i11);
        long j12 = i11 == this.f83086a.a(i10) ? this.f83086a.f81272h.f76930d : 0L;
        return new sm1(ym1Var, (jA == -9223372036854775807L || j12 < jA) ? j12 : Math.max(0L, jA - 1), j10, -9223372036854775807L, jA, this.f83086a.f81272h.a(i10).f76586h, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:70:0x0104  */
    public final sm1 a(s63 s63Var, Object obj, long j10, long j11, long j12) {
        boolean z10;
        boolean z11;
        boolean z12;
        long j13;
        long j14;
        long j15;
        long jMax;
        s63Var.a(obj, this.f83086a);
        int iA = this.f83086a.a(j10);
        if (iA == -1) {
            e6 e6Var = this.f83086a.f81272h;
            z11 = e6Var.f76929c > 0 && e6Var.a(e6Var.f76932f).f76586h;
        } else {
            if (this.f83086a.f81272h.a(iA).f76586h) {
                long j16 = this.f83086a.f81272h.a(iA).f76580b;
                p63 p63Var = this.f83086a;
                if (j16 == p63Var.f81269e) {
                    d6 d6VarA = p63Var.f81272h.a(iA);
                    if (d6VarA.f76581c != -1) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= d6VarA.f76581c) {
                                z10 = false;
                                break;
                            }
                            int i11 = d6VarA.f76583e[i10];
                            if (i11 == 0 || i11 == 1) {
                                z10 = true;
                                break;
                            }
                            i10++;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                    if (!z10) {
                        iA = -1;
                    }
                }
            }
        }
        ym1 ym1Var = new ym1(iA, j12, obj);
        boolean z13 = !ym1Var.a() && iA == -1;
        if (ym1Var.a() || iA != -1) {
            z12 = false;
        } else {
            if (s63Var.a(s63Var.a(obj, this.f83086a).f81268d, this.f83087b, 0L).f82133q == s63Var.a(obj)) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        boolean zA = a(s63Var, ym1Var, z13);
        boolean z14 = iA != -1 && this.f83086a.f81272h.a(iA).f76586h;
        if (iA != -1) {
            j14 = this.f83086a.f81272h.a(iA).f76580b;
        } else {
            if (z11) {
                j14 = this.f83086a.f81269e;
            } else {
                j13 = -9223372036854775807L;
            }
            if (j13 != -9223372036854775807L || j13 == Long.MIN_VALUE) {
                j15 = this.f83086a.f81269e;
            } else {
                j15 = j13;
            }
            if (j15 != -9223372036854775807L || j10 < j15) {
                jMax = j10;
            } else {
                jMax = Math.max(0L, j15 - ((long) ((zA || !z11) ? 1 : 0)));
            }
            return new sm1(ym1Var, jMax, j11, j13, j15, z14, z13, z12, zA);
        }
        j13 = j14;
        if (j13 != -9223372036854775807L) {
            j15 = this.f83086a.f81269e;
        } else {
            j15 = this.f83086a.f81269e;
        }
        if (j15 != -9223372036854775807L) {
            jMax = j10;
        } else {
            jMax = j10;
        }
        return new sm1(ym1Var, jMax, j11, j13, j15, z14, z13, z12, zA);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
    public final sm1 a(s63 s63Var, sm1 sm1Var) {
        boolean z10;
        long jA;
        long j10;
        int i10;
        boolean z11;
        int i11;
        ym1 ym1Var = sm1Var.f82688a;
        boolean z12 = !ym1Var.a() && ym1Var.f82315e == -1;
        if (ym1Var.a() || ym1Var.f82315e != -1) {
            z10 = false;
        } else {
            if (s63Var.a(s63Var.a(ym1Var.f82311a, this.f83086a).f81268d, this.f83087b, 0L).f82133q == s63Var.a(ym1Var.f82311a)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        boolean zA = a(s63Var, ym1Var, z12);
        s63Var.a(sm1Var.f82688a.f82311a, this.f83086a);
        long j11 = (ym1Var.a() || (i11 = ym1Var.f82315e) == -1) ? -9223372036854775807L : this.f83086a.f81272h.a(i11).f76580b;
        if (ym1Var.a()) {
            jA = this.f83086a.a(ym1Var.f82312b, ym1Var.f82313c);
        } else {
            if (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) {
                jA = this.f83086a.f81269e;
            } else {
                j10 = j11;
            }
            if (ym1Var.a()) {
                z11 = this.f83086a.f81272h.a(ym1Var.f82312b).f76586h;
            } else {
                i10 = ym1Var.f82315e;
                if (i10 == -1 && this.f83086a.f81272h.a(i10).f76586h) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            return new sm1(ym1Var, sm1Var.f82689b, sm1Var.f82690c, j11, j10, z11, z12, z10, zA);
        }
        j10 = jA;
        if (ym1Var.a()) {
            z11 = this.f83086a.f81272h.a(ym1Var.f82312b).f76586h;
        } else {
            i10 = ym1Var.f82315e;
            if (i10 == -1) {
                z11 = false;
            } else {
                z11 = false;
            }
        }
        return new sm1(ym1Var, sm1Var.f82689b, sm1Var.f82690c, j11, j10, z11, z12, z10, zA);
    }

    public final boolean a(s63 s63Var, ym1 ym1Var, boolean z10) {
        int iA = s63Var.a(ym1Var.f82311a);
        return !s63Var.a(s63Var.a(iA, this.f83086a, false).f81268d, this.f83087b, 0L).f82126j && s63Var.a(iA, this.f83086a, this.f83087b, this.f83091f, this.f83092g) == -1 && z10;
    }

    public final void a(l51 l51Var, ym1 ym1Var) {
        se seVar = this.f83088c;
        sm2 sm2VarA = l51Var.a();
        kb0 kb0Var = (kb0) seVar;
        jb0 jb0Var = kb0Var.f79353d;
        oe2 oe2Var = kb0Var.f79356g;
        oe2Var.getClass();
        jb0Var.getClass();
        jb0Var.f78961b = p51.a((Collection) sm2VarA);
        if (!sm2VarA.isEmpty()) {
            jb0Var.f78964e = (ym1) sm2VarA.get(0);
            ym1Var.getClass();
            jb0Var.f78965f = ym1Var;
        }
        if (jb0Var.f78963d == null) {
            jb0Var.f78963d = jb0.a(oe2Var, jb0Var.f78961b, jb0Var.f78964e, jb0Var.f78960a);
        }
        zn0 zn0Var = (zn0) oe2Var;
        zn0Var.r();
        jb0Var.a(zn0Var.Z.f76249a);
    }

    public final boolean a(qm1 qm1Var) {
        if (qm1Var != null) {
            int i10 = 0;
            if (qm1Var.equals(this.f83095j)) {
                return false;
            }
            this.f83095j = qm1Var;
            boolean z10 = false;
            while (true) {
                qm1Var = qm1Var.f81899l;
                if (qm1Var == null) {
                    break;
                }
                if (qm1Var == this.f83094i) {
                    this.f83094i = this.f83093h;
                    z10 = true;
                }
                qm1Var.b();
                this.f83096k--;
            }
            qm1 qm1Var2 = this.f83095j;
            if (qm1Var2.f81899l != null) {
                qm1Var2.a();
                qm1Var2.f81899l = null;
                while (true) {
                    t73 t73Var = qm1Var2.f81901n;
                    if (i10 >= t73Var.f82907a) {
                        break;
                    }
                    boolean zA = t73Var.a(i10);
                    op0 op0Var = qm1Var2.f81901n.f82909c[i10];
                    if (zA && op0Var != null) {
                        op0Var.a();
                    }
                    i10++;
                }
            }
            c();
            return z10;
        }
        throw new IllegalStateException();
    }

    public static ym1 a(s63 s63Var, Object obj, long j10, long j11, r63 r63Var, p63 p63Var) {
        Object obj2 = obj;
        s63Var.a(obj, p63Var);
        s63Var.a(p63Var.f81268d, r63Var, 0L);
        int iA = s63Var.a(obj);
        while (p63Var.f81269e == 0) {
            e6 e6Var = p63Var.f81272h;
            if (e6Var.f76929c <= 0 || !e6Var.a(e6Var.f76932f).f76586h || p63Var.b(0L) != -1) {
                break;
            }
            int i10 = iA + 1;
            if (iA >= r63Var.f82133q) {
                break;
            }
            s63Var.a(i10, p63Var, true);
            obj2 = p63Var.f81267c;
            obj2.getClass();
            iA = i10;
        }
        s63Var.a(obj2, p63Var);
        int iB = p63Var.b(j10);
        if (iB == -1) {
            return new ym1(p63Var.a(j10), j11, obj2);
        }
        return new ym1(obj2, iB, p63Var.a(iB), j11);
    }

    public final ym1 a(s63 s63Var, Object obj, long j10) {
        long j11;
        int iA;
        Object obj2 = obj;
        int i10 = s63Var.a(obj2, this.f83086a).f81268d;
        Object obj3 = this.f83097l;
        if (obj3 != null && (iA = s63Var.a(obj3)) != -1 && s63Var.a(iA, this.f83086a, false).f81268d == i10) {
            j11 = this.f83098m;
        } else {
            qm1 qm1Var = this.f83093h;
            while (true) {
                if (qm1Var != null) {
                    if (qm1Var.f81889b.equals(obj2)) {
                        j11 = qm1Var.f81893f.f82688a.f82314d;
                        break;
                    }
                    qm1Var = qm1Var.f81899l;
                } else {
                    qm1 qm1Var2 = this.f83093h;
                    while (true) {
                        if (qm1Var2 != null) {
                            int iA2 = s63Var.a(qm1Var2.f81889b);
                            if (iA2 != -1 && s63Var.a(iA2, this.f83086a, false).f81268d == i10) {
                                j11 = qm1Var2.f81893f.f82688a.f82314d;
                                break;
                            }
                            qm1Var2 = qm1Var2.f81899l;
                        } else {
                            j11 = this.f83090e;
                            this.f83090e = 1 + j11;
                            if (this.f83093h != null) {
                                break;
                            }
                            this.f83097l = obj2;
                            this.f83098m = j11;
                            break;
                        }
                    }
                }
            }
        }
        long j12 = j11;
        s63Var.a(obj2, this.f83086a);
        s63Var.a(this.f83086a.f81268d, this.f83087b, 0L);
        boolean z10 = false;
        for (int iA3 = s63Var.a(obj); iA3 >= this.f83087b.f82132p; iA3--) {
            s63Var.a(iA3, this.f83086a, true);
            p63 p63Var = this.f83086a;
            boolean z11 = p63Var.f81272h.f76929c > 0;
            z10 |= z11;
            if (p63Var.b(p63Var.f81269e) != -1) {
                obj2 = this.f83086a.f81267c;
                obj2.getClass();
            }
            if (z10 && (!z11 || this.f83086a.f81269e != 0)) {
                break;
            }
        }
        return a(s63Var, obj2, j10, j12, this.f83087b, this.f83086a);
    }

    public final boolean a(s63 s63Var) {
        qm1 qm1Var;
        qm1 qm1Var2 = this.f83093h;
        if (qm1Var2 == null) {
            return true;
        }
        int iA = s63Var.a(qm1Var2.f81889b);
        while (true) {
            iA = s63Var.a(iA, this.f83086a, this.f83087b, this.f83091f, this.f83092g);
            while (true) {
                qm1Var = qm1Var2.f81899l;
                if (qm1Var == null || qm1Var2.f81893f.f82694g) {
                    break;
                }
                qm1Var2 = qm1Var;
            }
            if (iA == -1 || qm1Var == null || s63Var.a(qm1Var.f81889b) != iA) {
                break;
            }
            qm1Var2 = qm1Var;
        }
        boolean zA = a(qm1Var2);
        qm1Var2.f81893f = a(s63Var, qm1Var2.f81893f);
        return !zA;
    }

    public final boolean a(s63 s63Var, long j10, long j11) {
        sm1 sm1VarA;
        qm1 qm1Var = this.f83093h;
        qm1 qm1Var2 = null;
        while (qm1Var != null) {
            sm1 sm1Var = qm1Var.f81893f;
            if (qm1Var2 == null) {
                sm1VarA = a(s63Var, sm1Var);
            } else {
                sm1 sm1VarA2 = a(s63Var, qm1Var2, j10);
                if (sm1VarA2 == null) {
                    return !a(qm1Var2);
                }
                if (sm1Var.f82689b != sm1VarA2.f82689b || !sm1Var.f82688a.equals(sm1VarA2.f82688a)) {
                    return !a(qm1Var2);
                }
                sm1VarA = sm1VarA2;
            }
            long j12 = sm1Var.f82690c;
            sm1 sm1Var2 = j12 == sm1VarA.f82690c ? sm1VarA : new sm1(sm1VarA.f82688a, sm1VarA.f82689b, j12, sm1VarA.f82691d, sm1VarA.f82692e, sm1VarA.f82693f, sm1VarA.f82694g, sm1VarA.f82695h, sm1VarA.f82696i);
            qm1Var.f81893f = sm1Var2;
            long j13 = sm1Var.f82692e;
            long j14 = sm1VarA.f82692e;
            if (j13 != -9223372036854775807L && j13 != j14) {
                pm1 pm1Var = qm1Var.f81888a;
                if (pm1Var instanceof tv) {
                    long j15 = sm1Var2.f82691d;
                    if (j15 == -9223372036854775807L) {
                        j15 = Long.MIN_VALUE;
                    }
                    tv tvVar = (tv) pm1Var;
                    tvVar.f83185f = 0L;
                    tvVar.f83186g = j15;
                }
                return (a(qm1Var) || (qm1Var == this.f83094i && !sm1Var2.f82693f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j14 > (-9223372036854775807L) ? 1 : (j14 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : qm1Var.f81902o + j14) ? 1 : (j11 == ((j14 > (-9223372036854775807L) ? 1 : (j14 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : qm1Var.f81902o + j14) ? 0 : -1)) >= 0))) ? false : true;
            }
            qm1Var2 = qm1Var;
            qm1Var = qm1Var.f81899l;
        }
        return true;
    }
}
