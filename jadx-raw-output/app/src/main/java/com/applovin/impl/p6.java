package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* JADX INFO: loaded from: classes.dex */
class p6 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s7 f8744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f8745h;

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, p8 p8Var, int i10) {
            this.f7705a.q0().a(h6.a(p8Var, p6.this.f8744g, p6.this.f8745h, p6.this.f7705a));
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, p8 p8Var) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, "Unable to resolve VAST wrapper. Server returned " + i10);
            }
            p6.this.a(i10);
        }
    }

    public p6(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskResolveVastWrapper", kVar);
        this.f8745h = appLovinAdLoadListener;
        this.f8744g = s7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strA = a8.a(this.f8744g);
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, "Resolving VAST failed. Could not find resolution URL");
            }
            a(-1);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Resolving VAST ad with depth " + this.f8744g.d() + " at " + strA);
        }
        try {
            this.f7705a.q0().a(new a(com.applovin.impl.sdk.network.a.a(this.f7705a).b(strA).c("GET").a(p8.f8751f).a(((Integer) this.f7705a.a(x4.U4)).intValue()).c(((Integer) this.f7705a.a(x4.V4)).intValue()).a(false).a(), this.f7705a));
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Unable to resolve VAST wrapper", th2);
            }
            a(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.b(this.f7706b, "Failed to resolve VAST wrapper due to error code " + i10);
        }
        if (i10 == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.f8745h;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i10);
                return;
            }
            return;
        }
        a8.a(this.f8744g, this.f8745h, i10 == -1001 ? t7.TIMED_OUT : t7.GENERAL_WRAPPER_ERROR, i10, this.f7705a);
    }
}
