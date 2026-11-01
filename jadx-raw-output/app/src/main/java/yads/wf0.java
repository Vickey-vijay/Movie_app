package yads;

/* JADX INFO: loaded from: classes.dex */
public final class wf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84185c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wf0.class != obj.getClass()) {
            return false;
        }
        wf0 wf0Var = (wf0) obj;
        return ib3.a(this.f84183a, wf0Var.f84183a) && ib3.a(this.f84184b, wf0Var.f84184b) && ib3.a(this.f84185c, wf0Var.f84185c);
    }

    public final int hashCode() {
        int iHashCode = this.f84183a.hashCode() * 31;
        String str = this.f84184b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f84185c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public wf0(String str, String str2, String str3) {
        this.f84183a = str;
        this.f84184b = str2;
        this.f84185c = str3;
    }
}
