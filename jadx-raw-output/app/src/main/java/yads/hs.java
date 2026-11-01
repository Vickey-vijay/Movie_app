package yads;

import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes11.dex */
public final class hs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet f78341c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f78342d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jc0 f78343e;

    public final boolean c(long j10, long j11) {
        for (int i10 = 0; i10 < this.f78342d.size(); i10++) {
            gs gsVar = (gs) this.f78342d.get(i10);
            long j12 = gsVar.f77915b;
            if (j12 == -1) {
                if (j10 >= gsVar.f77914a) {
                    return true;
                }
            } else if (j11 == -1) {
                continue;
            } else {
                long j13 = gsVar.f77914a;
                if (j13 <= j10 && j10 + j11 <= j13 + j12) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hs.class != obj.getClass()) {
            return false;
        }
        hs hsVar = (hs) obj;
        return this.f78339a == hsVar.f78339a && this.f78340b.equals(hsVar.f78340b) && this.f78341c.equals(hsVar.f78341c) && this.f78343e.equals(hsVar.f78343e);
    }

    public final long a(long j10, long j11) {
        if (j10 < 0) {
            throw new IllegalArgumentException();
        }
        if (j11 < 0) {
            throw new IllegalArgumentException();
        }
        yy2 yy2VarB = b(j10, j11);
        if (!yy2VarB.f85573e) {
            long j12 = yy2VarB.f85572d;
            return -Math.min(j12 != -1 ? j12 : Long.MAX_VALUE, j11);
        }
        long j13 = j10 + j11;
        long j14 = j13 >= 0 ? j13 : Long.MAX_VALUE;
        long jMax = yy2VarB.f85571c + yy2VarB.f85572d;
        if (jMax < j14) {
            for (yy2 yy2Var : this.f78341c.tailSet(yy2VarB, false)) {
                long j15 = yy2Var.f85571c;
                if (j15 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j15 + yy2Var.f85572d);
                if (jMax >= j14) {
                    break;
                }
            }
        }
        return Math.min(jMax - j10, j11);
    }

    public final yy2 b(long j10, long j11) {
        long j12;
        yy2 yy2Var = new yy2(this.f78340b, j10, -1L, -9223372036854775807L, null);
        yy2 yy2Var2 = (yy2) this.f78341c.floor(yy2Var);
        if (yy2Var2 != null && yy2Var2.f85571c + yy2Var2.f85572d > j10) {
            return yy2Var2;
        }
        yy2 yy2Var3 = (yy2) this.f78341c.ceiling(yy2Var);
        if (yy2Var3 != null) {
            long j13 = yy2Var3.f85571c - j10;
            if (j11 == -1) {
                j12 = j13;
            } else {
                j11 = Math.min(j13, j11);
                j12 = j11;
            }
        } else {
            j12 = j11;
        }
        return new yy2(this.f78340b, j10, j12, -9223372036854775807L, null);
    }

    public final int hashCode() {
        return this.f78343e.hashCode() + k4.a(this.f78340b, this.f78339a * 31, 31);
    }

    public hs(int i10, String str, jc0 jc0Var) {
        this.f78339a = i10;
        this.f78340b = str;
        this.f78343e = jc0Var;
    }
}
