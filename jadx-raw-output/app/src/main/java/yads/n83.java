package yads;

import android.os.Bundle;
import java.util.Arrays;
import yads.n83;
import yads.xq;

/* JADX INFO: loaded from: classes2.dex */
public final class n83 implements xq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wq f80597g = new wq() { // from class: cp.t6
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return n83.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h73 f80599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f80600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f80601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f80602f;

    public final int a() {
        return this.f80599c.f78089d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n83.class != obj.getClass()) {
            return false;
        }
        n83 n83Var = (n83) obj;
        return this.f80600d == n83Var.f80600d && this.f80599c.equals(n83Var.f80599c) && Arrays.equals(this.f80601e, n83Var.f80601e) && Arrays.equals(this.f80602f, n83Var.f80602f);
    }

    public static n83 a(Bundle bundle) {
        wq wqVar = h73.f78086g;
        Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
        bundle2.getClass();
        h73 h73Var = (h73) wqVar.fromBundle(bundle2);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        int[] iArr = new int[h73Var.f78087b];
        if (intArray == null) {
            intArray = iArr;
        }
        boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
        boolean[] zArr = new boolean[h73Var.f78087b];
        if (booleanArray == null) {
            booleanArray = zArr;
        }
        return new n83(h73Var, bundle.getBoolean(Integer.toString(4, 36), false), intArray, booleanArray);
    }

    public final boolean b() {
        for (boolean z10 : this.f80602f) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f80602f) + ((Arrays.hashCode(this.f80601e) + (((this.f80599c.hashCode() * 31) + (this.f80600d ? 1 : 0)) * 31)) * 31);
    }

    public n83(h73 h73Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = h73Var.f78087b;
        this.f80598b = i10;
        boolean z12 = false;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        ni.a(z11);
        this.f80599c = h73Var;
        if (z10 && i10 > 1) {
            z12 = true;
        }
        this.f80600d = z12;
        this.f80601e = (int[]) iArr.clone();
        this.f80602f = (boolean[]) zArr.clone();
    }
}
