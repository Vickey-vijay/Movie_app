package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f9541a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f9542b = new Object();

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f9542b) {
            if (b() <= 25) {
                this.f9541a.offer(appLovinAdImpl);
            } else {
                o.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    public int b() {
        int size;
        synchronized (this.f9542b) {
            size = this.f9541a.size();
        }
        return size;
    }

    public boolean c() {
        boolean z10;
        synchronized (this.f9542b) {
            z10 = b() == 0;
        }
        return z10;
    }

    public AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f9542b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f9541a.peek();
        }
        return appLovinAdImpl;
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f9542b) {
            this.f9541a.remove(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f9542b) {
            appLovinAdImpl = !c() ? (AppLovinAdImpl) this.f9541a.poll() : null;
        }
        return appLovinAdImpl;
    }
}
