package com.applovin.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f8699a = new a("Age Restricted User", z4.f10253r);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f8700b = new a("Has User Consent", z4.f10252q);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f8701c = new a("\"Do Not Sell\"", z4.f10254s);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final z4 f8703b;

        public Boolean b(Context context) {
            if (context != null) {
                return (Boolean) a5.a(this.f8703b, (Object) null, context);
            }
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Failed to get value for key: " + this.f8703b);
            return null;
        }

        public String a() {
            return this.f8702a;
        }

        public a(String str, z4 z4Var) {
            this.f8702a = str;
            this.f8703b = z4Var;
        }

        public String a(Context context) {
            Boolean boolB = b(context);
            return boolB != null ? boolB.toString() : "No value set";
        }
    }

    public static a a() {
        return f8701c;
    }

    public static a b() {
        return f8700b;
    }

    public static boolean a(boolean z10, Context context) {
        return a(z4.f10254s, Boolean.valueOf(z10), context);
    }

    public static boolean b(boolean z10, Context context) {
        return a(z4.f10252q, Boolean.valueOf(z10), context);
    }

    public static a c() {
        return f8699a;
    }

    public static String a(Context context) {
        return a(f8700b, context) + a(f8701c, context);
    }

    private static boolean a(z4 z4Var, Boolean bool, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Failed to update compliance value for key: " + z4Var);
            return false;
        }
        try {
            Boolean bool2 = (Boolean) a5.a(z4Var, (Object) null, context);
            a5.b(z4Var, bool, context);
            return bool2 == null || bool2 != bool;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ComplianceManager", "Unable to update compliance", th2);
            com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
            if (kVar != null) {
                kVar.D().a("ComplianceManager", "updateCompliance", th2);
            }
            return false;
        }
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.f8702a + " - " + aVar.a(context);
    }
}
