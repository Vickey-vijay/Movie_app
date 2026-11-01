package com.mbridge.msdk.advanced.common;

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
    public String f32543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f32544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f32545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f32546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f32547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f32548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f32549k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f32550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f32551m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f32552n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f32553o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f32554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f32555q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f32541c = "android";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f32539a = m0.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f32540b = m0.q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f32542d = g.d();

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(C3426d4.i.G, this.f32539a);
                jSONObject.put("system_version", this.f32540b);
                jSONObject.put("network_type", this.f32543e);
                jSONObject.put("network_type_str", this.f32544f);
                jSONObject.put("device_ua", this.f32545g);
                jSONObject.put("has_wx", m0.D(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.E());
                jSONObject.put("opensdk_ver", m0.B() + "");
                jSONObject.put("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f32554p);
                jSONObject.put("adid_limit_dev", this.f32555q);
            }
            jSONObject.put("plantform", this.f32541c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f32542d);
                jSONObject.put("az_aid_info", this.f32553o);
            }
            jSONObject.put("appkey", this.f32546h);
            jSONObject.put("appId", this.f32547i);
            jSONObject.put(CommonUrlParts.SCREEN_WIDTH, this.f32548j);
            jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, this.f32549k);
            jSONObject.put("orientation", this.f32550l);
            jSONObject.put("scale", this.f32551m);
            if (m0.y() != 0) {
                jSONObject.put("tun", m0.y());
            }
            jSONObject.put(InneractiveMediationDefs.GENDER_FEMALE, this.f32552n);
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
        this.f32543e = String.valueOf(iS);
        this.f32544f = m0.a(context, iS);
        this.f32545g = m0.l(context);
        this.f32546h = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f32547i = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f32548j = String.valueOf(v0.g(context));
        this.f32549k = String.valueOf(v0.f(context));
        this.f32551m = String.valueOf(v0.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f32550l = C3426d4.i.C;
        } else {
            this.f32550l = C3426d4.i.D;
        }
        this.f32552n = m0.u();
        this.f32553o = g.e();
        this.f32554p = g.a();
        this.f32555q = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }
}
