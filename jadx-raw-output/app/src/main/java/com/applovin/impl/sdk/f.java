package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.g7;
import com.applovin.impl.r3;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class f implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g7 f9232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f9233b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f9234c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f9235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f9236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final WeakReference f9237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f9238g;

    public interface a {
        void onAdRefresh();
    }

    public void a(long j10) {
        synchronized (this.f9233b) {
            a();
            this.f9238g = j10;
            this.f9232a = g7.a(j10, this.f9236e, new Runnable() { // from class: com.applovin.impl.sdk.g0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9263b.i();
                }
            });
            if (!((Boolean) this.f9236e.a(r3.E7)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((Boolean) this.f9236e.a(r3.D7)).booleanValue() && (this.f9236e.H().d() || this.f9236e.m0().isApplicationPaused())) {
                this.f9232a.d();
            }
            if (this.f9234c.compareAndSet(true, false) && ((Boolean) this.f9236e.a(r3.F7)).booleanValue()) {
                this.f9236e.O();
                if (o.a()) {
                    this.f9236e.O().a("AdRefreshManager", "Pausing refresh for a previous request.");
                }
                this.f9232a.d();
            }
        }
    }

    private void e() {
        if (((Boolean) this.f9236e.a(r3.D7)).booleanValue()) {
            k();
        }
    }

    private void f() {
        if (((Boolean) this.f9236e.a(r3.D7)).booleanValue()) {
            synchronized (this.f9233b) {
                if (this.f9235d) {
                    this.f9236e.O();
                    if (o.a()) {
                        this.f9236e.O().a("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                } else if (this.f9236e.m0().isApplicationPaused()) {
                    this.f9236e.O();
                    if (o.a()) {
                        this.f9236e.O().a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                    }
                } else {
                    g7 g7Var = this.f9232a;
                    if (g7Var != null) {
                        g7Var.e();
                    }
                }
            }
        }
    }

    private void k() {
        synchronized (this.f9233b) {
            g7 g7Var = this.f9232a;
            if (g7Var != null) {
                g7Var.d();
            } else {
                this.f9236e.O();
                if (o.a()) {
                    this.f9236e.O().a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                }
                this.f9234c.set(true);
            }
        }
    }

    private void l() {
        synchronized (this.f9233b) {
            this.f9232a = null;
            if (!((Boolean) this.f9236e.a(r3.E7)).booleanValue()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    private void n() {
        synchronized (this.f9233b) {
            g7 g7Var = this.f9232a;
            if (g7Var != null) {
                g7Var.e();
            } else {
                this.f9234c.set(false);
            }
        }
    }

    public long b() {
        long jC;
        synchronized (this.f9233b) {
            g7 g7Var = this.f9232a;
            jC = g7Var != null ? g7Var.c() : -1L;
        }
        return jC;
    }

    public void c() {
        if (((Boolean) this.f9236e.a(r3.C7)).booleanValue()) {
            k();
        }
    }

    public void d() {
        boolean z10;
        a aVar;
        if (((Boolean) this.f9236e.a(r3.C7)).booleanValue()) {
            synchronized (this.f9233b) {
                if (this.f9235d) {
                    this.f9236e.O();
                    if (o.a()) {
                        this.f9236e.O().a("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                    return;
                }
                if (this.f9236e.H().d()) {
                    this.f9236e.O();
                    if (o.a()) {
                        this.f9236e.O().a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                    }
                    return;
                }
                if (this.f9232a != null) {
                    long jB = this.f9238g - b();
                    long jLongValue = ((Long) this.f9236e.a(r3.B7)).longValue();
                    if (jLongValue < 0 || jB <= jLongValue) {
                        this.f9232a.e();
                        z10 = false;
                    } else {
                        a();
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                if (!z10 || (aVar = (a) this.f9237f.get()) == null) {
                    return;
                }
                aVar.onAdRefresh();
            }
        }
    }

    public boolean g() {
        return this.f9235d;
    }

    public boolean h() {
        boolean z10;
        synchronized (this.f9233b) {
            z10 = this.f9232a != null;
        }
        return z10;
    }

    public void j() {
        synchronized (this.f9233b) {
            k();
            this.f9235d = true;
        }
    }

    public void m() {
        synchronized (this.f9233b) {
            n();
            this.f9235d = false;
        }
    }

    public f(k kVar, a aVar) {
        this.f9237f = new WeakReference(aVar);
        this.f9236e = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        l();
        a aVar = (a) this.f9237f.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            c();
            return;
        }
        if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            d();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            e();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            f();
        }
    }

    public void a() {
        synchronized (this.f9233b) {
            g7 g7Var = this.f9232a;
            if (g7Var != null) {
                g7Var.a();
                l();
            }
        }
    }
}
