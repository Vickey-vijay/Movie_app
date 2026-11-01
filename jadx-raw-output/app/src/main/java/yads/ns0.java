package yads;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ns0 extends ut0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v22 f80741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f80742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f80743c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns0)) {
            return false;
        }
        ns0 ns0Var = (ns0) obj;
        return ck.p.e(this.f80741a, ns0Var.f80741a) && ck.p.e(this.f80742b, ns0Var.f80742b) && ck.p.e(this.f80743c, ns0Var.f80743c);
    }

    public final int hashCode() {
        return this.f80743c.hashCode() + ((this.f80742b.hashCode() + (this.f80741a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FeedItem(sliderAd=" + this.f80741a + ", adResponse=" + this.f80742b + ", preloadedDivKitDesigns=" + this.f80743c + ")";
    }
}
