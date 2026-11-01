package com.applovin.adview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.applovin.impl.n2;
import com.applovin.impl.w1;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class AppLovinFullscreenAdViewObserver implements LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lifecycle f6787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n2 f6788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f6789c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w1 f6790d;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.f6787a.removeObserver(this);
        n2 n2Var = this.f6788b;
        if (n2Var != null) {
            n2Var.a();
            this.f6788b = null;
        }
        w1 w1Var = this.f6790d;
        if (w1Var != null) {
            w1Var.a("lifecycle_on_destroy");
            this.f6790d.r();
            this.f6790d = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        w1 w1Var = this.f6790d;
        if (w1Var != null) {
            w1Var.s();
            this.f6790d.v();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        w1 w1Var;
        if (this.f6789c.getAndSet(false) || (w1Var = this.f6790d) == null) {
            return;
        }
        w1Var.t();
        this.f6790d.b(0L);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        w1 w1Var = this.f6790d;
        if (w1Var != null) {
            w1Var.u();
        }
    }

    public void setPresenter(w1 w1Var) {
        this.f6790d = w1Var;
    }

    public AppLovinFullscreenAdViewObserver(Lifecycle lifecycle, n2 n2Var) {
        this.f6787a = lifecycle;
        this.f6788b = n2Var;
        lifecycle.addObserver(this);
    }
}
