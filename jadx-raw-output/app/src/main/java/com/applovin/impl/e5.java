package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap f7415a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f7416b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f7417c = new Handler();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7418d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference f7419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f7420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f7421g;

    public interface a {
        void a(int i10, int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f7421g = null;
        View view = (View) this.f7419e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f7420f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f7419e.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f7416b) {
            this.f7418d = false;
            int iMin = -1;
            int iMax = -1;
            for (Map.Entry entry : this.f7415a.entrySet()) {
                if (a((View) entry.getKey())) {
                    Integer num = (Integer) entry.getValue();
                    if (iMin == -1 && iMax == -1) {
                        iMin = num.intValue();
                        iMax = num.intValue();
                    } else {
                        iMin = Math.min(iMin, ((Integer) entry.getValue()).intValue());
                        iMax = Math.max(iMax, ((Integer) entry.getValue()).intValue());
                    }
                }
            }
            a aVar = this.f7421g;
            if (aVar != null) {
                aVar.a(iMin, iMax);
            }
        }
    }

    private void d() {
        if (this.f7418d) {
            return;
        }
        this.f7418d = true;
        this.f7417c.postDelayed(new Runnable() { // from class: com.applovin.impl.y9
            @Override // java.lang.Runnable
            public final void run() {
                this.f10176b.c();
            }
        }, 100L);
    }

    public void b(View view) {
        synchronized (this.f7416b) {
            this.f7415a.remove(view);
        }
    }

    public e5(View view) {
        this.f7419e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.z9
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    return this.f10277b.b();
                }
            };
            this.f7420f = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
            return;
        }
        this.f7420f = null;
    }

    public void a(a aVar) {
        this.f7421g = aVar;
    }

    public void a(View view, int i10) {
        synchronized (this.f7416b) {
            this.f7415a.put(view, Integer.valueOf(i10));
            d();
        }
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }
}
