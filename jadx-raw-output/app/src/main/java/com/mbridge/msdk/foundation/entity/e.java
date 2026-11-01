package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: ClickTime.java */
/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f34740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f34741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f34742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f34743i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f34744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f34745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f34746l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f34747m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f34748n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f34749o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f34750p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f34751q;

    public String a() {
        return this.f34735a;
    }

    public String b() {
        return this.f34737c;
    }

    public int c() {
        return this.f34738d;
    }

    public String d() {
        return this.f34736b;
    }

    public void e(int i10) {
        this.f34747m = i10;
    }

    public void f(int i10) {
        this.f34750p = i10;
    }

    public String g() {
        return this.f34741g;
    }

    public void h(String str) {
        this.f34746l = str;
    }

    public void i(String str) {
        this.f34748n = str;
    }

    public String j() {
        return this.f34744j;
    }

    public void k(String str) {
        this.f34751q = str;
    }

    public void a(int i10) {
        this.f34738d = i10;
    }

    public void b(String str) {
        this.f34737c = str;
    }

    public void c(int i10) {
        this.f34743i = i10;
    }

    public void d(int i10) {
        this.f34745k = i10;
    }

    public int e() {
        return this.f34739e;
    }

    public String f() {
        return this.f34740f;
    }

    public void g(String str) {
        this.f34744j = str;
    }

    public String h() {
        return this.f34742h;
    }

    public int i() {
        return this.f34743i;
    }

    public void j(String str) {
        this.f34749o = str;
    }

    public int k() {
        return this.f34745k;
    }

    public String l() {
        return this.f34746l;
    }

    public int m() {
        return this.f34747m;
    }

    public String n() {
        return this.f34748n;
    }

    public String o() {
        return this.f34749o;
    }

    public int p() {
        return this.f34750p;
    }

    public String q() {
        return this.f34751q;
    }

    public String toString() {
        return "ClickTime [campaignId=" + this.f34735a + ", click_duration=" + this.f34736b + ", lastUrl=" + this.f34744j + ", code=" + this.f34739e + ", excepiton=" + this.f34741g + ", header=" + this.f34742h + ", content=" + this.f34740f + ", type=" + this.f34750p + ", click_type=" + this.f34738d + C3426d4.j.f28588e;
    }

    public void a(String str) {
        this.f34735a = str;
    }

    public void b(int i10) {
        this.f34739e = i10;
    }

    public void c(String str) {
        this.f34736b = str;
    }

    public void d(String str) {
        this.f34740f = str;
    }

    public void e(String str) {
        this.f34741g = str;
    }

    public void f(String str) {
        this.f34742h = str;
    }

    public static JSONObject a(e eVar) {
        if (eVar == null) {
            return null;
        }
        String strJ = eVar.j();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ImpressionLog.f43648x, eVar.n());
            jSONObject.put("rid_n", eVar.o());
            jSONObject.put("click_type", eVar.c());
            jSONObject.put("type", eVar.p());
            jSONObject.put("cid", eVar.a());
            jSONObject.put("click_duration", eVar.d());
            jSONObject.put(C3426d4.i.W, "2000012");
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, eVar.q());
            jSONObject.put("last_url", strJ);
            jSONObject.put("code", eVar.e());
            jSONObject.put("exception", eVar.g());
            jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, eVar.i());
            jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, eVar.k());
            jSONObject.put("click_time", eVar.b());
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("network_type", eVar.m());
                jSONObject.put("network_str", eVar.l());
            }
            return jSONObject;
        } catch (Throwable th2) {
            q0.b("ClickTime", th2.getMessage());
            return null;
        }
    }

    public static ArrayList<JSONObject> a(List<e> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList<JSONObject> arrayList = new ArrayList<>();
        for (e eVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ImpressionLog.f43648x, eVar.n());
                jSONObject.put("rid_n", eVar.o());
                jSONObject.put("cid", eVar.a());
                jSONObject.put("click_type", eVar.c());
                jSONObject.put("type", eVar.p());
                jSONObject.put("click_duration", eVar.d());
                jSONObject.put(C3426d4.i.W, "2000013");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, eVar.q());
                jSONObject.put("last_url", eVar.j());
                jSONObject.put("content", eVar.f());
                jSONObject.put("code", eVar.e());
                jSONObject.put("exception", eVar.g());
                jSONObject.put("header", eVar.h());
                jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, eVar.i());
                jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, eVar.k());
                jSONObject.put("click_time", eVar.b());
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", eVar.m());
                    jSONObject.put("network_str", eVar.l());
                }
                String strQ = eVar.q();
                if (!TextUtils.isEmpty(strQ)) {
                    String str = com.mbridge.msdk.foundation.controller.a.f34556r.get(strQ);
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                arrayList.add(jSONObject);
            } catch (Throwable th2) {
                q0.b("ClickTime", th2.getMessage());
            }
        }
        return arrayList;
    }
}
