package w6;

import y5.j;

/* JADX INFO: compiled from: FinderPattern.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f73525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f73526d;

    public d(float f10, float f11, float f12) {
        this(f10, f11, f12, 1);
    }

    public d(float f10, float f11, float f12, int i10) {
        super(f10, f11);
        this.f73525c = f12;
        this.f73526d = i10;
    }

    public d g(float f10, float f11, float f12) {
        int i10 = this.f73526d;
        int i11 = i10 + 1;
        float fC = (i10 * c()) + f11;
        float f13 = i11;
        return new d(fC / f13, ((this.f73526d * d()) + f10) / f13, ((this.f73526d * this.f73525c) + f12) / f13, i11);
    }

    public int h() {
        return this.f73526d;
    }

    public float i() {
        return this.f73525c;
    }

    public boolean f(float f10, float f11, float f12) {
        if (Math.abs(f11 - d()) > f10 || Math.abs(f12 - c()) > f10) {
            return false;
        }
        float fAbs = Math.abs(f10 - this.f73525c);
        if (fAbs > 1.0f && fAbs > this.f73525c) {
            return false;
        }
        return true;
    }
}
