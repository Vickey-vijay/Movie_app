package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class wh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xh0 f84211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84212b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh0)) {
            return false;
        }
        wh0 wh0Var = (wh0) obj;
        return this.f84211a == wh0Var.f84211a && ck.p.e(this.f84212b, wh0Var.f84212b);
    }

    public final int hashCode() {
        return this.f84212b.hashCode() + (this.f84211a.hashCode() * 31);
    }

    public final String toString() {
        return "DivKitAsset(type=" + this.f84211a + ", assetName=" + this.f84212b + ")";
    }

    public wh0(xh0 xh0Var, String str) {
        this.f84211a = xh0Var;
        this.f84212b = str;
    }
}
