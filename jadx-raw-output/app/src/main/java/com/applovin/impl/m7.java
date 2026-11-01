package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f7980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7981c = a(z4.f10247l);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7982d = a(z4.f10248m);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f7983e = (String) a5.a(z4.f10249n, (Object) null, com.applovin.impl.sdk.k.o());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f7984f = (String) a5.a(z4.f10250o, (Object) null, com.applovin.impl.sdk.k.o());

    public String a() {
        return this.f7982d;
    }

    public String b() {
        return this.f7983e;
    }

    public String c() {
        return this.f7981c;
    }

    private String a(z4 z4Var) {
        String str = (String) a5.a(z4Var, (Object) null, com.applovin.impl.sdk.k.o());
        if (StringUtils.isValidString(str)) {
            return str;
        }
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a5.b(z4Var, lowerCase, com.applovin.impl.sdk.k.o());
        return lowerCase;
    }

    private String f() {
        if (!((Boolean) this.f7979a.a(x4.K3)).booleanValue()) {
            this.f7979a.c(z4.f10246k);
        }
        String str = (String) this.f7979a.a(z4.f10246k);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f7979a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7979a.O().a("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    public void b(String str) {
        this.f7983e = str;
        a5.b(z4.f10249n, str, com.applovin.impl.sdk.k.o());
    }

    public void c(String str) {
        this.f7984f = str;
        a5.b(z4.f10250o, str, com.applovin.impl.sdk.k.o());
    }

    public String d() {
        return this.f7984f;
    }

    public String e() {
        return this.f7980b;
    }

    public m7(com.applovin.impl.sdk.k kVar) {
        this.f7979a = kVar;
        a(f());
    }

    public void a(String str) {
        if (((Boolean) this.f7979a.a(x4.K3)).booleanValue()) {
            this.f7979a.b(z4.f10246k, str);
        }
        this.f7980b = str;
        this.f7979a.t().b(str, a());
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        z4 z4Var = z4.f10251p;
        String str = (String) kVar.a(z4Var);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strValueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        kVar.b(z4Var, strValueOf);
        return strValueOf;
    }
}
