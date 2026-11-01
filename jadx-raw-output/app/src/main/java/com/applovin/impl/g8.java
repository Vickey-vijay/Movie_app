package com.applovin.impl;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.sdk.AppLovinSdkUtils;
import io.bidmachine.iab.utils.VisibilityTracker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class g8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f7558a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f7562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f7563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference f7564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f7565h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f7568k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f7569l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f7570m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f7571n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f7559b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f7560c = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WeakReference f7566i = new WeakReference(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference f7567j = new WeakReference(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f7572o = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f7561d = new Handler(Looper.getMainLooper());

    public interface a {
        void onLogVisibilityImpression();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WeakReference weakReference) {
        View view = (View) this.f7564g.get();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View view2 = (View) this.f7567j.get();
        if (viewGroup == null || view2 == null) {
            return;
        }
        if (!a(viewGroup, view2)) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7558a.a(VisibilityTracker.TAG, "View met visibility requirements. Logging visibility impression..");
        }
        b();
        a aVar = (a) weakReference.get();
        if (aVar != null) {
            aVar.onLogVisibilityImpression();
        }
    }

    public void b() {
        synchronized (this.f7559b) {
            this.f7561d.removeMessages(0);
            b((View) this.f7564g.get());
            this.f7572o = Long.MIN_VALUE;
            this.f7567j.clear();
        }
    }

    private void c(View view) {
        View viewB = e8.b((View) this.f7564g.get());
        if (viewB == null) {
            viewB = e8.b(view);
        }
        if (viewB == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7558a.a(VisibilityTracker.TAG, "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = viewB.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f7566i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f7563f);
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f7558a.k(VisibilityTracker.TAG, "Unable to set view tree observer since the view tree observer is not alive.");
        }
    }

    public g8(final View view, com.applovin.impl.sdk.k kVar, a aVar) {
        this.f7558a = kVar.O();
        this.f7565h = ((Long) kVar.a(x4.f10079y1)).longValue();
        this.f7564g = new WeakReference(view);
        final WeakReference weakReference = new WeakReference(aVar);
        this.f7562e = new Runnable() { // from class: com.applovin.impl.ra
            @Override // java.lang.Runnable
            public final void run() {
                this.f8985b.a(weakReference);
            }
        };
        this.f7563f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.sa
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f9045b.a(view);
            }
        };
    }

    private boolean b(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f7560c)) {
            return false;
        }
        long jPxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.f7560c.width()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f7560c.height());
        if (jPxToDp < this.f7568k) {
            return false;
        }
        if ((jPxToDp / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()))) * 100.0f < this.f7569l) {
            return false;
        }
        return (((float) ((long) (this.f7560c.width() * this.f7560c.height()))) / ((float) ((long) (view2.getWidth() * view2.getHeight())))) * 100.0f >= this.f7570m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        a();
        b(view);
        return true;
    }

    public void a(h3 h3Var) {
        View viewS0;
        if (h3Var instanceof b3) {
            viewS0 = h3Var.y();
        } else if (!(h3Var instanceof d3)) {
            return;
        } else {
            viewS0 = ((d3) h3Var).s0();
        }
        a(h3Var.k0(), h3Var.m0(), h3Var.n0(), h3Var.o0(), viewS0);
    }

    private void b(View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f7566i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f7563f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f7563f);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f7558a.a(VisibilityTracker.TAG, "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f7558a.a(VisibilityTracker.TAG, "Could not remove on pre-draw listener. Root view is null.");
        }
        this.f7566i.clear();
    }

    public void a(int i10, float f10, float f11, long j10, View view) {
        synchronized (this.f7559b) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7558a.a(VisibilityTracker.TAG, "Tracking visibility for " + view);
            }
            b();
            WeakReference weakReference = new WeakReference(view);
            this.f7567j = weakReference;
            this.f7568k = i10;
            this.f7569l = f10;
            this.f7570m = f11;
            this.f7571n = j10;
            c((View) weakReference.get());
        }
    }

    private void a() {
        this.f7561d.postDelayed(this.f7562e, this.f7565h);
    }

    private boolean a(View view, View view2) {
        if (!b(view, view2)) {
            return false;
        }
        if (this.f7572o == Long.MIN_VALUE) {
            this.f7572o = SystemClock.uptimeMillis();
        }
        return SystemClock.uptimeMillis() - this.f7572o >= this.f7571n;
    }
}
