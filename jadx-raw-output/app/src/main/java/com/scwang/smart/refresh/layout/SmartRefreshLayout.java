package com.scwang.smart.refresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.scwang.smart.refresh.layout.kernel.R$id;
import com.scwang.smart.refresh.layout.kernel.R$string;
import com.scwang.smart.refresh.layout.kernel.R$styleable;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"RestrictedApi"})
public class SmartRefreshLayout extends ViewGroup implements cc.f, NestedScrollingParent {
    public static ec.b P0;
    public static ec.c Q0;
    public static ec.d R0;
    public static ViewGroup.MarginLayoutParams S0 = new ViewGroup.MarginLayoutParams(-1, -1);
    public Interpolator A;
    public Handler A0;
    public int[] B;
    public cc.e B0;
    public boolean C;
    public RefreshState C0;
    public boolean D;
    public RefreshState D0;
    public boolean E;
    public long E0;
    public boolean F;
    public int F0;
    public boolean G;
    public int G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public boolean I0;
    public boolean J;
    public boolean J0;
    public boolean K;
    public boolean K0;
    public boolean L;
    public boolean L0;
    public boolean M;
    public MotionEvent M0;
    public boolean N;
    public Runnable N0;
    public boolean O;
    public ValueAnimator O0;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f45073a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45074b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f45075b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45076c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ec.g f45077c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45078d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ec.e f45079d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45080e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ec.f f45081e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45082f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ec.i f45083f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45084g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f45085g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45086h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f45087h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f45088i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int[] f45089i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f45090j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public NestedScrollingChildHelper f45091j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f45092k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public NestedScrollingParentHelper f45093k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f45094l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f45095l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f45096m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public dc.a f45097m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f45098n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f45099n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45100o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public dc.a f45101o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f45102p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f45103p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f45104q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f45105q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f45106r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f45107r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f45108s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f45109s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f45110t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f45111t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f45112u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f45113u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f45114v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public float f45115v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f45116w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public cc.a f45117w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f45118x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public cc.a f45119x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Scroller f45120y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public cc.b f45121y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public VelocityTracker f45122z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public Paint f45123z0;

    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f45127b;

        public b(boolean z10) {
            this.f45127b = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout.this.setStateDirectLoading(this.f45127b);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f45129b;

        public c(boolean z10) {
            this.f45129b = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout.this.E0 = System.currentTimeMillis();
                SmartRefreshLayout.this.D(RefreshState.Refreshing);
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                ec.g gVar = smartRefreshLayout.f45077c0;
                if (gVar != null) {
                    if (this.f45129b) {
                        gVar.d(smartRefreshLayout);
                    }
                } else if (smartRefreshLayout.f45081e0 == null) {
                    smartRefreshLayout.t(3000);
                }
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                cc.a aVar = smartRefreshLayout2.f45117w0;
                if (aVar != null) {
                    float f10 = smartRefreshLayout2.f45107r0;
                    if (f10 < 10.0f) {
                        f10 *= smartRefreshLayout2.f45095l0;
                    }
                    aVar.n(smartRefreshLayout2, smartRefreshLayout2.f45095l0, (int) f10);
                }
                SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                ec.f fVar = smartRefreshLayout3.f45081e0;
                if (fVar == null || !(smartRefreshLayout3.f45117w0 instanceof cc.d)) {
                    return;
                }
                if (this.f45129b) {
                    fVar.d(smartRefreshLayout3);
                }
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                float f11 = smartRefreshLayout4.f45107r0;
                if (f11 < 10.0f) {
                    f11 *= smartRefreshLayout4.f45095l0;
                }
                smartRefreshLayout4.f45081e0.b((cc.d) smartRefreshLayout4.f45117w0, smartRefreshLayout4.f45095l0, (int) f11);
            }
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            RefreshState refreshState;
            RefreshState refreshState2;
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                smartRefreshLayout.O0 = null;
                if (smartRefreshLayout.f45076c == 0 && (refreshState = smartRefreshLayout.C0) != (refreshState2 = RefreshState.None) && !refreshState.isOpening && !refreshState.isDragging) {
                    smartRefreshLayout.D(refreshState2);
                    return;
                }
                RefreshState refreshState3 = smartRefreshLayout.C0;
                if (refreshState3 != smartRefreshLayout.D0) {
                    smartRefreshLayout.setViceState(refreshState3);
                }
            }
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmartRefreshLayout.this.B0.f(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            ec.e eVar = smartRefreshLayout.f45079d0;
            if (eVar != null) {
                eVar.a(smartRefreshLayout);
            } else if (smartRefreshLayout.f45081e0 == null) {
                smartRefreshLayout.o(2000);
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            ec.f fVar = smartRefreshLayout2.f45081e0;
            if (fVar != null) {
                fVar.a(smartRefreshLayout2);
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45134b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f45135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Boolean f45136d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f45137e;

        public g(int i10, Boolean bool, boolean z10) {
            this.f45135c = i10;
            this.f45136d = bool;
            this.f45137e = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = this.f45134b;
            if (i10 == 0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                RefreshState refreshState = smartRefreshLayout.C0;
                RefreshState refreshState2 = RefreshState.None;
                if (refreshState == refreshState2 && smartRefreshLayout.D0 == RefreshState.Refreshing) {
                    smartRefreshLayout.D0 = refreshState2;
                } else {
                    ValueAnimator valueAnimator = smartRefreshLayout.O0;
                    if (valueAnimator != null && refreshState.isHeader && (refreshState.isDragging || refreshState == RefreshState.RefreshReleased)) {
                        valueAnimator.setDuration(0L);
                        SmartRefreshLayout.this.O0.cancel();
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        smartRefreshLayout2.O0 = null;
                        if (smartRefreshLayout2.B0.a(0) == null) {
                            SmartRefreshLayout.this.D(refreshState2);
                        } else {
                            SmartRefreshLayout.this.D(RefreshState.PullDownCanceled);
                        }
                    } else if (refreshState == RefreshState.Refreshing && smartRefreshLayout.f45117w0 != null && smartRefreshLayout.f45121y0 != null) {
                        this.f45134b = i10 + 1;
                        smartRefreshLayout.A0.postDelayed(this, this.f45135c);
                        SmartRefreshLayout.this.D(RefreshState.RefreshFinish);
                        if (this.f45136d == Boolean.FALSE) {
                            SmartRefreshLayout.this.J(false);
                        }
                    }
                }
                if (this.f45136d == Boolean.TRUE) {
                    SmartRefreshLayout.this.J(true);
                    return;
                }
                return;
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            int iK = smartRefreshLayout3.f45117w0.k(smartRefreshLayout3, this.f45137e);
            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
            ec.f fVar = smartRefreshLayout4.f45081e0;
            if (fVar != null) {
                cc.a aVar = smartRefreshLayout4.f45117w0;
                if (aVar instanceof cc.d) {
                    fVar.l((cc.d) aVar, this.f45137e);
                }
            }
            if (iK < Integer.MAX_VALUE) {
                SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                if (smartRefreshLayout5.f45100o || smartRefreshLayout5.f45087h0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.f45100o) {
                        float f10 = smartRefreshLayout6.f45094l;
                        smartRefreshLayout6.f45090j = f10;
                        smartRefreshLayout6.f45080e = 0;
                        smartRefreshLayout6.f45100o = false;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout6.f45092k, (f10 + smartRefreshLayout6.f45076c) - (smartRefreshLayout6.f45074b * 2), 0));
                        SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout7.f45092k, smartRefreshLayout7.f45094l + smartRefreshLayout7.f45076c, 0));
                    }
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (smartRefreshLayout8.f45087h0) {
                        smartRefreshLayout8.f45085g0 = 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout8.f45092k, smartRefreshLayout8.f45094l, 0));
                        SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                        smartRefreshLayout9.f45087h0 = false;
                        smartRefreshLayout9.f45080e = 0;
                    }
                }
                SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                int i11 = smartRefreshLayout10.f45076c;
                if (i11 <= 0) {
                    if (i11 < 0) {
                        smartRefreshLayout10.i(0, iK, smartRefreshLayout10.A, smartRefreshLayout10.f45084g);
                        return;
                    } else {
                        smartRefreshLayout10.B0.f(0, false);
                        SmartRefreshLayout.this.B0.g(RefreshState.None);
                        return;
                    }
                }
                ValueAnimator valueAnimatorI = smartRefreshLayout10.i(0, iK, smartRefreshLayout10.A, smartRefreshLayout10.f45084g);
                SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListenerC = smartRefreshLayout11.P ? smartRefreshLayout11.f45121y0.c(smartRefreshLayout11.f45076c) : null;
                if (valueAnimatorI == null || animatorUpdateListenerC == null) {
                    return;
                }
                valueAnimatorI.addUpdateListener(animatorUpdateListenerC);
            }
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45139b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f45140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f45141d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f45142e;

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f45144b;

            /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$h$a$a, reason: collision with other inner class name */
            public class C0436a extends AnimatorListenerAdapter {
                public C0436a() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (animator == null || animator.getDuration() != 0) {
                        h hVar = h.this;
                        SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                        smartRefreshLayout.K0 = false;
                        if (hVar.f45141d) {
                            smartRefreshLayout.J(true);
                        }
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        if (smartRefreshLayout2.C0 == RefreshState.LoadFinish) {
                            smartRefreshLayout2.D(RefreshState.None);
                        }
                    }
                }
            }

            public a(int i10) {
                this.f45144b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                ValueAnimator.AnimatorUpdateListener animatorUpdateListenerC;
                ValueAnimator valueAnimatorA;
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (!smartRefreshLayout.O || this.f45144b >= 0) {
                    animatorUpdateListenerC = null;
                } else {
                    animatorUpdateListenerC = smartRefreshLayout.f45121y0.c(smartRefreshLayout.f45076c);
                    if (animatorUpdateListenerC != null) {
                        animatorUpdateListenerC.onAnimationUpdate(ValueAnimator.ofInt(0, 0));
                    }
                }
                C0436a c0436a = new C0436a();
                h hVar = h.this;
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                int i10 = smartRefreshLayout2.f45076c;
                if (i10 > 0) {
                    valueAnimatorA = smartRefreshLayout2.B0.a(0);
                } else {
                    if (animatorUpdateListenerC != null || i10 == 0) {
                        ValueAnimator valueAnimator = smartRefreshLayout2.O0;
                        if (valueAnimator != null) {
                            valueAnimator.setDuration(0L);
                            SmartRefreshLayout.this.O0.cancel();
                            SmartRefreshLayout.this.O0 = null;
                        }
                        SmartRefreshLayout.this.B0.f(0, false);
                        SmartRefreshLayout.this.B0.g(RefreshState.None);
                    } else if (hVar.f45141d && smartRefreshLayout2.I) {
                        int i11 = smartRefreshLayout2.f45099n0;
                        if (i10 >= (-i11)) {
                            smartRefreshLayout2.D(RefreshState.None);
                        } else {
                            valueAnimatorA = smartRefreshLayout2.B0.a(-i11);
                        }
                    } else {
                        valueAnimatorA = smartRefreshLayout2.B0.a(0);
                    }
                    valueAnimatorA = null;
                }
                if (valueAnimatorA != null) {
                    valueAnimatorA.addListener(c0436a);
                } else {
                    c0436a.onAnimationEnd(null);
                }
            }
        }

        public h(int i10, boolean z10, boolean z11) {
            this.f45140c = i10;
            this.f45141d = z10;
            this.f45142e = z11;
        }

        /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            int i10 = this.f45139b;
            if (i10 == 0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                RefreshState refreshState = smartRefreshLayout.C0;
                RefreshState refreshState2 = RefreshState.None;
                if (refreshState == refreshState2 && smartRefreshLayout.D0 == RefreshState.Loading) {
                    smartRefreshLayout.D0 = refreshState2;
                } else {
                    ValueAnimator valueAnimator = smartRefreshLayout.O0;
                    if (valueAnimator != null && ((refreshState.isDragging || refreshState == RefreshState.LoadReleased) && refreshState.isFooter)) {
                        valueAnimator.setDuration(0L);
                        SmartRefreshLayout.this.O0.cancel();
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        smartRefreshLayout2.O0 = null;
                        if (smartRefreshLayout2.B0.a(0) == null) {
                            SmartRefreshLayout.this.D(refreshState2);
                        } else {
                            SmartRefreshLayout.this.D(RefreshState.PullUpCanceled);
                        }
                    } else if (refreshState == RefreshState.Loading && smartRefreshLayout.f45119x0 != null && smartRefreshLayout.f45121y0 != null) {
                        this.f45139b = i10 + 1;
                        smartRefreshLayout.A0.postDelayed(this, this.f45140c);
                        SmartRefreshLayout.this.D(RefreshState.LoadFinish);
                        return;
                    }
                }
                if (this.f45141d) {
                    SmartRefreshLayout.this.J(true);
                    return;
                }
                return;
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            int iK = smartRefreshLayout3.f45119x0.k(smartRefreshLayout3, this.f45142e);
            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
            ec.f fVar = smartRefreshLayout4.f45081e0;
            if (fVar != null) {
                cc.a aVar = smartRefreshLayout4.f45119x0;
                if (aVar instanceof cc.c) {
                    fVar.f((cc.c) aVar, this.f45142e);
                }
            }
            if (iK < Integer.MAX_VALUE) {
                if (this.f45141d) {
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    z10 = smartRefreshLayout5.I && smartRefreshLayout5.f45076c < 0 && smartRefreshLayout5.f45121y0.f();
                }
                SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                int i11 = smartRefreshLayout6.f45076c;
                int iMax = i11 - (z10 ? Math.max(i11, -smartRefreshLayout6.f45099n0) : 0);
                SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                if (smartRefreshLayout7.f45100o || smartRefreshLayout7.f45087h0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (smartRefreshLayout8.f45100o) {
                        float f10 = smartRefreshLayout8.f45094l;
                        smartRefreshLayout8.f45090j = f10;
                        smartRefreshLayout8.f45080e = smartRefreshLayout8.f45076c - iMax;
                        smartRefreshLayout8.f45100o = false;
                        float f11 = smartRefreshLayout8.H ? iMax : 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout8.f45092k, f10 + f11 + (smartRefreshLayout8.f45074b * 2), 0));
                        SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout9.f45092k, smartRefreshLayout9.f45094l + f11, 0));
                    }
                    SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                    if (smartRefreshLayout10.f45087h0) {
                        smartRefreshLayout10.f45085g0 = 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout10.f45092k, smartRefreshLayout10.f45094l, 0));
                        SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                        smartRefreshLayout11.f45087h0 = false;
                        smartRefreshLayout11.f45080e = 0;
                    }
                }
                SmartRefreshLayout.this.A0.postDelayed(new a(iMax), SmartRefreshLayout.this.f45076c < 0 ? iK : 0L);
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f45147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f45148c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f45149d;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.O0 == null || smartRefreshLayout.f45117w0 == null) {
                    return;
                }
                smartRefreshLayout.B0.f(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
            }
        }

        public class b extends AnimatorListenerAdapter {
            public b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (animator == null || animator.getDuration() != 0) {
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    smartRefreshLayout.O0 = null;
                    if (smartRefreshLayout.f45117w0 == null) {
                        smartRefreshLayout.B0.g(RefreshState.None);
                        return;
                    }
                    RefreshState refreshState = smartRefreshLayout.C0;
                    RefreshState refreshState2 = RefreshState.ReleaseToRefresh;
                    if (refreshState != refreshState2) {
                        smartRefreshLayout.B0.g(refreshState2);
                    }
                    i iVar = i.this;
                    SmartRefreshLayout.this.setStateRefreshing(!iVar.f45149d);
                }
            }
        }

        public i(float f10, int i10, boolean z10) {
            this.f45147b = f10;
            this.f45148c = i10;
            this.f45149d = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.D0 != RefreshState.Refreshing) {
                return;
            }
            ValueAnimator valueAnimator = smartRefreshLayout.O0;
            if (valueAnimator != null) {
                valueAnimator.setDuration(0L);
                SmartRefreshLayout.this.O0.cancel();
                SmartRefreshLayout.this.O0 = null;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            smartRefreshLayout2.f45092k = smartRefreshLayout2.getMeasuredWidth() / 2.0f;
            SmartRefreshLayout.this.B0.g(RefreshState.PullDownToRefresh);
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            int i10 = smartRefreshLayout3.f45095l0;
            float f10 = i10 == 0 ? smartRefreshLayout3.f45111t0 : i10;
            float f11 = this.f45147b;
            if (f11 < 10.0f) {
                f11 *= f10;
            }
            smartRefreshLayout3.O0 = ValueAnimator.ofInt(smartRefreshLayout3.f45076c, (int) f11);
            SmartRefreshLayout.this.O0.setDuration(this.f45148c);
            SmartRefreshLayout.this.O0.setInterpolator(new gc.b(gc.b.f53397b));
            SmartRefreshLayout.this.O0.addUpdateListener(new a());
            SmartRefreshLayout.this.O0.addListener(new b());
            SmartRefreshLayout.this.O0.start();
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f45155d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f45158g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45153b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f45154c = 10;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f45157f = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f45156e = AnimationUtils.currentAnimationTimeMillis();

        public j(float f10, int i10) {
            this.f45158g = f10;
            this.f45155d = i10;
            SmartRefreshLayout.this.A0.postDelayed(this, this.f45154c);
            if (f10 > 0.0f) {
                SmartRefreshLayout.this.B0.g(RefreshState.PullDownToRefresh);
            } else {
                SmartRefreshLayout.this.B0.g(RefreshState.PullUpToLoad);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.N0 != this || smartRefreshLayout.C0.isFinishing) {
                return;
            }
            if (Math.abs(smartRefreshLayout.f45076c) < Math.abs(this.f45155d)) {
                double d10 = this.f45158g;
                int i10 = this.f45153b + 1;
                this.f45153b = i10;
                this.f45158g = (float) (d10 * Math.pow(0.949999988079071d, i10 * 2));
            } else if (this.f45155d != 0) {
                double d11 = this.f45158g;
                int i11 = this.f45153b + 1;
                this.f45153b = i11;
                this.f45158g = (float) (d11 * Math.pow(0.44999998807907104d, i11 * 2));
            } else {
                double d12 = this.f45158g;
                int i12 = this.f45153b + 1;
                this.f45153b = i12;
                this.f45158g = (float) (d12 * Math.pow(0.8500000238418579d, i12 * 2));
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f10 = this.f45158g * (((jCurrentAnimationTimeMillis - this.f45156e) * 1.0f) / 1000.0f);
            if (Math.abs(f10) >= 1.0f) {
                this.f45156e = jCurrentAnimationTimeMillis;
                float f11 = this.f45157f + f10;
                this.f45157f = f11;
                SmartRefreshLayout.this.C(f11);
                SmartRefreshLayout.this.A0.postDelayed(this, this.f45154c);
                return;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            RefreshState refreshState = smartRefreshLayout2.D0;
            boolean z10 = refreshState.isDragging;
            if (z10 && refreshState.isHeader) {
                smartRefreshLayout2.B0.g(RefreshState.PullDownCanceled);
            } else if (z10 && refreshState.isFooter) {
                smartRefreshLayout2.B0.g(RefreshState.PullUpCanceled);
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            smartRefreshLayout3.N0 = null;
            if (Math.abs(smartRefreshLayout3.f45076c) >= Math.abs(this.f45155d)) {
                int iMin = Math.min(Math.max((int) gc.b.i(Math.abs(SmartRefreshLayout.this.f45076c - this.f45155d)), 30), 100) * 10;
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                smartRefreshLayout4.i(this.f45155d, 0, smartRefreshLayout4.A, iMin);
            }
        }
    }

    public class k implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45160b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f45163e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f45161c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f45162d = 10;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f45164f = 0.98f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f45165g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f45166h = AnimationUtils.currentAnimationTimeMillis();

        public k(float f10) {
            this.f45163e = f10;
            this.f45160b = SmartRefreshLayout.this.f45076c;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x004b  */
        /* JADX WARN: Code duplicated, block: B:33:0x0059  */
        /* JADX WARN: Code duplicated, block: B:36:0x0065  */
        /* JADX WARN: Code duplicated, block: B:40:0x0093  */
        /* JADX WARN: Code duplicated, block: B:48:0x00a3 A[LOOP:0: B:34:0x0061->B:48:0x00a3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:52:0x008b A[SYNTHETIC] */
        public Runnable a() {
            SmartRefreshLayout smartRefreshLayout;
            int i10;
            int i11;
            float fPow;
            int i12;
            float f10;
            RefreshState refreshState;
            RefreshState refreshState2;
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            RefreshState refreshState3 = smartRefreshLayout2.C0;
            if (refreshState3.isFinishing) {
                return null;
            }
            if (smartRefreshLayout2.f45076c != 0) {
                if (refreshState3.isOpening || (smartRefreshLayout2.U && smartRefreshLayout2.I && smartRefreshLayout2.V && smartRefreshLayout2.y(smartRefreshLayout2.D))) {
                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                    if (smartRefreshLayout3.C0 == RefreshState.Loading || (smartRefreshLayout3.U && smartRefreshLayout3.I && smartRefreshLayout3.V && smartRefreshLayout3.y(smartRefreshLayout3.D))) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        if (smartRefreshLayout4.f45076c >= (-smartRefreshLayout4.f45099n0)) {
                            smartRefreshLayout = SmartRefreshLayout.this;
                            if (smartRefreshLayout.C0 == RefreshState.Refreshing && smartRefreshLayout.f45076c > smartRefreshLayout.f45095l0) {
                                i10 = 0;
                                i11 = SmartRefreshLayout.this.f45076c;
                                fPow = this.f45163e;
                                i12 = i11;
                                while (i11 * i12 > 0) {
                                    i10++;
                                    fPow = (float) (((double) fPow) * Math.pow(this.f45164f, (this.f45162d * i10) / 10.0f));
                                    f10 = ((this.f45162d * 1.0f) / 1000.0f) * fPow;
                                    if (Math.abs(f10) < 1.0f) {
                                        SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                                        refreshState = smartRefreshLayout5.C0;
                                        if (!refreshState.isOpening && ((refreshState != (refreshState2 = RefreshState.Refreshing) || i12 <= smartRefreshLayout5.f45095l0) && (refreshState == refreshState2 || i12 >= (-smartRefreshLayout5.f45099n0)))) {
                                            break;
                                            break;
                                        }
                                        return null;
                                    }
                                    i12 = (int) (i12 + f10);
                                }
                            }
                        } else {
                            i10 = 0;
                            i11 = SmartRefreshLayout.this.f45076c;
                            fPow = this.f45163e;
                            i12 = i11;
                            while (i11 * i12 > 0) {
                                i10++;
                                fPow = (float) (((double) fPow) * Math.pow(this.f45164f, (this.f45162d * i10) / 10.0f));
                                f10 = ((this.f45162d * 1.0f) / 1000.0f) * fPow;
                                if (Math.abs(f10) < 1.0f) {
                                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                                    refreshState = smartRefreshLayout6.C0;
                                    if (!refreshState.isOpening) {
                                    }
                                    return null;
                                }
                                i12 = (int) (i12 + f10);
                            }
                        }
                    } else {
                        smartRefreshLayout = SmartRefreshLayout.this;
                        if (smartRefreshLayout.C0 == RefreshState.Refreshing) {
                            i10 = 0;
                            i11 = SmartRefreshLayout.this.f45076c;
                            fPow = this.f45163e;
                            i12 = i11;
                            while (i11 * i12 > 0) {
                                i10++;
                                fPow = (float) (((double) fPow) * Math.pow(this.f45164f, (this.f45162d * i10) / 10.0f));
                                f10 = ((this.f45162d * 1.0f) / 1000.0f) * fPow;
                                if (Math.abs(f10) < 1.0f) {
                                    SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                                    refreshState = smartRefreshLayout7.C0;
                                    if (!refreshState.isOpening) {
                                    }
                                    return null;
                                }
                                i12 = (int) (i12 + f10);
                            }
                        }
                    }
                } else {
                    i10 = 0;
                    i11 = SmartRefreshLayout.this.f45076c;
                    fPow = this.f45163e;
                    i12 = i11;
                    while (i11 * i12 > 0) {
                        i10++;
                        fPow = (float) (((double) fPow) * Math.pow(this.f45164f, (this.f45162d * i10) / 10.0f));
                        f10 = ((this.f45162d * 1.0f) / 1000.0f) * fPow;
                        if (Math.abs(f10) < 1.0f) {
                            SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                            refreshState = smartRefreshLayout8.C0;
                            if (!refreshState.isOpening) {
                            }
                            return null;
                        }
                        i12 = (int) (i12 + f10);
                    }
                }
            }
            this.f45165g = AnimationUtils.currentAnimationTimeMillis();
            SmartRefreshLayout.this.A0.postDelayed(this, this.f45162d);
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.N0 != this || smartRefreshLayout.C0.isFinishing) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j10 = jCurrentAnimationTimeMillis - this.f45166h;
            float fPow = (float) (((double) this.f45163e) * Math.pow(this.f45164f, (jCurrentAnimationTimeMillis - this.f45165g) / (1000.0f / this.f45162d)));
            this.f45163e = fPow;
            float f10 = fPow * ((j10 * 1.0f) / 1000.0f);
            if (Math.abs(f10) <= 1.0f) {
                SmartRefreshLayout.this.N0 = null;
                return;
            }
            this.f45166h = jCurrentAnimationTimeMillis;
            int i10 = (int) (this.f45160b + f10);
            this.f45160b = i10;
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            if (smartRefreshLayout2.f45076c * i10 > 0) {
                smartRefreshLayout2.B0.f(i10, true);
                SmartRefreshLayout.this.A0.postDelayed(this, this.f45162d);
                return;
            }
            smartRefreshLayout2.N0 = null;
            smartRefreshLayout2.B0.f(0, true);
            gc.b.d(SmartRefreshLayout.this.f45121y0.g(), (int) (-this.f45163e));
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            if (!smartRefreshLayout3.K0 || f10 <= 0.0f) {
                return;
            }
            smartRefreshLayout3.K0 = false;
        }
    }

    public class l implements cc.e {
        public l() {
        }

        @Override // cc.e
        public ValueAnimator a(int i10) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            return smartRefreshLayout.i(i10, 0, smartRefreshLayout.A, smartRefreshLayout.f45084g);
        }

        @Override // cc.e
        public cc.e b(@NonNull cc.a aVar, int i10) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f45123z0 == null && i10 != 0) {
                smartRefreshLayout.f45123z0 = new Paint();
            }
            if (aVar.equals(SmartRefreshLayout.this.f45117w0)) {
                SmartRefreshLayout.this.F0 = i10;
            } else if (aVar.equals(SmartRefreshLayout.this.f45119x0)) {
                SmartRefreshLayout.this.G0 = i10;
            }
            return this;
        }

        @Override // cc.e
        @NonNull
        public cc.f c() {
            return SmartRefreshLayout.this;
        }

        @Override // cc.e
        public cc.e d(@NonNull cc.a aVar) {
            if (aVar.equals(SmartRefreshLayout.this.f45117w0)) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                dc.a aVar2 = smartRefreshLayout.f45097m0;
                if (aVar2.f51928b) {
                    smartRefreshLayout.f45097m0 = aVar2.c();
                }
            } else if (aVar.equals(SmartRefreshLayout.this.f45119x0)) {
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                dc.a aVar3 = smartRefreshLayout2.f45101o0;
                if (aVar3.f51928b) {
                    smartRefreshLayout2.f45101o0 = aVar3.c();
                }
            }
            return this;
        }

        @Override // cc.e
        public cc.e e() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.C0 == RefreshState.TwoLevel) {
                smartRefreshLayout.B0.g(RefreshState.TwoLevelFinish);
                if (SmartRefreshLayout.this.f45076c == 0) {
                    f(0, false);
                    SmartRefreshLayout.this.D(RefreshState.None);
                } else {
                    a(0).setDuration(SmartRefreshLayout.this.f45082f);
                }
            }
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:50:0x009f  */
        @Override // cc.e
        public cc.e f(int i10, boolean z10) {
            int i11;
            ec.f fVar;
            ec.f fVar2;
            int i12;
            boolean z11;
            cc.a aVar;
            cc.a aVar2;
            cc.a aVar3;
            cc.a aVar4;
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f45076c == i10 && (((aVar3 = smartRefreshLayout.f45117w0) == null || !aVar3.e()) && ((aVar4 = SmartRefreshLayout.this.f45119x0) == null || !aVar4.e()))) {
                return this;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            int i13 = smartRefreshLayout2.f45076c;
            smartRefreshLayout2.f45076c = i10;
            if (z10) {
                RefreshState refreshState = smartRefreshLayout2.D0;
                if (refreshState.isDragging || refreshState.isOpening) {
                    float f10 = i10;
                    float f11 = smartRefreshLayout2.f45111t0;
                    if (f11 < 10.0f) {
                        f11 *= smartRefreshLayout2.f45095l0;
                    }
                    if (f10 <= f11) {
                        float f12 = -i10;
                        float f13 = smartRefreshLayout2.f45113u0;
                        if (f13 < 10.0f) {
                            f13 *= smartRefreshLayout2.f45099n0;
                        }
                        if (f12 > f13 && !smartRefreshLayout2.U) {
                            smartRefreshLayout2.B0.g(RefreshState.ReleaseToLoad);
                        } else if (i10 < 0 && !smartRefreshLayout2.U) {
                            smartRefreshLayout2.B0.g(RefreshState.PullUpToLoad);
                        } else if (i10 > 0) {
                            smartRefreshLayout2.B0.g(RefreshState.PullDownToRefresh);
                        }
                    } else if (smartRefreshLayout2.C0 != RefreshState.ReleaseToTwoLevel) {
                        smartRefreshLayout2.B0.g(RefreshState.ReleaseToRefresh);
                    }
                }
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            if (smartRefreshLayout3.f45121y0 != null) {
                if (i10 < 0) {
                    i12 = 0;
                    z11 = false;
                } else {
                    if (smartRefreshLayout3.z(smartRefreshLayout3.G, smartRefreshLayout3.f45117w0)) {
                        i12 = i10;
                    } else if (i13 < 0) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                        z11 = false;
                    }
                    z11 = true;
                }
                if (i10 <= 0) {
                    SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                    if (smartRefreshLayout4.z(smartRefreshLayout4.H, smartRefreshLayout4.f45119x0)) {
                        i12 = i10;
                    } else if (i13 > 0) {
                        i12 = 0;
                    }
                    z11 = true;
                }
                if (z11) {
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    smartRefreshLayout5.f45121y0.e(i12, smartRefreshLayout5.f45110t, smartRefreshLayout5.f45112u);
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.U && smartRefreshLayout6.V && smartRefreshLayout6.I) {
                        cc.a aVar5 = smartRefreshLayout6.f45119x0;
                        if ((aVar5 instanceof cc.c) && aVar5.getSpinnerStyle() == dc.b.f51929d) {
                            SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                            if (smartRefreshLayout7.y(smartRefreshLayout7.D)) {
                                SmartRefreshLayout.this.f45119x0.getView().setTranslationY(Math.max(0, i12));
                            }
                        }
                    }
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    boolean z12 = (smartRefreshLayout8.E && (aVar2 = smartRefreshLayout8.f45117w0) != null && aVar2.getSpinnerStyle() == dc.b.f51931f) || SmartRefreshLayout.this.F0 != 0;
                    SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                    boolean z13 = (smartRefreshLayout9.F && (aVar = smartRefreshLayout9.f45119x0) != null && aVar.getSpinnerStyle() == dc.b.f51931f) || SmartRefreshLayout.this.G0 != 0;
                    if ((z12 && (i12 >= 0 || i13 > 0)) || (z13 && (i12 <= 0 || i13 < 0))) {
                        smartRefreshLayout2.invalidate();
                    }
                }
            }
            if ((i10 >= 0 || i13 > 0) && SmartRefreshLayout.this.f45117w0 != null) {
                int iMax = Math.max(i10, 0);
                SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                int i14 = smartRefreshLayout10.f45095l0;
                float f14 = smartRefreshLayout10.f45107r0;
                if (f14 < 10.0f) {
                    f14 *= i14;
                }
                int i15 = (int) f14;
                float f15 = iMax * 1.0f;
                float f16 = smartRefreshLayout10.f45111t0;
                if (f16 < 10.0f) {
                    f16 *= i14;
                }
                float f17 = f15 / f16;
                if (smartRefreshLayout10.y(smartRefreshLayout10.C) || (SmartRefreshLayout.this.C0 == RefreshState.RefreshFinish && !z10)) {
                    SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                    if (i13 != smartRefreshLayout11.f45076c) {
                        if (smartRefreshLayout11.f45117w0.getSpinnerStyle() == dc.b.f51929d) {
                            SmartRefreshLayout.this.f45117w0.getView().setTranslationY(SmartRefreshLayout.this.f45076c);
                            SmartRefreshLayout smartRefreshLayout12 = SmartRefreshLayout.this;
                            if (smartRefreshLayout12.F0 != 0 && smartRefreshLayout12.f45123z0 != null && !smartRefreshLayout12.z(smartRefreshLayout12.G, smartRefreshLayout12.f45117w0)) {
                                smartRefreshLayout2.invalidate();
                            }
                        } else if (SmartRefreshLayout.this.f45117w0.getSpinnerStyle().f51937c) {
                            View view = SmartRefreshLayout.this.f45117w0.getView();
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : SmartRefreshLayout.S0;
                            view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((SmartRefreshLayout.this.f45076c - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                            int i16 = marginLayoutParams.leftMargin;
                            int i17 = marginLayoutParams.topMargin + SmartRefreshLayout.this.f45103p0;
                            view.layout(i16, i17, view.getMeasuredWidth() + i16, view.getMeasuredHeight() + i17);
                        }
                        i11 = i15;
                        SmartRefreshLayout.this.f45117w0.q(z10, f17, iMax, i14, i11);
                    } else {
                        i11 = i15;
                    }
                    if (z10 && SmartRefreshLayout.this.f45117w0.e()) {
                        int i18 = (int) SmartRefreshLayout.this.f45092k;
                        int width = smartRefreshLayout2.getWidth();
                        SmartRefreshLayout smartRefreshLayout13 = SmartRefreshLayout.this;
                        smartRefreshLayout13.f45117w0.d(smartRefreshLayout13.f45092k / (width == 0 ? 1 : width), i18, width);
                    }
                } else {
                    i11 = i15;
                    i14 = i14;
                }
                SmartRefreshLayout smartRefreshLayout14 = SmartRefreshLayout.this;
                if (i13 != smartRefreshLayout14.f45076c && (fVar = smartRefreshLayout14.f45081e0) != null) {
                    cc.a aVar6 = smartRefreshLayout14.f45117w0;
                    if (aVar6 instanceof cc.d) {
                        fVar.i((cc.d) aVar6, z10, f17, iMax, i14, i11);
                    }
                }
            }
            if ((i10 <= 0 || i13 < 0) && SmartRefreshLayout.this.f45119x0 != null) {
                int i19 = -Math.min(i10, 0);
                SmartRefreshLayout smartRefreshLayout15 = SmartRefreshLayout.this;
                int i20 = smartRefreshLayout15.f45099n0;
                float f18 = smartRefreshLayout15.f45109s0;
                if (f18 < 10.0f) {
                    f18 *= i20;
                }
                int i21 = (int) f18;
                float f19 = i19 * 1.0f;
                float f20 = smartRefreshLayout15.f45113u0;
                if (f20 < 10.0f) {
                    f20 *= i20;
                }
                float f21 = f19 / f20;
                if (smartRefreshLayout15.y(smartRefreshLayout15.D) || (SmartRefreshLayout.this.C0 == RefreshState.LoadFinish && !z10)) {
                    SmartRefreshLayout smartRefreshLayout16 = SmartRefreshLayout.this;
                    if (i13 != smartRefreshLayout16.f45076c) {
                        if (smartRefreshLayout16.f45119x0.getSpinnerStyle() == dc.b.f51929d) {
                            SmartRefreshLayout.this.f45119x0.getView().setTranslationY(SmartRefreshLayout.this.f45076c);
                            SmartRefreshLayout smartRefreshLayout17 = SmartRefreshLayout.this;
                            if (smartRefreshLayout17.G0 != 0 && smartRefreshLayout17.f45123z0 != null && !smartRefreshLayout17.z(smartRefreshLayout17.H, smartRefreshLayout17.f45119x0)) {
                                smartRefreshLayout2.invalidate();
                            }
                        } else if (SmartRefreshLayout.this.f45119x0.getSpinnerStyle().f51937c) {
                            View view2 = SmartRefreshLayout.this.f45119x0.getView();
                            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : SmartRefreshLayout.S0;
                            view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(((-SmartRefreshLayout.this.f45076c) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0), 1073741824));
                            int i22 = marginLayoutParams2.leftMargin;
                            int measuredHeight = (marginLayoutParams2.topMargin + smartRefreshLayout2.getMeasuredHeight()) - SmartRefreshLayout.this.f45105q0;
                            view2.layout(i22, measuredHeight - view2.getMeasuredHeight(), view2.getMeasuredWidth() + i22, measuredHeight);
                        }
                        SmartRefreshLayout.this.f45119x0.q(z10, f21, i19, i20, i21);
                    }
                    if (z10 && SmartRefreshLayout.this.f45119x0.e()) {
                        int i23 = (int) SmartRefreshLayout.this.f45092k;
                        int width2 = smartRefreshLayout2.getWidth();
                        SmartRefreshLayout smartRefreshLayout18 = SmartRefreshLayout.this;
                        smartRefreshLayout18.f45119x0.d(smartRefreshLayout18.f45092k / (width2 == 0 ? 1 : width2), i23, width2);
                    }
                }
                SmartRefreshLayout smartRefreshLayout19 = SmartRefreshLayout.this;
                if (i13 != smartRefreshLayout19.f45076c && (fVar2 = smartRefreshLayout19.f45081e0) != null) {
                    cc.a aVar7 = smartRefreshLayout19.f45119x0;
                    if (aVar7 instanceof cc.c) {
                        fVar2.p((cc.c) aVar7, z10, f21, i19, i20, i21);
                    }
                }
            }
            return this;
        }

        @Override // cc.e
        public cc.e g(@NonNull RefreshState refreshState) {
            switch (a.f45126a[refreshState.ordinal()]) {
                case 1:
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    RefreshState refreshState2 = smartRefreshLayout.C0;
                    RefreshState refreshState3 = RefreshState.None;
                    if (refreshState2 != refreshState3 && smartRefreshLayout.f45076c == 0) {
                        smartRefreshLayout.D(refreshState3);
                    } else if (smartRefreshLayout.f45076c != 0) {
                        a(0);
                    }
                    break;
                case 2:
                    SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout2.C0.isOpening && smartRefreshLayout2.y(smartRefreshLayout2.C)) {
                        SmartRefreshLayout.this.D(RefreshState.PullDownToRefresh);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.PullDownToRefresh);
                    }
                    break;
                case 3:
                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                    if (smartRefreshLayout3.y(smartRefreshLayout3.D)) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        RefreshState refreshState4 = smartRefreshLayout4.C0;
                        if (!refreshState4.isOpening && !refreshState4.isFinishing && (!smartRefreshLayout4.U || !smartRefreshLayout4.I || !smartRefreshLayout4.V)) {
                            smartRefreshLayout4.D(RefreshState.PullUpToLoad);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.PullUpToLoad);
                    break;
                case 4:
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout5.C0.isOpening && smartRefreshLayout5.y(smartRefreshLayout5.C)) {
                        SmartRefreshLayout.this.D(RefreshState.PullDownCanceled);
                        g(RefreshState.None);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.PullDownCanceled);
                    }
                    break;
                case 5:
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.y(smartRefreshLayout6.D)) {
                        SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                        if (!smartRefreshLayout7.C0.isOpening && (!smartRefreshLayout7.U || !smartRefreshLayout7.I || !smartRefreshLayout7.V)) {
                            smartRefreshLayout7.D(RefreshState.PullUpCanceled);
                            g(RefreshState.None);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.PullUpCanceled);
                    break;
                case 6:
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout8.C0.isOpening && smartRefreshLayout8.y(smartRefreshLayout8.C)) {
                        SmartRefreshLayout.this.D(RefreshState.ReleaseToRefresh);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToRefresh);
                    }
                    break;
                case 7:
                    SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                    if (smartRefreshLayout9.y(smartRefreshLayout9.D)) {
                        SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                        RefreshState refreshState5 = smartRefreshLayout10.C0;
                        if (!refreshState5.isOpening && !refreshState5.isFinishing && (!smartRefreshLayout10.U || !smartRefreshLayout10.I || !smartRefreshLayout10.V)) {
                            smartRefreshLayout10.D(RefreshState.ReleaseToLoad);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToLoad);
                    break;
                case 8:
                    SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout11.C0.isOpening && smartRefreshLayout11.y(smartRefreshLayout11.C)) {
                        SmartRefreshLayout.this.D(RefreshState.ReleaseToTwoLevel);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToTwoLevel);
                    }
                    break;
                case 9:
                    SmartRefreshLayout smartRefreshLayout12 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout12.C0.isOpening && smartRefreshLayout12.y(smartRefreshLayout12.C)) {
                        SmartRefreshLayout.this.D(RefreshState.RefreshReleased);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.RefreshReleased);
                    }
                    break;
                case 10:
                    SmartRefreshLayout smartRefreshLayout13 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout13.C0.isOpening && smartRefreshLayout13.y(smartRefreshLayout13.D)) {
                        SmartRefreshLayout.this.D(RefreshState.LoadReleased);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.LoadReleased);
                    }
                    break;
                case 11:
                    SmartRefreshLayout.this.setStateRefreshing(true);
                    break;
                case 12:
                    SmartRefreshLayout.this.setStateLoading(true);
                    break;
                default:
                    SmartRefreshLayout.this.D(refreshState);
                    break;
            }
            return null;
        }
    }

    public cc.f F() {
        return J(false);
    }

    public cc.f G(boolean z10) {
        this.W = true;
        this.D = z10;
        return this;
    }

    public cc.f N(@NonNull cc.c cVar) {
        return O(cVar, 0, 0);
    }

    public cc.f P(@NonNull cc.d dVar) {
        return Q(dVar, 0, 0);
    }

    public boolean R(float f10) {
        if (f10 == 0.0f) {
            f10 = this.f45118x;
        }
        if (Math.abs(f10) > this.f45114v) {
            int i10 = this.f45076c;
            if (i10 * f10 < 0.0f) {
                RefreshState refreshState = this.C0;
                if (refreshState == RefreshState.Refreshing || refreshState == RefreshState.Loading || (i10 < 0 && this.U)) {
                    this.N0 = new k(f10).a();
                    return true;
                }
                if (refreshState.isReleaseToOpening) {
                    return true;
                }
            }
            if ((f10 < 0.0f && ((this.K && (this.D || this.L)) || ((this.C0 == RefreshState.Loading && i10 >= 0) || (this.M && y(this.D))))) || (f10 > 0.0f && ((this.K && this.C) || this.L || (this.C0 == RefreshState.Refreshing && this.f45076c <= 0)))) {
                this.L0 = false;
                this.f45120y.fling(0, 0, 0, (int) (-f10), 0, 0, -2147483647, Integer.MAX_VALUE);
                this.f45120y.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    @Override // cc.f
    public cc.f a(@ColorRes int... iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = ContextCompat.getColor(getContext(), iArr[i10]);
        }
        M(iArr2);
        return this;
    }

    @Override // cc.f
    @NonNull
    public ViewGroup getLayout() {
        return this;
    }

    public cc.f n() {
        return q(true);
    }

    public cc.f o(int i10) {
        return p(i10, true, false);
    }

    public cc.f s() {
        return v(true);
    }

    public cc.f v(boolean z10) {
        return z10 ? u(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.E0))), com.safedk.android.internal.d.f44769a) << 16, true, Boolean.FALSE) : u(0, false, null);
    }

    public boolean x(int i10) {
        if (i10 == 0) {
            if (this.O0 != null) {
                RefreshState refreshState = this.C0;
                if (refreshState.isFinishing || refreshState == RefreshState.TwoLevelReleased || refreshState == RefreshState.RefreshReleased || refreshState == RefreshState.LoadReleased) {
                    return true;
                }
                if (refreshState == RefreshState.PullDownCanceled) {
                    this.B0.g(RefreshState.PullDownToRefresh);
                } else if (refreshState == RefreshState.PullUpCanceled) {
                    this.B0.g(RefreshState.PullUpToLoad);
                }
                this.O0.setDuration(0L);
                this.O0.cancel();
                this.O0 = null;
            }
            this.N0 = null;
        }
        return this.O0 != null;
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45126a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f45126a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45126a[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45126a[RefreshState.PullUpToLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45126a[RefreshState.PullDownCanceled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45126a[RefreshState.PullUpCanceled.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45126a[RefreshState.ReleaseToRefresh.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45126a[RefreshState.ReleaseToLoad.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f45126a[RefreshState.ReleaseToTwoLevel.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f45126a[RefreshState.RefreshReleased.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f45126a[RefreshState.LoadReleased.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f45126a[RefreshState.Refreshing.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f45126a[RefreshState.Loading.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static void setDefaultRefreshFooterCreator(@NonNull ec.b bVar) {
        P0 = bVar;
    }

    public static void setDefaultRefreshHeaderCreator(@NonNull ec.c cVar) {
        Q0 = cVar;
    }

    public static void setDefaultRefreshInitializer(@NonNull ec.d dVar) {
        R0 = dVar;
    }

    public boolean A() {
        return this.C0 == RefreshState.Loading;
    }

    public boolean B() {
        return this.C0 == RefreshState.Refreshing;
    }

    public void C(float f10) {
        RefreshState refreshState;
        float f11 = (!this.f45087h0 || this.Q || f10 >= 0.0f || this.f45121y0.f()) ? f10 : 0.0f;
        if (f11 > this.f45086h * 5 && getTag() == null) {
            int i10 = R$id.srl_tag;
            if (getTag(i10) == null) {
                float f12 = this.f45094l;
                int i11 = this.f45086h;
                if (f12 < i11 / 6.0f && this.f45092k < i11 / 16.0f) {
                    Toast.makeText(getContext(), "你这么死拉，臣妾做不到啊！", 0).show();
                    setTag(i10, "你这么死拉，臣妾做不到啊！");
                }
            }
        }
        RefreshState refreshState2 = this.C0;
        if (refreshState2 == RefreshState.TwoLevel && f11 > 0.0f) {
            this.B0.f(Math.min((int) f11, getMeasuredHeight()), true);
        } else if (refreshState2 == RefreshState.Refreshing && f11 >= 0.0f) {
            int i12 = this.f45095l0;
            if (f11 < i12) {
                this.B0.f((int) f11, true);
            } else {
                float f13 = this.f45107r0;
                if (f13 < 10.0f) {
                    f13 *= i12;
                }
                double d10 = f13 - i12;
                int iMax = Math.max((this.f45086h * 4) / 3, getHeight());
                int i13 = this.f45095l0;
                double d11 = iMax - i13;
                double dMax = Math.max(0.0f, (f11 - i13) * this.f45096m);
                double d12 = -dMax;
                if (d11 == 0.0d) {
                    d11 = 1.0d;
                }
                this.B0.f(((int) Math.min(d10 * (1.0d - Math.pow(100.0d, d12 / d11)), dMax)) + this.f45095l0, true);
            }
        } else if (f11 < 0.0f && (refreshState2 == RefreshState.Loading || ((this.I && this.U && this.V && y(this.D)) || (this.M && !this.U && y(this.D))))) {
            int i14 = this.f45099n0;
            if (f11 > (-i14)) {
                this.B0.f((int) f11, true);
            } else {
                float f14 = this.f45109s0;
                if (f14 < 10.0f) {
                    f14 *= i14;
                }
                double d13 = f14 - i14;
                int iMax2 = Math.max((this.f45086h * 4) / 3, getHeight());
                int i15 = this.f45099n0;
                double d14 = iMax2 - i15;
                double d15 = -Math.min(0.0f, (i15 + f11) * this.f45096m);
                double d16 = -d15;
                if (d14 == 0.0d) {
                    d14 = 1.0d;
                }
                this.B0.f(((int) (-Math.min(d13 * (1.0d - Math.pow(100.0d, d16 / d14)), d15))) - this.f45099n0, true);
            }
        } else if (f11 >= 0.0f) {
            float f15 = this.f45107r0;
            double d17 = f15 < 10.0f ? this.f45095l0 * f15 : f15;
            double dMax2 = Math.max(this.f45086h / 2, getHeight());
            double dMax3 = Math.max(0.0f, this.f45096m * f11);
            double d18 = -dMax3;
            if (dMax2 == 0.0d) {
                dMax2 = 1.0d;
            }
            this.B0.f((int) Math.min(d17 * (1.0d - Math.pow(100.0d, d18 / dMax2)), dMax3), true);
        } else {
            float f16 = this.f45109s0;
            double d19 = f16 < 10.0f ? this.f45099n0 * f16 : f16;
            double dMax4 = Math.max(this.f45086h / 2, getHeight());
            double d20 = -Math.min(0.0f, this.f45096m * f11);
            this.B0.f((int) (-Math.min(d19 * (1.0d - Math.pow(100.0d, (-d20) / (dMax4 == 0.0d ? 1.0d : dMax4))), d20)), true);
        }
        if (!this.M || this.U || !y(this.D) || f11 >= 0.0f || (refreshState = this.C0) == RefreshState.Refreshing || refreshState == RefreshState.Loading || refreshState == RefreshState.LoadFinish) {
            return;
        }
        if (this.T) {
            this.N0 = null;
            this.B0.a(-this.f45099n0);
        }
        setStateDirectLoading(false);
        this.A0.postDelayed(new f(), this.f45084g);
    }

    public void D(RefreshState refreshState) {
        RefreshState refreshState2 = this.C0;
        if (refreshState2 == refreshState) {
            if (this.D0 != refreshState2) {
                this.D0 = refreshState2;
                return;
            }
            return;
        }
        this.C0 = refreshState;
        this.D0 = refreshState;
        cc.a aVar = this.f45117w0;
        cc.a aVar2 = this.f45119x0;
        ec.f fVar = this.f45081e0;
        if (aVar != null) {
            aVar.c(this, refreshState2, refreshState);
        }
        if (aVar2 != null) {
            aVar2.c(this, refreshState2, refreshState);
        }
        if (fVar != null) {
            fVar.c(this, refreshState2, refreshState);
        }
        if (refreshState == RefreshState.LoadFinish) {
            this.K0 = false;
        }
    }

    public void E() {
        RefreshState refreshState = this.C0;
        if (refreshState == RefreshState.TwoLevel) {
            if (this.f45118x <= -1000 || this.f45076c <= getHeight() / 2) {
                if (this.f45100o) {
                    this.B0.e();
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimatorA = this.B0.a(getHeight());
                if (valueAnimatorA != null) {
                    valueAnimatorA.setDuration(this.f45082f);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState == refreshState2 || (this.I && this.U && this.V && this.f45076c < 0 && y(this.D))) {
            int i10 = this.f45076c;
            int i11 = this.f45099n0;
            if (i10 < (-i11)) {
                this.B0.a(-i11);
                return;
            } else {
                if (i10 > 0) {
                    this.B0.a(0);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState3 = this.C0;
        RefreshState refreshState4 = RefreshState.Refreshing;
        if (refreshState3 == refreshState4) {
            int i12 = this.f45076c;
            int i13 = this.f45095l0;
            if (i12 > i13) {
                this.B0.a(i13);
                return;
            } else {
                if (i12 < 0) {
                    this.B0.a(0);
                    return;
                }
                return;
            }
        }
        if (refreshState3 == RefreshState.PullDownToRefresh) {
            this.B0.g(RefreshState.PullDownCanceled);
            return;
        }
        if (refreshState3 == RefreshState.PullUpToLoad) {
            this.B0.g(RefreshState.PullUpCanceled);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToRefresh) {
            this.B0.g(refreshState4);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToLoad) {
            this.B0.g(refreshState2);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToTwoLevel) {
            this.B0.g(RefreshState.TwoLevelReleased);
            return;
        }
        if (refreshState3 == RefreshState.RefreshReleased) {
            if (this.O0 == null) {
                this.B0.a(this.f45095l0);
            }
        } else if (refreshState3 == RefreshState.LoadReleased) {
            if (this.O0 == null) {
                this.B0.a(-this.f45099n0);
            }
        } else {
            if (refreshState3 == RefreshState.LoadFinish || this.f45076c == 0) {
                return;
            }
            this.B0.a(0);
        }
    }

    public cc.f H(boolean z10) {
        this.K = z10;
        return this;
    }

    public cc.f I(boolean z10) {
        this.C = z10;
        return this;
    }

    public cc.f J(boolean z10) {
        RefreshState refreshState = this.C0;
        if (refreshState == RefreshState.Refreshing && z10) {
            w();
        } else if (refreshState == RefreshState.Loading && z10) {
            r();
        } else if (this.U != z10) {
            this.U = z10;
            cc.a aVar = this.f45119x0;
            if (aVar instanceof cc.c) {
                if (((cc.c) aVar).a(z10)) {
                    this.V = true;
                    if (this.U && this.I && this.f45076c > 0 && this.f45119x0.getSpinnerStyle() == dc.b.f51929d && y(this.D) && z(this.C, this.f45117w0)) {
                        this.f45119x0.getView().setTranslationY(this.f45076c);
                    }
                } else {
                    this.V = false;
                    new RuntimeException("Footer:" + this.f45119x0 + " NoMoreData is not supported.(不支持NoMoreData，请使用[ClassicsFooter]或者[自定义Footer并实现setNoMoreData方法且返回true])").printStackTrace();
                }
            }
        }
        return this;
    }

    public cc.f K(ec.e eVar) {
        this.f45079d0 = eVar;
        this.D = this.D || !(this.W || eVar == null);
        return this;
    }

    public cc.f L(ec.g gVar) {
        this.f45077c0 = gVar;
        return this;
    }

    public cc.f M(@ColorInt int... iArr) {
        cc.a aVar = this.f45117w0;
        if (aVar != null) {
            aVar.setPrimaryColors(iArr);
        }
        cc.a aVar2 = this.f45119x0;
        if (aVar2 != null) {
            aVar2.setPrimaryColors(iArr);
        }
        this.B = iArr;
        return this;
    }

    public cc.f O(@NonNull cc.c cVar, int i10, int i11) {
        cc.a aVar;
        cc.a aVar2 = this.f45119x0;
        if (aVar2 != null) {
            super.removeView(aVar2.getView());
        }
        this.f45119x0 = cVar;
        this.K0 = false;
        this.G0 = 0;
        this.V = false;
        this.I0 = false;
        this.f45101o0 = dc.a.f51914c;
        this.D = !this.W || this.D;
        if (i10 == 0) {
            i10 = -1;
        }
        if (i11 == 0) {
            i11 = -2;
        }
        LayoutParams layoutParams = new LayoutParams(i10, i11);
        ViewGroup.LayoutParams layoutParams2 = cVar.getView().getLayoutParams();
        if (layoutParams2 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams2;
        }
        if (this.f45119x0.getSpinnerStyle().f51936b) {
            super.addView(this.f45119x0.getView(), getChildCount(), layoutParams);
        } else {
            super.addView(this.f45119x0.getView(), 0, layoutParams);
        }
        int[] iArr = this.B;
        if (iArr != null && (aVar = this.f45119x0) != null) {
            aVar.setPrimaryColors(iArr);
        }
        return this;
    }

    public cc.f Q(@NonNull cc.d dVar, int i10, int i11) {
        cc.a aVar;
        cc.a aVar2 = this.f45117w0;
        if (aVar2 != null) {
            super.removeView(aVar2.getView());
        }
        this.f45117w0 = dVar;
        this.F0 = 0;
        this.H0 = false;
        this.f45097m0 = dc.a.f51914c;
        if (i10 == 0) {
            i10 = -1;
        }
        if (i11 == 0) {
            i11 = -2;
        }
        LayoutParams layoutParams = new LayoutParams(i10, i11);
        ViewGroup.LayoutParams layoutParams2 = dVar.getView().getLayoutParams();
        if (layoutParams2 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams2;
        }
        if (this.f45117w0.getSpinnerStyle().f51936b) {
            super.addView(this.f45117w0.getView(), getChildCount(), layoutParams);
        } else {
            super.addView(this.f45117w0.getView(), 0, layoutParams);
        }
        int[] iArr = this.B;
        if (iArr != null && (aVar = this.f45117w0) != null) {
            aVar.setPrimaryColors(iArr);
        }
        return this;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f45120y.getCurrY();
        if (this.f45120y.computeScrollOffset()) {
            int finalY = this.f45120y.getFinalY();
            if ((finalY >= 0 || !((this.C || this.L) && this.f45121y0.i())) && (finalY <= 0 || !((this.D || this.L) && this.f45121y0.f()))) {
                this.L0 = true;
                invalidate();
            } else {
                if (this.L0) {
                    j(finalY > 0 ? -this.f45120y.getCurrVelocity() : this.f45120y.getCurrVelocity());
                }
                this.f45120y.forceFinished(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0163  */
    /* JADX WARN: Code duplicated, block: B:123:0x0169  */
    /* JADX WARN: Code duplicated, block: B:132:0x0187  */
    /* JADX WARN: Code duplicated, block: B:134:0x018b  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:162:0x01de  */
    /* JADX WARN: Code duplicated, block: B:165:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:177:0x020b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0240  */
    /* JADX WARN: Code duplicated, block: B:186:0x024f  */
    /* JADX WARN: Code duplicated, block: B:193:0x026d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:194:0x026f  */
    /* JADX WARN: Code duplicated, block: B:201:0x028d  */
    /* JADX WARN: Code duplicated, block: B:204:0x0294 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:205:0x0296  */
    /* JADX WARN: Code duplicated, block: B:210:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:225:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:228:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:231:0x0311  */
    /* JADX WARN: Code duplicated, block: B:235:0x0319  */
    /* JADX WARN: Code duplicated, block: B:243:0x0359  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:93:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x0105  */
    /* JADX WARN: Code duplicated, block: B:97:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x010c  */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00dc, code lost:
    
        if (r2.isFooter != false) goto L246;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        Paint paint;
        Paint paint2;
        cc.b bVar = this.f45121y0;
        View view2 = bVar != null ? bVar.getView() : null;
        cc.a aVar = this.f45117w0;
        if (aVar != null && aVar.getView() == view) {
            if (!y(this.C) || (!this.J && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMax = Math.max(view2.getTop() + view2.getPaddingTop() + this.f45076c, view.getTop());
                int i10 = this.F0;
                if (i10 != 0 && (paint2 = this.f45123z0) != null) {
                    paint2.setColor(i10);
                    if (this.f45117w0.getSpinnerStyle().f51937c) {
                        iMax = view.getBottom();
                    } else if (this.f45117w0.getSpinnerStyle() == dc.b.f51929d) {
                        iMax = view.getBottom() + this.f45076c;
                    }
                    canvas.drawRect(0.0f, view.getTop(), getWidth(), iMax, this.f45123z0);
                }
                if ((this.E && this.f45117w0.getSpinnerStyle() == dc.b.f51931f) || this.f45117w0.getSpinnerStyle().f51937c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), iMax);
                    boolean zDrawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return zDrawChild;
                }
            }
        }
        cc.a aVar2 = this.f45119x0;
        if (aVar2 != null && aVar2.getView() == view) {
            if (!y(this.D) || (!this.J && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMin = Math.min((view2.getBottom() - view2.getPaddingBottom()) + this.f45076c, view.getBottom());
                int i11 = this.G0;
                if (i11 != 0 && (paint = this.f45123z0) != null) {
                    paint.setColor(i11);
                    if (this.f45119x0.getSpinnerStyle().f51937c) {
                        iMin = view.getTop();
                    } else if (this.f45119x0.getSpinnerStyle() == dc.b.f51929d) {
                        iMin = view.getTop() + this.f45076c;
                    }
                    canvas.drawRect(0.0f, iMin, getWidth(), view.getBottom(), this.f45123z0);
                }
                if ((this.F && this.f45119x0.getSpinnerStyle() == dc.b.f51931f) || this.f45119x0.getSpinnerStyle().f51937c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), iMin, view.getRight(), view.getBottom());
                    boolean zDrawChild2 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return zDrawChild2;
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f45093k0.getNestedScrollAxes();
    }

    @Nullable
    public cc.c getRefreshFooter() {
        cc.a aVar = this.f45119x0;
        if (aVar instanceof cc.c) {
            return (cc.c) aVar;
        }
        return null;
    }

    @Nullable
    public cc.d getRefreshHeader() {
        cc.a aVar = this.f45117w0;
        if (aVar instanceof cc.d) {
            return (cc.d) aVar;
        }
        return null;
    }

    @NonNull
    public RefreshState getState() {
        return this.C0;
    }

    public ValueAnimator i(int i10, int i11, Interpolator interpolator, int i12) {
        if (this.f45076c == i10) {
            return null;
        }
        ValueAnimator valueAnimator = this.O0;
        if (valueAnimator != null) {
            valueAnimator.setDuration(0L);
            this.O0.cancel();
            this.O0 = null;
        }
        this.N0 = null;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f45076c, i10);
        this.O0 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(i12);
        this.O0.setInterpolator(interpolator);
        this.O0.addListener(new d());
        this.O0.addUpdateListener(new e());
        this.O0.setStartDelay(i11);
        this.O0.start();
        return this.O0;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.R && (this.L || this.C || this.D);
    }

    public void j(float f10) {
        RefreshState refreshState;
        if (this.O0 == null) {
            if (f10 > 0.0f && ((refreshState = this.C0) == RefreshState.Refreshing || refreshState == RefreshState.TwoLevel)) {
                this.N0 = new j(f10, this.f45095l0);
                return;
            }
            if (f10 < 0.0f && (this.C0 == RefreshState.Loading || ((this.I && this.U && this.V && y(this.D)) || (this.M && !this.U && y(this.D) && this.C0 != RefreshState.Refreshing)))) {
                this.N0 = new j(f10, -this.f45099n0);
            } else if (this.f45076c == 0 && this.K) {
                this.N0 = new j(f10, 0);
            }
        }
    }

    public boolean k() {
        return l(this.J0 ? 0 : 400, this.f45084g, (this.f45107r0 + this.f45111t0) / 2.0f, false);
    }

    public boolean l(int i10, int i11, float f10, boolean z10) {
        if (this.C0 != RefreshState.None || !y(this.C)) {
            return false;
        }
        i iVar = new i(f10, i11, z10);
        setViceState(RefreshState.Refreshing);
        if (i10 > 0) {
            this.A0.postDelayed(iVar, i10);
            return true;
        }
        iVar.run();
        return true;
    }

    public boolean m() {
        return l(this.J0 ? 0 : 400, this.f45084g, (this.f45107r0 + this.f45111t0) / 2.0f, true);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0225  */
    /* JADX WARN: Code duplicated, block: B:116:0x023e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0246  */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int iMax;
        dc.a aVar;
        float f10;
        int i14;
        int i15;
        boolean z10 = isInEditMode() && this.J;
        int childCount = super.getChildCount();
        int i16 = 0;
        int measuredWidth = 0;
        int measuredHeight = 0;
        while (i16 < childCount) {
            View childAt = super.getChildAt(i16);
            if (childAt.getVisibility() == 8 || "GONE".equals(childAt.getTag(R$id.srl_tag))) {
                i12 = childCount;
            } else {
                cc.a aVar2 = this.f45117w0;
                if (aVar2 == null || aVar2.getView() != childAt) {
                    i12 = childCount;
                } else {
                    View view = this.f45117w0.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : S0;
                    int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, layoutParams.width);
                    int iMax2 = this.f45095l0;
                    dc.a aVar3 = this.f45097m0;
                    i12 = childCount;
                    if (aVar3.f51927a < dc.a.f51920i.f51927a) {
                        int i17 = layoutParams.height;
                        if (i17 > 0) {
                            int i18 = i17 + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                            dc.a aVar4 = dc.a.f51918g;
                            if (aVar3.a(aVar4)) {
                                this.f45095l0 = layoutParams.height + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                                this.f45097m0 = aVar4;
                            }
                            iMax2 = i18;
                        } else if (i17 == -2 && (this.f45117w0.getSpinnerStyle() != dc.b.f51933h || !this.f45097m0.f51928b)) {
                            int iMax3 = Math.max((View.MeasureSpec.getSize(i11) - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0);
                            view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMax3, Integer.MIN_VALUE));
                            int measuredHeight2 = view.getMeasuredHeight();
                            if (measuredHeight2 > 0) {
                                if (measuredHeight2 != iMax3) {
                                    dc.a aVar5 = this.f45097m0;
                                    dc.a aVar6 = dc.a.f51916e;
                                    if (aVar5.a(aVar6)) {
                                        this.f45095l0 = measuredHeight2 + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                                        this.f45097m0 = aVar6;
                                    }
                                }
                                iMax2 = -1;
                            }
                        }
                    }
                    if (this.f45117w0.getSpinnerStyle() == dc.b.f51933h) {
                        iMax2 = View.MeasureSpec.getSize(i11);
                        i15 = -1;
                        i14 = 0;
                    } else {
                        if (!this.f45117w0.getSpinnerStyle().f51937c || z10) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            iMax2 = Math.max(0, y(this.C) ? this.f45076c : 0);
                        }
                        i15 = -1;
                    }
                    if (iMax2 != i15) {
                        view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((iMax2 - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, i14), 1073741824));
                    }
                    dc.a aVar7 = this.f45097m0;
                    if (!aVar7.f51928b) {
                        float f11 = this.f45107r0;
                        if (f11 < 10.0f) {
                            f11 *= this.f45095l0;
                        }
                        this.f45097m0 = aVar7.b();
                        this.f45117w0.h(this.B0, this.f45095l0, (int) f11);
                    }
                    if (z10 && y(this.C)) {
                        measuredWidth += view.getMeasuredWidth();
                        measuredHeight += view.getMeasuredHeight();
                    }
                }
                cc.a aVar8 = this.f45119x0;
                if (aVar8 == null || aVar8.getView() != childAt) {
                    i13 = 0;
                } else {
                    View view2 = this.f45119x0.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : S0;
                    int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin, layoutParams2.width);
                    int i19 = this.f45099n0;
                    dc.a aVar9 = this.f45101o0;
                    if (aVar9.f51927a >= dc.a.f51920i.f51927a) {
                        iMax = i19;
                    } else {
                        int i20 = layoutParams2.height;
                        if (i20 > 0) {
                            i19 = marginLayoutParams2.bottomMargin + i20 + marginLayoutParams2.topMargin;
                            dc.a aVar10 = dc.a.f51918g;
                            if (aVar9.a(aVar10)) {
                                this.f45099n0 = layoutParams2.height + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                                this.f45101o0 = aVar10;
                            }
                        } else if (i20 == -2 && (this.f45119x0.getSpinnerStyle() != dc.b.f51933h || !this.f45101o0.f51928b)) {
                            int iMax4 = Math.max((View.MeasureSpec.getSize(i11) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0);
                            view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(iMax4, Integer.MIN_VALUE));
                            int measuredHeight3 = view2.getMeasuredHeight();
                            if (measuredHeight3 > 0) {
                                if (measuredHeight3 != iMax4) {
                                    dc.a aVar11 = this.f45101o0;
                                    dc.a aVar12 = dc.a.f51916e;
                                    if (aVar11.a(aVar12)) {
                                        this.f45099n0 = measuredHeight3 + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                                        this.f45101o0 = aVar12;
                                    }
                                }
                                iMax = -1;
                            }
                        }
                        iMax = i19;
                    }
                    if (this.f45119x0.getSpinnerStyle() == dc.b.f51933h) {
                        iMax = View.MeasureSpec.getSize(i11);
                    } else {
                        if (this.f45119x0.getSpinnerStyle().f51937c && !z10) {
                            i13 = 0;
                            iMax = Math.max(0, y(this.D) ? -this.f45076c : 0);
                        }
                        if (iMax != -1) {
                            view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((iMax - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, i13), 1073741824));
                        }
                        aVar = this.f45101o0;
                        if (!aVar.f51928b) {
                            f10 = this.f45109s0;
                            if (f10 < 10.0f) {
                                f10 *= this.f45099n0;
                            }
                            this.f45101o0 = aVar.b();
                            this.f45119x0.h(this.B0, this.f45099n0, (int) f10);
                        }
                        if (z10 && y(this.D)) {
                            measuredWidth += view2.getMeasuredWidth();
                            measuredHeight += view2.getMeasuredHeight();
                        }
                    }
                    i13 = 0;
                    if (iMax != -1) {
                        view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((iMax - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, i13), 1073741824));
                    }
                    aVar = this.f45101o0;
                    if (!aVar.f51928b) {
                        f10 = this.f45109s0;
                        if (f10 < 10.0f) {
                            f10 *= this.f45099n0;
                        }
                        this.f45101o0 = aVar.b();
                        this.f45119x0.h(this.B0, this.f45099n0, (int) f10);
                    }
                    if (z10) {
                        measuredWidth += view2.getMeasuredWidth();
                        measuredHeight += view2.getMeasuredHeight();
                    }
                }
                cc.b bVar = this.f45121y0;
                if (bVar != null && bVar.getView() == childAt) {
                    View view3 = this.f45121y0.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : S0;
                    view3.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin, layoutParams3.width), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin + ((!z10 || ((this.f45117w0 == null || !y(this.C) || !z(this.G, this.f45117w0)) ? i13 : 1) == 0) ? i13 : this.f45095l0) + ((!z10 || ((this.f45119x0 == null || !y(this.D) || !z(this.H, this.f45119x0)) ? i13 : 1) == 0) ? i13 : this.f45099n0), layoutParams3.height));
                    measuredWidth += view3.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                    measuredHeight += view3.getMeasuredHeight() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin;
                }
            }
            i16++;
            childCount = i12;
        }
        super.setMeasuredDimension(View.resolveSize(Math.max(measuredWidth + getPaddingLeft() + getPaddingRight(), super.getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(measuredHeight + getPaddingTop() + getPaddingBottom(), super.getSuggestedMinimumHeight()), i11));
        this.f45092k = getMeasuredWidth() / 2.0f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NonNull View view, float f10, float f11, boolean z10) {
        return this.f45091j0.dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NonNull View view, float f10, float f11) {
        return (this.K0 && f11 > 0.0f) || R(-f11) || this.f45091j0.dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(@NonNull View view, int i10, int i11, @NonNull int[] iArr) {
        int i12 = this.f45085g0;
        int i13 = 0;
        if (i11 * i12 > 0) {
            if (Math.abs(i11) > Math.abs(this.f45085g0)) {
                int i14 = this.f45085g0;
                this.f45085g0 = 0;
                i13 = i14;
            } else {
                this.f45085g0 -= i11;
                i13 = i11;
            }
            C(this.f45085g0);
        } else if (i11 > 0 && this.K0) {
            int i15 = i12 - i11;
            this.f45085g0 = i15;
            C(i15);
            i13 = i11;
        }
        this.f45091j0.dispatchNestedPreScroll(i10, i11 - i13, iArr, null);
        iArr[1] = iArr[1] + i13;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(@NonNull View view, int i10, int i11, int i12, int i13) {
        ec.i iVar;
        ViewParent parent;
        ec.i iVar2;
        boolean zDispatchNestedScroll = this.f45091j0.dispatchNestedScroll(i10, i11, i12, i13, this.f45089i0);
        int i14 = i13 + this.f45089i0[1];
        if ((i14 < 0 && ((this.C || this.L) && (this.f45085g0 != 0 || (iVar2 = this.f45083f0) == null || iVar2.b(this.f45121y0.getView())))) || (i14 > 0 && ((this.D || this.L) && (this.f45085g0 != 0 || (iVar = this.f45083f0) == null || iVar.a(this.f45121y0.getView()))))) {
            RefreshState refreshState = this.D0;
            if (refreshState == RefreshState.None || refreshState.isOpening) {
                this.B0.g(i14 > 0 ? RefreshState.PullUpToLoad : RefreshState.PullDownToRefresh);
                if (!zDispatchNestedScroll && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
            int i15 = this.f45085g0 - i14;
            this.f45085g0 = i15;
            C(i15);
        }
        if (!this.K0 || i11 >= 0) {
            return;
        }
        this.K0 = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i10) {
        this.f45093k0.onNestedScrollAccepted(view, view2, i10);
        this.f45091j0.startNestedScroll(i10 & 2);
        this.f45085g0 = this.f45076c;
        this.f45087h0 = true;
        x(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(@NonNull View view) {
        this.f45093k0.onStopNestedScroll(view);
        this.f45087h0 = false;
        this.f45085g0 = 0;
        E();
        this.f45091j0.stopNestedScroll();
    }

    public cc.f p(int i10, boolean z10, boolean z11) {
        int i11 = i10 >> 16;
        int i12 = (i10 << 16) >> 16;
        h hVar = new h(i11, z11, z10);
        if (i12 > 0) {
            this.A0.postDelayed(hVar, i12);
        } else {
            hVar.run();
        }
        return this;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (ViewCompat.isNestedScrollingEnabled(this.f45121y0.g())) {
            this.f45104q = z10;
            super.requestDisallowInterceptTouchEvent(z10);
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.R = z10;
        this.f45091j0.setNestedScrollingEnabled(z10);
    }

    public void setStateDirectLoading(boolean z10) {
        RefreshState refreshState = this.C0;
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState != refreshState2) {
            this.E0 = System.currentTimeMillis();
            this.K0 = true;
            D(refreshState2);
            ec.e eVar = this.f45079d0;
            if (eVar != null) {
                if (z10) {
                    eVar.a(this);
                }
            } else if (this.f45081e0 == null) {
                o(2000);
            }
            cc.a aVar = this.f45119x0;
            if (aVar != null) {
                float f10 = this.f45109s0;
                if (f10 < 10.0f) {
                    f10 *= this.f45099n0;
                }
                aVar.n(this, this.f45099n0, (int) f10);
            }
            ec.f fVar = this.f45081e0;
            if (fVar == null || !(this.f45119x0 instanceof cc.c)) {
                return;
            }
            if (z10) {
                fVar.a(this);
            }
            float f11 = this.f45109s0;
            if (f11 < 10.0f) {
                f11 *= this.f45099n0;
            }
            this.f45081e0.m((cc.c) this.f45119x0, this.f45099n0, (int) f11);
        }
    }

    public void setStateLoading(boolean z10) {
        b bVar = new b(z10);
        D(RefreshState.LoadReleased);
        ValueAnimator valueAnimatorA = this.B0.a(-this.f45099n0);
        if (valueAnimatorA != null) {
            valueAnimatorA.addListener(bVar);
        }
        cc.a aVar = this.f45119x0;
        if (aVar != null) {
            float f10 = this.f45109s0;
            if (f10 < 10.0f) {
                f10 *= this.f45099n0;
            }
            aVar.j(this, this.f45099n0, (int) f10);
        }
        ec.f fVar = this.f45081e0;
        if (fVar != null) {
            cc.a aVar2 = this.f45119x0;
            if (aVar2 instanceof cc.c) {
                float f11 = this.f45109s0;
                if (f11 < 10.0f) {
                    f11 *= this.f45099n0;
                }
                fVar.o((cc.c) aVar2, this.f45099n0, (int) f11);
            }
        }
        if (valueAnimatorA == null) {
            bVar.onAnimationEnd(null);
        }
    }

    public void setStateRefreshing(boolean z10) {
        c cVar = new c(z10);
        D(RefreshState.RefreshReleased);
        ValueAnimator valueAnimatorA = this.B0.a(this.f45095l0);
        if (valueAnimatorA != null) {
            valueAnimatorA.addListener(cVar);
        }
        cc.a aVar = this.f45117w0;
        if (aVar != null) {
            float f10 = this.f45107r0;
            if (f10 < 10.0f) {
                f10 *= this.f45095l0;
            }
            aVar.j(this, this.f45095l0, (int) f10);
        }
        ec.f fVar = this.f45081e0;
        if (fVar != null) {
            cc.a aVar2 = this.f45117w0;
            if (aVar2 instanceof cc.d) {
                float f11 = this.f45107r0;
                if (f11 < 10.0f) {
                    f11 *= this.f45095l0;
                }
                fVar.g((cc.d) aVar2, this.f45095l0, (int) f11);
            }
        }
        if (valueAnimatorA == null) {
            cVar.onAnimationEnd(null);
        }
    }

    public void setViceState(RefreshState refreshState) {
        RefreshState refreshState2 = this.C0;
        if (refreshState2.isDragging && refreshState2.isHeader != refreshState.isHeader) {
            D(RefreshState.None);
        }
        if (this.D0 != refreshState) {
            this.D0 = refreshState;
        }
    }

    public cc.f t(int i10) {
        return u(i10, true, Boolean.FALSE);
    }

    public cc.f u(int i10, boolean z10, Boolean bool) {
        int i11 = i10 >> 16;
        int i12 = (i10 << 16) >> 16;
        g gVar = new g(i11, bool, z10);
        if (i12 > 0) {
            this.A0.postDelayed(gVar, i12);
        } else {
            gVar.run();
        }
        return this;
    }

    public boolean y(boolean z10) {
        return z10 && !this.N;
    }

    public boolean z(boolean z10, @Nullable cc.a aVar) {
        return z10 || this.N || aVar == null || aVar.getSpinnerStyle() == dc.b.f51931f;
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet) {
        boolean z10;
        boolean z11;
        boolean z12;
        dc.a aVar;
        dc.a aVar2;
        super(context, attributeSet);
        this.f45082f = com.safedk.android.internal.d.f44769a;
        this.f45084g = com.safedk.android.internal.d.f44769a;
        this.f45096m = 0.5f;
        this.f45098n = 'n';
        this.f45106r = -1;
        this.f45108s = -1;
        this.f45110t = -1;
        this.f45112u = -1;
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = true;
        this.G = true;
        this.H = true;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = true;
        this.N = false;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.f45073a0 = false;
        this.f45075b0 = false;
        this.f45089i0 = new int[2];
        this.f45091j0 = new NestedScrollingChildHelper(this);
        this.f45093k0 = new NestedScrollingParentHelper(this);
        dc.a aVar3 = dc.a.f51914c;
        this.f45097m0 = aVar3;
        this.f45101o0 = aVar3;
        this.f45107r0 = 2.5f;
        this.f45109s0 = 2.5f;
        this.f45111t0 = 1.0f;
        this.f45113u0 = 1.0f;
        this.f45115v0 = 0.16666667f;
        this.B0 = new l();
        RefreshState refreshState = RefreshState.None;
        this.C0 = refreshState;
        this.D0 = refreshState;
        this.E0 = 0L;
        this.F0 = 0;
        this.G0 = 0;
        this.K0 = false;
        this.L0 = false;
        this.M0 = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0 = new Handler(Looper.getMainLooper());
        this.f45120y = new Scroller(context);
        this.f45122z = VelocityTracker.obtain();
        this.f45086h = context.getResources().getDisplayMetrics().heightPixels;
        this.A = new gc.b(gc.b.f53397b);
        this.f45074b = viewConfiguration.getScaledTouchSlop();
        this.f45114v = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f45116w = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f45099n0 = gc.b.c(60.0f);
        this.f45095l0 = gc.b.c(100.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SmartRefreshLayout);
        if (!typedArrayObtainStyledAttributes.hasValue(R$styleable.SmartRefreshLayout_android_clipToPadding)) {
            super.setClipToPadding(false);
        }
        if (!typedArrayObtainStyledAttributes.hasValue(R$styleable.SmartRefreshLayout_android_clipChildren)) {
            super.setClipChildren(false);
        }
        ec.d dVar = R0;
        if (dVar != null) {
            dVar.a(context, this);
        }
        this.f45096m = typedArrayObtainStyledAttributes.getFloat(R$styleable.SmartRefreshLayout_srlDragRate, this.f45096m);
        this.f45107r0 = typedArrayObtainStyledAttributes.getFloat(R$styleable.SmartRefreshLayout_srlHeaderMaxDragRate, this.f45107r0);
        this.f45109s0 = typedArrayObtainStyledAttributes.getFloat(R$styleable.SmartRefreshLayout_srlFooterMaxDragRate, this.f45109s0);
        this.f45111t0 = typedArrayObtainStyledAttributes.getFloat(R$styleable.SmartRefreshLayout_srlHeaderTriggerRate, this.f45111t0);
        this.f45113u0 = typedArrayObtainStyledAttributes.getFloat(R$styleable.SmartRefreshLayout_srlFooterTriggerRate, this.f45113u0);
        this.C = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableRefresh, this.C);
        this.f45084g = typedArrayObtainStyledAttributes.getInt(R$styleable.SmartRefreshLayout_srlReboundDuration, this.f45084g);
        int i10 = R$styleable.SmartRefreshLayout_srlEnableLoadMore;
        this.D = typedArrayObtainStyledAttributes.getBoolean(i10, this.D);
        int i11 = R$styleable.SmartRefreshLayout_srlHeaderHeight;
        this.f45095l0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i11, this.f45095l0);
        int i12 = R$styleable.SmartRefreshLayout_srlFooterHeight;
        this.f45099n0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i12, this.f45099n0);
        this.f45103p0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.SmartRefreshLayout_srlHeaderInsetStart, this.f45103p0);
        this.f45105q0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.SmartRefreshLayout_srlFooterInsetStart, this.f45105q0);
        this.S = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlDisableContentWhenRefresh, this.S);
        this.T = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlDisableContentWhenLoading, this.T);
        int i13 = R$styleable.SmartRefreshLayout_srlEnableHeaderTranslationContent;
        this.G = typedArrayObtainStyledAttributes.getBoolean(i13, this.G);
        int i14 = R$styleable.SmartRefreshLayout_srlEnableFooterTranslationContent;
        this.H = typedArrayObtainStyledAttributes.getBoolean(i14, this.H);
        this.J = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnablePreviewInEditMode, this.J);
        this.M = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableAutoLoadMore, this.M);
        this.K = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableOverScrollBounce, this.K);
        this.N = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnablePureScrollMode, this.N);
        this.O = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableScrollContentWhenLoaded, this.O);
        this.P = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableScrollContentWhenRefreshed, this.P);
        this.Q = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableLoadMoreWhenContentNotFull, this.Q);
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableFooterFollowWhenLoadFinished, this.I);
        this.I = z13;
        this.I = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableFooterFollowWhenNoMoreData, z13);
        this.E = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableClipHeaderWhenFixedBehind, this.E);
        this.F = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableClipFooterWhenFixedBehind, this.F);
        this.L = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableOverScrollDrag, this.L);
        this.f45106r = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SmartRefreshLayout_srlFixedHeaderViewId, this.f45106r);
        this.f45108s = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SmartRefreshLayout_srlFixedFooterViewId, this.f45108s);
        this.f45110t = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SmartRefreshLayout_srlHeaderTranslationViewId, this.f45110t);
        this.f45112u = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SmartRefreshLayout_srlFooterTranslationViewId, this.f45112u);
        boolean z14 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableNestedScrolling, this.R);
        this.R = z14;
        this.f45091j0.setNestedScrollingEnabled(z14);
        if (!this.W && !typedArrayObtainStyledAttributes.hasValue(i10)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.W = z10;
        if (!this.f45073a0 && !typedArrayObtainStyledAttributes.hasValue(i13)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f45073a0 = z11;
        if (!this.f45075b0 && !typedArrayObtainStyledAttributes.hasValue(i14)) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f45075b0 = z12;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            aVar = dc.a.f51920i;
        } else {
            aVar = this.f45097m0;
        }
        this.f45097m0 = aVar;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            aVar2 = dc.a.f51920i;
        } else {
            aVar2 = this.f45101o0;
        }
        this.f45101o0 = aVar2;
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.SmartRefreshLayout_srlAccentColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.SmartRefreshLayout_srlPrimaryColor, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.B = new int[]{color2, color};
            } else {
                this.B = new int[]{color2};
            }
        } else if (color != 0) {
            this.B = new int[]{0, color};
        }
        if (this.N && !this.W && !this.D) {
            this.D = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // cc.f
    public cc.f b(boolean z10) {
        setNestedScrollingEnabled(z10);
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        cc.a aVar;
        ec.c cVar;
        super.onAttachedToWindow();
        boolean z10 = true;
        this.J0 = true;
        if (!isInEditMode()) {
            if (this.f45117w0 == null && (cVar = Q0) != null) {
                cc.d dVarA = cVar.a(getContext(), this);
                if (dVarA != null) {
                    P(dVarA);
                } else {
                    throw new RuntimeException("DefaultRefreshHeaderCreator can not return null");
                }
            }
            if (this.f45119x0 == null) {
                ec.b bVar = P0;
                if (bVar != null) {
                    cc.c cVarA = bVar.a(getContext(), this);
                    if (cVarA != null) {
                        N(cVarA);
                    } else {
                        throw new RuntimeException("DefaultRefreshFooterCreator can not return null");
                    }
                }
            } else {
                if (!this.D && this.W) {
                    z10 = false;
                }
                this.D = z10;
            }
            if (this.f45121y0 == null) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    cc.a aVar2 = this.f45117w0;
                    if ((aVar2 == null || childAt != aVar2.getView()) && ((aVar = this.f45119x0) == null || childAt != aVar.getView())) {
                        this.f45121y0 = new hc.a(childAt);
                    }
                }
            }
            if (this.f45121y0 == null) {
                int iC = gc.b.c(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText(R$string.srl_content_empty);
                super.addView(textView, 0, new LayoutParams(-1, -1));
                hc.a aVar3 = new hc.a(textView);
                this.f45121y0 = aVar3;
                aVar3.getView().setPadding(iC, iC, iC, iC);
            }
            View viewFindViewById = findViewById(this.f45106r);
            View viewFindViewById2 = findViewById(this.f45108s);
            this.f45121y0.h(this.f45083f0);
            this.f45121y0.b(this.Q);
            this.f45121y0.d(this.B0, viewFindViewById, viewFindViewById2);
            if (this.f45076c != 0) {
                D(RefreshState.None);
                cc.b bVar2 = this.f45121y0;
                this.f45076c = 0;
                bVar2.e(0, this.f45110t, this.f45112u);
            }
        }
        int[] iArr = this.B;
        if (iArr != null) {
            cc.a aVar4 = this.f45117w0;
            if (aVar4 != null) {
                aVar4.setPrimaryColors(iArr);
            }
            cc.a aVar5 = this.f45119x0;
            if (aVar5 != null) {
                aVar5.setPrimaryColors(this.B);
            }
        }
        cc.b bVar3 = this.f45121y0;
        if (bVar3 != null) {
            super.bringChildToFront(bVar3.getView());
        }
        cc.a aVar6 = this.f45117w0;
        if (aVar6 != null && aVar6.getSpinnerStyle().f51936b) {
            super.bringChildToFront(this.f45117w0.getView());
        }
        cc.a aVar7 = this.f45119x0;
        if (aVar7 != null && aVar7.getSpinnerStyle().f51936b) {
            super.bringChildToFront(this.f45119x0.getView());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J0 = false;
        this.W = true;
        this.N0 = null;
        ValueAnimator valueAnimator = this.O0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.O0.removeAllUpdateListeners();
            this.O0.setDuration(0L);
            this.O0.cancel();
            this.O0 = null;
        }
        cc.a aVar = this.f45117w0;
        if (aVar != null && this.C0 == RefreshState.Refreshing) {
            aVar.k(this, false);
        }
        cc.a aVar2 = this.f45119x0;
        if (aVar2 != null && this.C0 == RefreshState.Loading) {
            aVar2.k(this, false);
        }
        if (this.f45076c != 0) {
            this.B0.f(0, true);
        }
        RefreshState refreshState = this.C0;
        RefreshState refreshState2 = RefreshState.None;
        if (refreshState != refreshState2) {
            D(refreshState2);
        }
        Handler handler = this.A0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.K0 = false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onFinishInflate() {
        int i10;
        int i11;
        cc.d cVar;
        boolean z10;
        cc.c bVar;
        super.onFinishInflate();
        int childCount = super.getChildCount();
        if (childCount <= 3) {
            int i12 = -1;
            int i13 = 0;
            char c10 = 0;
            while (true) {
                i10 = 2;
                if (i13 >= childCount) {
                    break;
                }
                View childAt = super.getChildAt(i13);
                if (gc.b.e(childAt) && (c10 < 2 || i13 == 1)) {
                    i12 = i13;
                    c10 = 2;
                } else if (!(childAt instanceof cc.a) && c10 < 1) {
                    if (i13 > 0) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    i12 = i13;
                }
                i13++;
            }
            if (i12 >= 0) {
                this.f45121y0 = new hc.a(super.getChildAt(i12));
                if (i12 == 1) {
                    if (childCount != 3) {
                        i10 = -1;
                    }
                    i11 = 0;
                } else if (childCount == 2) {
                    i11 = -1;
                    i10 = 1;
                } else {
                    i11 = -1;
                    i10 = -1;
                }
            } else {
                i11 = -1;
                i10 = -1;
            }
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt2 = super.getChildAt(i14);
                if (i14 != i11 && (i14 == i10 || i11 != -1 || this.f45117w0 != null || !(childAt2 instanceof cc.d))) {
                    if (i14 == i10 || (i10 == -1 && (childAt2 instanceof cc.c))) {
                        if (!this.D && this.W) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        this.D = z10;
                        if (childAt2 instanceof cc.c) {
                            bVar = (cc.c) childAt2;
                        } else {
                            bVar = new hc.b(childAt2);
                        }
                        this.f45119x0 = bVar;
                    }
                } else {
                    if (childAt2 instanceof cc.d) {
                        cVar = (cc.d) childAt2;
                    } else {
                        cVar = new hc.c(childAt2);
                    }
                    this.f45117w0 = cVar;
                }
            }
            return;
        }
        throw new RuntimeException("最多只支持3个子View，Most only support three sub view");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iMax;
        int i14;
        int i15;
        boolean z11;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        boolean z12;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = super.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = super.getChildAt(i16);
            if (childAt.getVisibility() != 8 && !"GONE".equals(childAt.getTag(R$id.srl_tag))) {
                cc.b bVar = this.f45121y0;
                boolean z13 = true;
                if (bVar != null && bVar.getView() == childAt) {
                    if (isInEditMode() && this.J && y(this.C) && this.f45117w0 != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    View view = this.f45121y0.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
                    } else {
                        marginLayoutParams3 = S0;
                    }
                    int i17 = marginLayoutParams3.leftMargin + paddingLeft;
                    int i18 = marginLayoutParams3.topMargin + paddingTop;
                    int measuredWidth = view.getMeasuredWidth() + i17;
                    int measuredHeight = view.getMeasuredHeight() + i18;
                    if (z12 && z(this.G, this.f45117w0)) {
                        int i19 = this.f45095l0;
                        i18 += i19;
                        measuredHeight += i19;
                    }
                    view.layout(i17, i18, measuredWidth, measuredHeight);
                }
                cc.a aVar = this.f45117w0;
                if (aVar != null && aVar.getView() == childAt) {
                    if (isInEditMode() && this.J && y(this.C)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    View view2 = this.f45117w0.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    } else {
                        marginLayoutParams2 = S0;
                    }
                    int i20 = marginLayoutParams2.leftMargin;
                    int i21 = marginLayoutParams2.topMargin + this.f45103p0;
                    int measuredWidth2 = view2.getMeasuredWidth() + i20;
                    int measuredHeight2 = view2.getMeasuredHeight() + i21;
                    if (!z11 && this.f45117w0.getSpinnerStyle() == dc.b.f51929d) {
                        int i22 = this.f45095l0;
                        i21 -= i22;
                        measuredHeight2 -= i22;
                    }
                    view2.layout(i20, i21, measuredWidth2, measuredHeight2);
                }
                cc.a aVar2 = this.f45119x0;
                if (aVar2 != null && aVar2.getView() == childAt) {
                    if (!isInEditMode() || !this.J || !y(this.D)) {
                        z13 = false;
                    }
                    View view3 = this.f45119x0.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                    } else {
                        marginLayoutParams = S0;
                    }
                    dc.b spinnerStyle = this.f45119x0.getSpinnerStyle();
                    int i23 = marginLayoutParams.leftMargin;
                    int measuredHeight3 = (marginLayoutParams.topMargin + getMeasuredHeight()) - this.f45105q0;
                    if (this.U && this.V && this.I && this.f45121y0 != null && this.f45119x0.getSpinnerStyle() == dc.b.f51929d && y(this.D)) {
                        View view4 = this.f45121y0.getView();
                        ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                            i15 = ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
                        } else {
                            i15 = 0;
                        }
                        measuredHeight3 = view4.getMeasuredHeight() + paddingTop + paddingTop + i15;
                    }
                    if (spinnerStyle == dc.b.f51933h) {
                        measuredHeight3 = marginLayoutParams.topMargin - this.f45105q0;
                    } else {
                        if (!z13 && spinnerStyle != dc.b.f51932g && spinnerStyle != dc.b.f51931f) {
                            if (spinnerStyle.f51937c && this.f45076c < 0) {
                                if (y(this.D)) {
                                    i14 = -this.f45076c;
                                } else {
                                    i14 = 0;
                                }
                                iMax = Math.max(i14, 0);
                            }
                        } else {
                            iMax = this.f45099n0;
                        }
                        measuredHeight3 -= iMax;
                    }
                    view3.layout(i23, measuredHeight3, view3.getMeasuredWidth() + i23, view3.getMeasuredHeight() + measuredHeight3);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i10) {
        boolean z10;
        if (isEnabled() && isNestedScrollingEnabled() && (i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (this.L || this.C || this.D)) {
            return true;
        }
        return false;
    }

    public cc.f q(boolean z10) {
        int iMin;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.E0;
        if (z10) {
            iMin = Math.min(Math.max(0, 300 - ((int) jCurrentTimeMillis)), com.safedk.android.internal.d.f44769a) << 16;
        } else {
            iMin = 0;
        }
        return p(iMin, z10, false);
    }

    public cc.f r() {
        return p(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.E0))), com.safedk.android.internal.d.f44769a) << 16, true, true);
    }

    public cc.f w() {
        return u(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.E0))), com.safedk.android.internal.d.f44769a) << 16, true, Boolean.TRUE);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public dc.b f45125b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f45124a = 0;
            this.f45125b = null;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SmartRefreshLayout_Layout);
            this.f45124a = typedArrayObtainStyledAttributes.getColor(R$styleable.SmartRefreshLayout_Layout_layout_srlBackgroundColor, this.f45124a);
            int i10 = R$styleable.SmartRefreshLayout_Layout_layout_srlSpinnerStyle;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                this.f45125b = dc.b.f51934i[typedArrayObtainStyledAttributes.getInt(i10, dc.b.f51929d.f51935a)];
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f45124a = 0;
            this.f45125b = null;
        }
    }
}
