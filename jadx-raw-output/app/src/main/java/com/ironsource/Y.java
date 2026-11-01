package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3651pc f27883a;

    public static final class a implements Mc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3395b9 f27884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InitListener f27885b;

        public a(C3395b9 c3395b9, InitListener initListener) {
            this.f27884a = c3395b9;
            this.f27885b = initListener;
        }

        @Override // com.ironsource.Mc
        public void onFail(C3731u8 c3731u8) {
            ck.p.j(c3731u8, "error");
            IronLog.ADAPTER_API.verbose("initSDKWithNetworkConfigurations error: " + c3731u8);
            this.f27885b.onInitFailed(C3813z5.f31697a.a(new IronSourceError(c3731u8.a(), c3731u8.b())));
        }

        @Override // com.ironsource.Mc
        public void onSuccess() {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations success");
            W wE = this.f27884a.e();
            ironLog.verbose("controllerURL = " + (wE != null ? wE.c() : null));
            W wE2 = this.f27884a.e();
            ironLog.verbose("controllerConfig = " + (wE2 != null ? wE2.a() : null));
            W wE3 = this.f27884a.e();
            ironLog.verbose("debugMode = " + (wE3 != null ? Integer.valueOf(wE3.b()) : null));
            ironLog.verbose("applicationKey = " + this.f27884a.d());
            ironLog.verbose("userId = " + this.f27884a.h());
            this.f27885b.onInitSuccess();
        }
    }

    public Y(InterfaceC3651pc interfaceC3651pc) {
        ck.p.j(interfaceC3651pc, "networkInitApi");
        this.f27883a = interfaceC3651pc;
    }

    @Override // com.ironsource.X
    public void a(Context context, C3395b9 c3395b9, InitListener initListener) {
        JSONObject jSONObjectA;
        String strC;
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(c3395b9, "initConfig");
        ck.p.j(initListener, "initListener");
        InterfaceC3651pc interfaceC3651pc = this.f27883a;
        W wE = c3395b9.e();
        interfaceC3651pc.a(wE != null ? wE.b() : 0);
        W wE2 = c3395b9.e();
        if (wE2 != null && (strC = wE2.c()) != null) {
            this.f27883a.b(strC);
        }
        W wE3 = c3395b9.e();
        if (wE3 != null && (jSONObjectA = wE3.a()) != null) {
            InterfaceC3651pc interfaceC3651pc2 = this.f27883a;
            String string = jSONObjectA.toString();
            ck.p.i(string, "applicationConfig.toString()");
            interfaceC3651pc2.a(string);
        }
        Map<String, String> mapA = new C3615nc().a();
        this.f27883a.a(new a(c3395b9, initListener));
        this.f27883a.a(context, c3395b9.d(), c3395b9.h(), mapA);
    }
}
