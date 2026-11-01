package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class jv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79197b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv)) {
            return false;
        }
        jv jvVar = (jv) obj;
        return ck.p.e(this.f79196a, jvVar.f79196a) && this.f79197b == jvVar.f79197b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f79197b) + (this.f79196a.hashCode() * 31);
    }

    public final String toString() {
        return "ClickQrcode(url=" + this.f79196a + ", sizeInPx=" + this.f79197b + ")";
    }

    public jv(int i10, String str) {
        this.f79196a = str;
        this.f79197b = i10;
    }
}
