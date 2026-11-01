package yads;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes8.dex */
public final class bk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ak0 f75853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f75854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final im3 f75855c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk0)) {
            return false;
        }
        bk0 bk0Var = (bk0) obj;
        return ck.p.e(this.f75853a, bk0Var.f75853a) && ck.p.e(this.f75854b, bk0Var.f75854b) && ck.p.e(this.f75855c, bk0Var.f75855c);
    }

    public final int hashCode() {
        int iHashCode = this.f75853a.hashCode() * 31;
        Drawable drawable = this.f75854b;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        im3 im3Var = this.f75855c;
        return iHashCode2 + (im3Var != null ? im3Var.hashCode() : 0);
    }

    public final String toString() {
        return "BatchedResponse(request=" + this.f75853a + ", drawable=" + this.f75854b + ", error=" + this.f75855c + ")";
    }

    public bk0(ak0 ak0Var, Drawable drawable, im3 im3Var) {
        this.f75853a = ak0Var;
        this.f75854b = drawable;
        this.f75855c = im3Var;
    }
}
