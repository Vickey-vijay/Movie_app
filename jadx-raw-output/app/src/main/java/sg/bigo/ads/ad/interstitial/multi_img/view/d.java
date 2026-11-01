package sg.bigo.ads.ad.interstitial.multi_img.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.ad.interstitial.u;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.FixContentFrameLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* JADX INFO: loaded from: classes11.dex */
public abstract class d<T extends View> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f68724b = 300;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f68725c = 500;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f68726d = u.f68981e;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f68727e = -188383023;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f68728a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f68729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.multi_img.c f68730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f68731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f68732i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RoundedFrameLayout f68733j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final FixContentFrameLayout f68734k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final T f68735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AdImageView f68736m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f68737n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f68738o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Bitmap f68739p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f68740q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f68741r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ValueAnimator f68743t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ValueAnimator f68744u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f68745v = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f68742s = false;

    public interface a {
        void a();

        void b();
    }

    public d(Context context, sg.bigo.ads.ad.interstitial.multi_img.c cVar, boolean z10, int i10, int i11, @LayoutRes int i12, @IdRes int i13, @IdRes int i14, @IdRes int i15) {
        this.f68729f = context;
        this.f68728a = z10;
        this.f68732i = i11;
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) sg.bigo.ads.common.utils.a.a(context, i12, null, false);
        this.f68733j = roundedFrameLayout;
        this.f68734k = (FixContentFrameLayout) roundedFrameLayout.findViewById(i13);
        this.f68735l = (T) roundedFrameLayout.findViewById(i14);
        this.f68736m = (AdImageView) roundedFrameLayout.findViewById(i15);
        a(cVar);
        a(i10);
        this.f68740q = f68726d;
        sg.bigo.ads.common.utils.u.a(roundedFrameLayout, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                d.this.f68745v = SystemClock.elapsedRealtime();
            }
        });
        roundedFrameLayout.setTag(f68727e, this);
    }

    public static /* synthetic */ void a(d dVar, final Bitmap bitmap, final int i10) {
        if (dVar.a()) {
            dVar.f68736m.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.4
                @Override // java.lang.Runnable
                public final void run() {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(d.this.f68736m.getResources(), bitmap);
                    bitmapDrawable.setAlpha(i10);
                    d.this.f68736m.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    d.this.f68736m.setImageDrawable(bitmapDrawable);
                }
            });
        }
    }

    public final void a(int i10) {
        int i11;
        if (i10 != Integer.MIN_VALUE) {
            if (i10 != 4) {
                if (i10 == 1) {
                    i11 = -1;
                } else if (i10 != 2) {
                    i10 = 3;
                } else {
                    i11 = ViewCompat.MEASURED_STATE_MASK;
                }
            }
            this.f68731h = i10;
        }
        i11 = 0;
        b(i11);
        this.f68731h = i10;
    }

    public final void a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        FixContentFrameLayout.a aVar = (FixContentFrameLayout.a) this.f68735l.getLayoutParams();
        if (aVar.f70070a == i10 || aVar.f70071b == i11) {
            return;
        }
        aVar.f70070a = i10;
        aVar.f70071b = i11;
        this.f68735l.setLayoutParams(aVar);
    }

    public final void a(sg.bigo.ads.ad.interstitial.multi_img.c cVar) {
        FixContentFrameLayout fixContentFrameLayout;
        boolean z10;
        this.f68730g = cVar;
        if (a()) {
            int iA = e.a(this.f68729f, 12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f68734k.getLayoutParams();
            layoutParams.gravity = 17;
            layoutParams.topMargin = iA;
            layoutParams.leftMargin = iA;
            layoutParams.rightMargin = iA;
            layoutParams.bottomMargin = iA;
            layoutParams.height = -2;
            layoutParams.width = -2;
            this.f68734k.setLayoutParams(layoutParams);
            fixContentFrameLayout = this.f68734k;
            z10 = true;
        } else {
            fixContentFrameLayout = this.f68734k;
            z10 = false;
        }
        fixContentFrameLayout.setFixContent(z10);
    }

    public boolean a() {
        return this.f68728a;
    }

    public final void b(final int i10) {
        if (a()) {
            this.f68736m.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.5
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.f68736m.setBackgroundColor(i10);
                }
            });
        }
    }

    public final void b(Bitmap bitmap) {
        a aVar;
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = ((this.f68745v > 0L ? 1 : (this.f68745v == 0L ? 0 : -1)) != 0 ? SystemClock.elapsedRealtime() - this.f68745v : 0L) > f68724b;
        if (c(this.f68732i) || c(this.f68731h)) {
            this.f68739p = sg.bigo.ads.common.utils.d.b(this.f68729f, bitmap);
            if (c(this.f68732i)) {
                this.f68738o = sg.bigo.ads.common.w.b.a(this.f68739p, ViewCompat.MEASURED_STATE_MASK);
            } else {
                this.f68738o = ViewCompat.MEASURED_STATE_MASK;
            }
            final sg.bigo.ads.common.w.b.a aVar2 = new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.2
                @Override // sg.bigo.ads.common.w.b.a
                public final long a() {
                    return d.f68725c;
                }

                @Override // sg.bigo.ads.common.w.b.a
                public final boolean a(int i10) {
                    d.this.f68740q = i10;
                    d dVar = d.this;
                    if (dVar.c(dVar.f68731h)) {
                        d dVar2 = d.this;
                        d.a(dVar2, dVar2.f68739p, d.this.f68740q);
                    }
                    if (d.this.f68741r != null) {
                        d.this.f68741r.a();
                    }
                    return super.a(i10);
                }

                @Override // sg.bigo.ads.common.w.b.a
                public final void b(int i10) {
                    if (d.this.f68741r != null) {
                        d.this.f68741r.b();
                    }
                }
            };
            if (z12) {
                ValueAnimator valueAnimator = this.f68744u;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, f68726d);
                this.f68744u = valueAnimatorOfInt;
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                this.f68744u.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.6
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        Object animatedValue = valueAnimator2.getAnimatedValue();
                        if (animatedValue instanceof Integer) {
                            int iIntValue = ((Integer) animatedValue).intValue();
                            sg.bigo.ads.common.w.b.a aVar3 = aVar2;
                            if (aVar3 != null) {
                                aVar3.a(iIntValue);
                            }
                        }
                    }
                });
                this.f68744u.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.7
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        sg.bigo.ads.common.w.b.a aVar3 = aVar2;
                        if (aVar3 != null) {
                            aVar3.b(d.f68726d);
                        }
                    }
                });
                if (aVar2.a() >= 0) {
                    this.f68744u.setDuration(aVar2.a());
                }
                this.f68744u.start();
            } else {
                aVar2.a(f68726d);
                aVar2.b(f68726d);
            }
            z11 = true;
        }
        if (d(this.f68732i) || d(this.f68731h)) {
            int iA = sg.bigo.ads.common.w.b.a(bitmap, ViewCompat.MEASURED_STATE_MASK);
            final sg.bigo.ads.common.w.b.a aVar3 = new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.3
                @Override // sg.bigo.ads.common.w.b.a
                public final long a() {
                    return d.f68725c;
                }

                @Override // sg.bigo.ads.common.w.b.a
                public final boolean a(int i10) {
                    d.this.f68737n = i10;
                    d dVar = d.this;
                    if (dVar.d(dVar.f68731h)) {
                        d dVar2 = d.this;
                        dVar2.b(dVar2.f68737n);
                    }
                    if (d.this.f68741r != null) {
                        d.this.f68741r.a();
                    }
                    return super.a(i10);
                }

                @Override // sg.bigo.ads.common.w.b.a
                public final void b(int i10) {
                    if (d.this.f68741r != null) {
                        d.this.f68741r.b();
                    }
                }
            };
            if (z12) {
                ValueAnimator valueAnimator2 = this.f68743t;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f68743t = sg.bigo.ads.common.w.b.a(this.f68736m, iA, new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.8
                    @Override // sg.bigo.ads.common.w.b.a
                    public final long a() {
                        sg.bigo.ads.common.w.b.a aVar4 = aVar3;
                        if (aVar4 != null) {
                            return aVar4.a();
                        }
                        return -1L;
                    }

                    @Override // sg.bigo.ads.common.w.b.a
                    public final boolean a(int i10) {
                        sg.bigo.ads.common.w.b.a aVar4 = aVar3;
                        if (aVar4 == null) {
                            return true;
                        }
                        aVar4.a(i10);
                        return true;
                    }

                    @Override // sg.bigo.ads.common.w.b.a
                    public final void b(int i10) {
                        sg.bigo.ads.common.w.b.a aVar4 = aVar3;
                        if (aVar4 != null) {
                            aVar4.b(i10);
                        }
                    }
                });
            } else {
                aVar3.a(iA);
                aVar3.b(iA);
            }
        } else {
            z10 = z11;
        }
        if (z10 || (aVar = this.f68741r) == null) {
            return;
        }
        aVar.b();
    }

    public final boolean c(int i10) {
        if (this.f68742s) {
            return i10 == 5;
        }
        return i10 == 4;
    }

    public final boolean d(int i10) {
        if (this.f68742s) {
            return i10 == 4;
        }
        return i10 == 3;
    }
}
