package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class dm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f76730d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm)) {
            return false;
        }
        dm dmVar = (dm) obj;
        return ck.p.e(this.f76727a, dmVar.f76727a) && ck.p.e(this.f76728b, dmVar.f76728b) && ck.p.e(this.f76729c, dmVar.f76729c) && ck.p.e(this.f76730d, dmVar.f76730d);
    }

    public final int hashCode() {
        String str = this.f76727a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f76728b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f76729c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f76730d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundColors(top=" + this.f76727a + ", right=" + this.f76728b + ", left=" + this.f76729c + ", bottom=" + this.f76730d + ")";
    }

    public dm(String str, String str2, String str3, String str4) {
        this.f76727a = str;
        this.f76728b = str2;
        this.f76729c = str3;
        this.f76730d = str4;
    }
}
