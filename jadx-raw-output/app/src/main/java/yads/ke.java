package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class ke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd f79398a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ke) && ck.p.e(this.f79398a, ((ke) obj).f79398a);
    }

    public final int hashCode() {
        return this.f79398a.hashCode();
    }

    public final String toString() {
        return "Success(advertisingInfoHolder=" + this.f79398a + ")";
    }

    public ke(vd vdVar) {
        this.f79398a = vdVar;
    }
}
