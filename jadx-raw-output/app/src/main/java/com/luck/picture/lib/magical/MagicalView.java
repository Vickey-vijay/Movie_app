package com.luck.picture.lib.magical;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.viewpager2.widget.ViewPager2;
import com.luck.picture.lib.config.PictureSelectionConfig;

/* JADX INFO: loaded from: classes.dex */
public class MagicalView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f32294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f32295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f32299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f32300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f32301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f32302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f32304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f32305m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f32306n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f32307o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f32308p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f32309q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FrameLayout f32310r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f32311s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i8.b f32312t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f32313u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f32314v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f32315w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i8.c f32316x;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            MagicalView magicalView = MagicalView.this;
            magicalView.H(fFloatValue, magicalView.f32297e, MagicalView.this.f32303k, MagicalView.this.f32296d, MagicalView.this.f32306n, MagicalView.this.f32299g, MagicalView.this.f32304l, MagicalView.this.f32298f, MagicalView.this.f32305m);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MagicalView.this.E();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TransitionManager.beginDelayedTransition((ViewGroup) MagicalView.this.f32310r.getParent(), new TransitionSet().setDuration(250L).addTransition(new ChangeBounds()).addTransition(new ChangeTransform()).addTransition(new ChangeImageTransform()));
            MagicalView.this.w(true);
            MagicalView.this.f32310r.setTranslationX(0.0f);
            MagicalView.this.f32310r.setTranslationY(0.0f);
            MagicalView.this.f32312t.d(MagicalView.this.f32299g);
            MagicalView.this.f32312t.a(MagicalView.this.f32298f);
            MagicalView.this.f32312t.c(MagicalView.this.f32297e);
            MagicalView.this.f32312t.b(MagicalView.this.f32296d);
            MagicalView.this.y(true);
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (MagicalView.this.f32316x != null) {
                MagicalView.this.f32316x.c();
            }
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            MagicalView.this.f32309q = true;
            MagicalView.this.f32294b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            MagicalView.this.f32311s.setAlpha(MagicalView.this.f32294b);
            if (MagicalView.this.f32316x != null) {
                MagicalView.this.f32316x.d(MagicalView.this.f32294b);
            }
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f32322b;

        public f(boolean z10) {
            this.f32322b = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MagicalView.this.f32309q = false;
            if (!this.f32322b || MagicalView.this.f32316x == null) {
                return;
            }
            MagicalView.this.f32316x.c();
        }
    }

    public MagicalView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void D() {
        this.f32310r.getLocationOnScreen(new int[2]);
        this.f32306n = 0;
        int i10 = this.f32300h;
        int i11 = this.f32301i;
        float f10 = i10 / i11;
        int i12 = this.f32307o;
        int i13 = this.f32308p;
        if (f10 < i12 / i13) {
            this.f32304l = i10;
            int i14 = (int) (i10 * (i13 / i12));
            this.f32305m = i14;
            this.f32303k = (i11 - i14) / 2;
        } else {
            this.f32305m = i11;
            int i15 = (int) (i11 * (i12 / i13));
            this.f32304l = i15;
            this.f32303k = 0;
            this.f32306n = (i10 - i15) / 2;
        }
        this.f32312t.d(this.f32299g);
        this.f32312t.a(this.f32298f);
        this.f32312t.b(this.f32296d);
        this.f32312t.c(this.f32297e);
    }

    public final void E() {
        this.f32309q = false;
        z();
        i8.c cVar = this.f32316x;
        if (cVar != null) {
            cVar.b(this, false);
        }
    }

    public final void G(float f10, float f11, float f12, float f13) {
        I(true, 0.0f, 0.0f, f10, 0.0f, f11, 0.0f, f12, 0.0f, f13);
    }

    public final void H(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        I(false, f10, f11, f12, f13, f14, f15, f16, f17, f18);
    }

    public MagicalView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f32294b = 0.0f;
        this.f32295c = 250L;
        this.f32309q = false;
        this.f32313u = PictureSelectionConfig.e().L;
        this.f32302j = o8.e.d(getContext());
        getScreenSize();
        View view = new View(context);
        this.f32311s = view;
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setAlpha(this.f32294b);
        addView(view);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32310r = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f32312t = new i8.b(frameLayout);
    }

    public void A(int i10, int i11, boolean z10) {
        int i12;
        int i13;
        if (this.f32313u || (i12 = this.f32300h) > (i13 = this.f32301i)) {
            return;
        }
        if (((int) (i12 / (i10 / i11))) > i13) {
            this.f32301i = this.f32302j;
            if (z10) {
                this.f32312t.d(i12);
                this.f32312t.a(this.f32301i);
            }
        }
    }

    public void F(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f32307o = i14;
        this.f32308p = i15;
        this.f32296d = i10;
        this.f32297e = i11;
        this.f32299g = i12;
        this.f32298f = i13;
    }

    public final void I(boolean z10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        if (z10) {
            this.f32312t.d(f16);
            this.f32312t.a(f18);
            this.f32312t.b((int) f14);
            this.f32312t.c((int) f12);
            return;
        }
        float f19 = (f14 - f13) * f10;
        float f20 = (f16 - f15) * f10;
        float f21 = (f18 - f17) * f10;
        this.f32312t.d(f15 + f20);
        this.f32312t.a(f17 + f21);
        this.f32312t.b((int) (f13 + f19));
        this.f32312t.c((int) (f11 + (f10 * (f12 - f11))));
    }

    public void J(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
            this.f32294b = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f32294b = f10;
        this.f32311s.setAlpha(f10);
        setVisibility(0);
        D();
        x(z10);
    }

    public void K(int i10, int i11, boolean z10) {
        this.f32307o = i10;
        this.f32308p = i11;
        this.f32296d = 0;
        this.f32297e = 0;
        this.f32299g = 0;
        this.f32298f = 0;
        setVisibility(0);
        D();
        G(this.f32303k, this.f32306n, this.f32304l, this.f32305m);
        if (z10) {
            this.f32294b = 1.0f;
            this.f32311s.setAlpha(1.0f);
        } else {
            this.f32294b = 0.0f;
            this.f32311s.setAlpha(0.0f);
            this.f32310r.setAlpha(0.0f);
            this.f32310r.animate().alpha(1.0f).setDuration(250L).start();
            this.f32311s.animate().alpha(1.0f).setDuration(250L).start();
        }
        E();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View childAt = this.f32310r.getChildAt(0);
        ViewPager2 viewPager2 = childAt instanceof ViewPager2 ? (ViewPager2) childAt : null;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f32314v = (int) motionEvent.getX();
            this.f32315w = (int) motionEvent.getY();
            if (viewPager2 != null) {
                viewPager2.setUserInputEnabled(true);
            }
        } else if (action == 1) {
            if (viewPager2 != null) {
                viewPager2.setUserInputEnabled(true);
            }
        } else if (action == 2) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (Math.abs(x10 - this.f32314v) > Math.abs(y10 - this.f32315w)) {
                if (viewPager2 != null) {
                    viewPager2.setUserInputEnabled(true);
                }
            } else if (viewPager2 != null) {
                viewPager2.setUserInputEnabled(canScrollVertically(this.f32315w - y10));
            }
        } else if (action == 3) {
            if (viewPager2 != null) {
                viewPager2.setUserInputEnabled(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setBackgroundAlpha(float f10) {
        this.f32294b = f10;
        this.f32311s.setAlpha(f10);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f32311s.setBackgroundColor(i10);
    }

    public void setMagicalContent(View view) {
        this.f32310r.addView(view);
    }

    public void setOnMojitoViewCallback(i8.c cVar) {
        this.f32316x = cVar;
    }

    public void t() {
        if (this.f32309q) {
            return;
        }
        if (this.f32299g == 0 || this.f32298f == 0) {
            v();
            return;
        }
        i8.c cVar = this.f32316x;
        if (cVar != null) {
            cVar.e();
        }
        w(false);
        u();
    }

    @RequiresApi(api = 21)
    public final void u() {
        this.f32310r.post(new c());
    }

    public final void v() {
        this.f32310r.animate().alpha(0.0f).setDuration(250L).setListener(new d()).start();
        this.f32311s.animate().alpha(0.0f).setDuration(250L).start();
    }

    public final void w(boolean z10) {
        if (z10) {
            this.f32316x.a(true);
        }
    }

    public final void x(boolean z10) {
        Interpolator interpolatorA;
        if (z10) {
            this.f32294b = 1.0f;
            this.f32311s.setAlpha(1.0f);
            G(this.f32303k, this.f32306n, this.f32304l, this.f32305m);
            E();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a());
        valueAnimatorOfFloat.addListener(new b());
        z7.d dVar = PictureSelectionConfig.f32194m1;
        if (dVar != null && (interpolatorA = dVar.a()) != null) {
            valueAnimatorOfFloat.setInterpolator(interpolatorA);
        }
        valueAnimatorOfFloat.setDuration(250L).start();
        y(false);
    }

    public final void y(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f32294b, z10 ? 0.0f : 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new e());
        valueAnimatorOfFloat.addListener(new f(z10));
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.start();
    }

    public final void z() {
        int i10 = this.f32301i;
        this.f32305m = i10;
        this.f32304l = this.f32300h;
        this.f32303k = 0;
        this.f32312t.a(i10);
        this.f32312t.d(this.f32300h);
        this.f32312t.c(0);
        this.f32312t.b(0);
    }

    private void getScreenSize() {
        this.f32300h = o8.e.e(getContext());
        if (this.f32313u) {
            this.f32301i = o8.e.d(getContext());
        } else {
            this.f32301i = o8.e.g(getContext());
        }
    }

    public void B() {
        getScreenSize();
        J(true);
    }

    public void C(int i10, int i11, boolean z10) {
        getScreenSize();
        K(i10, i11, z10);
    }
}
