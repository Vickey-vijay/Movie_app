package yads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class yl implements mq0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85025c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zl f85027e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f85030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public iu f85031i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f85035m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f85036n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f85023a = new jb2(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xl f85024b = new xl();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pq0 f85026d = new zk0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public iu[] f85029g = new iu[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f85033k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f85034l = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f85032j = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f85028f = -9223372036854775807L;

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f85025c = 0;
        this.f85026d = pq0Var;
        this.f85030h = -1L;
    }

    @Override // yads.mq0
    public final void release() {
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        this.f85030h = -1L;
        this.f85031i = null;
        for (iu iuVar : this.f85029g) {
            if (iuVar.f78813j == 0) {
                iuVar.f78811h = 0;
            } else {
                iuVar.f78811h = iuVar.f78815l[ib3.b(iuVar.f78814k, j10, true)];
            }
        }
        if (j10 != 0) {
            this.f85025c = 6;
        } else if (this.f85029g.length == 0) {
            this.f85025c = 0;
        } else {
            this.f85025c = 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x010c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0113  */
    @Override // yads.mq0
    public final int a(nq0 nq0Var, gg2 gg2Var) throws ob2, EOFException, InterruptedIOException {
        boolean z10;
        long j10;
        iu iuVar;
        long j11 = this.f85030h;
        if (j11 != -1) {
            ld0 ld0Var = (ld0) nq0Var;
            long j12 = ld0Var.f79757d;
            if (j11 >= j12 && j11 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE + j12) {
                ld0Var.a((int) (j11 - j12));
                z10 = false;
            } else {
                gg2Var.f77799a = j11;
                z10 = true;
            }
        } else {
            z10 = false;
        }
        this.f85030h = -1L;
        if (z10) {
            return 1;
        }
        iu iuVar2 = null;
        switch (this.f85025c) {
            case 0:
                if (a(nq0Var)) {
                    ((ld0) nq0Var).a(12);
                    this.f85025c = 1;
                    return 0;
                }
                throw new ob2("AVI Header List not found", null, true, 1);
            case 1:
                ((ld0) nq0Var).a(this.f85023a.f78966a, 0, 12, false);
                this.f85023a.e(0);
                xl xlVar = this.f85024b;
                jb2 jb2Var = this.f85023a;
                xlVar.getClass();
                xlVar.f84619a = jb2Var.d();
                xlVar.f84620b = jb2Var.d();
                xlVar.f84621c = 0;
                if (xlVar.f84619a == 1414744396) {
                    xlVar.f84621c = jb2Var.d();
                    xl xlVar2 = this.f85024b;
                    if (xlVar2.f84621c == 1819436136) {
                        this.f85032j = xlVar2.f84620b;
                        this.f85025c = 2;
                        return 0;
                    }
                    throw new ob2("hdrl expected, found: " + this.f85024b.f84621c, null, true, 1);
                }
                throw new ob2("LIST expected, found: " + xlVar.f84619a, null, true, 1);
            case 2:
                int i10 = this.f85032j - 4;
                jb2 jb2Var2 = new jb2(i10);
                ((ld0) nq0Var).a(jb2Var2.f78966a, 0, i10, false);
                lf1 lf1VarA = lf1.a(1819436136, jb2Var2);
                if (lf1VarA.f79776b == 1819436136) {
                    zl zlVar = (zl) lf1VarA.a(zl.class);
                    if (zlVar != null) {
                        this.f85027e = zlVar;
                        this.f85028f = ((long) zlVar.f85471c) * ((long) zlVar.f85469a);
                        ArrayList arrayList = new ArrayList();
                        m51 m51VarListIterator = lf1VarA.f79775a.listIterator(0);
                        int i11 = 0;
                        while (m51VarListIterator.hasNext()) {
                            vl vlVar = (vl) m51VarListIterator.next();
                            if (vlVar.getType() == 1819440243) {
                                lf1 lf1Var = (lf1) vlVar;
                                int i12 = i11 + 1;
                                am amVar = (am) lf1Var.a(am.class);
                                t33 t33Var = (t33) lf1Var.a(t33.class);
                                if (amVar == null) {
                                    ih1.d("AviExtractor", "Missing Stream Header");
                                } else if (t33Var == null) {
                                    ih1.d("AviExtractor", "Missing Stream Format");
                                } else {
                                    long jA = ib3.a(amVar.f75565d, ((long) amVar.f75563b) * 1000000, amVar.f75564c);
                                    mx0 mx0Var = t33Var.f82880a;
                                    mx0Var.getClass();
                                    lx0 lx0Var = new lx0(mx0Var);
                                    lx0Var.f79957a = Integer.toString(i11);
                                    int i13 = amVar.f75566e;
                                    if (i13 != 0) {
                                        lx0Var.f79968l = i13;
                                    }
                                    w33 w33Var = (w33) lf1Var.a(w33.class);
                                    if (w33Var != null) {
                                        lx0Var.f79958b = w33Var.f84101a;
                                    }
                                    int iD = ht1.d(mx0Var.f80429m);
                                    if (iD == 1 || iD == 2) {
                                        m73 m73VarA = this.f85026d.a(i11, iD);
                                        m73VarA.a(new mx0(lx0Var));
                                        iu iuVar3 = new iu(i11, iD, jA, amVar.f75565d, m73VarA);
                                        this.f85028f = jA;
                                        iuVar2 = iuVar3;
                                    } else {
                                        iuVar2 = null;
                                    }
                                }
                                if (iuVar2 != null) {
                                    arrayList.add(iuVar2);
                                }
                                i11 = i12;
                                iuVar2 = null;
                            }
                        }
                        this.f85029g = (iu[]) arrayList.toArray(new iu[0]);
                        this.f85026d.a();
                        this.f85025c = 3;
                        return 0;
                    }
                    throw new ob2("AviHeader not found", null, true, 1);
                }
                throw new ob2("Unexpected header list type " + lf1VarA.f79776b, null, true, 1);
            case 3:
                long j13 = this.f85033k;
                if (j13 != -1 && ((ld0) nq0Var).f79757d != j13) {
                    this.f85030h = j13;
                    return 0;
                }
                ld0 ld0Var2 = (ld0) nq0Var;
                ld0Var2.b(this.f85023a.f78966a, 0, 12, false);
                ld0Var2.f79759f = 0;
                this.f85023a.e(0);
                xl xlVar3 = this.f85024b;
                jb2 jb2Var3 = this.f85023a;
                xlVar3.getClass();
                xlVar3.f84619a = jb2Var3.d();
                xlVar3.f84620b = jb2Var3.d();
                xlVar3.f84621c = 0;
                int iD2 = this.f85023a.d();
                xl xlVar4 = this.f85024b;
                int i14 = xlVar4.f84619a;
                if (i14 == 1179011410) {
                    ld0Var2.a(12);
                    return 0;
                }
                if (i14 == 1414744396 && iD2 == 1769369453) {
                    long j14 = ld0Var2.f79757d;
                    this.f85033k = j14;
                    this.f85034l = j14 + ((long) xlVar4.f84620b) + 8;
                    if (!this.f85036n) {
                        zl zlVar2 = this.f85027e;
                        zlVar2.getClass();
                        if ((zlVar2.f85470b & 16) == 16) {
                            this.f85025c = 4;
                            this.f85030h = this.f85034l;
                            return 0;
                        }
                        this.f85026d.a(new uw2(this.f85028f, 0L));
                        this.f85036n = true;
                    }
                    this.f85030h = ld0Var2.f79757d + 12;
                    this.f85025c = 6;
                    return 0;
                }
                this.f85030h = ld0Var2.f79757d + ((long) xlVar4.f84620b) + 8;
                return 0;
            case 4:
                ld0 ld0Var3 = (ld0) nq0Var;
                ld0Var3.a(this.f85023a.f78966a, 0, 8, false);
                this.f85023a.e(0);
                int iD3 = this.f85023a.d();
                int iD4 = this.f85023a.d();
                if (iD3 == 829973609) {
                    this.f85025c = 5;
                    this.f85035m = iD4;
                } else {
                    this.f85030h = ld0Var3.f79757d + ((long) iD4);
                }
                return 0;
            case 5:
                jb2 jb2Var4 = new jb2(this.f85035m);
                ((ld0) nq0Var).a(jb2Var4.f78966a, 0, this.f85035m, false);
                int i15 = jb2Var4.f78968c;
                int i16 = jb2Var4.f78967b;
                if (i15 - i16 < 16) {
                    j10 = 0;
                } else {
                    jb2Var4.e(i16 + 8);
                    long jD = jb2Var4.d();
                    long j15 = this.f85033k;
                    j10 = jD > j15 ? 0L : j15 + 8;
                    jb2Var4.e(i16);
                }
                while (jb2Var4.f78968c - jb2Var4.f78967b >= 16) {
                    int iD5 = jb2Var4.d();
                    int iD6 = jb2Var4.d();
                    long jD2 = ((long) jb2Var4.d()) + j10;
                    jb2Var4.d();
                    iu[] iuVarArr = this.f85029g;
                    int length = iuVarArr.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 < length) {
                            iuVar = iuVarArr[i17];
                            if (iuVar.f78805b != iD5 && iuVar.f78806c != iD5) {
                                i17++;
                            }
                        } else {
                            iuVar = null;
                        }
                    }
                    if (iuVar != null) {
                        if ((iD6 & 16) == 16) {
                            iuVar.a(jD2);
                        }
                        iuVar.f78812i++;
                    }
                }
                for (iu iuVar4 : this.f85029g) {
                    iuVar4.a();
                }
                this.f85036n = true;
                this.f85026d.a(new wl(this, this.f85028f));
                this.f85025c = 6;
                this.f85030h = this.f85033k;
                return 0;
            case 6:
                ld0 ld0Var4 = (ld0) nq0Var;
                long j16 = ld0Var4.f79757d;
                if (j16 >= this.f85034l) {
                    return -1;
                }
                iu iuVar5 = this.f85031i;
                if (iuVar5 != null) {
                    int i18 = iuVar5.f78810g;
                    int iA = i18 - iuVar5.f78804a.a(nq0Var, i18, false);
                    iuVar5.f78810g = iA;
                    boolean z11 = iA == 0;
                    if (z11) {
                        if (iuVar5.f78809f > 0) {
                            m73 m73Var = iuVar5.f78804a;
                            int i19 = iuVar5.f78811h;
                            m73Var.a((iuVar5.f78807d * ((long) i19)) / ((long) iuVar5.f78808e), Arrays.binarySearch(iuVar5.f78815l, i19) >= 0 ? 1 : 0, iuVar5.f78809f, 0, null);
                        }
                        iuVar5.f78811h++;
                    }
                    if (!z11) {
                        return 0;
                    }
                    this.f85031i = null;
                    return 0;
                }
                if ((j16 & 1) == 1) {
                    ld0Var4.a(1);
                }
                ld0Var4.b(this.f85023a.f78966a, 0, 12, false);
                this.f85023a.e(0);
                int iD7 = this.f85023a.d();
                if (iD7 == 1414744396) {
                    this.f85023a.e(8);
                    ld0Var4.a(this.f85023a.d() == 1769369453 ? 12 : 8);
                    ld0Var4.f79759f = 0;
                    return 0;
                }
                int iD8 = this.f85023a.d();
                if (iD7 == 1263424842) {
                    this.f85030h = ld0Var4.f79757d + ((long) iD8) + 8;
                    return 0;
                }
                ld0Var4.a(8);
                ld0Var4.f79759f = 0;
                for (iu iuVar6 : this.f85029g) {
                    if (iuVar6.f78805b == iD7 || iuVar6.f78806c == iD7) {
                        iuVar2 = iuVar6;
                        if (iuVar2 == null) {
                            this.f85030h = ld0Var4.f79757d + ((long) iD8);
                            return 0;
                        }
                        iuVar2.f78809f = iD8;
                        iuVar2.f78810g = iD8;
                        this.f85031i = iuVar2;
                        return 0;
                    }
                }
                if (iuVar2 == null) {
                    this.f85030h = ld0Var4.f79757d + ((long) iD8);
                    return 0;
                }
                iuVar2.f78809f = iD8;
                iuVar2.f78810g = iD8;
                this.f85031i = iuVar2;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) {
        ((ld0) nq0Var).b(this.f85023a.f78966a, 0, 12, false);
        this.f85023a.e(0);
        if (this.f85023a.d() != 1179011410) {
            return false;
        }
        jb2 jb2Var = this.f85023a;
        jb2Var.e(jb2Var.f78967b + 4);
        return this.f85023a.d() == 541677121;
    }
}
