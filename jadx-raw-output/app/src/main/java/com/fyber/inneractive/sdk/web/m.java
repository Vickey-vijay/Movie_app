package com.fyber.inneractive.sdk.web;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* JADX INFO: loaded from: classes3.dex */
public class m extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f18731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y0 f18732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.g1 f18733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18735g;

    public final void a(String str) {
        IAlog.a("injecting JS: %s", str);
        if (str != null) {
            try {
                DTExchangeNetworkBridge.webviewLoadUrl(this, SafeDKWebAppInterface.f44738f.concat(str));
            } catch (Throwable th2) {
                IAlog.a("Failed to inject JS", th2, new Object[0]);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44970p, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public m() {
        super(IAConfigManager.O.f15027v.a());
        this.f18729a = false;
        this.f18733e = new com.fyber.inneractive.sdk.util.g1();
    }

    public int getHeightDp() {
        return this.f18735g;
    }

    public boolean getIsVisible() {
        return this.f18730b;
    }

    public com.fyber.inneractive.sdk.util.g1 getLastClickedLocation() {
        return this.f18733e;
    }

    public int getWidthDp() {
        return this.f18734f;
    }

    public void setHeightDp(int i10) {
        this.f18735g = i10;
    }

    public void setListener(l lVar) {
        this.f18731c = lVar;
    }

    public void setTapListener(x0 x0Var) {
        this.f18732d = new y0(x0Var, IAConfigManager.O.f15027v.a());
    }

    public void setWidthDp(int i10) {
        this.f18734f = i10;
    }

    public final void b() {
        boolean z10;
        boolean z11 = false;
        IAlog.e("updateVisibility called - is = %s hwf = %s atw = %swinToken - %s app token - %s", Boolean.valueOf(isShown()), Boolean.valueOf(hasWindowFocus()), Boolean.valueOf(this.f18729a), getWindowToken(), getApplicationWindowToken());
        if (getWindowToken() != getApplicationWindowToken()) {
            if (getWindowVisibility() != 8 && isShown() && this.f18729a) {
                z11 = true;
            }
            a(z11);
            return;
        }
        if (isShown() && this.f18729a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!IAConfigManager.O.f15026u.f15195b.a(false, "ignore_w_f")) {
            if (z10 && hasWindowFocus()) {
                z11 = true;
            }
        } else {
            z11 = z10;
        }
        a(z11);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        try {
            super.destroy();
        } catch (Throwable unused) {
        }
        this.f18731c = null;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f18729a) {
            this.f18729a = true;
            l lVar = this.f18731c;
            if (lVar != null) {
                lVar.b();
            }
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18730b = false;
        if (this.f18729a) {
            this.f18729a = false;
            l lVar = this.f18731c;
            if (lVar != null) {
                lVar.c();
            }
            a();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && motionEvent.getEventTime() - motionEvent.getDownTime() >= ViewConfiguration.getLongPressTimeout()) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, x10, y10, 0));
            dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, x10, y10, 0));
        }
        y0 y0Var = this.f18732d;
        if (y0Var != null) {
            y0Var.onTouch(this, motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            com.fyber.inneractive.sdk.util.g1 g1Var = this.f18733e;
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            g1Var.f18579a = x11;
            g1Var.f18580b = y11;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        IAlog.e("onWindowFocusChanged with: %s", Boolean.valueOf(z10));
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (i10 == 8) {
            a(false);
        } else {
            a();
        }
    }

    public final void a(boolean z10) {
        if (z10) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                Rect rect = new Rect();
                viewGroup.getHitRect(rect);
                if (!getLocalVisibleRect(rect) && getWindowToken() == getApplicationWindowToken()) {
                    IAlog.e("updateVisibility - Cannot find local visible rect. Scrolled out?", new Object[0]);
                    z10 = false;
                }
            } else {
                IAlog.e("updateVisibility - No parent available", new Object[0]);
            }
        }
        if (this.f18730b != z10) {
            this.f18730b = z10;
            l lVar = this.f18731c;
            if (lVar != null) {
                lVar.a(z10);
            }
        }
    }

    public final void a() {
        if (IAConfigManager.O.f15026u.f15195b.a(false, "update_v_mth")) {
            com.fyber.inneractive.sdk.util.r.f18607b.post(new k(this));
        } else {
            b();
        }
    }
}
