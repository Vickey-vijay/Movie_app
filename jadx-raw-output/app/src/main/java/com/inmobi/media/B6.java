package com.inmobi.media;

/* JADX INFO: loaded from: classes6.dex */
public final class B6 extends C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2990kl f22406a;

    public B6() {
        this.f22406a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B6) && ck.p.e(this.f22406a, ((B6) obj).f22406a);
    }

    public B6(C2990kl c2990kl) {
        this.f22406a = c2990kl;
    }

    public final int hashCode() {
        C2990kl c2990kl = this.f22406a;
        if (c2990kl == null) {
            return 0;
        }
        return c2990kl.hashCode();
    }

    public final String toString() {
        return "UnAvailable(vastBeaconData=" + this.f22406a + ")";
    }
}
