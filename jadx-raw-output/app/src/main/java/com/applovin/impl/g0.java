package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class g0 implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f7523c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g7 f7524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7525b;

    public static g0 a(long j10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return a(j10, false, kVar, runnable);
    }

    public static g0 a(long j10, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new g0(j10, z10, kVar, runnable);
    }

    public long b() {
        return this.f7524a.c();
    }

    private g0(long j10, final boolean z10, com.applovin.impl.sdk.k kVar, final Runnable runnable) {
        this.f7524a = g7.a(j10, z10, kVar, new Runnable() { // from class: com.applovin.impl.qa
            @Override // java.lang.Runnable
            public final void run() {
                this.f8876b.a(z10, runnable);
            }
        });
        this.f7525b = kVar;
        f7523c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, Runnable runnable) {
        if (!z10) {
            a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f7524a.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f7524a.e();
        }
    }

    public void a() {
        this.f7524a.a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        f7523c.remove(this);
    }
}
