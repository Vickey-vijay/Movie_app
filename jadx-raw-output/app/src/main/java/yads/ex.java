package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class ex extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77215a;

    public ex(String str) {
        super(0);
        this.f77215a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ex) && ck.p.e(this.f77215a, ((ex) obj).f77215a);
    }

    public final int hashCode() {
        String str = this.f77215a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "ConsentString(value=" + this.f77215a + ")";
    }
}
