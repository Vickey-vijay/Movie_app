package i4;

import android.util.Log;
import android.view.View;

/* JADX INFO: compiled from: RenderMeasure.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f54055g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f54057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f54058j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54049a = "RenderMeasure";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f54056h = 4;

    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[PHI: r7
  0x0073: PHI (r7v1 float) = (r7v0 float), (r7v2 float) binds: [B:30:0x0070, B:26:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ac  */
    public void a(int i10, int i11) {
        int i12;
        float f10;
        float f11;
        int i13;
        int i14 = this.f54057i;
        if (i14 == 90 || i14 == 270) {
            i11 = i10;
            i10 = i11;
        }
        int defaultSize = View.getDefaultSize(this.f54050b, i10);
        int defaultSize2 = View.getDefaultSize(this.f54051c, i11);
        if (this.f54056h != 2) {
            if (this.f54050b <= 0 || this.f54051c <= 0) {
                i10 = defaultSize;
                i11 = defaultSize2;
            } else {
                int mode = View.MeasureSpec.getMode(i10);
                i10 = View.MeasureSpec.getSize(i10);
                int mode2 = View.MeasureSpec.getMode(i11);
                i11 = View.MeasureSpec.getSize(i11);
                if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                    float f12 = i10;
                    float f13 = i11;
                    float f14 = f12 / f13;
                    int i15 = this.f54056h;
                    if (i15 == 0) {
                        f10 = 1.7777778f;
                        int i16 = this.f54057i;
                        if (i16 == 90 || i16 == 270) {
                            f11 = 0.5625f;
                        } else {
                            f11 = f10;
                        }
                    } else if (i15 != 1) {
                        f11 = this.f54050b / this.f54051c;
                        int i17 = this.f54052d;
                        if (i17 > 0 && (i13 = this.f54053e) > 0) {
                            f11 = (f11 * i17) / i13;
                        }
                    } else {
                        f10 = 1.3333334f;
                        int i18 = this.f54057i;
                        if (i18 == 90 || i18 == 270) {
                            f11 = 0.75f;
                        } else {
                            f11 = f10;
                        }
                    }
                    boolean z10 = f11 > f14;
                    if (i15 == 0 || i15 == 1) {
                        if (z10) {
                            i11 = (int) (f12 / f11);
                        } else {
                            i10 = (int) (f13 * f11);
                        }
                    } else if (i15 != 3) {
                        if (i15 != 4) {
                            if (z10) {
                                i10 = Math.min(this.f54050b, i10);
                                i11 = (int) (i10 / f11);
                            } else {
                                int iMin = Math.min(this.f54051c, i11);
                                i11 = iMin;
                                i10 = (int) (iMin * f11);
                            }
                        } else if (z10) {
                            i11 = (int) (f12 / f11);
                        } else {
                            i10 = (int) (f13 * f11);
                        }
                    } else if (z10) {
                        i10 = (int) (f13 * f11);
                    } else {
                        i11 = (int) (f12 / f11);
                    }
                } else if (mode == 1073741824 && mode2 == 1073741824) {
                    int i19 = this.f54050b;
                    int i20 = i19 * i11;
                    int i21 = this.f54051c;
                    if (i20 < i10 * i21) {
                        i10 = (i19 * i11) / i21;
                    } else if (i19 * i11 > i10 * i21) {
                        i11 = (i21 * i10) / i19;
                    }
                } else if (mode == 1073741824) {
                    int i22 = (this.f54051c * i10) / this.f54050b;
                    if (mode2 != Integer.MIN_VALUE || i22 <= i11) {
                        i11 = i22;
                    }
                } else if (mode2 == 1073741824) {
                    int i23 = (this.f54050b * i11) / this.f54051c;
                    if (mode != Integer.MIN_VALUE || i23 <= i10) {
                        i10 = i23;
                    }
                } else {
                    int i24 = this.f54050b;
                    int i25 = this.f54051c;
                    if (mode2 != Integer.MIN_VALUE || i25 <= i11) {
                        i12 = i24;
                        i11 = i25;
                    } else {
                        i12 = (i11 * i24) / i25;
                    }
                    if (mode != Integer.MIN_VALUE || i12 <= i10) {
                        i10 = i12;
                    } else {
                        i11 = (i25 * i10) / i24;
                    }
                }
            }
        }
        this.f54054f = i10;
        this.f54055g = i11;
    }

    public void b(int i10, View view) {
        int i11;
        int i12;
        int i13 = this.f54051c;
        float f10 = (i13 == 0 || (i12 = this.f54050b) == 0) ? 1.0f : (i12 * this.f54058j) / i13;
        if (i10 != 0 && ((i11 = this.f54057i) == 90 || i11 == 270)) {
            f10 = 1.0f / f10;
        }
        if (f10 < 1.0f) {
            h(i10);
            view.setRotation(i10);
        }
    }

    public int c() {
        return this.f54055g;
    }

    public int d() {
        return this.f54054f;
    }

    public int e() {
        return this.f54056h;
    }

    public void f(int i10) {
        this.f54056h = i10;
    }

    public void g(float f10) {
        this.f54058j = f10;
    }

    public void h(int i10) {
        this.f54057i = i10;
    }

    public void i(int i10, int i11) {
        this.f54052d = i10;
        this.f54053e = i11;
    }

    public void j(int i10, int i11) {
        Log.d("RenderMeasure", "videoWidth = " + i10 + " videoHeight = " + i11);
        this.f54050b = i10;
        this.f54051c = i11;
    }
}
