package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.impl.C4268ic;

/* JADX INFO: loaded from: classes7.dex */
public final class Xk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4407o f56167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4388n5 f56168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActivityLifecycleListener f56169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActivityLifecycleListener f56170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4457q f56171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4357m f56172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f56173g;

    public Xk(C4407o c4407o, C4357m c4357m) {
        this(c4407o, c4357m, new C4388n5(), new C4457q());
    }

    public final void a(final Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C4388n5 c4388n5 = this.f56168b;
            InterfaceC4089be interfaceC4089be = new InterfaceC4089be() { // from class: af.y
                @Override // io.appmetrica.analytics.impl.InterfaceC4089be
                public final void consume(Object obj) {
                    this.f3597a.a(activity, (C4268ic) obj);
                }
            };
            c4388n5.getClass();
            C4105c4.l().f56438c.a().execute(new RunnableC4363m5(c4388n5, interfaceC4089be));
        }
    }

    public final void b(final Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C4388n5 c4388n5 = this.f56168b;
            InterfaceC4089be interfaceC4089be = new InterfaceC4089be() { // from class: af.v
                @Override // io.appmetrica.analytics.impl.InterfaceC4089be
                public final void consume(Object obj) {
                    this.f3592a.b(activity, (C4268ic) obj);
                }
            };
            c4388n5.getClass();
            C4105c4.l().f56438c.a().execute(new RunnableC4363m5(c4388n5, interfaceC4089be));
        }
    }

    public Xk(C4407o c4407o, C4357m c4357m, C4388n5 c4388n5, C4457q c4457q) {
        this.f56173g = false;
        this.f56167a = c4407o;
        this.f56172f = c4357m;
        this.f56168b = c4388n5;
        this.f56171e = c4457q;
        this.f56169c = new ActivityLifecycleListener() { // from class: af.w
            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                this.f3594a.a(activity, activityEvent);
            }
        };
        this.f56170d = new ActivityLifecycleListener() { // from class: af.x
            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                this.f3596a.b(activity, activityEvent);
            }
        };
    }

    public final void a(Activity activity, C4268ic c4268ic) {
        if (this.f56173g && this.f56171e.a(activity, EnumC4432p.RESUMED)) {
            c4268ic.a(activity);
        }
    }

    public final void b(Activity activity, C4268ic c4268ic) {
        if (this.f56173g && this.f56171e.a(activity, EnumC4432p.PAUSED)) {
            c4268ic.b(activity);
        }
    }

    public final synchronized EnumC4382n a() {
        if (!this.f56173g) {
            this.f56167a.registerListener(this.f56169c, ActivityEvent.RESUMED);
            this.f56167a.registerListener(this.f56170d, ActivityEvent.PAUSED);
            this.f56173g = true;
        }
        return this.f56167a.f57371b;
    }
}
