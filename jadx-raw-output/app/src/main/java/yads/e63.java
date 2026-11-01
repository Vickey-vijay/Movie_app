package yads;

import android.os.Bundle;
import java.util.Arrays;
import yads.e63;
import yads.xq;

/* JADX INFO: loaded from: classes3.dex */
public final class e63 extends ql2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wq f76947e = new wq() { // from class: cp.f1
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return e63.b(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f76948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f76949d;

    public e63() {
        this.f76948c = false;
        this.f76949d = false;
    }

    public static e63 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 3) {
            return bundle.getBoolean(Integer.toString(1, 36), false) ? new e63(bundle.getBoolean(Integer.toString(2, 36), false)) : new e63();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e63)) {
            return false;
        }
        e63 e63Var = (e63) obj;
        return this.f76949d == e63Var.f76949d && this.f76948c == e63Var.f76948c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f76948c), Boolean.valueOf(this.f76949d)});
    }

    public e63(boolean z10) {
        this.f76948c = true;
        this.f76949d = z10;
    }
}
