package com.google.android.exoplayer2.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import chuangyuan.ycj.videolibrary.R$styleable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import g5.k0;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes11.dex */
public class DefaultTimeBar extends View implements com.google.android.exoplayer2.ui.a {
    public int A;
    public int[] B;
    public Point C;
    public boolean D;
    public long E;
    public long F;
    public long G;
    public long H;
    public int I;
    public long[] J;
    public boolean[] K;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f19921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f19922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f19923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f19924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f19925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f19926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f19927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f19928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f19929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Paint f19930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Drawable f19931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f19932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f19933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f19934o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f19935p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f19936q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f19937r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f19938s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f19939t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final StringBuilder f19940u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Formatter f19941v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Runnable f19942w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArraySet<com.google.android.exoplayer2.ui.a.InterfaceC0187a> f19943x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f19944y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f19945z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultTimeBar.this.s(false);
        }
    }

    public static int d(DisplayMetrics displayMetrics, int i10) {
        return (int) ((i10 * displayMetrics.density) + 0.5f);
    }

    public static int g(int i10) {
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | (-872415232);
    }

    public static int h(int i10) {
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | 855638016;
    }

    public static int i(int i10) {
        return i10 | ViewCompat.MEASURED_STATE_MASK;
    }

    public static int j(int i10) {
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | 855638016;
    }

    public boolean a() {
        return true;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = ((i13 - i11) - this.f19933n) / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i12 - i10) - getPaddingRight();
        int i15 = this.f19933n;
        int i16 = ((i15 - this.f19932m) / 2) + i14;
        this.f19921b.set(paddingLeft, i14, paddingRight, i15 + i14);
        Rect rect = this.f19922c;
        Rect rect2 = this.f19921b;
        int i17 = rect2.left;
        int i18 = this.f19938s;
        rect.set(i17 + i18, i16, rect2.right - i18, this.f19932m + i16);
        update();
    }

    public final void r() {
        this.D = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<com.google.android.exoplayer2.ui.a.InterfaceC0187a> it = this.f19943x.iterator();
        while (it.hasNext()) {
            it.next().f(this, getScrubberPosition());
        }
    }

    public final void s(boolean z10) {
        this.D = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<com.google.android.exoplayer2.ui.a.InterfaceC0187a> it = this.f19943x.iterator();
        while (it.hasNext()) {
            it.next().d(this, getScrubberPosition(), z10);
        }
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        boolean z10;
        super(context, attributeSet);
        this.f19921b = new Rect();
        this.f19922c = new Rect();
        this.f19923d = new Rect();
        this.f19924e = new Rect();
        Paint paint = new Paint();
        this.f19925f = paint;
        Paint paint2 = new Paint();
        this.f19926g = paint2;
        Paint paint3 = new Paint();
        this.f19927h = paint3;
        Paint paint4 = new Paint();
        this.f19928i = paint4;
        Paint paint5 = new Paint();
        this.f19929j = paint5;
        Paint paint6 = new Paint();
        this.f19930k = paint6;
        paint6.setAntiAlias(true);
        this.f19943x = new CopyOnWriteArraySet<>();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f19939t = d(displayMetrics, -50);
        int iD = d(displayMetrics, 4);
        int iD2 = d(displayMetrics, 26);
        int iD3 = d(displayMetrics, 4);
        int iD4 = d(displayMetrics, 12);
        int iD5 = d(displayMetrics, 0);
        int iD6 = d(displayMetrics, 16);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.DefaultTimeBar, 0, 0);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.DefaultTimeBar_scrubber_drawable);
                this.f19931l = drawable;
                if (drawable != null) {
                    p(drawable);
                    iD2 = Math.max(drawable.getMinimumHeight(), iD2);
                }
                this.f19932m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_bar_height, iD);
                this.f19933n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_touch_target_height, iD2);
                this.f19934o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_ad_marker_width, iD3);
                this.f19935p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_scrubber_enabled_size, iD4);
                this.f19936q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_scrubber_disabled_size, iD5);
                this.f19937r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DefaultTimeBar_scrubber_dragged_size, iD6);
                int i10 = typedArrayObtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_played_color, -1);
                int i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_scrubber_color, i(i10));
                int i12 = typedArrayObtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_buffered_color, g(i10));
                int i13 = typedArrayObtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_unplayed_color, j(i10));
                int i14 = typedArrayObtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_ad_marker_color, io.bidmachine.media3.ui.DefaultTimeBar.DEFAULT_AD_MARKER_COLOR);
                int i15 = typedArrayObtainStyledAttributes.getInt(R$styleable.DefaultTimeBar_played_ad_marker_color, h(i14));
                paint.setColor(i10);
                paint6.setColor(i11);
                paint2.setColor(i12);
                paint3.setColor(i13);
                paint4.setColor(i14);
                paint5.setColor(i15);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.f19932m = iD;
            this.f19933n = iD2;
            this.f19934o = iD3;
            this.f19935p = iD4;
            this.f19936q = iD5;
            this.f19937r = iD6;
            paint.setColor(-1);
            paint6.setColor(i(-1));
            paint2.setColor(g(-1));
            paint3.setColor(j(-1));
            paint4.setColor(io.bidmachine.media3.ui.DefaultTimeBar.DEFAULT_AD_MARKER_COLOR);
            this.f19931l = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f19940u = sb2;
        this.f19941v = new Formatter(sb2, Locale.getDefault());
        this.f19942w = new a();
        Drawable drawable2 = this.f19931l;
        if (drawable2 != null) {
            z10 = true;
            this.f19938s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            z10 = true;
            this.f19938s = (Math.max(this.f19936q, Math.max(this.f19935p, this.f19937r)) + 1) / 2;
        }
        this.F = -9223372036854775807L;
        this.f19945z = -9223372036854775807L;
        this.f19944y = 20;
        setFocusable(z10);
        if (k0.f53108a >= 16) {
            l();
        }
    }

    private long getPositionIncrement() {
        long j10 = this.f19945z;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = this.F;
        if (j11 == -9223372036854775807L) {
            return 0L;
        }
        return j11 / ((long) this.f19944y);
    }

    private String getProgressText() {
        return k0.V(this.f19940u, this.f19941v, this.G);
    }

    private long getScrubberPosition() {
        if (this.f19922c.width() <= 0 || this.F == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f19924e.width()) * this.F) / ((long) this.f19922c.width());
    }

    public static boolean q(Drawable drawable, int i10) {
        return k0.f53108a >= 23 && drawable.setLayoutDirection(i10);
    }

    private void update() {
        this.f19923d.set(this.f19922c);
        this.f19924e.set(this.f19922c);
        long j10 = this.D ? this.E : this.G;
        if (this.F > 0) {
            int iWidth = (int) ((((long) this.f19922c.width()) * this.H) / this.F);
            Rect rect = this.f19923d;
            Rect rect2 = this.f19922c;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f19922c.width()) * j10) / this.F);
            Rect rect3 = this.f19924e;
            Rect rect4 = this.f19922c;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f19923d;
            int i10 = this.f19922c.left;
            rect5.right = i10;
            this.f19924e.right = i10;
        }
        invalidate(this.f19921b);
    }

    @Override // com.google.android.exoplayer2.ui.a
    public void b(com.google.android.exoplayer2.ui.a.InterfaceC0187a interfaceC0187a) {
        this.f19943x.add(interfaceC0187a);
    }

    public final void e(Canvas canvas) {
        int i10;
        if (this.F <= 0) {
            return;
        }
        Rect rect = this.f19924e;
        int iQ = k0.q(rect.right, rect.left, this.f19922c.right);
        int iCenterY = this.f19924e.centerY();
        Drawable drawable = this.f19931l;
        if (drawable == null) {
            if (this.D || isFocused()) {
                i10 = this.f19937r;
            } else {
                i10 = isEnabled() ? this.f19935p : this.f19936q;
            }
            canvas.drawCircle(iQ, iCenterY, i10 / 2, this.f19930k);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        int intrinsicHeight = this.f19931l.getIntrinsicHeight() / 2;
        this.f19931l.setBounds(iQ - intrinsicWidth, iCenterY - intrinsicHeight, iQ + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f19931l.draw(canvas);
    }

    public final void f(Canvas canvas) {
        int iHeight = this.f19922c.height();
        int iCenterY = this.f19922c.centerY() - (iHeight / 2);
        int i10 = iHeight + iCenterY;
        if (this.F <= 0) {
            Rect rect = this.f19922c;
            canvas.drawRect(rect.left, iCenterY, rect.right, i10, this.f19927h);
            return;
        }
        Rect rect2 = this.f19923d;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int iMax = Math.max(Math.max(this.f19922c.left, i12), this.f19924e.right);
        int i13 = this.f19922c.right;
        if (iMax < i13) {
            canvas.drawRect(iMax, iCenterY, i13, i10, this.f19927h);
        }
        int iMax2 = Math.max(i11, this.f19924e.right);
        if (i12 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i12, i10, this.f19926g);
        }
        if (this.f19924e.width() > 0) {
            Rect rect3 = this.f19924e;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i10, this.f19925f);
        }
        int i14 = this.f19934o / 2;
        for (int i15 = 0; i15 < this.I; i15++) {
            int iWidth = ((int) ((((long) this.f19922c.width()) * k0.r(this.J[i15], 0L, this.F)) / this.F)) - i14;
            Rect rect4 = this.f19922c;
            int iMin = rect4.left + Math.min(rect4.width() - this.f19934o, Math.max(0, iWidth));
            canvas.drawRect(iMin, iCenterY, iMin + this.f19934o, i10, this.K[i15] ? this.f19929j : this.f19928i);
        }
    }

    public final boolean k(float f10, float f11) {
        return this.f19921b.contains((int) f10, (int) f11);
    }

    public final void m(float f10) {
        Rect rect = this.f19924e;
        Rect rect2 = this.f19922c;
        rect.right = k0.q((int) f10, rect2.left, rect2.right);
    }

    public final Point n(MotionEvent motionEvent) {
        if (this.B == null) {
            this.B = new int[2];
            this.C = new Point();
        }
        getLocationOnScreen(this.B);
        this.C.set(((int) motionEvent.getRawX()) - this.B[0], ((int) motionEvent.getRawY()) - this.B[1]);
        return this.C;
    }

    public final boolean o(long j10) {
        if (this.F <= 0) {
            return false;
        }
        long scrubberPosition = getScrubberPosition();
        long jR = k0.r(scrubberPosition + j10, 0L, this.F);
        this.E = jR;
        if (jR == scrubberPosition) {
            return false;
        }
        if (!this.D) {
            r();
        }
        Iterator<com.google.android.exoplayer2.ui.a.InterfaceC0187a> it = this.f19943x.iterator();
        while (it.hasNext()) {
            it.next().e(this, this.E);
        }
        update();
        return true;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f19931l;
        if (drawable == null || !q(drawable, i10)) {
            return;
        }
        invalidate();
    }

    public final boolean p(Drawable drawable) {
        return k0.f53108a >= 23 && q(drawable, getLayoutDirection());
    }

    @Override // com.google.android.exoplayer2.ui.a
    public void setAdGroupTimesMs(@Nullable long[] jArr, @Nullable boolean[] zArr, int i10) {
        g5.a.a(i10 == 0 || !(jArr == null || zArr == null));
        this.I = i10;
        this.J = jArr;
        this.K = zArr;
        update();
    }

    public void setAdMarkerColor(@ColorInt int i10) {
        this.f19928i.setColor(i10);
        invalidate(this.f19921b);
    }

    public void setBufferedColor(@ColorInt int i10) {
        this.f19926g.setColor(i10);
        invalidate(this.f19921b);
    }

    @Override // com.google.android.exoplayer2.ui.a
    public void setBufferedPosition(long j10) {
        this.H = j10;
        update();
    }

    @Override // com.google.android.exoplayer2.ui.a
    public void setDuration(long j10) {
        this.F = j10;
        if (this.D && j10 == -9223372036854775807L) {
            s(true);
        }
        update();
    }

    public void setKeyCountIncrement(int i10) {
        g5.a.a(i10 > 0);
        this.f19944y = i10;
        this.f19945z = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        g5.a.a(j10 > 0);
        this.f19944y = -1;
        this.f19945z = j10;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i10) {
        this.f19929j.setColor(i10);
        invalidate(this.f19921b);
    }

    public void setPlayedColor(@ColorInt int i10) {
        this.f19925f.setColor(i10);
        invalidate(this.f19921b);
    }

    @Override // com.google.android.exoplayer2.ui.a
    public void setPosition(long j10) {
        this.G = j10;
        setContentDescription(getProgressText());
        update();
    }

    public void setScrubberColor(@ColorInt int i10) {
        this.f19930k.setColor(i10);
        invalidate(this.f19921b);
    }

    public void setUnplayedColor(@ColorInt int i10) {
        this.f19927h.setColor(i10);
        invalidate(this.f19921b);
    }

    public final void t() {
        Drawable drawable = this.f19931l;
        if (drawable != null && drawable.isStateful() && this.f19931l.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        t();
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f19931l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @TargetApi(16)
    public final void l() {
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        f(canvas);
        e(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName(DefaultTimeBar.class.getName());
    }

    @Override // android.view.View
    @TargetApi(21)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(DefaultTimeBar.class.getCanonicalName());
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.F <= 0) {
            return;
        }
        int i10 = k0.f53108a;
        if (i10 >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else if (i10 >= 16) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i10 != 66) {
                switch (i10) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (o(positionIncrement)) {
                            removeCallbacks(this.f19942w);
                            postDelayed(this.f19942w, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (o(positionIncrement)) {
                            removeCallbacks(this.f19942w);
                            postDelayed(this.f19942w, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.D) {
                            removeCallbacks(this.f19942w);
                            this.f19942w.run();
                            return true;
                        }
                        break;
                }
            } else if (this.D) {
                removeCallbacks(this.f19942w);
                this.f19942w.run();
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f19933n;
        } else if (mode != 1073741824) {
            size = Math.min(this.f19933n, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        t();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        if (isEnabled() && this.F > 0) {
            Point pointN = n(motionEvent);
            int i10 = pointN.x;
            int i11 = pointN.y;
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            if (this.D) {
                                if (motionEvent.getAction() == 3) {
                                    z10 = true;
                                }
                                s(z10);
                                return true;
                            }
                        }
                    } else if (this.D) {
                        if (i11 < this.f19939t) {
                            int i12 = this.A;
                            m(i12 + ((i10 - i12) / 3));
                        } else {
                            this.A = i10;
                            m(i10);
                        }
                        this.E = getScrubberPosition();
                        Iterator<com.google.android.exoplayer2.ui.a.InterfaceC0187a> it = this.f19943x.iterator();
                        while (it.hasNext()) {
                            it.next().e(this, this.E);
                        }
                        update();
                        invalidate();
                        return true;
                    }
                } else if (this.D) {
                    if (motionEvent.getAction() == 3) {
                        z10 = true;
                    }
                    s(z10);
                    return true;
                }
            } else {
                float f10 = i10;
                if (k(f10, i11)) {
                    m(f10);
                    r();
                    this.E = getScrubberPosition();
                    update();
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    @TargetApi(16)
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.F <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (o(-getPositionIncrement())) {
                s(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (o(getPositionIncrement())) {
                s(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.a
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (this.D && !z10) {
            s(true);
        }
    }
}
