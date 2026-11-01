package sg.bigo.ads.common.view.a;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f70219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f70220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f70221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f70222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f70223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f70224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f70225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f70226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f70227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f70228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Drawable f70229n;

    public b() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 1291845632, 0, 0.0f);
    }

    public b(float f10, float f11, float f12, float f13, int i10, int i11, float f14) {
        this(f10, f11, f12, f13, null, i10, i11, f14, null);
    }

    public b(float f10, float f11, float f12, float f13, @Nullable Rect rect, int i10, int i11, float f14, @Nullable boolean[] zArr) {
        this.f70219d = f10;
        this.f70220e = f11;
        this.f70221f = f12;
        this.f70222g = f13;
        this.f70223h = rect;
        this.f70224i = i10;
        this.f70225j = i11;
        this.f70226k = f14;
        this.f70227l = Math.max(0.0f, Math.min(25.0f, 23.0f));
        this.f70228m = 4.0f;
        this.f70229n = (i11 == 0 || f14 <= 0.0f) ? null : sg.bigo.ads.common.utils.d.a(f10, f11, f12, f13, i11, f14, zArr);
    }

    public final void a(Rect rect) {
        Rect rect2 = this.f70223h;
        if (rect2 == null) {
            rect2 = new Rect();
        }
        rect.left = rect2.left;
        rect.top = rect2.top;
        rect.right = rect2.right;
        rect.bottom = rect2.bottom;
    }

    public final void a(float[] fArr) {
        float f10 = this.f70219d;
        fArr[0] = f10;
        fArr[1] = f10;
        float f11 = this.f70220e;
        fArr[2] = f11;
        fArr[3] = f11;
        float f12 = this.f70221f;
        fArr[4] = f12;
        fArr[5] = f12;
        float f13 = this.f70222g;
        fArr[6] = f13;
        fArr[7] = f13;
    }

    public final int b() {
        return this.f70224i;
    }

    @FloatRange(from = 0.0d, to = 25.0d)
    public final float c() {
        return this.f70227l;
    }

    public final float d() {
        return this.f70228m;
    }

    @Nullable
    public final Drawable e() {
        return this.f70229n;
    }
}
