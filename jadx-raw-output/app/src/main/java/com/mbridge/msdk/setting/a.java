package com.mbridge.msdk.setting;

import org.json.JSONObject;

/* JADX INFO: compiled from: BCP.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f36791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f36792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36793g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36787a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36788b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36789c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36790d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36794h = 0;

    public static a a(String str) {
        Exception e10;
        a aVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            aVar = new a();
            try {
                aVar.b(jSONObject.optString("http_domain", com.mbridge.msdk.foundation.same.net.utils.d.h().f35037h));
                aVar.c(jSONObject.optString("tcp_domain", com.mbridge.msdk.foundation.same.net.utils.d.h().f35041l));
                aVar.e(jSONObject.optInt("tcp_port", com.mbridge.msdk.foundation.same.net.utils.d.h().f35045p));
                aVar.f(jSONObject.optInt("type", 0));
                aVar.a(jSONObject.optInt("batch_size", 1));
                aVar.c(jSONObject.optInt("duration", 0));
                aVar.b(jSONObject.optInt("disable", 0));
                aVar.d(jSONObject.optInt("e_t_l", 0));
            } catch (Exception e11) {
                e10 = e11;
                e10.printStackTrace();
            }
        } catch (Exception e12) {
            e10 = e12;
            aVar = null;
        }
        return aVar;
    }

    public int b() {
        return this.f36788b;
    }

    public int c() {
        return this.f36789c;
    }

    public int d() {
        return this.f36790d;
    }

    public String e() {
        return this.f36791e;
    }

    public String f() {
        return this.f36792f;
    }

    public void b(int i10) {
        this.f36788b = i10;
    }

    public void c(int i10) {
        this.f36789c = i10;
    }

    public void d(int i10) {
        this.f36790d = i10;
    }

    public void e(int i10) {
        this.f36793g = i10;
    }

    public void f(int i10) {
        this.f36794h = i10;
    }

    public int g() {
        return this.f36793g;
    }

    public int h() {
        return this.f36794h;
    }

    public void b(String str) {
        this.f36791e = str;
    }

    public void c(String str) {
        this.f36792f = str;
    }

    public int a() {
        return this.f36787a;
    }

    public void a(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        this.f36787a = i10;
    }
}
