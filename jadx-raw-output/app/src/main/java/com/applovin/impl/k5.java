package com.applovin.impl;

import android.app.Activity;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class k5 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f7810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Activity f7811h;

    public k5(List list, Activity activity, com.applovin.impl.sdk.k kVar) {
        super("TaskAutoInitAdapters", kVar, true);
        this.f7810g = list;
        this.f7811h = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f7810g.size() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f7707c;
                String str = this.f7706b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Auto-initing ");
                sb2.append(this.f7810g.size());
                sb2.append(" adapters");
                sb2.append(this.f7705a.s0().c() ? " in test mode" : "");
                sb2.append("...");
                oVar.a(str, sb2.toString());
            }
            if (TextUtils.isEmpty(this.f7705a.V())) {
                this.f7705a.O0();
            } else if (!this.f7705a.G0()) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f7705a.V());
            }
            if (this.f7811h == null) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            for (final k3 k3Var : this.f7810g) {
                if (k3Var.s()) {
                    this.f7705a.q0().a(new Runnable() { // from class: com.applovin.impl.hb
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f7640b.a(k3Var);
                        }
                    }, d6.b.MEDIATION);
                } else {
                    this.f7705a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7705a.O().a(this.f7706b, "Skipping eager auto-init for adapter " + k3Var);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(k3 k3Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Auto-initing adapter: " + k3Var);
        }
        this.f7705a.S().a(k3Var, this.f7811h);
    }
}
