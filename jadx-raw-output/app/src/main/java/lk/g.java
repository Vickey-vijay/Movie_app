package lk;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ik.i f63616b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return ck.p.e(this.f63615a, gVar.f63615a) && ck.p.e(this.f63616b, gVar.f63616b);
    }

    public int hashCode() {
        return (this.f63615a.hashCode() * 31) + this.f63616b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f63615a + ", range=" + this.f63616b + ')';
    }

    public g(String str, ik.i iVar) {
        ck.p.j(str, "value");
        ck.p.j(iVar, "range");
        this.f63615a = str;
        this.f63616b = iVar;
    }
}
