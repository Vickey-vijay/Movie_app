package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class hx extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78403a;

    public hx(String str) {
        super(0);
        this.f78403a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hx) && ck.p.e(this.f78403a, ((hx) obj).f78403a);
    }

    public final int hashCode() {
        String str = this.f78403a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "VendorConsents(value=" + this.f78403a + ")";
    }
}
