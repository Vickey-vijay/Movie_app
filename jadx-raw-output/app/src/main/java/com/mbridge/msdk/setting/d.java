package com.mbridge.msdk.setting;

import org.json.JSONObject;

/* JADX INFO: compiled from: EventLibMonitorSetting.java */
/* JADX INFO: loaded from: classes11.dex */
public class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f36893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f36894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36895h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36888a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36889b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36890c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36891d = 30;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36892e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36896i = 0;

    public static d a(String str) {
        Exception e10;
        d dVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            dVar = new d();
            try {
                dVar.b(jSONObject.optString("h_d", com.mbridge.msdk.foundation.same.net.utils.d.h().f35034f));
                dVar.c(jSONObject.optString("t_d", com.mbridge.msdk.foundation.same.net.utils.d.h().f35040k));
                dVar.c(jSONObject.optInt("t_p", com.mbridge.msdk.foundation.same.net.utils.d.h().f35044o));
                dVar.d(jSONObject.optInt("type", 1));
                dVar.b(jSONObject.optInt("d_t", 30));
                dVar.a(jSONObject.optInt("d_a", 0));
            } catch (Exception e11) {
                e10 = e11;
                e10.printStackTrace();
            }
        } catch (Exception e12) {
            e10 = e12;
            dVar = null;
        }
        return dVar;
    }

    public int b() {
        return this.f36891d;
    }

    public String c() {
        return this.f36893f;
    }

    public String d() {
        return this.f36894g;
    }

    public void b(int i10) {
        this.f36891d = i10;
    }

    public void c(String str) {
        this.f36894g = str;
    }

    public void d(int i10) {
        this.f36896i = i10;
    }

    public int e() {
        return this.f36895h;
    }

    public void b(String str) {
        this.f36893f = str;
    }

    public void c(int i10) {
        this.f36895h = i10;
    }

    public int a() {
        return this.f36890c;
    }

    public void a(int i10) {
        this.f36890c = i10;
    }
}
