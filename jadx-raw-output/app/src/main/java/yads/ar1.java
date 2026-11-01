package yads;

/* JADX INFO: loaded from: classes10.dex */
@xk.f
public final class ar1 {
    public static final zq1 Companion = new zq1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f75610c;

    public /* synthetic */ ar1(int i10, String str, String str2, boolean z10) {
        if (7 != (i10 & 7)) {
            bl.o1.a(i10, 7, yq1.f85088a.getDescriptor());
        }
        this.f75608a = str;
        this.f75609b = str2;
        this.f75610c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar1)) {
            return false;
        }
        ar1 ar1Var = (ar1) obj;
        return ck.p.e(this.f75608a, ar1Var.f75608a) && ck.p.e(this.f75609b, ar1Var.f75609b) && this.f75610c == ar1Var.f75610c;
    }

    public ar1(String str, String str2, boolean z10) {
        this.f75608a = str;
        this.f75609b = str2;
        this.f75610c = z10;
    }

    public final String a() {
        return this.f75608a;
    }

    public final int hashCode() {
        int iHashCode = this.f75608a.hashCode() * 31;
        String str = this.f75609b;
        return Boolean.hashCode(this.f75610c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "MediationAdapterData(format=" + this.f75608a + ", version=" + this.f75609b + ", isIntegrated=" + this.f75610c + ")";
    }
}
