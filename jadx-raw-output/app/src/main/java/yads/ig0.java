package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import yads.ig0;
import yads.xq;

/* JADX INFO: loaded from: classes7.dex */
public final class ig0 implements xq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f78652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f78653d;

    public static ig0 a(Bundle bundle) {
        return new ig0(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig0)) {
            return false;
        }
        ig0 ig0Var = (ig0) obj;
        return this.f78651b == ig0Var.f78651b && this.f78652c == ig0Var.f78652c && this.f78653d == ig0Var.f78653d;
    }

    static {
        new wq() { // from class: cp.d3
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return ig0.a(bundle);
            }
        };
    }

    public final int hashCode() {
        return ((((this.f78651b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f78652c) * 31) + this.f78653d;
    }

    public ig0(int i10, int i11, int i12) {
        this.f78651b = i10;
        this.f78652c = i11;
        this.f78653d = i12;
    }
}
