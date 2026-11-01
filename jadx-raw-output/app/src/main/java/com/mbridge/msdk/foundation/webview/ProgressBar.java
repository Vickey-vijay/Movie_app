package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes6.dex */
public class ProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Runnable f35417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f35418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f35419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f35420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f35421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f35422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f35423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Handler f35424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f35425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f35426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f35427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f35428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f35429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f35430n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f35431o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f35432p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Rect f35433q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f35434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f35435s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f35436t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f35437u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f35438v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f35439w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f35440x;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar.this.invalidate();
        }
    }

    public ProgressBar(Context context) {
        super(context);
        this.f35417a = new a();
        this.f35423g = 25L;
        this.f35424h = new Handler(Looper.getMainLooper());
        this.f35427k = false;
        this.f35430n = 0.95f;
        this.f35431o = false;
        this.f35433q = new Rect();
        a(context);
    }

    private void a(Context context) {
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z10) {
        return null;
    }

    public void setProgressBarListener(c cVar) {
    }

    public void setProgressState(int i10) {
        if (i10 == 5) {
            this.f35437u = 1;
            this.f35438v = 0;
            this.f35439w = 0;
            this.f35440x = 0L;
            return;
        }
        if (i10 == 6) {
            this.f35438v = 1;
            if (this.f35439w == 1) {
                startEndAnimation();
            }
            this.f35440x = 0L;
            return;
        }
        if (i10 == 7) {
            startEndAnimation();
        } else {
            if (i10 != 8) {
                return;
            }
            this.f35439w = 1;
            if (this.f35438v == 1) {
                startEndAnimation();
            }
        }
    }

    private void a(Canvas canvas, float f10) {
        Drawable drawable;
        Drawable drawable2;
        if (this.f35436t) {
            float f11 = this.f35422f;
            float f12 = this.f35435s * 0.5f;
            int i10 = (int) ((1.0f - (f11 / f12)) * 255.0f);
            if (i10 < 0) {
                i10 = 0;
            }
            if (f11 > f12) {
                setVisible(false);
            }
            Drawable drawable3 = this.f35434r;
            if (drawable3 != null) {
                drawable3.setAlpha(i10);
            }
            Drawable drawable4 = this.f35421e;
            if (drawable4 != null) {
                drawable4.setAlpha(i10);
            }
            Drawable drawable5 = this.f35432p;
            if (drawable5 != null) {
                drawable5.setAlpha(i10);
            }
            canvas.save();
            canvas.translate(this.f35422f, 0.0f);
        }
        if (this.f35434r != null && this.f35432p != null) {
            int iWidth = (int) (this.f35433q.width() - (this.f35432p.getIntrinsicWidth() * 0.05f));
            Drawable drawable6 = this.f35434r;
            drawable6.setBounds(0, 0, iWidth, drawable6.getIntrinsicHeight());
            this.f35434r.draw(canvas);
        }
        if (this.f35436t && (drawable2 = this.f35421e) != null && this.f35432p != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.f35421e;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, 0.0f);
            this.f35421e.draw(canvas);
            canvas.restore();
        }
        if (this.f35432p != null) {
            canvas.save();
            canvas.translate(this.f35433q.width() - getWidth(), 0.0f);
            this.f35432p.draw(canvas);
            canvas.restore();
        }
        if (!this.f35436t && Math.abs(this.f35418b - this.f35430n) < 1.0E-5f && (drawable = this.f35425i) != null) {
            int i11 = (int) (this.f35426j + (f10 * 0.2f * this.f35435s));
            this.f35426j = i11;
            if (i11 + drawable.getIntrinsicWidth() >= this.f35433q.width()) {
                this.f35426j = -this.f35425i.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.f35426j, 0.0f);
            this.f35425i.draw(canvas);
            canvas.restore();
        }
        if (this.f35436t) {
            canvas.restore();
        }
    }

    private float getVelocity() {
        if (this.f35436t) {
            return this.f35428l ? 1.0f : 0.4f;
        }
        if (this.f35440x >= 2000) {
            return 0.05f;
        }
        if (this.f35438v == 1) {
            return this.f35428l ? 1.0f : 0.4f;
        }
        if (this.f35437u == 1) {
            return this.f35428l ? 0.4f : 0.2f;
        }
        return this.f35428l ? 0.2f : 0.05f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.f35427k) {
            this.f35427k = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f35431o ? 0L : jCurrentTimeMillis - this.f35429m;
        this.f35420d = Math.abs(j10 / 1000.0f);
        this.f35429m = jCurrentTimeMillis;
        this.f35440x += j10;
        float velocity = getVelocity();
        this.f35419c = velocity;
        float f10 = this.f35418b + (velocity * this.f35420d);
        this.f35418b = f10;
        if (!this.f35436t) {
            float f11 = this.f35430n;
            if (f10 > f11) {
                this.f35418b = f11;
            }
        }
        this.f35433q.right = (int) (this.f35418b * this.f35435s);
        this.f35424h.removeCallbacksAndMessages(null);
        this.f35424h.postDelayed(this.f35417a, this.f35423g);
        super.draw(canvas);
        a(canvas, this.f35420d);
    }

    public float getProgress() {
        return this.f35418b;
    }

    public void initResource(boolean z10) {
        if (z10 || (this.f35425i == null && this.f35432p == null && this.f35434r == null && this.f35421e == null)) {
            Drawable drawable = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_highlight", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f35425i = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f35425i.getIntrinsicHeight());
            }
            Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_head", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f35432p = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f35432p.getIntrinsicHeight());
            }
            this.f35434r = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_tail", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f35421e = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_end_animation", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        }
    }

    public void onThemeChange() {
        if (this.f35427k) {
            initResource(true);
        }
    }

    public void setPaused(boolean z10) {
        this.f35431o = z10;
        if (z10) {
            return;
        }
        this.f35429m = System.currentTimeMillis();
    }

    public void setProgress(float f10, boolean z10) {
        if (!z10 || f10 < 1.0f) {
            return;
        }
        startEndAnimation();
    }

    public void setVisible(boolean z10) {
        if (!z10) {
            setVisibility(4);
            return;
        }
        this.f35428l = true;
        this.f35429m = System.currentTimeMillis();
        this.f35420d = 0.0f;
        this.f35440x = 0L;
        this.f35436t = false;
        this.f35422f = 0.0f;
        this.f35418b = 0.0f;
        this.f35435s = getMeasuredWidth();
        this.f35431o = false;
        this.f35437u = 0;
        this.f35438v = 0;
        this.f35439w = 0;
        Drawable drawable = this.f35425i;
        if (drawable != null) {
            this.f35426j = -drawable.getIntrinsicWidth();
        } else {
            this.f35426j = 0;
        }
        Drawable drawable2 = this.f35434r;
        if (drawable2 != null) {
            drawable2.setAlpha(255);
        }
        Drawable drawable3 = this.f35421e;
        if (drawable3 != null) {
            drawable3.setAlpha(255);
        }
        Drawable drawable4 = this.f35432p;
        if (drawable4 != null) {
            drawable4.setAlpha(255);
        }
        setVisibility(0);
        invalidate();
    }

    public void startEndAnimation() {
        if (this.f35436t) {
            return;
        }
        this.f35436t = true;
        this.f35422f = 0.0f;
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f35435s = getMeasuredWidth();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Drawable drawable = this.f35425i;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (((double) drawable.getIntrinsicWidth()) * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f35432p;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35417a = new a();
        this.f35423g = 25L;
        this.f35424h = new Handler(Looper.getMainLooper());
        this.f35427k = false;
        this.f35430n = 0.95f;
        this.f35431o = false;
        this.f35433q = new Rect();
        a(context);
    }
}
