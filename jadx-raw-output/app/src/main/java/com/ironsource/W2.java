package com.ironsource;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes5.dex */
public final class W2 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3619ng f27823a;

    public static final class a implements InterfaceC3619ng {
        @Override // com.ironsource.InterfaceC3619ng
        public void a(View view, FrameLayout.LayoutParams layoutParams, final W0 w10) {
            ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            ck.p.j(layoutParams, "layoutParams");
            ck.p.j(w10, "adTools");
            final View childAt = W2.this.getChildAt(0);
            final long jB = Lb.f26968s.d().g().b();
            if (jB <= 0) {
                W2.this.removeView(childAt);
                W2.this.addView(view, layoutParams);
                w10.d(new Runnable() { // from class: com.ironsource.pj
                    @Override // java.lang.Runnable
                    public final void run() {
                        W2.a.a(w10, jB);
                    }
                });
                return;
            }
            w10.d(new Runnable() { // from class: com.ironsource.qj
                @Override // java.lang.Runnable
                public final void run() {
                    W2.a.b(w10, jB);
                }
            });
            view.setAlpha(0.0f);
            W2.this.addView(view, layoutParams);
            if (childAt != null) {
                final W2 w11 = W2.this;
                childAt.animate().alpha(0.0f).setDuration(jB).withStartAction(new Runnable() { // from class: com.ironsource.rj
                    @Override // java.lang.Runnable
                    public final void run() {
                        W2.a.a(childAt);
                    }
                }).withEndAction(new Runnable() { // from class: com.ironsource.sj
                    @Override // java.lang.Runnable
                    public final void run() {
                        W2.a.a(w11, childAt, childAt);
                    }
                }).start();
            }
            view.animate().alpha(1.0f).setDuration(jB).withEndAction(new Runnable() { // from class: com.ironsource.tj
                @Override // java.lang.Runnable
                public final void run() {
                    W2.a.c(w10, jB);
                }
            }).start();
        }

        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(W0 w10, long j10) {
            ck.p.j(w10, "$adTools");
            w10.e().h().a(true, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(final W0 w10, final long j10) {
            ck.p.j(w10, "$adTools");
            w10.d(new Runnable() { // from class: com.ironsource.uj
                @Override // java.lang.Runnable
                public final void run() {
                    W2.a.d(w10, j10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(W0 w10, long j10) {
            ck.p.j(w10, "$adTools");
            w10.e().h().a(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(W0 w10, long j10) {
            ck.p.j(w10, "$adTools");
            w10.e().h().a(false, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(View view) {
            ck.p.j(view, "$this_apply");
            view.setEnabled(false);
            view.setClickable(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(W2 w10, View view, View view2) {
            ck.p.j(w10, "this$0");
            ck.p.j(view2, "$this_apply");
            w10.removeView(view);
            view2.setEnabled(true);
            view2.setClickable(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44960f, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W2(Context context) {
        super(context);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        this.f27823a = new a();
    }

    public final InterfaceC3619ng getViewBinder() {
        return this.f27823a;
    }
}
