package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseDomainDeviceInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f35267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f35270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f35271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f35272h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f35274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f35275k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f35277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f35278n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f35279o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f35280p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f35282r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f35283s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f35284t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f35286v;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f35281q = "android";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f35273i = m0.t();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f35285u = m0.q();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f35276l = g.d();

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(C3426d4.i.G, this.f35273i);
                jSONObject.put("system_version", this.f35285u);
                jSONObject.put("network_type", this.f35278n);
                jSONObject.put("network_type_str", this.f35279o);
                jSONObject.put("device_ua", this.f35274j);
                jSONObject.put("has_wx", m0.D(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.E());
                jSONObject.put("opensdk_ver", m0.B() + "");
                jSONObject.put("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
                jSONObject.put("brand", this.f35271g);
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f35265a);
                jSONObject.put("adid_limit_dev", this.f35266b);
            }
            jSONObject.put("plantform", this.f35281q);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f35276l);
                jSONObject.put("az_aid_info", this.f35267c);
            }
            jSONObject.put("appkey", this.f35269e);
            jSONObject.put("appId", this.f35268d);
            jSONObject.put(CommonUrlParts.SCREEN_WIDTH, this.f35284t);
            jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, this.f35283s);
            jSONObject.put("orientation", this.f35280p);
            jSONObject.put("scale", this.f35282r);
            jSONObject.put("b", this.f35270f);
            jSONObject.put("c", this.f35272h);
            jSONObject.put("web_env", this.f35286v);
            jSONObject.put(InneractiveMediationDefs.GENDER_FEMALE, this.f35275k);
            jSONObject.put("misk_spt", this.f35277m);
            if (m0.y() != 0) {
                jSONObject.put("tun", m0.y());
            }
            jSONObject.put(com.mbridge.msdk.foundation.same.net.wrapper.e.f35061f, com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c() + "");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adid_limit", this.f35265a);
                jSONObject2.put("adid_limit_dev", this.f35266b);
                jSONObject.put("dvi", k0.b(jSONObject2.toString()));
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                jSONObject.put("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public e(Context context) {
        int iS = m0.s(context);
        this.f35278n = String.valueOf(iS);
        this.f35279o = m0.a(context, iS);
        this.f35274j = m0.l(context);
        this.f35269e = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f35268d = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f35284t = String.valueOf(v0.g(context));
        this.f35283s = String.valueOf(v0.f(context));
        this.f35282r = String.valueOf(v0.d(context));
        this.f35286v = com.mbridge.msdk.foundation.controller.c.n().k().toString();
        this.f35271g = m0.s();
        this.f35277m = v0.a();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f35280p = C3426d4.i.C;
        } else {
            this.f35280p = C3426d4.i.D;
        }
        this.f35270f = com.mbridge.msdk.foundation.same.a.V;
        this.f35272h = com.mbridge.msdk.foundation.same.a.f34897g;
        this.f35275k = m0.u();
        this.f35267c = g.e();
        this.f35265a = g.a();
        this.f35266b = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }
}
