package yads;

import android.os.Bundle;
import java.util.Arrays;
import yads.k33;
import yads.xq;

/* JADX INFO: loaded from: classes7.dex */
public final class k33 extends ql2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wq f79292e = new wq() { // from class: cp.t3
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return k33.b(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f79293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f79294d;

    public k33(int i10) {
        ni.a("maxStars must be a positive integer", i10 > 0);
        this.f79293c = i10;
        this.f79294d = -1.0f;
    }

    public static k33 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) != 2) {
            throw new IllegalArgumentException();
        }
        int i10 = bundle.getInt(Integer.toString(1, 36), 5);
        float f10 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
        return f10 == -1.0f ? new k33(i10) : new k33(i10, f10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k33)) {
            return false;
        }
        k33 k33Var = (k33) obj;
        return this.f79293c == k33Var.f79293c && this.f79294d == k33Var.f79294d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f79293c), Float.valueOf(this.f79294d)});
    }

    public k33(int i10, float f10) {
        ni.a("maxStars must be a positive integer", i10 > 0);
        ni.a("starRating is out of range [0, maxStars]", f10 >= 0.0f && f10 <= ((float) i10));
        this.f79293c = i10;
        this.f79294d = f10;
    }
}
