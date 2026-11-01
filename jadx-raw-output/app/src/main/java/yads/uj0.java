package yads;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class uj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f83504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s41 f83505b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj0)) {
            return false;
        }
        uj0 uj0Var = (uj0) obj;
        return ck.p.e(this.f83504a, uj0Var.f83504a) && this.f83505b == uj0Var.f83505b;
    }

    public final int hashCode() {
        return this.f83505b.hashCode() + (this.f83504a.hashCode() * 31);
    }

    public final String toString() {
        return "CachedDrawable(drawable=" + this.f83504a + ", imageType=" + this.f83505b + ")";
    }

    public uj0(Drawable drawable, s41 s41Var) {
        this.f83504a = drawable;
        this.f83505b = s41Var;
    }
}
