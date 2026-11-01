package com.applovin.impl.sdk.network;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.t2;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f9480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f9481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f9483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f9484e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f9485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f9486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f9487h;

    public class a implements AppLovinPostbackListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f9488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AppLovinPostbackListener f9489b;

        public a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
            this.f9488a = dVar;
            this.f9489b = appLovinPostbackListener;
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i10) {
            o unused = b.this.f9481b;
            if (o.a()) {
                b.this.f9481b.d("PersistentPostbackManager", "Failed to submit postback: " + this.f9488a + " with error code: " + i10 + "; will retry later...");
            }
            b.this.d(this.f9488a);
            t2.a(this.f9489b, str, i10);
            if (this.f9488a.c() == 1) {
                b.this.f9480a.D().a("dispatchPostback", str, i10, (String) null);
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            b.this.a(this.f9488a);
            o unused = b.this.f9481b;
            if (o.a()) {
                b.this.f9481b.a("PersistentPostbackManager", "Successfully submit postback: " + this.f9488a);
            }
            b.this.c();
            t2.a(this.f9489b, str);
        }
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f9484e) {
            if (((Boolean) this.f9480a.a(x4.L2)).booleanValue()) {
                arrayList.ensureCapacity(this.f9487h.size());
                arrayList.addAll(this.f9487h);
            } else {
                arrayList.ensureCapacity(this.f9485f.size());
                arrayList.addAll(this.f9485f);
            }
        }
        return arrayList;
    }

    public void e(d dVar) {
        a(dVar, true);
    }

    private void c(d dVar) {
        synchronized (this.f9484e) {
            while (this.f9485f.size() > this.f9482c) {
                this.f9485f.remove(0);
            }
            this.f9485f.add(dVar);
        }
        if (o.a()) {
            this.f9481b.a("PersistentPostbackManager", "Enqueued postback: " + dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        synchronized (this.f9484e) {
            Iterator it = new ArrayList(this.f9485f).iterator();
            while (it.hasNext()) {
                b((d) it.next());
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        this.f9480a.q0().a((i5) this.f9483d, d6.b.OTHER);
    }

    public b(k kVar) {
        ArrayList arrayList = new ArrayList();
        this.f9485f = arrayList;
        this.f9486g = new HashSet();
        this.f9487h = new ArrayList();
        if (kVar != null) {
            this.f9480a = kVar;
            this.f9481b = kVar.O();
            int iIntValue = ((Integer) kVar.a(x4.J2)).intValue();
            this.f9482c = iIntValue;
            if (((Boolean) kVar.a(x4.M2)).booleanValue()) {
                c cVar = new c(this, kVar);
                this.f9483d = cVar;
                arrayList.addAll(cVar.a(iIntValue));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                return;
            }
            this.f9483d = null;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        synchronized (this.f9484e) {
            c(dVar);
            a(dVar, appLovinPostbackListener);
        }
    }

    public void a(d dVar, boolean z10) {
        a(dVar, z10, (AppLovinPostbackListener) null);
    }

    public void a(final d dVar, boolean z10, final AppLovinPostbackListener appLovinPostbackListener) {
        if (TextUtils.isEmpty(dVar.k())) {
            if (o.a()) {
                this.f9481b.b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z10) {
                dVar.a();
            }
            a(new Runnable() { // from class: com.applovin.impl.sdk.network.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9525b.b(dVar, appLovinPostbackListener);
                }
            }, n7.i(), dVar.m());
        }
    }

    public void b() {
        a(new Runnable() { // from class: com.applovin.impl.sdk.network.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f9528b.e();
            }
        }, true, false);
    }

    private void b(d dVar) {
        a(dVar, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f9484e) {
            Iterator it = this.f9487h.iterator();
            while (it.hasNext()) {
                b((d) it.next());
            }
            this.f9487h.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(d dVar) {
        synchronized (this.f9484e) {
            this.f9486g.remove(dVar);
            this.f9487h.add(dVar);
        }
    }

    public void a() {
        synchronized (this.f9484e) {
            this.f9485f.clear();
            this.f9487h.clear();
        }
        this.f9480a.q0().a((i5) this.f9483d, d6.b.OTHER);
    }

    private void a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        if (o.a()) {
            this.f9481b.a("PersistentPostbackManager", "Preparing to submit postback: " + dVar);
        }
        if (this.f9480a.E0() && !dVar.m()) {
            if (o.a()) {
                this.f9481b.a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(dVar.k())) {
            if (o.a()) {
                this.f9481b.b("PersistentPostbackManager", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.f9484e) {
            if (this.f9486g.contains(dVar)) {
                if (o.a()) {
                    this.f9481b.a("PersistentPostbackManager", "Skipping in progress postback: " + dVar.k());
                }
                return;
            }
            dVar.l();
            Integer num = (Integer) this.f9480a.a(x4.I2);
            if (dVar.c() > num.intValue()) {
                if (o.a()) {
                    this.f9481b.k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + dVar);
                }
                a(dVar);
                return;
            }
            synchronized (this.f9484e) {
                this.f9486g.add(dVar);
            }
            e eVarB = e.b(this.f9480a).b(dVar.k()).a(dVar.d()).b(dVar.i()).c(dVar.h()).a(dVar.g()).a(dVar.j() != null ? new JSONObject(dVar.j()) : null).b(dVar.o()).a(dVar.n()).a(dVar.f()).h(dVar.p()).e(dVar.e()).a();
            if (o.a()) {
                this.f9481b.a("PersistentPostbackManager", "Submitting postback: " + dVar);
            }
            this.f9480a.g0().dispatchPostbackRequest(eVarB, new a(dVar, appLovinPostbackListener));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar) {
        synchronized (this.f9484e) {
            this.f9486g.remove(dVar);
            this.f9485f.remove(dVar);
        }
        if (o.a()) {
            this.f9481b.a("PersistentPostbackManager", "Dequeued postback: " + dVar);
        }
    }

    private void a(Runnable runnable, boolean z10, boolean z11) {
        if (z10) {
            this.f9480a.q0().a((i5) new r6(this.f9480a, z11, "runPostbackTask", runnable), d6.b.OTHER);
        } else {
            runnable.run();
        }
    }
}
