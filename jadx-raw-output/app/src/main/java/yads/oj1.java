package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class oj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f81055b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj1)) {
            return false;
        }
        oj1 oj1Var = (oj1) obj;
        return ck.p.e(this.f81054a, oj1Var.f81054a) && Float.compare(this.f81055b, oj1Var.f81055b) == 0;
    }

    public final int hashCode() {
        String str = this.f81054a;
        return Float.hashCode(this.f81055b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Media(htmlContent=" + this.f81054a + ", aspectRatio=" + this.f81055b + ")";
    }

    public oj1(String str, float f10) {
        this.f81054a = str;
        this.f81055b = f10;
    }
}
