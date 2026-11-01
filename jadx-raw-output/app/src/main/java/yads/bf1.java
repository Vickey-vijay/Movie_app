package yads;

import java.util.Comparator;
import java.util.TreeSet;
import yads.bf1;
import yads.zr;

/* JADX INFO: loaded from: classes8.dex */
public final class bf1 implements ur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f75799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeSet f75800b = new TreeSet(new Comparator() { // from class: cp.l
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return bf1.a((zr) obj, (zr) obj2);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f75801c;

    public static int a(zr zrVar, zr zrVar2) {
        long j10 = zrVar.f85575g;
        long j11 = zrVar2.f85575g;
        if (j10 - j11 != 0) {
            return j10 < j11 ? -1 : 1;
        }
        if (!zrVar.f85570b.equals(zrVar2.f85570b)) {
            return zrVar.f85570b.compareTo(zrVar2.f85570b);
        }
        long j12 = zrVar.f85571c - zrVar2.f85571c;
        if (j12 == 0) {
            return 0;
        }
        return j12 < 0 ? -1 : 1;
    }

    public bf1(long j10) {
        this.f75799a = j10;
    }

    public final void a(nr nrVar, long j10) {
        while (this.f75801c + j10 > this.f75799a && !this.f75800b.isEmpty()) {
            zr zrVar = (zr) this.f75800b.first();
            vy2 vy2Var = (vy2) nrVar;
            synchronized (vy2Var) {
                vy2Var.b(zrVar);
            }
        }
    }
}
