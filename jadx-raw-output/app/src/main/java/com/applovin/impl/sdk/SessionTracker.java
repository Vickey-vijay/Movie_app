package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.n7;
import com.applovin.impl.x4;
import com.ironsource.C3426d4;
import com.squareup.picasso.Utils;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f9103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9104b = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f9105c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f9106d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicInteger f9107e = new AtomicInteger();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicLong f9108f = new AtomicLong();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicLong f9109g = new AtomicLong();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicLong f9110h = new AtomicLong();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Date f9111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Date f9112j;

    public class a extends com.applovin.impl.b {
        public a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            SessionTracker.this.b();
        }
    }

    public class b implements ComponentCallbacks2 {
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        public b() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            SessionTracker.this.f9107e.set(i10);
            if (i10 == 20) {
                SessionTracker.this.a();
            }
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                if (n7.h()) {
                    SessionTracker.this.b();
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                SessionTracker.this.a();
            }
        }
    }

    public enum e {
        STARTED(C3426d4.i.f28535d0),
        PAUSED("paused"),
        RESUMED(Utils.VERB_RESUMED);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9121a;

        public String b() {
            return this.f9121a;
        }

        e(String str) {
            this.f9121a = str;
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9116a;

        static {
            int[] iArr = new int[e.values().length];
            f9116a = iArr;
            try {
                iArr[e.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9116a[e.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9116a[e.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f9106d.compareAndSet(false, true)) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f9106d.compareAndSet(true, false)) {
            d();
        }
    }

    private void c() {
        this.f9103a.O();
        if (o.a()) {
            this.f9103a.O().a("SessionTracker", "Application Paused");
        }
        this.f9108f.set(System.currentTimeMillis());
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.f9105c.get()) {
            return;
        }
        boolean zBooleanValue = ((Boolean) this.f9103a.a(x4.f10049u3)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f9103a.a(x4.f10065w3)).longValue());
        if (this.f9111i == null || System.currentTimeMillis() - this.f9111i.getTime() >= millis) {
            this.f9103a.F().trackEvent("paused");
            if (zBooleanValue) {
                this.f9111i = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f9111i = new Date();
    }

    private void d() {
        this.f9103a.O();
        if (o.a()) {
            this.f9103a.O().a("SessionTracker", "Application Resumed");
        }
        this.f9109g.set(System.currentTimeMillis());
        this.f9110h.addAndGet(this.f9109g.get() - this.f9108f.get());
        boolean zBooleanValue = ((Boolean) this.f9103a.a(x4.f10049u3)).booleanValue();
        long jLongValue = ((Long) this.f9103a.a(x4.f10057v3)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.f9105c.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(jLongValue);
        if (this.f9112j == null || System.currentTimeMillis() - this.f9112j.getTime() >= millis) {
            this.f9103a.F().trackEvent(Utils.VERB_RESUMED);
            if (zBooleanValue) {
                this.f9112j = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f9112j = new Date();
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.f9108f.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.f9109g.get();
    }

    public e getCurrentApplicationState() {
        if (this.f9106d.get()) {
            return e.PAUSED;
        }
        return this.f9108f.get() != 0 ? e.RESUMED : e.STARTED;
    }

    public int getLastTrimMemoryLevel() {
        return this.f9107e.get();
    }

    public String getSessionId() {
        return this.f9104b;
    }

    public boolean isApplicationPaused() {
        return this.f9106d.get();
    }

    public void pauseForClick() {
        this.f9105c.set(true);
    }

    public void resumeForClick() {
        this.f9105c.set(false);
    }

    public SessionTracker(k kVar) {
        this.f9103a = kVar;
        Application application = (Application) k.o();
        application.registerActivityLifecycleCallbacks(new a());
        application.registerComponentCallbacks(new b());
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new c(), intentFilter);
    }

    public long getCurrentApplicationStateDurationMillis() {
        long jN;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = d.f9116a[getCurrentApplicationState().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return -1L;
                }
                jN = this.f9109g.get();
            } else {
                jN = this.f9108f.get();
            }
        } else {
            jN = k.n();
        }
        return jCurrentTimeMillis - jN;
    }

    public long getTotalBackgroundDurationMillis() {
        if (getCurrentApplicationState() == e.PAUSED) {
            return this.f9110h.get() + getCurrentApplicationStateDurationMillis();
        }
        return this.f9110h.get();
    }
}
