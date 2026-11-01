package yads;

import android.os.Bundle;
import java.util.ArrayList;
import yads.le2;
import yads.xq;

/* JADX INFO: loaded from: classes10.dex */
public final class le2 implements xq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final le2 f79762c = new le2(new cw0().a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dw0 f79763b;

    public static le2 a(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(Integer.toString(0, 36));
        if (integerArrayList == null) {
            return f79762c;
        }
        cw0 cw0Var = new cw0();
        for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
            cw0Var.a(integerArrayList.get(i10).intValue());
        }
        return new le2(cw0Var.a());
    }

    static {
        new wq() { // from class: cp.d6
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return le2.a(bundle);
            }
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof le2) {
            return this.f79763b.equals(((le2) obj).f79763b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f79763b.hashCode();
    }

    public le2(dw0 dw0Var) {
        this.f79763b = dw0Var;
    }
}
