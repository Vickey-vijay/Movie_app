package com.mbridge.msdk.foundation.same.report.campaignreport;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.authoritycontroller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.h;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.tracker.e;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseCampaignRequestTimeUtil.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f35084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f35085b;

    public void a() {
        if (this.f35085b != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("time", this.f35085b.f());
                jSONObject.put(CampaignEx.JSON_KEY_HB, this.f35085b.i());
                jSONObject.put("fb", this.f35085b.b());
                jSONObject.put("num", this.f35085b.e());
                jSONObject.put(CampaignEx.JSON_KEY_AD_SOURCE_ID, this.f35085b.a());
                jSONObject.put("timeout", this.f35085b.g());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35085b.h());
                if (c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", this.f35085b.d());
                    jSONObject.put("network_str", this.f35085b.c());
                }
                e eVar = new e("2000006");
                eVar.a(0);
                eVar.b(0);
                eVar.a(jSONObject);
                eVar.a(com.mbridge.msdk.foundation.same.report.c.d());
                d.b().d().d(eVar);
            } catch (Throwable unused) {
            }
        }
    }

    public void b(int i10) {
        h hVar = this.f35085b;
        if (hVar != null) {
            hVar.a(i10);
        }
    }

    public void b(String str) {
        h hVar = this.f35085b;
        if (hVar != null) {
            hVar.c(str);
        }
    }

    public void c(int i10) {
        h hVar = this.f35085b;
        if (hVar != null) {
            hVar.b(i10);
        }
    }

    public a(h hVar) {
        this.f35085b = hVar;
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        this.f35084a = contextD;
        if (this.f35085b != null && contextD != null) {
            int iS = m0.s(contextD);
            this.f35085b.c(iS);
            this.f35085b.a(m0.a(this.f35084a, iS));
        }
    }

    public void a(int i10) {
        h hVar = this.f35085b;
        if (hVar != null) {
            hVar.d(i10);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f35085b.b(str);
    }
}
