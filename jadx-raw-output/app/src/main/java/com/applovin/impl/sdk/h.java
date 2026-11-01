package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.applovin.impl.d2;
import com.applovin.impl.n7;
import com.applovin.impl.x4;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public class h implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f9264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f9265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f9266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f9267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicLong f9268e = new AtomicLong(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f9269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f9270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9271h;

    public enum b {
        INELIGIBLE,
        IDLE,
        MONITORING
    }

    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (h.this.f9265b.get() != b.MONITORING) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - h.this.f9268e.get();
            if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= h.this.f9269f) {
                h.this.f9267d.postDelayed(this, h.this.f9271h);
                return;
            }
            h.this.f9265b.set(b.INELIGIBLE);
            AppLovinBroadcastManager.unregisterReceiver(h.this);
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (stackTrace.length > 0) {
                StackTraceElement stackTraceElement = stackTrace[0];
                str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str = "None";
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - k.n());
            HashMap map = new HashMap(3);
            map.put("top_main_method", str);
            map.put("source", h.this.f9264a.z0() ? "non_first_session" : "first_session");
            map.put("details", "seconds_since_app_launch=" + seconds);
            h.this.f9264a.D().d(d2.F0, map);
        }
    }

    public class d implements Runnable {
        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f9265b.get() != b.MONITORING) {
                return;
            }
            h.this.f9268e.set(System.currentTimeMillis());
            h.this.f9266c.postDelayed(this, h.this.f9270g);
        }
    }

    private void b() {
        if (androidx.lifecycle.e.a(this.f9265b, b.MONITORING, b.IDLE)) {
            this.f9266c.removeCallbacksAndMessages(null);
            this.f9267d.removeCallbacksAndMessages(null);
        }
    }

    private void c() {
        if (!(((Boolean) this.f9264a.a(x4.f9925f6)).booleanValue() && this.f9264a.m0().getCurrentApplicationState() == SessionTracker.e.PAUSED) && androidx.lifecycle.e.a(this.f9265b, b.IDLE, b.MONITORING)) {
            this.f9266c.post(new d());
            this.f9267d.postDelayed(new c(), this.f9271h / 2);
        }
    }

    private void d() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f9269f = ((Long) this.f9264a.a(x4.f9898c6)).longValue();
        this.f9270g = ((Long) this.f9264a.a(x4.f9907d6)).longValue();
        this.f9271h = ((Long) this.f9264a.a(x4.f9916e6)).longValue();
        if (((Boolean) this.f9264a.a(x4.f9925f6)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
        }
    }

    public void a() {
        if (this.f9265b.get() == b.INELIGIBLE) {
            return;
        }
        if (!((Boolean) this.f9264a.a(x4.f9889b6)).booleanValue()) {
            b();
        } else {
            d();
            c();
        }
    }

    public h(k kVar) {
        b bVar;
        this.f9264a = kVar;
        if (!n7.c(kVar)) {
            bVar = b.IDLE;
        } else {
            bVar = b.INELIGIBLE;
        }
        this.f9265b = new AtomicReference(bVar);
        this.f9266c = new Handler(k.o().getMainLooper());
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:anr_detector");
        handlerThread.start();
        this.f9267d = new Handler(handlerThread.getLooper());
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }
}
