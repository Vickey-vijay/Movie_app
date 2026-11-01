package ac;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: ProgressDrawable.java */
/* JADX INFO: loaded from: classes7.dex */
public class b extends a implements Animatable, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ValueAnimator f3530f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3527c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3528d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3529e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Path f3531g = new Path();

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f3530f.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f3530f.isRunning()) {
            return;
        }
        this.f3530f.addUpdateListener(this);
        this.f3530f.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f3530f.isRunning()) {
            this.f3530f.removeAllListeners();
            this.f3530f.removeAllUpdateListeners();
            this.f3530f.cancel();
        }
    }

    public b() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(30, 3600);
        this.f3530f = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(10000L);
        this.f3530f.setInterpolator(null);
        this.f3530f.setRepeatCount(-1);
        this.f3530f.setRepeatMode(1);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        float f10 = iWidth;
        float fMax = Math.max(1.0f, f10 / 22.0f);
        if (this.f3527c != iWidth || this.f3528d != iHeight) {
            this.f3531g.reset();
            float f11 = f10 - fMax;
            float f12 = iHeight / 2.0f;
            this.f3531g.addCircle(f11, f12, fMax, Path.Direction.CW);
            float f13 = f10 - (5.0f * fMax);
            this.f3531g.addRect(f13, f12 - fMax, f11, f12 + fMax, Path.Direction.CW);
            this.f3531g.addCircle(f13, f12, fMax, Path.Direction.CW);
            this.f3527c = iWidth;
            this.f3528d = iHeight;
        }
        canvas.save();
        float f14 = f10 / 2.0f;
        float f15 = iHeight / 2.0f;
        canvas.rotate(this.f3529e, f14, f15);
        for (int i10 = 0; i10 < 12; i10++) {
            this.f3526b.setAlpha((i10 + 5) * 17);
            canvas.rotate(30.0f, f14, f15);
            canvas.drawPath(this.f3531g, this.f3526b);
        }
        canvas.restore();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3529e = (((Integer) valueAnimator.getAnimatedValue()).intValue() / 30) * 30;
        invalidateSelf();
    }
}
