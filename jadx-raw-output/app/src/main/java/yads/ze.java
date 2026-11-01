package yads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes11.dex */
public final class ze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dw0 f85365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f85366b;

    public final boolean a(int i10) {
        return this.f85365a.f76817a.get(i10);
    }

    public ze(dw0 dw0Var, SparseArray sparseArray) {
        this.f85365a = dw0Var;
        SparseArray sparseArray2 = new SparseArray(dw0Var.a());
        for (int i10 = 0; i10 < dw0Var.a(); i10++) {
            int iA = dw0Var.a(i10);
            sparseArray2.append(iA, (ye) ni.a((ye) sparseArray.get(iA)));
        }
        this.f85366b = sparseArray2;
    }
}
