package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83021c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg)) {
            return false;
        }
        tg tgVar = (tg) obj;
        return ck.p.e(this.f83019a, tgVar.f83019a) && ck.p.e(this.f83020b, tgVar.f83020b) && ck.p.e(this.f83021c, tgVar.f83021c);
    }

    public final int hashCode() {
        String str = this.f83019a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f83020b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f83021c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AppMetricaIdentifiers(adGetUrl=" + this.f83019a + ", deviceId=" + this.f83020b + ", uuid=" + this.f83021c + ")";
    }

    public tg(String str, String str2, String str3) {
        this.f83019a = str;
        this.f83020b = str2;
        this.f83021c = str3;
    }
}
