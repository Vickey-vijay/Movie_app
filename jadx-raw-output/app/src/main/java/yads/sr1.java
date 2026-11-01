package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class sr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rr1 f82739b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr1)) {
            return false;
        }
        sr1 sr1Var = (sr1) obj;
        return ck.p.e(this.f82738a, sr1Var.f82738a) && this.f82739b == sr1Var.f82739b;
    }

    public final int hashCode() {
        return this.f82739b.hashCode() + (this.f82738a.hashCode() * 31);
    }

    public final String toString() {
        return "MediationNetworkMessage(message=" + this.f82738a + ", type=" + this.f82739b + ")";
    }

    public sr1(String str, rr1 rr1Var) {
        this.f82738a = str;
        this.f82739b = rr1Var;
    }
}
