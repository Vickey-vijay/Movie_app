package yads;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes11.dex */
public final class gk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f77835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s41 f77836b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk0)) {
            return false;
        }
        gk0 gk0Var = (gk0) obj;
        return ck.p.e(this.f77835a, gk0Var.f77835a) && this.f77836b == gk0Var.f77836b;
    }

    public final int hashCode() {
        return this.f77836b.hashCode() + (this.f77835a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableResponse(drawable=" + this.f77835a + ", imageType=" + this.f77836b + ")";
    }

    public gk0(Drawable drawable, s41 s41Var) {
        this.f77835a = drawable;
        this.f77836b = s41Var;
    }
}
