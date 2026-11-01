package com.ironsource.sdk.controller;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public interface f {

    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0284a f30914c = new C0284a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final JSONObject f30916b;

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.f$a$a, reason: collision with other inner class name */
        public static final class C0284a {
            public /* synthetic */ C0284a(ck.i iVar) {
                this();
            }

            private C0284a() {
            }

            public final a a(String str) throws JSONException {
                ck.p.j(str, "jsonStr");
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
                String string = jSONObjectJsonObjectInit.getString(b.f30918b);
                JSONObject jSONObjectOptJSONObject = jSONObjectJsonObjectInit.optJSONObject("params");
                ck.p.i(string, "id");
                return new a(string, jSONObjectOptJSONObject);
            }
        }

        public final String a() {
            return this.f30915a;
        }

        public final JSONObject b() {
            return this.f30916b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return ck.p.e(this.f30915a, aVar.f30915a) && ck.p.e(this.f30916b, aVar.f30916b);
        }

        public int hashCode() {
            int iHashCode = this.f30915a.hashCode() * 31;
            JSONObject jSONObject = this.f30916b;
            return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        public String toString() {
            return "CallbackToNative(msgId=" + this.f30915a + ", params=" + this.f30916b + ")";
        }

        public a(String str, JSONObject jSONObject) {
            ck.p.j(str, b.f30918b);
            this.f30915a = str;
            this.f30916b = jSONObject;
        }

        public final a a(String str, JSONObject jSONObject) {
            ck.p.j(str, b.f30918b);
            return new a(str, jSONObject);
        }

        public final String c() {
            return this.f30915a;
        }

        public final JSONObject d() {
            return this.f30916b;
        }

        public static /* synthetic */ a a(a aVar, String str, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f30915a;
            }
            if ((i10 & 2) != 0) {
                jSONObject = aVar.f30916b;
            }
            return aVar.a(str, jSONObject);
        }

        public static final a a(String str) throws JSONException {
            return f30914c.a(str);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final JSONObject f30926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f30927d;

        public final String a() {
            return this.f30924a;
        }

        public final String b() {
            return this.f30925b;
        }

        public final JSONObject c() {
            return this.f30926c;
        }

        public String toString() {
            return "MessageToController(adId=" + this.f30924a + ", command=" + this.f30925b + ", params=" + this.f30926c + ")";
        }

        public c(String str, String str2, JSONObject jSONObject) {
            ck.p.j(str, b.f30919c);
            ck.p.j(str2, b.f30923g);
            ck.p.j(jSONObject, "params");
            this.f30924a = str;
            this.f30925b = str2;
            this.f30926c = jSONObject;
            String string = UUID.randomUUID().toString();
            ck.p.i(string, "randomUUID().toString()");
            this.f30927d = string;
        }

        public final c a(String str, String str2, JSONObject jSONObject) {
            ck.p.j(str, b.f30919c);
            ck.p.j(str2, b.f30923g);
            ck.p.j(jSONObject, "params");
            return new c(str, str2, jSONObject);
        }

        public final String d() {
            return this.f30924a;
        }

        public final String e() {
            return this.f30925b;
        }

        public boolean equals(Object obj) {
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar == null) {
                return false;
            }
            if (this == cVar) {
                return true;
            }
            return ck.p.e(this.f30927d, cVar.f30927d) && ck.p.e(this.f30924a, cVar.f30924a) && ck.p.e(this.f30925b, cVar.f30925b) && ck.p.e(this.f30926c.toString(), cVar.f30926c.toString());
        }

        public final String f() {
            return this.f30927d;
        }

        public final JSONObject g() {
            return this.f30926c;
        }

        public static /* synthetic */ c a(c cVar, String str, String str2, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cVar.f30924a;
            }
            if ((i10 & 2) != 0) {
                str2 = cVar.f30925b;
            }
            if ((i10 & 4) != 0) {
                jSONObject = cVar.f30926c;
            }
            return cVar.a(str, str2, jSONObject);
        }

        public int hashCode() {
            return super.hashCode();
        }

        public final void a(String str) {
            ck.p.j(str, "<set-?>");
            this.f30927d = str;
        }

        public final String h() {
            String string = IronSourceVideoBridge.jsonObjectInit().put(b.f30918b, this.f30927d).put(b.f30919c, this.f30924a).put("params", this.f30926c).toString();
            ck.p.i(string, "JSONObject()\n          .…ms)\n          .toString()");
            return string;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30917a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f30918b = "msgId";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f30919c = "adId";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f30920d = "params";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f30921e = "success";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f30922f = "reason";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f30923g = "command";

        private b() {
        }
    }
}
