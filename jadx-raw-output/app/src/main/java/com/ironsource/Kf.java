package com.ironsource;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.mediation.LevelPlayAdSize;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Kf f26939a = new Kf();

    public final String a(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        return C1.a(context, c(context));
    }

    public final String b(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        return C1.b(context, c(context));
    }

    public final String c(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        return C1.g(context);
    }

    public final JSONObject a(boolean z10) {
        JSONObject jSONObjectB = IronSourceUtils.b(z10);
        ck.p.i(jSONObjectB, "getMediationAdditionalData(isDemandOnlyMode)");
        return jSONObjectB;
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObjectB = N6.a().b();
        ck.p.i(jSONObjectB, "getProperties().toJSON()");
        return jSONObjectB;
    }

    public final JSONObject c() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            ConcurrentHashMap<String, AdapterBaseWrapper> concurrentHashMapE = com.ironsource.mediationsdk.c.b().e();
            ck.p.i(concurrentHashMapE, "networkAdaptersMap");
            for (Map.Entry<String, AdapterBaseWrapper> entry : concurrentHashMapE.entrySet()) {
                if (entry.getValue().getAdapterBaseInterface() != null) {
                    Kf kf2 = f26939a;
                    String key = entry.getKey();
                    ck.p.i(key, "entry.key");
                    String strA = kf2.a(key);
                    AdapterBaseInterface adapterBaseInterface = entry.getValue().getAdapterBaseInterface();
                    ck.p.i(adapterBaseInterface, "entry.value.adapterBaseInterface");
                    String adapterVersion = adapterBaseInterface.getAdapterVersion();
                    ck.p.i(adapterVersion, "adapterBaseInterface.adapterVersion");
                    jSONObjectJsonObjectInit.putOpt(strA, kf2.a(adapterVersion, adapterBaseInterface.getNetworkSDKVersion()));
                }
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
        }
        return jSONObjectJsonObjectInit;
    }

    public final ConcurrentHashMap<String, List<String>> d() {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putAll(com.ironsource.mediationsdk.c.b().d());
        concurrentHashMap.putAll(C3649pa.b().c());
        return concurrentHashMap;
    }

    private Kf() {
    }

    public final void a(InterfaceC3505hb interfaceC3505hb) {
        C3502h8.a().b(interfaceC3505hb);
    }

    public final LevelPlayAdSize b(String str, int i10, int i11) {
        if (str != null && str.length() != 0 && !ck.p.e(str, "CUSTOM")) {
            if (ck.p.e(str, com.ironsource.mediationsdk.l.f29840c)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            return LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(str);
        }
        return LevelPlayAdSize.Companion.createCustomSize(i10, i11);
    }

    public final void e() {
        com.ironsource.mediationsdk.r.m().R();
    }

    public final void a(InterfaceC3700sb interfaceC3700sb) {
        Dd.a().b(interfaceC3700sb);
    }

    public final void a(Ga ga2) {
        C3725u2.a().b(ga2);
    }

    public final int a() {
        return Lb.f26968s.d().i().c();
    }

    public final String a(C3489gd c3489gd) {
        String strC;
        return (c3489gd == null || (strC = c3489gd.c()) == null) ? new String() : strC;
    }

    public final String a(NetworkSettings networkSettings) {
        ck.p.j(networkSettings, "networkSettings");
        String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new String() : providerDefaultInstance;
    }

    public final void b(String str) {
        ck.p.j(str, "message");
        IronLog.INTERNAL.error(str);
    }

    public final boolean a(NetworkSettings networkSettings, IronSource.a aVar) {
        ck.p.j(networkSettings, "networkSettings");
        ck.p.j(aVar, "adUnit");
        return networkSettings.isBidder(aVar);
    }

    public final ISBannerSize a(String str, int i10, int i11) {
        return new ISBannerSize(str, i10, i11);
    }

    public final com.ironsource.mediationsdk.q a(Activity activity, ISBannerSize iSBannerSize) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ck.p.j(iSBannerSize, "size");
        com.ironsource.mediationsdk.q qVarB = com.ironsource.mediationsdk.r.m().b(activity, iSBannerSize);
        ck.p.i(qVarB, "getInstance().createBanner(activity, size)");
        return qVarB;
    }

    public final void a(D5 d10, JSONObject jSONObject) {
        ck.p.j(d10, "event");
        ck.p.j(jSONObject, "data");
        C3400be.i().a(new C5(d10, jSONObject));
    }

    private final JSONObject a(String str, String str2) {
        return new JSONObject(kotlin.collections.a.m(mj.h.a(Df.f26386b, str), mj.h.a("sdkVersion", str2)));
    }

    public final String a(String str) {
        String str2;
        ck.p.j(str, C3426d4.i.W);
        try {
            if (!lk.a0.X(str, "-", false, 2, null)) {
                if (!lk.a0.X(str, "_", false, 2, null)) {
                    return str;
                }
                str2 = (String) nj.b0.f0(lk.a0.N0(str, new String[]{"_"}, false, 0, 6, null));
            } else {
                String str3 = (String) nj.b0.r0(lk.a0.N0(str, new String[]{"-"}, false, 0, 6, null));
                if (!lk.a0.X(str3, "_", false, 2, null)) {
                    return str3;
                }
                str2 = (String) nj.b0.f0(lk.a0.N0(str3, new String[]{"_"}, false, 0, 6, null));
            }
            return str2;
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.getMessage());
            return str;
        }
    }
}
