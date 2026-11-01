package yads;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import yads.af0;
import yads.xq;

/* JADX INFO: loaded from: classes.dex */
public final class af0 extends q73 {
    public static final af0 R = new af0(new ze0());
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final SparseArray P;
    public final SparseBooleanArray Q;

    @Override // yads.q73
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || af0.class != obj.getClass()) {
            return false;
        }
        af0 af0Var = (af0) obj;
        if (super.equals(af0Var) && this.C == af0Var.C && this.D == af0Var.D && this.E == af0Var.E && this.F == af0Var.F && this.G == af0Var.G && this.H == af0Var.H && this.I == af0Var.I && this.J == af0Var.J && this.K == af0Var.K && this.L == af0Var.L && this.M == af0Var.M && this.N == af0Var.N && this.O == af0Var.O) {
            SparseBooleanArray sparseBooleanArray = this.Q;
            SparseBooleanArray sparseBooleanArray2 = af0Var.Q;
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() == size) {
                for (int i10 = 0; i10 < size; i10++) {
                    if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) >= 0) {
                    }
                }
                SparseArray sparseArray = this.P;
                SparseArray sparseArray2 = af0Var.P;
                int size2 = sparseArray.size();
                if (sparseArray2.size() == size2) {
                    for (int i11 = 0; i11 < size2; i11++) {
                        int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                        if (iIndexOfKey >= 0) {
                            Map map = (Map) sparseArray.valueAt(i11);
                            Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                            if (map2.size() == map.size()) {
                                for (Map.Entry entry : map.entrySet()) {
                                    i73 i73Var = (i73) entry.getKey();
                                    if (!map2.containsKey(i73Var) || !ib3.a(entry.getValue(), map2.get(i73Var))) {
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    static {
        new wq() { // from class: cp.a
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return af0.b(bundle);
            }
        };
    }

    public static af0 a(Context context) {
        return new af0(new ze0(context));
    }

    public static af0 b(Bundle bundle) {
        return new af0(new ze0(bundle));
    }

    public af0(ze0 ze0Var) {
        super(ze0Var);
        this.C = ze0Var.A;
        this.D = ze0Var.B;
        this.E = ze0Var.C;
        this.F = ze0Var.D;
        this.G = ze0Var.E;
        this.H = ze0Var.F;
        this.I = ze0Var.G;
        this.J = ze0Var.H;
        this.K = ze0Var.I;
        this.L = ze0Var.J;
        this.M = ze0Var.K;
        this.N = ze0Var.L;
        this.O = ze0Var.M;
        this.P = ze0Var.N;
        this.Q = ze0Var.O;
    }

    @Override // yads.q73
    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31) + (this.M ? 1 : 0)) * 31) + (this.N ? 1 : 0)) * 31) + (this.O ? 1 : 0);
    }
}
