package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes4.dex */
public class h8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f7627f = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f7628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f7630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f7631d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Timer f7632e;

    public class a extends TimerTask {

        /* JADX INFO: renamed from: com.applovin.impl.h8$a$a, reason: collision with other inner class name */
        public class C0037a implements AppLovinBroadcastManager.Receiver {
            public C0037a() {
            }

            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Intent intent, Map map) {
                AppLovinBroadcastManager.unregisterReceiver(this);
                h8.this.c();
            }
        }

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!h8.this.f7629b.m0().isApplicationPaused() || h8.this.f7628a) {
                h8.this.c();
            } else {
                AppLovinBroadcastManager.registerReceiver(new C0037a(), new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }
    }

    public static h8 a(long j10, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new h8(j10, z10, kVar, runnable);
    }

    private TimerTask b() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Runnable runnable = this.f7630c;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }

    private h8(long j10, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        Timer timer = new Timer();
        this.f7632e = timer;
        if (j10 >= 0) {
            if (kVar != null) {
                if (runnable != null) {
                    this.f7628a = z10;
                    this.f7629b = kVar;
                    this.f7630c = runnable;
                    f7627f.add(this);
                    timer.schedule(b(), j10);
                    return;
                }
                throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
            }
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        throw new IllegalArgumentException("Cannot create wall clock timer. Invalid timer length: " + j10);
    }

    public void a() {
        synchronized (this.f7631d) {
            this.f7632e.cancel();
            this.f7630c = null;
            f7627f.remove(this);
        }
    }
}
