package m4;

import k4.h0;
import q3.u;

/* JADX INFO: compiled from: BaseMediaChunkOutput.java */
/* JADX INFO: loaded from: classes6.dex */
public final class c implements e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f64039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0[] f64040b;

    @Override // m4.e.b
    public u track(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f64039a;
            if (i12 >= iArr.length) {
                g5.m.c("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new q3.f();
            }
            if (i11 == iArr[i12]) {
                return this.f64040b[i12];
            }
            i12++;
        }
    }

    public int[] a() {
        int[] iArr = new int[this.f64040b.length];
        int i10 = 0;
        while (true) {
            h0[] h0VarArr = this.f64040b;
            if (i10 >= h0VarArr.length) {
                return iArr;
            }
            h0 h0Var = h0VarArr[i10];
            if (h0Var != null) {
                iArr[i10] = h0Var.A();
            }
            i10++;
        }
    }

    public void b(long j10) {
        for (h0 h0Var : this.f64040b) {
            if (h0Var != null) {
                h0Var.T(j10);
            }
        }
    }

    public c(int[] iArr, h0[] h0VarArr) {
        this.f64039a = iArr;
        this.f64040b = h0VarArr;
    }
}
