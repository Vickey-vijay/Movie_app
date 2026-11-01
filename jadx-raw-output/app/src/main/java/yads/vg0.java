package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class vg0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final vg0 f83903g = new vg0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f83904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f83905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f83906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f83907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f83908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f83909f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg0)) {
            return false;
        }
        vg0 vg0Var = (vg0) obj;
        return Float.compare(this.f83904a, vg0Var.f83904a) == 0 && Float.compare(this.f83905b, vg0Var.f83905b) == 0 && Float.compare(this.f83906c, vg0Var.f83906c) == 0 && Float.compare(this.f83907d, vg0Var.f83907d) == 0 && Float.compare(this.f83908e, vg0Var.f83908e) == 0 && Float.compare(this.f83909f, vg0Var.f83909f) == 0;
    }

    public final float a() {
        return this.f83907d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f83909f) + ((Float.hashCode(this.f83908e) + ((Float.hashCode(this.f83907d) + ((Float.hashCode(this.f83906c) + ((Float.hashCode(this.f83905b) + (Float.hashCode(this.f83904a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DisplayInsetsF(left=" + this.f83904a + ", top=" + this.f83905b + ", right=" + this.f83906c + ", bottom=" + this.f83907d + ", cutoutTop=" + this.f83908e + ", cutoutBottom=" + this.f83909f + ")";
    }

    public vg0(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f83904a = f10;
        this.f83905b = f11;
        this.f83906c = f12;
        this.f83907d = f13;
        this.f83908e = f14;
        this.f83909f = f15;
    }
}
