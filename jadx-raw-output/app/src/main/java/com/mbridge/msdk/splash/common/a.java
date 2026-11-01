package com.mbridge.msdk.splash.common;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseDeviceInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f36954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f36955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f36956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f36957h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f36958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f36959j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f36960k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f36961l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f36962m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f36963n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f36964o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f36965p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f36966q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f36952c = "android";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36950a = m0.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36951b = m0.q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f36953d = g.d();

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(C3426d4.i.G, this.f36950a);
                jSONObject.put("system_version", this.f36951b);
                jSONObject.put("network_type", this.f36954e);
                jSONObject.put("network_type_str", this.f36955f);
                jSONObject.put("device_ua", this.f36956g);
                jSONObject.put("has_wx", m0.D(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.E());
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f36965p);
                jSONObject.put("adid_limit_dev", this.f36966q);
            }
            jSONObject.put("plantform", this.f36952c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f36953d);
                jSONObject.put("az_aid_info", this.f36964o);
            }
            jSONObject.put("appkey", this.f36957h);
            jSONObject.put("appId", this.f36958i);
            jSONObject.put(CommonUrlParts.SCREEN_WIDTH, this.f36959j);
            jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, this.f36960k);
            jSONObject.put("orientation", this.f36961l);
            jSONObject.put("scale", this.f36962m);
            if (m0.y() != 0) {
                jSONObject.put("tun", m0.y());
            }
            jSONObject.put(InneractiveMediationDefs.GENDER_FEMALE, this.f36963n);
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
        } catch (JSONException e10) {
            q0.b("BaseDeviceInfo", e10.getMessage());
        }
        return jSONObject;
    }

    public a(Context context) {
        int iS = m0.s(context);
        this.f36954e = String.valueOf(iS);
        this.f36955f = m0.a(context, iS);
        this.f36956g = m0.l(context);
        this.f36957h = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f36958i = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f36959j = String.valueOf(v0.g(context));
        this.f36960k = String.valueOf(v0.f(context));
        this.f36962m = String.valueOf(v0.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f36961l = C3426d4.i.C;
        } else {
            this.f36961l = C3426d4.i.D;
        }
        this.f36963n = m0.u();
        this.f36964o = g.e();
        this.f36965p = g.a();
        this.f36966q = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }
}
