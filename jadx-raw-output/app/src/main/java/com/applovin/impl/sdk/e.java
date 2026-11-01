package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f9221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f9222b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f9224d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f9225e = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f9223c = new Object();

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f9223c) {
            d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
            if (o.a()) {
                this.f9222b.a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
            }
        }
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f9223c) {
            c(appLovinAdImpl.getAdZone()).b(appLovinAdImpl);
        }
    }

    private q c(com.applovin.impl.u uVar) {
        synchronized (this.f9223c) {
            q qVarB = b(uVar);
            if (qVarB.b() > 0) {
                return qVarB;
            }
            return d(uVar);
        }
    }

    private q d(com.applovin.impl.u uVar) {
        q qVar;
        synchronized (this.f9223c) {
            qVar = (q) this.f9224d.get(uVar);
            if (qVar == null) {
                qVar = new q();
                this.f9224d.put(uVar, qVar);
            }
        }
        return qVar;
    }

    public AppLovinAdImpl e(com.applovin.impl.u uVar) {
        com.applovin.impl.sdk.ad.c cVar;
        synchronized (this.f9223c) {
            q qVarD = d(uVar);
            if (qVarD.b() > 0) {
                b(uVar).a(qVarD.a());
                cVar = new com.applovin.impl.sdk.ad.c(uVar, this.f9221a);
            } else {
                cVar = null;
            }
        }
        if (cVar != null) {
            if (o.a()) {
                this.f9222b.a("AdPreloadManager", "Retrieved ad of zone " + uVar + "...");
            }
        } else if (o.a()) {
            this.f9222b.a("AdPreloadManager", "Unable to retrieve ad of zone " + uVar + "...");
        }
        return cVar;
    }

    public AppLovinAdBase f(com.applovin.impl.u uVar) {
        AppLovinAdImpl appLovinAdImplD;
        synchronized (this.f9223c) {
            appLovinAdImplD = c(uVar).d();
        }
        return appLovinAdImplD;
    }

    public e(k kVar) {
        this.f9221a = kVar;
        this.f9222b = kVar.O();
        for (com.applovin.impl.u uVar : com.applovin.impl.u.a()) {
            this.f9224d.put(uVar, new q());
            this.f9225e.put(uVar, new q());
        }
    }

    private q b(com.applovin.impl.u uVar) {
        q qVar;
        synchronized (this.f9223c) {
            qVar = (q) this.f9225e.get(uVar);
            if (qVar == null) {
                qVar = new q();
                this.f9225e.put(uVar, qVar);
            }
        }
        return qVar;
    }

    public AppLovinAdImpl a(com.applovin.impl.u uVar) {
        AppLovinAdImpl appLovinAdImplA;
        synchronized (this.f9223c) {
            appLovinAdImplA = c(uVar).a();
        }
        return appLovinAdImplA;
    }
}
