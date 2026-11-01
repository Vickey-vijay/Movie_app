package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class jk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f79075c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk)) {
            return false;
        }
        jk jkVar = (jk) obj;
        return ck.p.e(this.f79073a, jkVar.f79073a) && ck.p.e(this.f79074b, jkVar.f79074b) && ck.p.e(this.f79075c, jkVar.f79075c);
    }

    public final int hashCode() {
        return this.f79075c.hashCode() + k4.a(this.f79074b, this.f79073a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Attributes(campaignId=" + this.f79073a + ", bannerId=" + this.f79074b + ", placeId=" + this.f79075c + ")";
    }

    public jk(String str, String str2, String str3) {
        this.f79073a = str;
        this.f79074b = str2;
        this.f79075c = str3;
    }
}
