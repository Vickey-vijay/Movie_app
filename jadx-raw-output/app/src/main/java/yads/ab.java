package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f75453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75455c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return this.f75453a == abVar.f75453a && ck.p.e(this.f75454b, abVar.f75454b) && ck.p.e(this.f75455c, abVar.f75455c);
    }

    public final String a() {
        return this.f75455c;
    }

    public final String b() {
        return this.f75454b;
    }

    public final int hashCode() {
        return this.f75455c.hashCode() + k4.a(this.f75454b, Boolean.hashCode(this.f75453a) * 31, 31);
    }

    public final String toString() {
        return "AdTuneInfo(shouldShow=" + this.f75453a + ", token=" + this.f75454b + ", advertiserInfo=" + this.f75455c + ")";
    }

    public ab(String str, String str2, boolean z10) {
        this.f75453a = z10;
        this.f75454b = str;
        this.f75455c = str2;
    }
}
