package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes9.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55249c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ck.p.e(G.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.id.AdvIdGetterController.CanTrackIdentifiers");
        }
        G g10 = (G) obj;
        return this.f55247a == g10.f55247a && this.f55248b == g10.f55248b && this.f55249c == g10.f55249c;
    }

    public final int hashCode() {
        return L7.a(this.f55249c) + ((L7.a(this.f55248b) + (L7.a(this.f55247a) * 31)) * 31);
    }

    public final String toString() {
        return "CanTrackIdentifiers(canTrackGaid=" + H.a(this.f55247a) + ", canTrackHoaid=" + H.a(this.f55248b) + ", canTrackYandexAdvId=" + H.a(this.f55249c) + ')';
    }

    public G(int i10, int i11, int i12) {
        this.f55247a = i10;
        this.f55248b = i11;
        this.f55249c = i12;
    }
}
