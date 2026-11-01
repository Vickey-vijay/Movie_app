package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC3724u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f31347a = b.f31363a;

    /* JADX INFO: renamed from: com.ironsource.u1$a */
    public interface a extends InterfaceC3724u1 {

        /* JADX INFO: renamed from: com.ironsource.u1$a$a, reason: collision with other inner class name */
        public static final class C0289a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f31348b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f31349c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final C3714t8.e f31350d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final String f31351e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final String f31352f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final C0290a f31353g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final int f31354h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final int f31355i;

            /* JADX INFO: renamed from: com.ironsource.u1$a$a$a, reason: collision with other inner class name */
            public static final class C0290a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f31356a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f31357b;

                public final int a() {
                    return this.f31356a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0290a)) {
                        return false;
                    }
                    C0290a c0290a = (C0290a) obj;
                    return this.f31356a == c0290a.f31356a && this.f31357b == c0290a.f31357b;
                }

                public final C0290a a(int i10, int i11) {
                    return new C0290a(i10, i11);
                }

                public final int b() {
                    return this.f31357b;
                }

                public final int c() {
                    return this.f31356a;
                }

                public final int d() {
                    return this.f31357b;
                }

                public int hashCode() {
                    return (Integer.hashCode(this.f31356a) * 31) + Integer.hashCode(this.f31357b);
                }

                public String toString() {
                    return "Coordinates(x=" + this.f31356a + ", y=" + this.f31357b + ")";
                }

                public C0290a(int i10, int i11) {
                    this.f31356a = i10;
                    this.f31357b = i11;
                }

                public static /* synthetic */ C0290a a(C0290a c0290a, int i10, int i11, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        i10 = c0290a.f31356a;
                    }
                    if ((i12 & 2) != 0) {
                        i11 = c0290a.f31357b;
                    }
                    return c0290a.a(i10, i11);
                }
            }

            public final C0289a a(String str, String str2, C3714t8.e eVar, String str3, String str4, C0290a c0290a, int i10, int i11) {
                ck.p.j(str, "successCallback");
                ck.p.j(str2, "failCallback");
                ck.p.j(eVar, C3426d4.i.f28552m);
                ck.p.j(str3, "demandSourceName");
                ck.p.j(str4, "url");
                ck.p.j(c0290a, C3444e4.f28731f);
                return new C0289a(str, str2, eVar, str3, str4, c0290a, i10, i11);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0289a)) {
                    return false;
                }
                C0289a c0289a = (C0289a) obj;
                return ck.p.e(this.f31348b, c0289a.f31348b) && ck.p.e(this.f31349c, c0289a.f31349c) && this.f31350d == c0289a.f31350d && ck.p.e(this.f31351e, c0289a.f31351e) && ck.p.e(this.f31352f, c0289a.f31352f) && ck.p.e(this.f31353g, c0289a.f31353g) && this.f31354h == c0289a.f31354h && this.f31355i == c0289a.f31355i;
            }

            public C0289a(String str, String str2, C3714t8.e eVar, String str3, String str4, C0290a c0290a, int i10, int i11) {
                ck.p.j(str, "successCallback");
                ck.p.j(str2, "failCallback");
                ck.p.j(eVar, C3426d4.i.f28552m);
                ck.p.j(str3, "demandSourceName");
                ck.p.j(str4, "url");
                ck.p.j(c0290a, C3444e4.f28731f);
                this.f31348b = str;
                this.f31349c = str2;
                this.f31350d = eVar;
                this.f31351e = str3;
                this.f31352f = str4;
                this.f31353g = c0290a;
                this.f31354h = i10;
                this.f31355i = i11;
            }

            @Override // com.ironsource.InterfaceC3724u1.a
            public String b() {
                return this.f31352f;
            }

            @Override // com.ironsource.InterfaceC3724u1
            public String c() {
                return this.f31349c;
            }

            @Override // com.ironsource.InterfaceC3724u1
            public C3714t8.e d() {
                return this.f31350d;
            }

            @Override // com.ironsource.InterfaceC3724u1
            public String e() {
                return this.f31351e;
            }

            public final String f() {
                return this.f31348b;
            }

            public final String g() {
                return this.f31349c;
            }

            public final C3714t8.e h() {
                return this.f31350d;
            }

            public int hashCode() {
                return (((((((((((((this.f31348b.hashCode() * 31) + this.f31349c.hashCode()) * 31) + this.f31350d.hashCode()) * 31) + this.f31351e.hashCode()) * 31) + this.f31352f.hashCode()) * 31) + this.f31353g.hashCode()) * 31) + Integer.hashCode(this.f31354h)) * 31) + Integer.hashCode(this.f31355i);
            }

            public final String i() {
                return this.f31351e;
            }

            public final String j() {
                return this.f31352f;
            }

            public final C0290a k() {
                return this.f31353g;
            }

            public final int l() {
                return this.f31354h;
            }

            public final int m() {
                return this.f31355i;
            }

            public final int n() {
                return this.f31354h;
            }

            public final C0290a o() {
                return this.f31353g;
            }

            public final int p() {
                return this.f31355i;
            }

            public String toString() {
                return "Click(successCallback=" + this.f31348b + ", failCallback=" + this.f31349c + ", productType=" + this.f31350d + ", demandSourceName=" + this.f31351e + ", url=" + this.f31352f + ", coordinates=" + this.f31353g + ", action=" + this.f31354h + ", metaState=" + this.f31355i + ")";
            }

            @Override // com.ironsource.InterfaceC3724u1
            public String a() {
                return this.f31348b;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.u1$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f31358b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f31359c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final C3714t8.e f31360d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final String f31361e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final String f31362f;

            public final b a(String str, String str2, C3714t8.e eVar, String str3, String str4) {
                ck.p.j(str, "successCallback");
                ck.p.j(str2, "failCallback");
                ck.p.j(eVar, C3426d4.i.f28552m);
                ck.p.j(str3, "demandSourceName");
                ck.p.j(str4, "url");
                return new b(str, str2, eVar, str3, str4);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return ck.p.e(this.f31358b, bVar.f31358b) && ck.p.e(this.f31359c, bVar.f31359c) && this.f31360d == bVar.f31360d && ck.p.e(this.f31361e, bVar.f31361e) && ck.p.e(this.f31362f, bVar.f31362f);
            }

            public b(String str, String str2, C3714t8.e eVar, String str3, String str4) {
                ck.p.j(str, "successCallback");
                ck.p.j(str2, "failCallback");
                ck.p.j(eVar, C3426d4.i.f28552m);
                ck.p.j(str3, "demandSourceName");
                ck.p.j(str4, "url");
                this.f31358b = str;
                this.f31359c = str2;
                this.f31360d = eVar;
                this.f31361e = str3;
                this.f31362f = str4;
            }

            public static /* synthetic */ b a(b bVar, String str, String str2, C3714t8.e eVar, String str3, String str4, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = bVar.f31358b;
                }
                if ((i10 & 2) != 0) {
                    str2 = bVar.f31359c;
                }
                String str5 = str2;
                if ((i10 & 4) != 0) {
                    eVar = bVar.f31360d;
                }
                C3714t8.e eVar2 = eVar;
                if ((i10 & 8) != 0) {
                    str3 = bVar.f31361e;
                }
                String str6 = str3;
                if ((i10 & 16) != 0) {
                    str4 = bVar.f31362f;
                }
                return bVar.a(str, str5, eVar2, str6, str4);
            }

            @Override // com.ironsource.InterfaceC3724u1.a
            public String b() {
                return this.f31362f;
            }

            @Override // com.ironsource.InterfaceC3724u1
            public String c() {
                return this.f31359c;
            }

            @Override // com.ironsource.InterfaceC3724u1
            public C3714t8.e d() {
                return this.f31360d;
            }

            @Override // com.ironsource.InterfaceC3724u1
            public String e() {
                return this.f31361e;
            }

            public final String f() {
                return this.f31358b;
            }

            public final String g() {
                return this.f31359c;
            }

            public final C3714t8.e h() {
                return this.f31360d;
            }

            public int hashCode() {
                return (((((((this.f31358b.hashCode() * 31) + this.f31359c.hashCode()) * 31) + this.f31360d.hashCode()) * 31) + this.f31361e.hashCode()) * 31) + this.f31362f.hashCode();
            }

            public final String i() {
                return this.f31361e;
            }

            public final String j() {
                return this.f31362f;
            }

            public String toString() {
                return "Impression(successCallback=" + this.f31358b + ", failCallback=" + this.f31359c + ", productType=" + this.f31360d + ", demandSourceName=" + this.f31361e + ", url=" + this.f31362f + ")";
            }

            @Override // com.ironsource.InterfaceC3724u1
            public String a() {
                return this.f31358b;
            }
        }

        String b();
    }

    String a();

    String c();

    C3714t8.e d();

    String e();

    /* JADX INFO: renamed from: com.ironsource.u1$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f31363a = new b();

        public final InterfaceC3724u1 a(String str) throws JSONException {
            ck.p.j(str, "jsonString");
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
            String strOptString = jSONObjectJsonObjectInit.optString("type", "none");
            if (ck.p.e(strOptString, C3444e4.f28728c)) {
                return a(jSONObjectJsonObjectInit);
            }
            throw new IllegalArgumentException("unsupported message type: " + strOptString);
        }

        private b() {
        }

        private final a a(JSONObject jSONObject) throws JSONException {
            String string = jSONObject.getString("success");
            String string2 = jSONObject.getString(C3426d4.g.f28496e);
            String string3 = jSONObject.getString("demandSourceName");
            String string4 = jSONObject.getString(C3426d4.i.f28552m);
            ck.p.i(string4, "json.getString(ParametersKeys.PRODUCT_TYPE)");
            C3714t8.e eVarValueOf = C3714t8.e.valueOf(string4);
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            String string5 = jSONObject2.getString("url");
            String strOptString = jSONObject2.optString("type");
            if (ck.p.e(strOptString, "click")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(C3444e4.f28731f);
                int i10 = jSONObject3.getInt(C3444e4.f28732g);
                int i11 = jSONObject3.getInt(C3444e4.f28733h);
                int iOptInt = jSONObject2.optInt("action", 0);
                int iOptInt2 = jSONObject2.optInt(C3444e4.f28735j, 0);
                ck.p.i(string, "successCallback");
                ck.p.i(string2, "failCallback");
                ck.p.i(string3, "demandSourceName");
                ck.p.i(string5, "url");
                return new a.C0289a(string, string2, eVarValueOf, string3, string5, new a.C0289a.C0290a(i10, i11), iOptInt, iOptInt2);
            }
            if (ck.p.e(strOptString, "impression")) {
                ck.p.i(string, "successCallback");
                ck.p.i(string2, "failCallback");
                ck.p.i(string3, "demandSourceName");
                ck.p.i(string5, "url");
                return new a.b(string, string2, eVarValueOf, string3, string5);
            }
            throw new IllegalArgumentException("JSON does not contain valid type: " + jSONObject2.optString("type"));
        }
    }

    static InterfaceC3724u1 a(String str) {
        return f31347a.a(str);
    }
}
