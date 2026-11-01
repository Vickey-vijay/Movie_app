package yads;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public final class u10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f83294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f83295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f83296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f83297d;

    public /* synthetic */ u10(View view, float f10, float f11, float f12, float f13) {
        this(view, f10, f11, f12, f13, new RectF(), new Path());
    }

    public static float[] a(float f10, float f11, float f12, float f13) {
        if (f10 > 0.0f || f11 > 0.0f || f12 > 0.0f || f13 > 0.0f) {
            return new float[]{f10, f10, f11, f11, f12, f12, f13, f13};
        }
        return null;
    }

    public final void a() {
        if (this.f83297d != null) {
            int measuredWidth = this.f83294a.getMeasuredWidth();
            int measuredHeight = this.f83294a.getMeasuredHeight();
            int paddingLeft = this.f83294a.getPaddingLeft();
            int paddingTop = this.f83294a.getPaddingTop();
            int paddingRight = measuredWidth - this.f83294a.getPaddingRight();
            int paddingBottom = measuredHeight - this.f83294a.getPaddingBottom();
            if (paddingLeft >= paddingRight || paddingTop >= paddingBottom) {
                return;
            }
            this.f83295b.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
            this.f83296c.reset();
            this.f83296c.addRoundRect(this.f83295b, this.f83297d, Path.Direction.CW);
        }
    }

    public u10(View view, float f10, float f11, float f12, float f13, RectF rectF, Path path) {
        this.f83294a = view;
        this.f83295b = rectF;
        this.f83296c = path;
        this.f83297d = a(f10, f11, f12, f13);
    }
}
