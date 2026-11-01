package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class R9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R9 f27547a = new R9();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C3538j9 f27548b = new C3538j9();

    public static final class a implements InitListener {
        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(IronSourceError ironSourceError) {
            ck.p.j(ironSourceError, "error");
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
        }
    }

    public static final class b implements InterfaceC3686re {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f27549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C3570l5 f27550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InitListener f27551c;

        @Override // com.ironsource.InterfaceC3686re
        public void a(C3579le c3579le) {
            ck.p.j(c3579le, "sdkConfig");
            R9.f27547a.a(this.f27549a, c3579le.d(), this.f27550b, this.f27551c);
        }

        public b(Context context, C3570l5 c3570l5, InitListener initListener) {
            this.f27549a = context;
            this.f27550b = c3570l5;
            this.f27551c = initListener;
        }

        @Override // com.ironsource.InterfaceC3686re
        public void a(C3617ne c3617ne) {
            ck.p.j(c3617ne, "error");
            R9.f27547a.a(this.f27551c, this.f27550b, c3617ne);
        }
    }

    private R9() {
    }

    public final void a(final Context context, final InitRequest initRequest, final InitListener initListener) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(initRequest, "initRequest");
        ck.p.j(initListener, "initializationListener");
        IronLog.API.info("IronSourceAds.init() appkey: " + initRequest.getAppKey() + ", legacyAdFormats: " + initRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        f27548b.a(new Runnable() { // from class: com.ironsource.fj
            @Override // java.lang.Runnable
            public final void run() {
                R9.a(initRequest, context, initListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitRequest initRequest, Context context, InitListener initListener) {
        ck.p.j(initRequest, "$initRequest");
        ck.p.j(context, "$context");
        ck.p.j(initListener, "$initializationListener");
        C3570l5 c3570l5 = new C3570l5();
        Ae.f25944a.c(context, new C3720te(initRequest.getAppKey(), null, nj.n.s0(f27548b.a(initRequest.getLegacyAdFormats())), 2, null), new b(context, c3570l5, initListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, Ne ne2, C3570l5 c3570l5, InitListener initListener) {
        String strT = com.ironsource.mediationsdk.r.m().t();
        C3395b9 c3395b9G = ne2.g();
        ck.p.i(c3395b9G, "serverResponse.initialConfiguration");
        NetworkSettings networkSettingsB = ne2.l().b("IronSource");
        ck.p.i(networkSettingsB, "serverResponse.providerS…s.IRONSOURCE_CONFIG_NAME)");
        JSONObject interstitialSettings = networkSettingsB.getInterstitialSettings();
        ck.p.i(interstitialSettings, "networkSettings.interstitialSettings");
        c3395b9G.a(new W.a(interstitialSettings));
        c3395b9G.a(ConfigFile.getConfigFile().getPluginType());
        c3395b9G.b(strT);
        new Y(new C3668qc()).a(context, c3395b9G, new a());
        a(ne2, c3570l5, initListener);
    }

    private final void a(Ne ne2, C3570l5 c3570l5, final InitListener initListener) {
        J1 j1E;
        A1 a1B = ne2.c().b();
        new Mb().a((a1B == null || (j1E = a1B.e()) == null) ? null : j1E.b(), true);
        String strT = com.ironsource.mediationsdk.r.m().t();
        C3541jc c3541jcA = C3541jc.f29275e.a();
        c3541jcA.a(ne2.l());
        c3541jcA.a(ne2.c());
        ck.p.i(strT, JsonStorageKeyNames.SESSION_ID_KEY);
        c3541jcA.a(strT);
        c3541jcA.g();
        long jA = C3570l5.a(c3570l5);
        C3538j9 c3538j9 = f27548b;
        Ne.a aVarI = ne2.i();
        ck.p.i(aVarI, "serverResponse.origin");
        c3538j9.a(jA, aVarI);
        c3538j9.b(new Runnable() { // from class: com.ironsource.hj
            @Override // java.lang.Runnable
            public final void run() {
                R9.a(initListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitListener initListener) {
        IronLog.CALLBACK.info("InitListener.onInitSuccess()");
        if (initListener != null) {
            initListener.onInitSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final InitListener initListener, C3570l5 c3570l5, final C3617ne c3617ne) {
        long jA = C3570l5.a(c3570l5);
        C3538j9 c3538j9 = f27548b;
        final C3617ne c3617neB = c3538j9.b(c3617ne);
        c3538j9.a(c3617neB, jA);
        c3538j9.b(new Runnable() { // from class: com.ironsource.gj
            @Override // java.lang.Runnable
            public final void run() {
                R9.a(c3617ne, initListener, c3617neB);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3617ne c3617ne, InitListener initListener, C3617ne c3617ne2) {
        ck.p.j(c3617ne, "$error");
        ck.p.j(c3617ne2, "$eventError");
        IronLog.CALLBACK.info("InitListener.onInitFailed() error " + c3617ne);
        if (initListener != null) {
            initListener.onInitFailed(f27548b.a(c3617ne2));
        }
    }

    public final void a(String str, String str2) {
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(str2, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        com.ironsource.mediationsdk.r.m().a(str, arrayList);
    }
}
