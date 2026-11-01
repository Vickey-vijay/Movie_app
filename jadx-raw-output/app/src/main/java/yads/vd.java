package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final td f83879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final td f83880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f83881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f83882d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd)) {
            return false;
        }
        vd vdVar = (vd) obj;
        return ck.p.e(this.f83879a, vdVar.f83879a) && ck.p.e(this.f83880b, vdVar.f83880b) && this.f83881c == vdVar.f83881c && ck.p.e(this.f83882d, vdVar.f83882d);
    }

    public final int hashCode() {
        td tdVar = this.f83879a;
        int iHashCode = (tdVar == null ? 0 : tdVar.hashCode()) * 31;
        td tdVar2 = this.f83880b;
        int iHashCode2 = (Boolean.hashCode(this.f83881c) + ((iHashCode + (tdVar2 == null ? 0 : tdVar2.hashCode())) * 31)) * 31;
        String str = this.f83882d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdvertisingInfoHolder(gmsAdvertisingInfo=" + this.f83879a + ", hmsAdvertisingInfo=" + this.f83880b + ", gmsAdvertisingReset=" + this.f83881c + ", appSetId=" + this.f83882d + ")";
    }

    public vd(td tdVar, td tdVar2, boolean z10, String str) {
        this.f83879a = tdVar;
        this.f83880b = tdVar2;
        this.f83881c = z10;
        this.f83882d = str;
    }
}
