package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class z21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tg f85181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e31 f85183c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z21)) {
            return false;
        }
        z21 z21Var = (z21) obj;
        return ck.p.e(this.f85181a, z21Var.f85181a) && ck.p.e(this.f85182b, z21Var.f85182b) && this.f85183c == z21Var.f85183c;
    }

    public final int hashCode() {
        return this.f85183c.hashCode() + k4.a(this.f85182b, this.f85181a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Identifiers(appMetricaIdentifiers=" + this.f85181a + ", mauid=" + this.f85182b + ", identifiersType=" + this.f85183c + ")";
    }

    public z21(tg tgVar, String str, e31 e31Var) {
        this.f85181a = tgVar;
        this.f85182b = str;
        this.f85183c = e31Var;
    }
}
