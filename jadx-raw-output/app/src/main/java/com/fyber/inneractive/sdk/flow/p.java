package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import com.squareup.picasso.Utils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends o implements IAConfigManager.OnConfigurationReadyAndValidListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.e f15565g;

    @Override // com.fyber.inneractive.sdk.flow.o, com.fyber.inneractive.sdk.interfaces.a
    public final void a(InneractiveAdRequest inneractiveAdRequest) {
        com.fyber.inneractive.sdk.metrics.i iVarB = com.fyber.inneractive.sdk.metrics.d.f15849d.b(this.f15562e);
        iVarB.f15864b.put(new com.fyber.inneractive.sdk.metrics.h("success"), Long.valueOf(System.currentTimeMillis() - iVarB.f15866d));
        super.a(inneractiveAdRequest);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public final void b() {
        com.fyber.inneractive.sdk.metrics.i iVarB = com.fyber.inneractive.sdk.metrics.d.f15849d.b(this.f15562e);
        iVarB.f15864b.put(new com.fyber.inneractive.sdk.metrics.h(Utils.VERB_RETRYING), Long.valueOf(System.currentTimeMillis() - iVarB.f15866d));
    }

    public p(String str) {
        super(str);
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z10, Exception exc) {
        IAConfigManager.removeListener(this);
        if (!z10) {
            a(null, c(), new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.NO_APP_CONFIG_AVAILABLE, exc));
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public final void b(InneractiveAdRequest inneractiveAdRequest) {
        a(inneractiveAdRequest, this.f15565g);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public final void a() {
        com.fyber.inneractive.sdk.metrics.i iVarB = com.fyber.inneractive.sdk.metrics.d.f15849d.b(this.f15562e);
        iVarB.f15864b.put(new com.fyber.inneractive.sdk.metrics.h("dyn_timeout"), Long.valueOf(System.currentTimeMillis() - iVarB.f15866d));
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public final void a(boolean z10) {
        com.fyber.inneractive.sdk.network.m mVar = this.f15561d;
        if (mVar != null) {
            mVar.a();
        }
        super.a(true);
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        String str;
        if (eVar == null || (str = eVar.B) == null) {
            return;
        }
        com.fyber.inneractive.sdk.metrics.i iVarB = com.fyber.inneractive.sdk.metrics.d.f15849d.b(str);
        com.fyber.inneractive.sdk.config.global.r rVarA = this.f15560c;
        if (rVarA == null) {
            rVarA = com.fyber.inneractive.sdk.config.global.r.a();
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayA = com.fyber.inneractive.sdk.metrics.i.a(iVarB.f15864b);
        try {
            jSONObject.put("adl", jSONArrayA);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "adl", jSONArrayA);
        }
        JSONArray jSONArrayA2 = com.fyber.inneractive.sdk.metrics.i.a(iVarB.f15863a);
        try {
            jSONObject.put("adml", jSONArrayA2);
        } catch (Exception unused2) {
            IAlog.f("Got exception adding param to json object: %s, %s", "adml", jSONArrayA2);
        }
        if (!TextUtils.isEmpty(null)) {
            try {
                jSONObject.put("dns_failed", (Object) null);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "dns_failed", null);
            }
        }
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.SDK_BIDDING_METRICS;
        JSONArray jSONArrayB = rVarA.b();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.f16129c = uVar;
        wVar.f16127a = inneractiveAdRequest;
        wVar.f16130d = jSONArrayB;
        wVar.f16132f.put(jSONObject);
        wVar.a((String) null);
    }
}
