package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class gx extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77964a;

    public gx(String str) {
        super(0);
        this.f77964a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gx) && ck.p.e(this.f77964a, ((gx) obj).f77964a);
    }

    public final int hashCode() {
        String str = this.f77964a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "PurposeConsents(value=" + this.f77964a + ")";
    }
}
