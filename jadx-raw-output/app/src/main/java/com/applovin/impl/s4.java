package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class s4 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Executor f9021i = new Executor() { // from class: com.applovin.impl.sd
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            AppLovinSdkUtils.runOnUiThread(runnable);
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Executor f9022j = new androidx.media3.exoplayer.dash.offline.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9024b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile Object f9029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Object f9030h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f9023a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f9025c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f9026d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f9027e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f9028f = false;

    public interface a {
        void a(Object obj);
    }

    public interface b {
        void a(boolean z10, Object obj, Object obj2);
    }

    public static s4 a(String str, Object obj) {
        return new s4(str).b(obj);
    }

    public s4 b(Object obj) {
        a(true, obj, (Object) null, false);
        return this;
    }

    public s4 c(Object obj) {
        a(false, (Object) null, obj, true);
        return this;
    }

    public boolean d() {
        return this.f9026d;
    }

    public boolean e() {
        return this.f9026d && !this.f9027e;
    }

    public s4 a(Object obj) {
        a(false, (Object) null, obj, false);
        return this;
    }

    public Object b() {
        l1.a(e());
        return this.f9030h;
    }

    public String c() {
        String str = this.f9024b;
        return str != null ? str : super.toString();
    }

    public String toString() {
        String str;
        if (!this.f9026d) {
            str = "Waiting";
        } else if (this.f9027e) {
            str = "Success -> " + this.f9029g;
        } else {
            str = "Failed -> " + this.f9030h;
        }
        return "Promise(" + c() + ": " + str + ")";
    }

    public s4(String str) {
        this.f9024b = str;
    }

    private Runnable c(final Executor executor, final b bVar) {
        return new Runnable() { // from class: com.applovin.impl.vd
            @Override // java.lang.Runnable
            public final void run() {
                this.f9757b.b(executor, bVar);
            }
        };
    }

    public void a(Executor executor, final Runnable runnable) {
        a(executor, new b() { // from class: com.applovin.impl.wd
            @Override // com.applovin.impl.s4.b
            public final void a(boolean z10, Object obj, Object obj2) {
                s4.a(runnable, z10, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, boolean z10, Object obj, Object obj2) {
        if (z10) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Executor executor, final b bVar) {
        try {
            executor.execute(new Runnable() { // from class: com.applovin.impl.ud
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9700b.a(bVar);
                }
            });
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public void a(Executor executor, final a aVar) {
        a(executor, new b() { // from class: com.applovin.impl.td
            @Override // com.applovin.impl.s4.b
            public final void a(boolean z10, Object obj, Object obj2) {
                s4.a(aVar, z10, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, boolean z10, Object obj, Object obj2) {
        if (z10) {
            return;
        }
        aVar.a(obj2);
    }

    public void a(Executor executor, b bVar) {
        Runnable runnableC = c(executor, bVar);
        synchronized (this.f9023a) {
            if (!this.f9026d) {
                this.f9025c.add(runnableC);
            } else {
                runnableC.run();
            }
        }
    }

    public boolean a() {
        return this.f9026d && this.f9028f;
    }

    private void a(boolean z10, Object obj, Object obj2, boolean z11) {
        synchronized (this.f9023a) {
            if (this.f9026d) {
                return;
            }
            this.f9029g = obj;
            this.f9030h = obj2;
            this.f9027e = z10;
            this.f9028f = z11;
            this.f9026d = true;
            Iterator it = this.f9025c.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f9025c.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        try {
            bVar.a(this.f9027e, this.f9029g, this.f9030h);
        } catch (Throwable th2) {
            a(th2);
        }
    }

    private void a(Throwable th2) {
        l1.a(th2);
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        if (kVar != null) {
            kVar.D().a("Promise", "PromiseCallback: " + c(), th2);
        }
    }
}
