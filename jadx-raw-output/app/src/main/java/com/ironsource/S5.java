package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class S5 implements Lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f27573a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27574b = T5.f27679j;

    public static final class a implements InterfaceC3536j7 {
        @Override // com.ironsource.InterfaceC3536j7
        public void a(boolean z10) {
            if (z10) {
                return;
            }
            IronLog.API.error("failed to send impression data");
        }
    }

    @Override // com.ironsource.Lc
    public void a() {
    }

    public final void a(String str, JSONObject jSONObject) {
        ck.p.j(str, "dataSource");
        ck.p.j(jSONObject, "impressionData");
        if (!this.f27573a) {
            IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            JSONObject jSONObjectB = b();
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            jSONObjectJsonObjectInit.putOpt("externalMediationSource", str);
            jSONObjectJsonObjectInit.putOpt("externalMediationData", jSONObject);
            jSONObjectJsonObjectInit.putOpt("clientParams", jSONObjectB);
            IronLog.API.info("impressionData: " + jSONObjectJsonObjectInit);
            C3519i7.a(this.f27574b, jSONObjectJsonObjectInit.toString(), new a());
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.API.error("exception " + e10.getMessage() + " sending impression data");
        }
    }

    @Override // com.ironsource.Lc
    public void h(String str) {
    }

    private final JSONObject b() throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put("deviceOS", "android");
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            jSONObjectJsonObjectInit.put("deviceType", IronSourceUtils.b(applicationContext));
            T9 t9D = IronSourceUtils.d(applicationContext);
            if (t9D != null) {
                jSONObjectJsonObjectInit.put("advId", t9D.c());
                jSONObjectJsonObjectInit.put("advIdType", t9D.d());
            }
        }
        String strN = com.ironsource.mediationsdk.r.m().n();
        if (strN != null) {
            jSONObjectJsonObjectInit.put(C3426d4.j.f28592g, strN);
        }
        return jSONObjectJsonObjectInit;
    }

    @Override // com.ironsource.Lc
    public void a(List<IronSource.a> list, boolean z10, T3 t10) {
        if (t10 != null) {
            A1 a1B = t10.b();
            K1 k1F = a1B != null ? a1B.f() : null;
            ck.p.g(k1F);
            this.f27573a = k1F.l();
            this.f27574b = t10.b().f().d();
        }
    }
}
