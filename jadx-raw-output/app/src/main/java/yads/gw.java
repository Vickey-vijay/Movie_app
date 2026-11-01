package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class gw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fw f77953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77954b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw)) {
            return false;
        }
        gw gwVar = (gw) obj;
        return this.f77953a == gwVar.f77953a && ck.p.e(this.f77954b, gwVar.f77954b);
    }

    public final int hashCode() {
        int iHashCode = this.f77953a.hashCode() * 31;
        String str = this.f77954b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CloseButtonValue(type=" + this.f77953a + ", text=" + this.f77954b + ")";
    }

    public gw(fw fwVar, String str) {
        this.f77953a = fwVar;
        this.f77954b = str;
    }
}
