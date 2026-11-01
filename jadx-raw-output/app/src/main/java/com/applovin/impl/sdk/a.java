package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.t1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class a implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f9122e = TimeUnit.SECONDS.toMillis(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f9123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f9124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashSet f9125c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f9126d = new Object();

    /* JADX INFO: renamed from: com.applovin.impl.sdk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0044a {
        void onAdExpired(t1 t1Var);
    }

    private b b(t1 t1Var) {
        synchronized (this.f9126d) {
            try {
                if (t1Var == null) {
                    return null;
                }
                for (b bVar : this.f9125c) {
                    if (t1Var == bVar.b()) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a(t1 t1Var, InterfaceC0044a interfaceC0044a) {
        synchronized (this.f9126d) {
            if (b(t1Var) != null) {
                if (o.a()) {
                    this.f9124b.a("AdExpirationManager", "Ad expiration already scheduled for ad: " + t1Var);
                }
                return true;
            }
            if (t1Var.getTimeToLiveMillis() <= f9122e) {
                if (o.a()) {
                    this.f9124b.a("AdExpirationManager", "Ad has already expired: " + t1Var);
                }
                t1Var.setExpired();
                return false;
            }
            if (o.a()) {
                this.f9124b.a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(t1Var.getTimeToLiveMillis()) + " seconds from now for " + t1Var + "...");
            }
            if (this.f9125c.isEmpty()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            this.f9125c.add(b.a(t1Var, interfaceC0044a, this.f9123a));
            return true;
        }
    }

    public a(k kVar) {
        this.f9123a = kVar;
        this.f9124b = kVar.O();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            a();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            b();
        }
    }

    private void b() {
        HashSet<b> hashSet = new HashSet();
        synchronized (this.f9126d) {
            for (b bVar : this.f9125c) {
                t1 t1VarB = bVar.b();
                if (t1VarB == null) {
                    hashSet.add(bVar);
                } else {
                    long timeToLiveMillis = t1VarB.getTimeToLiveMillis();
                    if (timeToLiveMillis <= 0) {
                        if (o.a()) {
                            this.f9124b.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + t1VarB);
                        }
                        hashSet.add(bVar);
                    } else {
                        if (o.a()) {
                            this.f9124b.a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + t1VarB);
                        }
                        bVar.a(timeToLiveMillis);
                    }
                }
            }
        }
        for (b bVar2 : hashSet) {
            a(bVar2);
            bVar2.d();
        }
    }

    public void a(t1 t1Var) {
        synchronized (this.f9126d) {
            b bVarB = b(t1Var);
            if (bVarB != null) {
                if (o.a()) {
                    this.f9124b.a("AdExpirationManager", "Cancelling expiration timer for ad: " + t1Var);
                }
                bVarB.a();
                a(bVarB);
            }
        }
    }

    public void a(b bVar) {
        synchronized (this.f9126d) {
            this.f9125c.remove(bVar);
            if (this.f9125c.isEmpty()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    private void a() {
        synchronized (this.f9126d) {
            Iterator it = this.f9125c.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
        }
    }
}
