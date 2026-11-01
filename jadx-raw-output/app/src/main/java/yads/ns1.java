package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class ns1 implements pm1, om1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pm1[] f80744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f80745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hc0 f80746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f80747e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f80748f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public om1 f80749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i73 f80750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public pm1[] f80751i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public sy f80752j;

    @Override // yads.pm1
    public final long a(long j10, ww2 ww2Var) {
        pm1[] pm1VarArr = this.f80751i;
        return (pm1VarArr.length > 0 ? pm1VarArr[0] : this.f80744b[0]).a(j10, ww2Var);
    }

    @Override // yads.rx2
    public final boolean continueLoading(long j10) {
        if (this.f80747e.isEmpty()) {
            return this.f80752j.continueLoading(j10);
        }
        int size = this.f80747e.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((pm1) this.f80747e.get(i10)).continueLoading(j10);
        }
        return false;
    }

    @Override // yads.pm1
    public final void discardBuffer(long j10, boolean z10) {
        for (pm1 pm1Var : this.f80751i) {
            pm1Var.discardBuffer(j10, z10);
        }
    }

    @Override // yads.rx2
    public final long getBufferedPositionUs() {
        return this.f80752j.getBufferedPositionUs();
    }

    @Override // yads.rx2
    public final long getNextLoadPositionUs() {
        return this.f80752j.getNextLoadPositionUs();
    }

    @Override // yads.pm1
    public final i73 getTrackGroups() {
        i73 i73Var = this.f80750h;
        i73Var.getClass();
        return i73Var;
    }

    @Override // yads.rx2
    public final boolean isLoading() {
        return this.f80752j.isLoading();
    }

    @Override // yads.pm1
    public final void maybeThrowPrepareError() {
        for (pm1 pm1Var : this.f80744b) {
            pm1Var.maybeThrowPrepareError();
        }
    }

    @Override // yads.pm1
    public final long readDiscontinuity() {
        long j10 = -9223372036854775807L;
        for (pm1 pm1Var : this.f80751i) {
            long discontinuity = pm1Var.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && pm1Var.seekToUs(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (pm1 pm1Var2 : this.f80751i) {
                    if (pm1Var2 == pm1Var) {
                        break;
                    }
                    if (pm1Var2.seekToUs(discontinuity) != discontinuity) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = discontinuity;
            } else if (discontinuity != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // yads.rx2
    public final void reevaluateBuffer(long j10) {
        this.f80752j.reevaluateBuffer(j10);
    }

    @Override // yads.pm1
    public final long seekToUs(long j10) {
        long jSeekToUs = this.f80751i[0].seekToUs(j10);
        int i10 = 1;
        while (true) {
            pm1[] pm1VarArr = this.f80751i;
            if (i10 >= pm1VarArr.length) {
                return jSeekToUs;
            }
            if (pm1VarArr[i10].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    public ns1(hc0 hc0Var, long[] jArr, pm1... pm1VarArr) {
        this.f80746d = hc0Var;
        this.f80744b = pm1VarArr;
        hc0Var.getClass();
        this.f80752j = hc0.a(new rx2[0]);
        this.f80745c = new IdentityHashMap();
        this.f80751i = new pm1[0];
        for (int i10 = 0; i10 < pm1VarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f80744b[i10] = new ls1(pm1VarArr[i10], j10);
            }
        }
    }

    @Override // yads.qx2
    public final void a(rx2 rx2Var) {
        om1 om1Var = this.f80749g;
        om1Var.getClass();
        om1Var.a((rx2) this);
    }

    @Override // yads.om1
    public final void a(pm1 pm1Var) {
        this.f80747e.remove(pm1Var);
        if (!this.f80747e.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (pm1 pm1Var2 : this.f80744b) {
            i10 += pm1Var2.getTrackGroups().f78514b;
        }
        h73[] h73VarArr = new h73[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            pm1[] pm1VarArr = this.f80744b;
            if (i11 < pm1VarArr.length) {
                i73 trackGroups = pm1VarArr[i11].getTrackGroups();
                int i13 = trackGroups.f78514b;
                int i14 = 0;
                while (i14 < i13) {
                    h73 h73VarA = trackGroups.a(i14);
                    h73 h73Var = new h73(i11 + StringUtils.PROCESS_POSTFIX_DELIMITER + h73VarA.f78088c, h73VarA.f78090e);
                    this.f80748f.put(h73Var, h73VarA);
                    h73VarArr[i12] = h73Var;
                    i14++;
                    i12++;
                }
                i11++;
            } else {
                this.f80750h = new i73(h73VarArr);
                om1 om1Var = this.f80749g;
                om1Var.getClass();
                om1Var.a((pm1) this);
                return;
            }
        }
    }

    @Override // yads.pm1
    public final void a(om1 om1Var, long j10) {
        this.f80749g = om1Var;
        Collections.addAll(this.f80747e, this.f80744b);
        for (pm1 pm1Var : this.f80744b) {
            pm1Var.a(this, j10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.pm1
    public final long a(op0[] op0VarArr, boolean[] zArr, ns2[] ns2VarArr, boolean[] zArr2, long j10) {
        Integer num;
        int[] iArr = new int[op0VarArr.length];
        int[] iArr2 = new int[op0VarArr.length];
        int i10 = 0;
        while (true) {
            num = null;
            if (i10 >= op0VarArr.length) {
                break;
            }
            ns2 ns2Var = ns2VarArr[i10];
            num = ns2Var != null ? (Integer) this.f80745c.get(ns2Var) : null;
            iArr[i10] = num == null ? -1 : num.intValue();
            iArr2[i10] = -1;
            op0 op0Var = op0VarArr[i10];
            if (op0Var != null) {
                h73 h73Var = (h73) this.f80748f.get(op0Var.b());
                h73Var.getClass();
                int i11 = 0;
                while (true) {
                    pm1[] pm1VarArr = this.f80744b;
                    if (i11 >= pm1VarArr.length) {
                        break;
                    }
                    int iIndexOf = pm1VarArr[i11].getTrackGroups().f78515c.indexOf(h73Var);
                    if (iIndexOf >= 0 && iIndexOf != -1) {
                        iArr2[i10] = i11;
                        break;
                    }
                    i11++;
                }
            }
            i10++;
        }
        this.f80745c.clear();
        int length = op0VarArr.length;
        ns2[] ns2VarArr2 = new ns2[length];
        ns2[] ns2VarArr3 = new ns2[op0VarArr.length];
        Object[] objArr = new op0[op0VarArr.length];
        ArrayList arrayList = new ArrayList(this.f80744b.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f80744b.length) {
            for (int i13 = 0; i13 < op0VarArr.length; i13++) {
                ns2VarArr3[i13] = iArr[i13] == i12 ? ns2VarArr[i13] : num;
                if (iArr2[i13] == i12) {
                    op0 op0Var2 = op0VarArr[i13];
                    op0Var2.getClass();
                    h73 h73Var2 = (h73) this.f80748f.get(op0Var2.b());
                    h73Var2.getClass();
                    objArr[i13] = new ks1(op0Var2, h73Var2);
                } else {
                    objArr[i13] = num;
                }
            }
            int i14 = i12;
            ArrayList arrayList2 = arrayList;
            Object[] objArr2 = objArr;
            long jA = this.f80744b[i12].a(objArr, zArr, ns2VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jA;
            } else if (jA != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < op0VarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    Object[] objArr3 = ns2VarArr3[i15];
                    objArr3.getClass();
                    ns2VarArr2[i15] = ns2VarArr3[i15];
                    this.f80745c.put(objArr3, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14 && ns2VarArr3[i15] != 0) {
                    throw new IllegalStateException();
                }
            }
            if (z10) {
                arrayList2.add(this.f80744b[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            objArr = objArr2;
            num = null;
        }
        System.arraycopy(ns2VarArr2, 0, ns2VarArr, 0, length);
        pm1[] pm1VarArr2 = (pm1[]) arrayList.toArray(new pm1[0]);
        this.f80751i = pm1VarArr2;
        this.f80746d.getClass();
        this.f80752j = new sy(pm1VarArr2);
        return j11;
    }
}
