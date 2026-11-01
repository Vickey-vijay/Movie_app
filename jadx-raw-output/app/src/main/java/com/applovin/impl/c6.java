package com.applovin.impl;

import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.ironsource.C3426d4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class c6 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7132g;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f7132g.S().a(this.f7132g.e().b());
    }

    private void f() {
        if (this.f7132g.S().c()) {
            return;
        }
        Activity activityU0 = this.f7132g.u0();
        if (activityU0 != null) {
            this.f7132g.S().a(activityU0);
            return;
        }
        this.f7132g.D().a(d2.D0, this.f7706b + ":maybeInitializeAdapters()");
        this.f7132g.q0().a(new r6(this.f7132g, true, "initializeAdapters", new Runnable() { // from class: com.applovin.impl.k9
            @Override // java.lang.Runnable
            public final void run() {
                this.f7820b.e();
            }
        }), d6.b.CORE, TimeUnit.SECONDS.toMillis(1L));
    }

    public c6(com.applovin.impl.sdk.k kVar) {
        super("TaskInitializeSdk", kVar, true);
        this.f7132g = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, p2 p2Var, Exception exc) {
        if (exc != null) {
            this.f7132g.D().a("license_validation", exc);
        }
        this.f7132g.q0().a(new s6(this.f7132g, p2Var, exc));
    }

    private void g() {
        String str;
        String str2;
        boolean zC = this.f7132g.o0().c();
        Map mapP = this.f7132g.A().p();
        Map mapM = this.f7132g.A().M();
        String strA = zC ? this.f7132g.A().f().a() : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (zC) {
            str = mapP.get("idfv") + " (use this for test devices)";
        } else {
            str = "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        }
        v2 v2Var = new v2();
        v2Var.a().a("=====AppLovin SDK=====");
        v2Var.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.f7132g.a(x4.L3)).a("Ad Review Version", j.b()).a("OM SDK Version", this.f7132g.e0().c());
        v2Var.a("===Device Info===").a("OS", n7.d()).a(IronSourceConstants.TYPE_GAID, strA).a("App Set ID", str).a(ExifInterface.TAG_MODEL, mapP.get("model")).a("Locale", mapP.get(CommonUrlParts.LOCALE)).a("Emulator", mapP.get("sim")).a("Tablet", mapP.get("is_tablet"));
        v2Var.a("===App Info===").a("Application ID", mapM.get("package_name")).a("Target SDK", mapM.get("target_sdk"));
        v2Var.a("===SDK Settings===").a("SDK Key", this.f7132g.i0()).a("Mediation Provider", this.f7132g.V()).a("TG", m7.a(this.f7132g)).a("MD", this.f7132g.a(x4.f10037t)).a("Test Mode On", Boolean.valueOf(this.f7132g.s0().c())).a("Verbose Logging On", Boolean.valueOf(zC));
        v2Var.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(p0.a(a()));
        v2Var.a("===MAX Terms and Privcay Policy Flow===");
        u0 u0VarX = this.f7132g.x();
        boolean zJ = u0VarX.j();
        v2Var.a("Enabled", Boolean.valueOf(zJ));
        if (zJ) {
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f7132g.v().getConsentFlowUserGeography();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyD = u0VarX.d();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            String str3 = "Other";
            if (consentFlowUserGeography == consentFlowUserGeography2) {
                str2 = "GDPR";
            } else {
                str2 = consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown";
            }
            v2Var.a("Consent Flow Geography", str2);
            if (n7.c(this.f7132g)) {
                if (consentFlowUserGeographyD == consentFlowUserGeography2) {
                    str3 = "GDPR";
                } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                    str3 = "None";
                }
                v2Var.a("Debug User Geography", str3);
            }
        }
        v2Var.a("Privacy Policy URI", u0VarX.f()).a("Terms of Service URI", u0VarX.h());
        v2Var.a("===CMP (CONSENT MANAGEMENT PLATFORM)===").a(this.f7132g.r0().i());
        v2Var.a();
        com.applovin.impl.sdk.o.g("AppLovinSdk", v2Var.toString());
    }

    private void h() {
        Long l10 = (Long) this.f7132g.a(x4.f10077y);
        if (l10.longValue() < 0) {
            return;
        }
        Boolean bool = (Boolean) a5.a(z4.f10244i, Boolean.FALSE, com.applovin.impl.sdk.k.o());
        Boolean bool2 = (Boolean) this.f7132g.a(x4.f10085z);
        if (!bool.booleanValue() || bool2.booleanValue()) {
            this.f7132g.N().a(l10.longValue()).a(this.f7132g.q0().a("lv_task"), new s4.b() { // from class: com.applovin.impl.j9
                @Override // com.applovin.impl.s4.b
                public final void a(boolean z10, Object obj, Object obj2) {
                    this.f7770a.a(z10, (p2) obj, (Exception) obj2);
                }
            });
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.sdk.o oVar;
        String str;
        StringBuilder sb2;
        String str2 = "succeeded";
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Initializing AppLovin SDK v" + AppLovinSdk.VERSION + "...");
        }
        try {
            this.f7132g.G().b(a());
            this.f7132g.G().e(a());
            this.f7132g.q0().a((i5) new j5(this.f7132g), d6.b.OTHER);
            this.f7132g.A().b0();
            this.f7132g.l0().c();
            this.f7132g.y().l();
            if (n7.c(this.f7132g)) {
                this.f7132g.a();
            }
            this.f7132g.X0();
            g();
            f();
            this.f7132g.a(true);
            h();
            this.f7132g.f0().b();
            this.f7132g.k().maybeFireAppKilledWhilePlayingAdPostback();
            if (((Boolean) this.f7132g.a(x4.C2)).booleanValue()) {
                this.f7132g.X().maybeFireAppKilledWhilePlayingMediatedAdPostback();
            }
            this.f7132g.F().maybeTrackAppOpenEvent();
            this.f7132g.z().a();
            if (((Boolean) this.f7132g.a(x4.P2)).booleanValue()) {
                this.f7132g.x0().b();
            }
            if (((Boolean) this.f7132g.a(x4.X0)).booleanValue()) {
                this.f7132g.h().b();
            } else {
                this.f7132g.h().g();
            }
            if (this.f7132g.U().g() || (((Boolean) this.f7132g.a(r3.f8958u7)).booleanValue() && n7.c(this.f7132g) && this.f7132g.G0())) {
                this.f7132g.U().e();
            }
            this.f7132g.e0().i();
            if (com.applovin.impl.sdk.o.a()) {
                oVar = this.f7707c;
                str = this.f7706b;
                sb2 = new StringBuilder();
                sb2.append("AppLovin SDK ");
                sb2.append(AppLovinSdk.VERSION);
                sb2.append(" initialization ");
                if (!this.f7132g.B0()) {
                    str2 = C3426d4.i.f28566t;
                }
                sb2.append(str2);
                sb2.append(" in ");
                sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                sb2.append("ms");
                oVar.a(str, sb2.toString());
            }
        } catch (Throwable th2) {
            try {
                com.applovin.impl.sdk.o.c("AppLovinSdk", "Failed to initialize SDK!", th2);
                this.f7132g.a(false);
                a(th2);
                if (((Boolean) this.f7132g.a(x4.f9945i)).booleanValue()) {
                    this.f7132g.f0().a();
                }
                if (((Boolean) this.f7132g.a(x4.f9936h)).booleanValue()) {
                    this.f7132g.T0();
                }
                this.f7132g.e0().i();
                if (!com.applovin.impl.sdk.o.a()) {
                    return;
                }
                oVar = this.f7707c;
                str = this.f7706b;
                sb2 = new StringBuilder();
                sb2.append("AppLovin SDK ");
                sb2.append(AppLovinSdk.VERSION);
                sb2.append(" initialization ");
                if (!this.f7132g.B0()) {
                }
            } catch (Throwable th3) {
                this.f7132g.e0().i();
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVar2 = this.f7707c;
                    String str3 = this.f7706b;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("AppLovin SDK ");
                    sb3.append(AppLovinSdk.VERSION);
                    sb3.append(" initialization ");
                    sb3.append(this.f7132g.B0() ? "succeeded" : C3426d4.i.f28566t);
                    sb3.append(" in ");
                    sb3.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sb3.append("ms");
                    oVar2.a(str3, sb3.toString());
                }
                throw th3;
            }
        }
    }
}
