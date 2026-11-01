package yads;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import yads.mx0;
import yads.to;

/* JADX INFO: loaded from: classes11.dex */
public abstract class to implements op0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h73 f83120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f83122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mx0[] f83123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f83124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f83125f;

    @Override // yads.op0
    public void a() {
    }

    @Override // yads.op0
    public void a(float f10) {
    }

    @Override // yads.op0
    public final boolean a(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zB = b(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f83121b && !zB) {
            zB = (i11 == i10 || b(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zB) {
            return false;
        }
        long[] jArr = this.f83124e;
        long j11 = jArr[i10];
        int i12 = ib3.f78556a;
        long j12 = jElapsedRealtime + j10;
        jArr[i10] = Math.max(j11, ((j10 ^ j12) & (jElapsedRealtime ^ j12)) >= 0 ? j12 : Long.MAX_VALUE);
        return true;
    }

    @Override // yads.op0
    public final int b(int i10) {
        return this.f83122c[i10];
    }

    @Override // yads.op0
    public final mx0 c() {
        return this.f83123d[e()];
    }

    @Override // yads.op0
    public void disable() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        to toVar = (to) obj;
        return this.f83120a == toVar.f83120a && Arrays.equals(this.f83122c, toVar.f83122c);
    }

    @Override // yads.op0
    public final h73 b() {
        return this.f83120a;
    }

    @Override // yads.op0
    public final int c(int i10) {
        for (int i11 = 0; i11 < this.f83121b; i11++) {
            if (this.f83122c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // yads.op0
    public final int f() {
        return this.f83122c.length;
    }

    public final int hashCode() {
        if (this.f83125f == 0) {
            this.f83125f = Arrays.hashCode(this.f83122c) + (System.identityHashCode(this.f83120a) * 31);
        }
        return this.f83125f;
    }

    public to(h73 h73Var, int[] iArr) {
        boolean z10;
        int i10 = 0;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ni.b(z10);
        this.f83120a = (h73) ni.a(h73Var);
        int length = iArr.length;
        this.f83121b = length;
        this.f83123d = new mx0[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f83123d[i11] = h73Var.a(iArr[i11]);
        }
        Arrays.sort(this.f83123d, new Comparator() { // from class: cp.la
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return to.a((mx0) obj, (mx0) obj2);
            }
        });
        this.f83122c = new int[this.f83121b];
        while (true) {
            int i12 = this.f83121b;
            if (i10 < i12) {
                this.f83122c[i10] = h73Var.a(this.f83123d[i10]);
                i10++;
            } else {
                this.f83124e = new long[i12];
                return;
            }
        }
    }

    @Override // yads.op0
    public final boolean b(int i10, long j10) {
        return this.f83124e[i10] > j10;
    }

    @Override // yads.op0
    public int a(long j10, List list) {
        return list.size();
    }

    @Override // yads.op0
    public final mx0 a(int i10) {
        return this.f83123d[i10];
    }

    @Override // yads.op0
    public final int a(mx0 mx0Var) {
        for (int i10 = 0; i10 < this.f83121b; i10++) {
            if (this.f83123d[i10] == mx0Var) {
                return i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ int a(mx0 mx0Var, mx0 mx0Var2) {
        return mx0Var2.f80425i - mx0Var.f80425i;
    }
}
