package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.c3;
import com.applovin.impl.n7;

/* JADX INFO: loaded from: classes6.dex */
public class a extends com.applovin.impl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.c f8047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0039a f8050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c3 f8051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f8052f;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    public interface InterfaceC0039a {
        void b(c3 c3Var);
    }

    public void a(c3 c3Var, InterfaceC0039a interfaceC0039a) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8048b.a("AdActivityObserver", "Starting for ad " + c3Var.getAdUnitId() + "...");
        }
        a();
        this.f8050d = interfaceC0039a;
        this.f8051e = c3Var;
        this.f8047a.a(this);
    }

    public a(com.applovin.impl.sdk.k kVar) {
        this.f8048b = kVar.O();
        this.f8047a = kVar.e();
        this.f8049c = n7.a(com.applovin.impl.sdk.k.o(), "AdActivityObserver", kVar);
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().equals(this.f8049c) && this.f8051e.y0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8048b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
            }
            if (this.f8050d != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8048b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f8050d.b(this.f8051e);
            }
            a();
            return;
        }
        if (this.f8052f == null) {
            this.f8052f = activity.getClass().getName();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8048b.a("AdActivityObserver", "Started tracking ad Activity: " + this.f8052f);
            }
        }
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (activity.getClass().getName().equals(this.f8052f)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8048b.a("AdActivityObserver", "Ad Activity destroyed: " + this.f8052f);
            }
            if (this.f8050d != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8048b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f8050d.b(this.f8051e);
            }
            a();
        }
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8048b.a("AdActivityObserver", "Cancelling...");
        }
        this.f8047a.b(this);
        this.f8050d = null;
        this.f8051e = null;
        this.f8052f = null;
    }
}
