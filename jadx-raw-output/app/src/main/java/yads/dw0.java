package yads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes7.dex */
public final class dw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f76817a;

    public final int a(int i10) {
        ni.a(i10, this.f76817a.size());
        return this.f76817a.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw0)) {
            return false;
        }
        dw0 dw0Var = (dw0) obj;
        if (ib3.f78556a >= 24) {
            return this.f76817a.equals(dw0Var.f76817a);
        }
        if (this.f76817a.size() != dw0Var.f76817a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f76817a.size(); i10++) {
            if (a(i10) != dw0Var.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (ib3.f78556a >= 24) {
            return this.f76817a.hashCode();
        }
        int size = this.f76817a.size();
        for (int i10 = 0; i10 < this.f76817a.size(); i10++) {
            size = (size * 31) + a(i10);
        }
        return size;
    }

    public dw0(SparseBooleanArray sparseBooleanArray) {
        this.f76817a = sparseBooleanArray;
    }

    public final int a() {
        return this.f76817a.size();
    }
}
