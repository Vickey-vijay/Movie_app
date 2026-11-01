package com.xw.repo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.xw.repo.bubbleseekbar.R$color;
import com.xw.repo.bubbleseekbar.R$styleable;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes10.dex */
public class BubbleSeekBar extends View {
    public boolean A;
    public long B;
    public boolean C;
    public long D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public boolean O;
    public int P;
    public boolean Q;
    public SparseArray<String> R;
    public float S;
    public boolean T;
    public k U;
    public float V;
    public float W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Paint f45507a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f45508b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Rect f45509b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f45510c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public WindowManager f45511c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f45512d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public i f45513d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45514e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f45515e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45516f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f45517f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45518g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f45519g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45520h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f45521h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45522i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public WindowManager.LayoutParams f45523i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45524j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int[] f45525j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45526k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f45527k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f45528l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f45529l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45530m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f45531m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f45532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45533o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f45534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f45535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f45536r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f45537s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f45538t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f45539u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f45540v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f45541w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f45542x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f45543y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f45544z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.requestLayout();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.f45527k0 = false;
            BubbleSeekBar.this.z();
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            BubbleSeekBar.this.O = false;
            BubbleSeekBar.this.invalidate();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BubbleSeekBar.this.O = false;
            BubbleSeekBar.this.invalidate();
        }
    }

    public class d implements Runnable {

        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                if (!BubbleSeekBar.this.C) {
                    BubbleSeekBar.this.G();
                }
                BubbleSeekBar.this.O = false;
                BubbleSeekBar.this.invalidate();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!BubbleSeekBar.this.C) {
                    BubbleSeekBar.this.G();
                }
                BubbleSeekBar.this.O = false;
                BubbleSeekBar.this.invalidate();
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.f45513d0.animate().alpha(BubbleSeekBar.this.C ? 1.0f : 0.0f).setDuration(BubbleSeekBar.this.B).setListener(new a()).start();
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BubbleSeekBar.this.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BubbleSeekBar bubbleSeekBar = BubbleSeekBar.this;
            bubbleSeekBar.f45512d = bubbleSeekBar.C();
            if (BubbleSeekBar.this.E) {
                BubbleSeekBar.this.M();
            } else {
                BubbleSeekBar bubbleSeekBar2 = BubbleSeekBar.this;
                bubbleSeekBar2.f45521h0 = bubbleSeekBar2.B();
                BubbleSeekBar.this.f45523i0.x = (int) (BubbleSeekBar.this.f45521h0 + 0.5f);
                if (BubbleSeekBar.this.f45513d0.getParent() != null) {
                    BubbleSeekBar.this.f45511c0.updateViewLayout(BubbleSeekBar.this.f45513d0, BubbleSeekBar.this.f45523i0);
                }
                BubbleSeekBar.this.f45513d0.a(BubbleSeekBar.this.f45542x ? String.valueOf(BubbleSeekBar.this.getProgressFloat()) : String.valueOf(BubbleSeekBar.this.getProgress()));
            }
            BubbleSeekBar.this.invalidate();
            if (BubbleSeekBar.this.U != null) {
                k kVar = BubbleSeekBar.this.U;
                BubbleSeekBar bubbleSeekBar3 = BubbleSeekBar.this;
                kVar.b(bubbleSeekBar3, bubbleSeekBar3.getProgress(), BubbleSeekBar.this.getProgressFloat(), true);
            }
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (!BubbleSeekBar.this.E && !BubbleSeekBar.this.C) {
                BubbleSeekBar.this.G();
            }
            BubbleSeekBar bubbleSeekBar = BubbleSeekBar.this;
            bubbleSeekBar.f45512d = bubbleSeekBar.C();
            BubbleSeekBar.this.O = false;
            BubbleSeekBar.this.f45527k0 = true;
            BubbleSeekBar.this.invalidate();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!BubbleSeekBar.this.E && !BubbleSeekBar.this.C) {
                BubbleSeekBar.this.G();
            }
            BubbleSeekBar bubbleSeekBar = BubbleSeekBar.this;
            bubbleSeekBar.f45512d = bubbleSeekBar.C();
            BubbleSeekBar.this.O = false;
            BubbleSeekBar.this.f45527k0 = true;
            BubbleSeekBar.this.invalidate();
            if (BubbleSeekBar.this.U != null) {
                k kVar = BubbleSeekBar.this.U;
                BubbleSeekBar bubbleSeekBar2 = BubbleSeekBar.this;
                kVar.a(bubbleSeekBar2, bubbleSeekBar2.getProgress(), BubbleSeekBar.this.getProgressFloat(), true);
            }
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BubbleSeekBar.this.f45511c0.addView(BubbleSeekBar.this.f45513d0, BubbleSeekBar.this.f45523i0);
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.N();
            BubbleSeekBar.this.Q = true;
        }
    }

    public class i extends View {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Paint f45554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Path f45555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RectF f45556d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Rect f45557e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f45558f;

        public i(BubbleSeekBar bubbleSeekBar, Context context) {
            this(bubbleSeekBar, context, null);
        }

        public i(BubbleSeekBar bubbleSeekBar, Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public void a(String str) {
            if (str == null || this.f45558f.equals(str)) {
                return;
            }
            this.f45558f = str;
            invalidate();
        }

        public i(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f45558f = "";
            Paint paint = new Paint();
            this.f45554b = paint;
            paint.setAntiAlias(true);
            this.f45554b.setTextAlign(Paint.Align.CENTER);
            this.f45555c = new Path();
            this.f45556d = new RectF();
            this.f45557e = new Rect();
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            this.f45555c.reset();
            float measuredWidth = getMeasuredWidth() / 2.0f;
            float measuredHeight = getMeasuredHeight() - (BubbleSeekBar.this.f45515e0 / 3.0f);
            this.f45555c.moveTo(measuredWidth, measuredHeight);
            float measuredWidth2 = (float) (((double) (getMeasuredWidth() / 2.0f)) - ((Math.sqrt(3.0d) / 2.0d) * ((double) BubbleSeekBar.this.f45515e0)));
            float f10 = BubbleSeekBar.this.f45515e0 * 1.5f;
            this.f45555c.quadTo(measuredWidth2 - ed.a.a(2), f10 - ed.a.a(2), measuredWidth2, f10);
            this.f45555c.arcTo(this.f45556d, 150.0f, 240.0f);
            this.f45555c.quadTo(((float) (((double) (getMeasuredWidth() / 2.0f)) + ((Math.sqrt(3.0d) / 2.0d) * ((double) BubbleSeekBar.this.f45515e0)))) + ed.a.a(2), f10 - ed.a.a(2), measuredWidth, measuredHeight);
            this.f45555c.close();
            this.f45554b.setColor(BubbleSeekBar.this.G);
            canvas.drawPath(this.f45555c, this.f45554b);
            this.f45554b.setTextSize(BubbleSeekBar.this.H);
            this.f45554b.setColor(BubbleSeekBar.this.I);
            Paint paint = this.f45554b;
            String str = this.f45558f;
            paint.getTextBounds(str, 0, str.length(), this.f45557e);
            Paint.FontMetrics fontMetrics = this.f45554b.getFontMetrics();
            float f11 = BubbleSeekBar.this.f45515e0;
            float f12 = fontMetrics.descent;
            canvas.drawText(this.f45558f, getMeasuredWidth() / 2.0f, (f11 + ((f12 - fontMetrics.ascent) / 2.0f)) - f12, this.f45554b);
        }

        @Override // android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            setMeasuredDimension(BubbleSeekBar.this.f45515e0 * 3, BubbleSeekBar.this.f45515e0 * 3);
            this.f45556d.set((getMeasuredWidth() / 2.0f) - BubbleSeekBar.this.f45515e0, 0.0f, (getMeasuredWidth() / 2.0f) + BubbleSeekBar.this.f45515e0, BubbleSeekBar.this.f45515e0 * 2);
        }
    }

    public interface j {
        @NonNull
        SparseArray<String> a(int i10, @NonNull SparseArray<String> sparseArray);
    }

    public interface k {
        void a(BubbleSeekBar bubbleSeekBar, int i10, float f10, boolean z10);

        void b(BubbleSeekBar bubbleSeekBar, int i10, float f10, boolean z10);

        void c(BubbleSeekBar bubbleSeekBar, int i10, float f10);
    }

    public BubbleSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final float F(float f10) {
        return BigDecimal.valueOf(f10).setScale(1, 4).floatValue();
    }

    public final void z() {
        float f10 = 0.0f;
        int i10 = 0;
        while (i10 <= this.f45530m) {
            float f11 = this.N;
            f10 = (i10 * f11) + this.V;
            float f12 = this.L;
            if (f10 <= f12 && f12 - f10 <= f11) {
                break;
            } else {
                i10++;
            }
        }
        boolean z10 = BigDecimal.valueOf((double) this.L).setScale(1, 4).floatValue() == f10;
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = null;
        if (!z10) {
            float f13 = this.L;
            float f14 = f13 - f10;
            float f15 = this.N;
            valueAnimatorOfFloat = f14 <= f15 / 2.0f ? ValueAnimator.ofFloat(f13, f10) : ValueAnimator.ofFloat(f13, ((i10 + 1) * f15) + this.V);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new e());
        }
        if (!this.E) {
            i iVar = this.f45513d0;
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = this.C ? 1.0f : 0.0f;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(iVar, (Property<i, Float>) property, fArr);
            if (z10) {
                animatorSet.setDuration(this.B).play(objectAnimatorOfFloat);
            } else {
                animatorSet.setDuration(this.B).playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat);
            }
        } else if (!z10) {
            animatorSet.setDuration(this.B).playTogether(valueAnimatorOfFloat);
        }
        animatorSet.addListener(new f());
        animatorSet.start();
    }

    public BubbleSeekBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45537s = -1;
        this.R = new SparseArray<>();
        this.f45525j0 = new int[2];
        this.f45527k0 = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BubbleSeekBar, i10, 0);
        this.f45508b = typedArrayObtainStyledAttributes.getFloat(R$styleable.BubbleSeekBar_bsb_min, 0.0f);
        this.f45510c = typedArrayObtainStyledAttributes.getFloat(R$styleable.BubbleSeekBar_bsb_max, 100.0f);
        this.f45512d = typedArrayObtainStyledAttributes.getFloat(R$styleable.BubbleSeekBar_bsb_progress, this.f45508b);
        this.f45514e = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_is_float_type, false);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_track_size, ed.a.a(2));
        this.f45516f = dimensionPixelSize;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_second_track_size, dimensionPixelSize + ed.a.a(2));
        this.f45518g = dimensionPixelSize2;
        this.f45520h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_thumb_radius, dimensionPixelSize2 + ed.a.a(2));
        this.f45522i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_thumb_radius_on_dragging, this.f45518g * 2);
        this.f45530m = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_section_count, 10);
        this.f45524j = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_track_color, ContextCompat.getColor(context, R$color.colorPrimary));
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_second_track_color, ContextCompat.getColor(context, R$color.colorAccent));
        this.f45526k = color;
        this.f45528l = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_thumb_color, color);
        this.f45534p = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_show_section_text, false);
        this.f45535q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_section_text_size, ed.a.c(14));
        this.f45536r = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_section_text_color, this.f45524j);
        this.f45544z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_seek_step_section, false);
        this.A = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_seek_by_section, false);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_section_text_position, -1);
        if (integer == 0) {
            this.f45537s = 0;
        } else if (integer == 1) {
            this.f45537s = 1;
        } else if (integer == 2) {
            this.f45537s = 2;
        } else {
            this.f45537s = -1;
        }
        this.f45538t = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_section_text_interval, 1);
        this.f45539u = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_show_thumb_text, false);
        this.f45540v = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_thumb_text_size, ed.a.c(14));
        this.f45541w = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_thumb_text_color, this.f45526k);
        this.G = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_bubble_color, this.f45526k);
        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_bubble_text_size, ed.a.c(14));
        this.I = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_bubble_text_color, -1);
        this.f45532n = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_show_section_mark, false);
        this.f45533o = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_auto_adjust_section_mark, false);
        this.f45542x = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_show_progress_in_float, false);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_anim_duration, -1);
        this.B = integer2 < 0 ? 200L : integer2;
        this.f45543y = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_touch_to_seek, false);
        this.C = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_always_show_bubble, false);
        int integer3 = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_always_show_bubble_delay, 0);
        this.D = integer3 < 0 ? 0L : integer3;
        this.E = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_hide_bubble, false);
        this.F = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_rtl, false);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_android_enabled, isEnabled()));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f45507a0 = paint;
        paint.setAntiAlias(true);
        this.f45507a0.setStrokeCap(Paint.Cap.ROUND);
        this.f45507a0.setTextAlign(Paint.Align.CENTER);
        this.f45509b0 = new Rect();
        this.P = ed.a.a(2);
        H();
        if (this.E) {
            return;
        }
        this.f45511c0 = (WindowManager) context.getSystemService("window");
        i iVar = new i(this, context);
        this.f45513d0 = iVar;
        iVar.a(this.f45542x ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f45523i0 = layoutParams;
        layoutParams.gravity = BadgeDrawable.TOP_START;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.flags = 524328;
        if (ed.a.b() || Build.VERSION.SDK_INT >= 25) {
            this.f45523i0.type = 2;
        } else {
            this.f45523i0.type = 2005;
        }
        D();
    }

    public final float A(float f10) {
        float f11 = this.V;
        if (f10 <= f11) {
            return f11;
        }
        float f12 = this.W;
        if (f10 >= f12) {
            return f12;
        }
        float f13 = 0.0f;
        int i10 = 0;
        while (i10 <= this.f45530m) {
            float f14 = this.N;
            f13 = (i10 * f14) + this.V;
            if (f13 <= f10 && f10 - f13 <= f14) {
                break;
            }
            i10++;
        }
        float f15 = f10 - f13;
        float f16 = this.N;
        return f15 <= f16 / 2.0f ? f13 : ((i10 + 1) * f16) + this.V;
    }

    public final float B() {
        return this.F ? this.f45517f0 - ((this.M * (this.f45512d - this.f45508b)) / this.J) : this.f45517f0 + ((this.M * (this.f45512d - this.f45508b)) / this.J);
    }

    public final float C() {
        float f10;
        float f11;
        if (this.F) {
            f10 = ((this.W - this.L) * this.J) / this.M;
            f11 = this.f45508b;
        } else {
            f10 = ((this.L - this.V) * this.J) / this.M;
            f11 = this.f45508b;
        }
        return f10 + f11;
    }

    public final void D() {
        String strE;
        String strE2;
        this.f45507a0.setTextSize(this.H);
        if (this.f45542x) {
            strE = E(this.F ? this.f45510c : this.f45508b);
        } else if (this.F) {
            strE = this.f45514e ? E(this.f45510c) : String.valueOf((int) this.f45510c);
        } else {
            strE = this.f45514e ? E(this.f45508b) : String.valueOf((int) this.f45508b);
        }
        this.f45507a0.getTextBounds(strE, 0, strE.length(), this.f45509b0);
        int iWidth = (this.f45509b0.width() + (this.P * 2)) >> 1;
        if (this.f45542x) {
            strE2 = E(this.F ? this.f45508b : this.f45510c);
        } else if (this.F) {
            strE2 = this.f45514e ? E(this.f45508b) : String.valueOf((int) this.f45508b);
        } else {
            strE2 = this.f45514e ? E(this.f45510c) : String.valueOf((int) this.f45510c);
        }
        this.f45507a0.getTextBounds(strE2, 0, strE2.length(), this.f45509b0);
        int iWidth2 = (this.f45509b0.width() + (this.P * 2)) >> 1;
        int iA = ed.a.a(14);
        this.f45515e0 = iA;
        this.f45515e0 = Math.max(iA, Math.max(iWidth, iWidth2)) + this.P;
    }

    public final void G() {
        i iVar = this.f45513d0;
        if (iVar == null) {
            return;
        }
        iVar.setVisibility(8);
        if (this.f45513d0.getParent() != null) {
            this.f45511c0.removeViewImmediate(this.f45513d0);
        }
    }

    public final void H() {
        if (this.f45508b == this.f45510c) {
            this.f45508b = 0.0f;
            this.f45510c = 100.0f;
        }
        float f10 = this.f45508b;
        float f11 = this.f45510c;
        if (f10 > f11) {
            this.f45510c = f10;
            this.f45508b = f11;
        }
        float f12 = this.f45512d;
        float f13 = this.f45508b;
        if (f12 < f13) {
            this.f45512d = f13;
        }
        float f14 = this.f45512d;
        float f15 = this.f45510c;
        if (f14 > f15) {
            this.f45512d = f15;
        }
        int i10 = this.f45518g;
        int i11 = this.f45516f;
        if (i10 < i11) {
            this.f45518g = i11 + ed.a.a(2);
        }
        int i12 = this.f45520h;
        int i13 = this.f45518g;
        if (i12 <= i13) {
            this.f45520h = i13 + ed.a.a(2);
        }
        int i14 = this.f45522i;
        int i15 = this.f45518g;
        if (i14 <= i15) {
            this.f45522i = i15 * 2;
        }
        if (this.f45530m <= 0) {
            this.f45530m = 10;
        }
        float f16 = this.f45510c - this.f45508b;
        this.J = f16;
        float f17 = f16 / this.f45530m;
        this.K = f17;
        if (f17 < 1.0f) {
            this.f45514e = true;
        }
        if (this.f45514e) {
            this.f45542x = true;
        }
        int i16 = this.f45537s;
        if (i16 != -1) {
            this.f45534p = true;
        }
        if (this.f45534p) {
            if (i16 == -1) {
                this.f45537s = 0;
            }
            if (this.f45537s == 2) {
                this.f45532n = true;
            }
        }
        if (this.f45538t < 1) {
            this.f45538t = 1;
        }
        I();
        if (this.f45544z) {
            this.A = false;
            this.f45533o = false;
        }
        if (this.f45533o && !this.f45532n) {
            this.f45533o = false;
        }
        if (this.A) {
            float f18 = this.f45508b;
            this.f45529l0 = f18;
            if (this.f45512d != f18) {
                this.f45529l0 = this.K;
            }
            this.f45532n = true;
            this.f45533o = true;
        }
        if (this.E) {
            this.C = false;
        }
        if (this.C) {
            setProgress(this.f45512d);
        }
        this.f45540v = (this.f45514e || this.A || (this.f45534p && this.f45537s == 2)) ? this.f45535q : this.f45540v;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004e A[PHI: r5
  0x004e: PHI (r5v3 float) = (r5v2 float), (r5v2 float), (r5v2 float), (r5v7 float) binds: [B:26:0x0049, B:27:0x004b, B:19:0x002e, B:25:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x0059, please report this as an issue */
    public final void I() {
        String strE;
        int i10 = 0;
        boolean z10 = this.f45537s == 2;
        boolean z11 = this.f45538t > 1 && this.f45530m % 2 == 0;
        while (true) {
            int i11 = this.f45530m;
            if (i10 > i11) {
                return;
            }
            boolean z12 = this.F;
            float f10 = z12 ? this.f45510c - (this.K * i10) : this.f45508b + (this.K * i10);
            if (z10) {
                if (!z11) {
                    SparseArray<String> sparseArray = this.R;
                    if (this.f45514e) {
                        strE = E(f10);
                    } else {
                        strE = ((int) f10) + "";
                    }
                    sparseArray.put(i10, strE);
                } else if (i10 % this.f45538t == 0) {
                    f10 = z12 ? this.f45510c - (this.K * i10) : this.f45508b + (this.K * i10);
                    SparseArray<String> sparseArray2 = this.R;
                    if (this.f45514e) {
                        strE = E(f10);
                    } else {
                        strE = ((int) f10) + "";
                    }
                    sparseArray2.put(i10, strE);
                }
            } else if (i10 == 0 || i10 == i11) {
                SparseArray<String> sparseArray3 = this.R;
                if (this.f45514e) {
                    strE = E(f10);
                } else {
                    strE = ((int) f10) + "";
                }
                sparseArray3.put(i10, strE);
            }
            i10++;
        }
    }

    public final void L() {
        Window window;
        getLocationInWindow(this.f45525j0);
        Object parent = getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            if (view.getMeasuredWidth() > 0) {
                int[] iArr = this.f45525j0;
                iArr[0] = iArr[0] % view.getMeasuredWidth();
            }
        }
        if (this.F) {
            this.f45517f0 = (this.f45525j0[0] + this.W) - (this.f45513d0.getMeasuredWidth() / 2.0f);
        } else {
            this.f45517f0 = (this.f45525j0[0] + this.V) - (this.f45513d0.getMeasuredWidth() / 2.0f);
        }
        this.f45521h0 = B();
        float measuredHeight = this.f45525j0[1] - this.f45513d0.getMeasuredHeight();
        this.f45519g0 = measuredHeight;
        this.f45519g0 = measuredHeight - ed.a.a(24);
        if (ed.a.b()) {
            this.f45519g0 -= ed.a.a(4);
        }
        Context context = getContext();
        if (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (window.getAttributes().flags & 1024) == 0) {
            return;
        }
        Resources system = Resources.getSystem();
        this.f45519g0 += system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
    }

    public final float M() {
        float f10 = this.f45512d;
        if (!this.A || !this.T) {
            return f10;
        }
        float f11 = this.K / 2.0f;
        if (this.f45543y) {
            if (f10 == this.f45508b || f10 == this.f45510c) {
                return f10;
            }
            for (int i10 = 0; i10 <= this.f45530m; i10++) {
                float f12 = this.K;
                float f13 = i10 * f12;
                if (f13 < f10 && f13 + f12 >= f10) {
                    return f11 + f13 > f10 ? f13 : f13 + f12;
                }
            }
        }
        float f14 = this.f45529l0;
        if (f10 >= f14) {
            if (f10 < f11 + f14) {
                return f14;
            }
            float f15 = f14 + this.K;
            this.f45529l0 = f15;
            return f15;
        }
        if (f10 >= f14 - f11) {
            return f14;
        }
        float f16 = f14 - this.K;
        this.f45529l0 = f16;
        return f16;
    }

    public final void N() {
        i iVar = this.f45513d0;
        if (iVar == null || iVar.getParent() != null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f45523i0;
        layoutParams.x = (int) (this.f45521h0 + 0.5f);
        layoutParams.y = (int) (this.f45519g0 + 0.5f);
        this.f45513d0.setAlpha(0.0f);
        this.f45513d0.setVisibility(0);
        this.f45513d0.animate().alpha(1.0f).setDuration(this.f45543y ? 0L : this.B).setListener(new g()).start();
        this.f45513d0.a(this.f45542x ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
    }

    public float getMax() {
        return this.f45510c;
    }

    public float getMin() {
        return this.f45508b;
    }

    public k getOnProgressChangedListener() {
        return this.U;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0258  */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float measuredWidth = getMeasuredWidth() - getPaddingRight();
        float paddingTop = getPaddingTop() + this.f45522i;
        if (this.f45534p) {
            this.f45507a0.setColor(this.f45536r);
            this.f45507a0.setTextSize(this.f45535q);
            this.f45507a0.getTextBounds("0123456789", 0, 10, this.f45509b0);
            int i10 = this.f45537s;
            if (i10 == 0) {
                float fHeight = (this.f45509b0.height() / 2.0f) + paddingTop;
                String str = this.R.get(0);
                this.f45507a0.getTextBounds(str, 0, str.length(), this.f45509b0);
                canvas.drawText(str, (this.f45509b0.width() / 2.0f) + paddingLeft, fHeight, this.f45507a0);
                paddingLeft += this.f45509b0.width() + this.P;
                String str2 = this.R.get(this.f45530m);
                this.f45507a0.getTextBounds(str2, 0, str2.length(), this.f45509b0);
                canvas.drawText(str2, measuredWidth - ((this.f45509b0.width() + 0.5f) / 2.0f), fHeight, this.f45507a0);
                measuredWidth -= this.f45509b0.width() + this.P;
            } else if (i10 >= 1) {
                float f10 = this.f45522i + paddingTop + this.P;
                String str3 = this.R.get(0);
                this.f45507a0.getTextBounds(str3, 0, str3.length(), this.f45509b0);
                float fHeight2 = f10 + this.f45509b0.height();
                float f11 = this.V;
                if (this.f45537s == 1) {
                    canvas.drawText(str3, f11, fHeight2, this.f45507a0);
                }
                String str4 = this.R.get(this.f45530m);
                this.f45507a0.getTextBounds(str4, 0, str4.length(), this.f45509b0);
                float f12 = this.W;
                if (this.f45537s == 1) {
                    canvas.drawText(str4, f12, fHeight2, this.f45507a0);
                }
                paddingLeft = f11;
                measuredWidth = f12;
            }
        } else if (this.f45539u && this.f45537s == -1) {
            paddingLeft = this.V;
            measuredWidth = this.W;
        }
        boolean z10 = this.f45534p;
        if ((!z10 && !this.f45539u) || this.f45537s == 0) {
            int i11 = this.f45522i;
            paddingLeft += i11;
            measuredWidth -= i11;
        }
        float f13 = paddingLeft;
        float f14 = measuredWidth;
        boolean z11 = z10 && this.f45537s == 2;
        if (z11 || this.f45532n) {
            this.f45507a0.setTextSize(this.f45535q);
            this.f45507a0.getTextBounds("0123456789", 0, 10, this.f45509b0);
            float fHeight3 = this.f45509b0.height() + paddingTop;
            int i12 = this.f45522i;
            float f15 = fHeight3 + i12 + this.P;
            float fA = (i12 - ed.a.a(2)) / 2.0f;
            float fAbs = this.F ? this.W - ((this.M / this.J) * Math.abs(this.f45512d - this.f45508b)) : this.V + ((this.M / this.J) * Math.abs(this.f45512d - this.f45508b));
            for (int i13 = 0; i13 <= this.f45530m; i13++) {
                float f16 = (i13 * this.N) + f13;
                if (this.F) {
                    this.f45507a0.setColor(f16 <= fAbs ? this.f45524j : this.f45526k);
                } else {
                    this.f45507a0.setColor(f16 <= fAbs ? this.f45526k : this.f45524j);
                }
                canvas.drawCircle(f16, paddingTop, fA, this.f45507a0);
                if (z11) {
                    this.f45507a0.setColor(this.f45536r);
                    if (this.R.get(i13, null) != null) {
                        canvas.drawText(this.R.get(i13), f16, f15, this.f45507a0);
                    }
                }
            }
        }
        boolean z12 = this.O;
        if (!z12 || this.C) {
            if (this.F) {
                this.L = f14 - ((this.M / this.J) * (this.f45512d - this.f45508b));
            } else {
                this.L = ((this.M / this.J) * (this.f45512d - this.f45508b)) + f13;
            }
        }
        if (this.f45539u && !z12 && this.f45527k0) {
            this.f45507a0.setColor(this.f45541w);
            this.f45507a0.setTextSize(this.f45540v);
            this.f45507a0.getTextBounds("0123456789", 0, 10, this.f45509b0);
            float fHeight4 = this.f45509b0.height() + paddingTop + this.f45522i + this.P;
            if (this.f45514e) {
                canvas.drawText(String.valueOf(getProgressFloat()), this.L, fHeight4, this.f45507a0);
            } else {
                if (this.f45542x && this.f45537s == 1) {
                    float f17 = this.f45512d;
                    if (f17 != this.f45508b && f17 != this.f45510c) {
                        canvas.drawText(String.valueOf(getProgressFloat()), this.L, fHeight4, this.f45507a0);
                    }
                }
                canvas.drawText(String.valueOf(getProgress()), this.L, fHeight4, this.f45507a0);
            }
        }
        this.f45507a0.setColor(this.f45526k);
        this.f45507a0.setStrokeWidth(this.f45518g);
        if (this.F) {
            canvas.drawLine(f14, paddingTop, this.L, paddingTop, this.f45507a0);
        } else {
            canvas.drawLine(f13, paddingTop, this.L, paddingTop, this.f45507a0);
        }
        this.f45507a0.setColor(this.f45524j);
        this.f45507a0.setStrokeWidth(this.f45516f);
        if (this.F) {
            canvas.drawLine(this.L, paddingTop, f13, paddingTop, this.f45507a0);
        } else {
            canvas.drawLine(this.L, paddingTop, f14, paddingTop, this.f45507a0);
        }
        this.f45507a0.setColor(this.f45528l);
        canvas.drawCircle(this.L, paddingTop, this.O ? this.f45522i : this.f45520h, this.f45507a0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f45512d = bundle.getFloat("progress");
        super.onRestoreInstanceState(bundle.getParcelable("save_instance"));
        i iVar = this.f45513d0;
        if (iVar != null) {
            iVar.a(this.f45542x ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
        }
        setProgress(this.f45512d);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("save_instance", super.onSaveInstanceState());
        bundle.putFloat("progress", this.f45512d);
        return bundle;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i10) {
        if (this.E || !this.C) {
            return;
        }
        if (i10 != 0) {
            G();
        } else if (this.Q) {
            N();
        }
        super.onVisibilityChanged(view, i10);
    }

    public void setBubbleColor(@ColorInt int i10) {
        if (this.G != i10) {
            this.G = i10;
            i iVar = this.f45513d0;
            if (iVar != null) {
                iVar.invalidate();
            }
        }
    }

    public void setCustomSectionTextArray(@NonNull j jVar) {
        this.R = jVar.a(this.f45530m, this.R);
        for (int i10 = 0; i10 <= this.f45530m; i10++) {
            if (this.R.get(i10) == null) {
                this.R.put(i10, "");
            }
        }
        this.f45539u = false;
        requestLayout();
        invalidate();
    }

    public void setOnProgressChangedListener(k kVar) {
        this.U = kVar;
    }

    public void setProgress(float f10) {
        this.f45512d = f10;
        k kVar = this.U;
        if (kVar != null) {
            kVar.b(this, getProgress(), getProgressFloat(), false);
            this.U.a(this, getProgress(), getProgressFloat(), false);
        }
        if (!this.E) {
            this.f45521h0 = B();
        }
        if (this.C) {
            G();
            postDelayed(new h(), this.D);
        }
        if (this.A) {
            this.T = false;
        }
        postInvalidate();
    }

    public void setSecondTrackColor(@ColorInt int i10) {
        if (this.f45526k != i10) {
            this.f45526k = i10;
            invalidate();
        }
    }

    public void setThumbColor(@ColorInt int i10) {
        if (this.f45528l != i10) {
            this.f45528l = i10;
            invalidate();
        }
    }

    public void setTrackColor(@ColorInt int i10) {
        if (this.f45524j != i10) {
            this.f45524j = i10;
            invalidate();
        }
    }

    public final String E(float f10) {
        return String.valueOf(F(f10));
    }

    public final boolean J(MotionEvent motionEvent) {
        float f10;
        if (!isEnabled()) {
            return false;
        }
        float f11 = (this.M / this.J) * (this.f45512d - this.f45508b);
        if (this.F) {
            f10 = this.W - f11;
        } else {
            f10 = this.V + f11;
        }
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (((motionEvent.getX() - f10) * (motionEvent.getX() - f10)) + ((motionEvent.getY() - measuredHeight) * (motionEvent.getY() - measuredHeight)) > (this.V + ed.a.a(8)) * (this.V + ed.a.a(8))) {
            return false;
        }
        return true;
    }

    public final boolean K(MotionEvent motionEvent) {
        if (isEnabled() && motionEvent.getX() >= getPaddingLeft() && motionEvent.getX() <= getMeasuredWidth() - getPaddingRight() && motionEvent.getY() >= getPaddingTop() && motionEvent.getY() <= getMeasuredHeight() - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    public int getProgress() {
        return Math.round(M());
    }

    public float getProgressFloat() {
        return F(M());
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        G();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.E) {
            L();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int iMax = this.f45522i * 2;
        if (this.f45539u) {
            this.f45507a0.setTextSize(this.f45540v);
            this.f45507a0.getTextBounds("j", 0, 1, this.f45509b0);
            iMax += this.f45509b0.height();
        }
        if (this.f45534p && this.f45537s >= 1) {
            this.f45507a0.setTextSize(this.f45535q);
            this.f45507a0.getTextBounds("j", 0, 1, this.f45509b0);
            iMax = Math.max(iMax, (this.f45522i * 2) + this.f45509b0.height());
        }
        setMeasuredDimension(View.resolveSize(ed.a.a(BaseTransientBottomBar.ANIMATION_FADE_DURATION), i10), iMax + (this.P * 2));
        this.V = getPaddingLeft() + this.f45522i;
        this.W = (getMeasuredWidth() - getPaddingRight()) - this.f45522i;
        if (this.f45534p) {
            this.f45507a0.setTextSize(this.f45535q);
            int i12 = this.f45537s;
            if (i12 == 0) {
                String str = this.R.get(0);
                this.f45507a0.getTextBounds(str, 0, str.length(), this.f45509b0);
                this.V += this.f45509b0.width() + this.P;
                String str2 = this.R.get(this.f45530m);
                this.f45507a0.getTextBounds(str2, 0, str2.length(), this.f45509b0);
                this.W -= this.f45509b0.width() + this.P;
            } else if (i12 >= 1) {
                String str3 = this.R.get(0);
                this.f45507a0.getTextBounds(str3, 0, str3.length(), this.f45509b0);
                this.V = getPaddingLeft() + Math.max(this.f45522i, this.f45509b0.width() / 2.0f) + this.P;
                String str4 = this.R.get(this.f45530m);
                this.f45507a0.getTextBounds(str4, 0, str4.length(), this.f45509b0);
                this.W = ((getMeasuredWidth() - getPaddingRight()) - Math.max(this.f45522i, this.f45509b0.width() / 2.0f)) - this.P;
            }
        } else if (this.f45539u && this.f45537s == -1) {
            this.f45507a0.setTextSize(this.f45540v);
            String str5 = this.R.get(0);
            this.f45507a0.getTextBounds(str5, 0, str5.length(), this.f45509b0);
            this.V = getPaddingLeft() + Math.max(this.f45522i, this.f45509b0.width() / 2.0f) + this.P;
            String str6 = this.R.get(this.f45530m);
            this.f45507a0.getTextBounds(str6, 0, str6.length(), this.f45509b0);
            this.W = ((getMeasuredWidth() - getPaddingRight()) - Math.max(this.f45522i, this.f45509b0.width() / 2.0f)) - this.P;
        }
        float f10 = this.W - this.V;
        this.M = f10;
        this.N = (f10 * 1.0f) / this.f45530m;
        if (!this.E) {
            this.f45513d0.measure(i10, i11);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new a());
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00de  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        long j10;
        k kVar;
        boolean z10;
        k kVar2;
        String strValueOf;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        if (this.f45533o) {
                            if (this.f45543y) {
                                postDelayed(new b(), this.B);
                            } else {
                                z();
                            }
                        } else if (!this.O) {
                            if (this.E) {
                                ViewPropertyAnimator duration = animate().setDuration(this.B);
                                if (this.O) {
                                    j10 = 0;
                                } else {
                                    j10 = 0;
                                }
                                duration.setStartDelay(j10).setListener(new c()).start();
                            } else {
                                postDelayed(new d(), this.B);
                            }
                        } else if (this.E) {
                            ViewPropertyAnimator duration2 = animate().setDuration(this.B);
                            if (this.O) {
                                j10 = 0;
                            } else {
                                j10 = 0;
                            }
                            duration2.setStartDelay(j10).setListener(new c()).start();
                        } else {
                            postDelayed(new d(), this.B);
                        }
                        kVar = this.U;
                        if (kVar != null) {
                            kVar.b(this, getProgress(), getProgressFloat(), true);
                            this.U.c(this, getProgress(), getProgressFloat());
                        }
                    }
                } else if (this.O) {
                    if (this.f45544z) {
                        float fA = A(motionEvent.getX());
                        if (fA != this.S) {
                            this.S = fA;
                            this.L = fA;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            this.f45512d = C();
                            if (this.E && this.f45513d0.getParent() != null) {
                                float fB = B();
                                this.f45521h0 = fB;
                                WindowManager.LayoutParams layoutParams = this.f45523i0;
                                layoutParams.x = (int) (fB + 0.5f);
                                this.f45511c0.updateViewLayout(this.f45513d0, layoutParams);
                                i iVar = this.f45513d0;
                                if (this.f45542x) {
                                    strValueOf = String.valueOf(getProgressFloat());
                                } else {
                                    strValueOf = String.valueOf(getProgress());
                                }
                                iVar.a(strValueOf);
                            } else {
                                M();
                            }
                            invalidate();
                            kVar2 = this.U;
                            if (kVar2 != null) {
                                kVar2.b(this, getProgress(), getProgressFloat(), true);
                            }
                        }
                    } else {
                        float x10 = motionEvent.getX() + this.f45531m0;
                        this.L = x10;
                        float f10 = this.V;
                        if (x10 < f10) {
                            this.L = f10;
                        }
                        float f11 = this.L;
                        float f12 = this.W;
                        if (f11 > f12) {
                            this.L = f12;
                        }
                    }
                    z10 = true;
                    if (z10) {
                        this.f45512d = C();
                        if (this.E) {
                            M();
                        } else {
                            M();
                        }
                        invalidate();
                        kVar2 = this.U;
                        if (kVar2 != null) {
                            kVar2.b(this, getProgress(), getProgressFloat(), true);
                        }
                    }
                }
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
                if (this.f45533o) {
                    if (this.f45543y) {
                        postDelayed(new b(), this.B);
                    } else {
                        z();
                    }
                } else if (!this.O || this.f45543y) {
                    if (this.E) {
                        ViewPropertyAnimator duration3 = animate().setDuration(this.B);
                        if (this.O && this.f45543y) {
                            j10 = 300;
                        } else {
                            j10 = 0;
                        }
                        duration3.setStartDelay(j10).setListener(new c()).start();
                    } else {
                        postDelayed(new d(), this.B);
                    }
                }
                kVar = this.U;
                if (kVar != null) {
                    kVar.b(this, getProgress(), getProgressFloat(), true);
                    this.U.c(this, getProgress(), getProgressFloat());
                }
            }
        } else {
            performClick();
            getParent().requestDisallowInterceptTouchEvent(true);
            boolean zJ = J(motionEvent);
            this.O = zJ;
            if (zJ) {
                if (this.A && !this.T) {
                    this.T = true;
                }
                if (this.C && !this.Q) {
                    this.Q = true;
                }
                if (!this.E) {
                    N();
                }
                invalidate();
            } else if (this.f45543y && K(motionEvent)) {
                this.O = true;
                if (this.A && !this.T) {
                    this.T = true;
                }
                if (this.C) {
                    G();
                    this.Q = true;
                }
                if (this.f45544z) {
                    float fA2 = A(motionEvent.getX());
                    this.S = fA2;
                    this.L = fA2;
                } else {
                    float x11 = motionEvent.getX();
                    this.L = x11;
                    float f13 = this.V;
                    if (x11 < f13) {
                        this.L = f13;
                    }
                    float f14 = this.L;
                    float f15 = this.W;
                    if (f14 > f15) {
                        this.L = f15;
                    }
                }
                this.f45512d = C();
                if (!this.E) {
                    this.f45521h0 = B();
                    N();
                }
                invalidate();
            }
            this.f45531m0 = this.L - motionEvent.getX();
        }
        if (!this.O && !this.f45543y && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }
}
