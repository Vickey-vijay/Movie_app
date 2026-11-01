package wa;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: ProgressDrawable.java */
/* JADX INFO: loaded from: classes8.dex */
public class c extends b implements Animatable, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ValueAnimator f73947f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f73944c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f73945d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f73946e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Path f73948g = new Path();

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f73947f.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f73947f.isRunning()) {
            return;
        }
        this.f73947f.addUpdateListener(this);
        this.f73947f.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f73947f.isRunning()) {
            this.f73947f.removeAllListeners();
            this.f73947f.removeAllUpdateListeners();
            this.f73947f.cancel();
        }
    }

    public c() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(30, 3600);
        this.f73947f = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(10000L);
        this.f73947f.setInterpolator(null);
        this.f73947f.setRepeatCount(-1);
        this.f73947f.setRepeatMode(1);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        float f10 = iWidth;
        float fMax = Math.max(1.0f, f10 / 22.0f);
        if (this.f73944c != iWidth || this.f73945d != iHeight) {
            this.f73948g.reset();
            float f11 = f10 - fMax;
            float f12 = iHeight / 2.0f;
            this.f73948g.addCircle(f11, f12, fMax, Path.Direction.CW);
            float f13 = f10 - (5.0f * fMax);
            this.f73948g.addRect(f13, f12 - fMax, f11, f12 + fMax, Path.Direction.CW);
            this.f73948g.addCircle(f13, f12, fMax, Path.Direction.CW);
            this.f73944c = iWidth;
            this.f73945d = iHeight;
        }
        canvas.save();
        float f14 = f10 / 2.0f;
        float f15 = iHeight / 2.0f;
        canvas.rotate(this.f73946e, f14, f15);
        for (int i10 = 0; i10 < 12; i10++) {
            this.f73943b.setAlpha((i10 + 5) * 17);
            canvas.rotate(30.0f, f14, f15);
            canvas.drawPath(this.f73948g, this.f73943b);
        }
        canvas.restore();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f73946e = (((Integer) valueAnimator.getAnimatedValue()).intValue() / 30) * 30;
        invalidateSelf();
    }
}
