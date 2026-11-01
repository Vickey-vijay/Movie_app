package com.applovin.impl.mediation;

import com.applovin.impl.c3;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f8204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.g0 f8205d;

    public interface a {
        void a(c3 c3Var);
    }

    public void a(final c3 c3Var, long j10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8203b.a("AdHiddenCallbackTimeoutManager", "Scheduling in " + j10 + "ms...");
        }
        this.f8205d = com.applovin.impl.g0.a(j10, this.f8202a, new Runnable() { // from class: com.applovin.impl.mediation.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f8449b.a(c3Var);
            }
        });
    }

    public c(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f8202a = kVar;
        this.f8203b = kVar.O();
        this.f8204c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c3 c3Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8203b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.f8204c.a(c3Var);
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8203b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        com.applovin.impl.g0 g0Var = this.f8205d;
        if (g0Var != null) {
            g0Var.a();
            this.f8205d = null;
        }
    }
}
