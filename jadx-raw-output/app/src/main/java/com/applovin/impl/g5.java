package com.applovin.impl;

import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class g5 implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f7543c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f7541a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f7544d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f7545e = new Object();

    public AppLovinCommunicatorSubscriber a() {
        return (AppLovinCommunicatorSubscriber) this.f7543c.get();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return false;
        }
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f7543c.get();
        g5 g5Var = (g5) obj;
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = (AppLovinCommunicatorSubscriber) g5Var.f7543c.get();
        if (b().equals(g5Var.b())) {
            if (appLovinCommunicatorSubscriber != null) {
                if (appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2)) {
                    return true;
                }
            } else if (appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2) {
                return true;
            }
        }
        return false;
    }

    public void a(boolean z10) {
        this.f7541a = z10;
    }

    public String b() {
        return this.f7542b;
    }

    public boolean c() {
        return this.f7541a;
    }

    public int hashCode() {
        int iHashCode = this.f7542b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f7543c.get();
        return (iHashCode * 31) + (appLovinCommunicatorSubscriber != null ? appLovinCommunicatorSubscriber.hashCode() : 0);
    }

    public g5(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f7542b = str;
        this.f7543c = new WeakReference(appLovinCommunicatorSubscriber);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        if (a() == null) {
            com.applovin.impl.sdk.o.h("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        boolean z10 = false;
        synchronized (this.f7545e) {
            if (!this.f7544d.contains(communicatorMessageImpl.getUniqueId())) {
                this.f7544d.add(communicatorMessageImpl.getUniqueId());
                z10 = true;
            }
        }
        if (z10) {
            a().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }
}
