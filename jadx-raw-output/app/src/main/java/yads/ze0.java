package yads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ze0 extends p73 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final SparseArray N;
    public final SparseBooleanArray O;

    public ze0() {
        this.N = new SparseArray();
        this.O = new SparseBooleanArray();
        a();
    }

    public final void a() {
        this.A = true;
        this.B = false;
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = true;
    }

    public final void b(boolean z10) {
        this.I = z10;
    }

    @Override // yads.p73
    public final void b(Context context) {
        Point pointC = ib3.c(context);
        a(pointC.x, pointC.y);
    }

    public final void c(boolean z10) {
        this.F = z10;
    }

    public final void d(boolean z10) {
        this.G = z10;
    }

    public final void e(boolean z10) {
        this.M = z10;
    }

    public final void f(boolean z10) {
        this.D = z10;
    }

    public final void g(boolean z10) {
        this.B = z10;
    }

    public final void h(boolean z10) {
        this.C = z10;
    }

    public final void i(boolean z10) {
        this.J = z10;
    }

    public final void j(boolean z10) {
        this.E = z10;
    }

    public final void k(boolean z10) {
        this.K = z10;
    }

    public final void l(boolean z10) {
        this.A = z10;
    }

    public final void m(boolean z10) {
        this.L = z10;
    }

    public ze0(Context context) {
        super(context);
        this.N = new SparseArray();
        this.O = new SparseBooleanArray();
        a();
    }

    public ze0(Bundle bundle) {
        super(bundle);
        a();
        af0 af0Var = af0.R;
        l(bundle.getBoolean(q73.a(1000), af0Var.C));
        g(bundle.getBoolean(q73.a(1001), af0Var.D));
        h(bundle.getBoolean(q73.a(1002), af0Var.E));
        f(bundle.getBoolean(q73.a(1014), af0Var.F));
        j(bundle.getBoolean(q73.a(1003), af0Var.G));
        c(bundle.getBoolean(q73.a(1004), af0Var.H));
        d(bundle.getBoolean(q73.a(1005), af0Var.I));
        a(bundle.getBoolean(q73.a(1006), af0Var.J));
        b(bundle.getBoolean(q73.a(1015), af0Var.K));
        i(bundle.getBoolean(q73.a(1016), af0Var.L));
        k(bundle.getBoolean(q73.a(1007), af0Var.M));
        m(bundle.getBoolean(q73.a(1008), af0Var.N));
        e(bundle.getBoolean(q73.a(1009), af0Var.O));
        this.N = new SparseArray();
        a(bundle);
        this.O = a(bundle.getIntArray(q73.a(1013)));
    }

    public static SparseBooleanArray a(int[] iArr) {
        if (iArr == null) {
            return new SparseBooleanArray();
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
        for (int i10 : iArr) {
            sparseBooleanArray.append(i10, true);
        }
        return sparseBooleanArray;
    }

    public final void a(boolean z10) {
        this.H = z10;
    }

    @Override // yads.p73
    public final void a(Context context) {
        super.a(context);
    }

    public final void a(Bundle bundle) {
        sm2 sm2VarA;
        SparseArray sparseArray;
        int[] intArray = bundle.getIntArray(Integer.toString(1010, 36));
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1011, 36));
        if (parcelableArrayList == null) {
            m51 m51Var = p51.f81258c;
            sm2VarA = sm2.f82697f;
        } else {
            sm2VarA = yq.a(i73.f78513f, parcelableArrayList);
        }
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(Integer.toString(1012, 36));
        if (sparseParcelableArray == null) {
            sparseArray = new SparseArray();
        } else {
            wq wqVar = bf0.f75795e;
            SparseArray sparseArray2 = new SparseArray(sparseParcelableArray.size());
            for (int i10 = 0; i10 < sparseParcelableArray.size(); i10++) {
                sparseArray2.put(sparseParcelableArray.keyAt(i10), wqVar.fromBundle((Bundle) sparseParcelableArray.valueAt(i10)));
            }
            sparseArray = sparseArray2;
        }
        if (intArray == null || intArray.length != sm2VarA.f82699e) {
            return;
        }
        for (int i11 = 0; i11 < intArray.length; i11++) {
            int i12 = intArray[i11];
            i73 i73Var = (i73) sm2VarA.get(i11);
            bf0 bf0Var = (bf0) sparseArray.get(i11);
            Map map = (Map) this.N.get(i12);
            if (map == null) {
                map = new HashMap();
                this.N.put(i12, map);
            }
            if (!map.containsKey(i73Var) || !ib3.a(map.get(i73Var), bf0Var)) {
                map.put(i73Var, bf0Var);
            }
        }
    }

    @Override // yads.p73
    public final p73 a(int i10, int i11) {
        this.f81282i = i10;
        this.f81283j = i11;
        this.f81284k = true;
        return this;
    }
}
