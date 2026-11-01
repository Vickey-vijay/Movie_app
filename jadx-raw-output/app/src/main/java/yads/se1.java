package yads;

import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* JADX INFO: loaded from: classes10.dex */
public final class se1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f82623b = ExtendedNativeAdView.class;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zf0 f82624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ag0 f82625d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se1)) {
            return false;
        }
        se1 se1Var = (se1) obj;
        return this.f82622a == se1Var.f82622a && ck.p.e(this.f82623b, se1Var.f82623b) && ck.p.e(this.f82624c, se1Var.f82624c) && ck.p.e(this.f82625d, se1Var.f82625d);
    }

    public final int hashCode() {
        return this.f82625d.hashCode() + ((this.f82624c.hashCode() + ((this.f82623b.hashCode() + (Integer.hashCode(this.f82622a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LayoutDesign(layoutId=" + this.f82622a + ", layoutViewClass=" + this.f82623b + ", designComponentBinder=" + this.f82624c + ", designConstraint=" + this.f82625d + ")";
    }

    public se1(int i10, jy jyVar, ag0 ag0Var) {
        this.f82622a = i10;
        this.f82624c = jyVar;
        this.f82625d = ag0Var;
    }
}
