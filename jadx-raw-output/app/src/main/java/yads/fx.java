package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class fx extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77533a;

    public fx(String str) {
        super(0);
        this.f77533a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fx) && ck.p.e(this.f77533a, ((fx) obj).f77533a);
    }

    public final int hashCode() {
        String str = this.f77533a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "Gdpr(value=" + this.f77533a + ")";
    }
}
