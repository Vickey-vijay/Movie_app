package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk f77727b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc)) {
            return false;
        }
        gc gcVar = (gc) obj;
        return ck.p.e(this.f77726a, gcVar.f77726a) && ck.p.e(this.f77727b, gcVar.f77727b);
    }

    public final int hashCode() {
        String str = this.f77726a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        jk jkVar = this.f77727b;
        return iHashCode + (jkVar != null ? jkVar.hashCode() : 0);
    }

    public final String toString() {
        return "AdditionalInfo(skuId=" + this.f77726a + ", attributes=" + this.f77727b + ")";
    }

    public gc(String str, jk jkVar) {
        this.f77726a = str;
        this.f77727b = jkVar;
    }
}
