package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class cx extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76454a;

    public cx(String str) {
        super(0);
        this.f76454a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cx) && ck.p.e(this.f76454a, ((cx) obj).f76454a);
    }

    public final int hashCode() {
        String str = this.f76454a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "AdditionalConsent(value=" + this.f76454a + ")";
    }
}
