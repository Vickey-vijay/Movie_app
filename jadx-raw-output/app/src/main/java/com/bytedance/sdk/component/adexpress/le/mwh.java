package com.bytedance.sdk.component.adexpress.le;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"AppCompatCustomView"})
public final class mwh extends ImageView {
    private float bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f11512cf;
    private boolean fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private boolean f11513jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private boolean f11514le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f11515lh;
    private boolean mwh;
    private Movie ouw;
    private float pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private float f11516ra;
    private volatile boolean ryl;
    private int tlj;
    private long vt;
    private AnimatedImageDrawable yu;

    private void ouw() {
        if (this.ouw == null || this.fkw || !this.mwh) {
            return;
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    private void setDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        setImageDrawable(drawable);
        if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
            AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) drawable;
            this.yu = animatedImageDrawable;
            if (!this.ryl) {
                animatedImageDrawable.start();
            }
            if (!this.f11513jg) {
                animatedImageDrawable.setRepeatCount(0);
            }
        }
        ouw();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.ouw == null || this.fkw) {
            super.onDraw(canvas);
            return;
        }
        try {
            if (this.ryl) {
                ouw(canvas);
                return;
            }
            if (this.ouw != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.vt == 0) {
                    this.vt = jUptimeMillis;
                }
                int iDuration = this.ouw.duration();
                if (iDuration == 0) {
                    iDuration = 1000;
                }
                if (this.f11513jg || Math.abs(iDuration - this.f11515lh) >= 60) {
                    this.f11515lh = (int) ((jUptimeMillis - this.vt) % ((long) iDuration));
                } else {
                    this.f11515lh = iDuration;
                    this.ryl = true;
                }
            }
            ouw(canvas);
            ouw();
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.lh("GifView", "onDraw->Throwable->", th2);
        }
    }

    public final void setRepeatConfig(boolean z10) {
        AnimatedImageDrawable animatedImageDrawable;
        this.f11513jg = z10;
        if (z10) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28 || (animatedImageDrawable = this.yu) == null) {
                return;
            }
            animatedImageDrawable.setRepeatCount(0);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ko.lh("GifView", "setRepeatConfig error", e10);
        }
    }

    public mwh(Context context) {
        boolean z10;
        super(context);
        if (Build.VERSION.SDK_INT >= 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.fkw = z10;
        this.f11514le = false;
        this.mwh = true;
        this.f11513jg = true;
        if (!z10) {
            setLayerType(1, null);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.ouw != null && !this.fkw) {
            this.f11516ra = (getWidth() - this.tlj) / 2.0f;
            this.pno = (getHeight() - this.f11512cf) / 2.0f;
        }
        if (getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.mwh = z11;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        Movie movie;
        float f10;
        float f11;
        int size;
        int size2;
        super.onMeasure(i10, i11);
        if (!this.fkw && (movie = this.ouw) != null) {
            int iWidth = movie.width();
            int iHeight = this.ouw.height();
            if (View.MeasureSpec.getMode(i10) != 0 && iWidth > (size2 = View.MeasureSpec.getSize(i10))) {
                f10 = iWidth / size2;
            } else {
                f10 = 1.0f;
            }
            if (View.MeasureSpec.getMode(i11) != 0 && iHeight > (size = View.MeasureSpec.getSize(i11))) {
                f11 = iHeight / size;
            } else {
                f11 = 1.0f;
            }
            float fMax = 1.0f / Math.max(f10, f11);
            this.bly = fMax;
            int i12 = (int) (iWidth * fMax);
            this.tlj = i12;
            int i13 = (int) (iHeight * fMax);
            this.f11512cf = i13;
            setMeasuredDimension(i12, i13);
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public final void onScreenStateChanged(int i10) {
        super.onScreenStateChanged(i10);
        if (this.ouw != null) {
            boolean z10 = true;
            if (i10 != 1) {
                z10 = false;
            }
            this.mwh = z10;
            ouw();
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public final void onVisibilityChanged(View view, int i10) {
        boolean z10;
        super.onVisibilityChanged(view, i10);
        if (this.ouw != null) {
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.mwh = z10;
            ouw();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (this.ouw != null) {
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.mwh = z10;
            ouw();
        }
    }

    private void ouw(Canvas canvas) {
        Movie movie = this.ouw;
        if (movie == null) {
            return;
        }
        movie.setTime(this.f11515lh);
        float f10 = this.bly;
        if (f10 == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.ouw.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f10, f10);
            Movie movie2 = this.ouw;
            float f11 = this.f11516ra;
            float f12 = this.bly;
            movie2.draw(canvas, f11 / f12, this.pno / f12);
        }
        canvas.restore();
    }
}
