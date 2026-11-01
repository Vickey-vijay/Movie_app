package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Nb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f27100d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f27103c;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        public final Nb a(String str) throws JSONException {
            ck.p.j(str, "jsonStr");
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
            String string = jSONObjectJsonObjectInit.getString(com.ironsource.sdk.controller.f.b.f30919c);
            String string2 = jSONObjectJsonObjectInit.getString(com.ironsource.sdk.controller.f.b.f30923g);
            JSONObject jSONObjectOptJSONObject = jSONObjectJsonObjectInit.optJSONObject("params");
            ck.p.i(string, com.ironsource.sdk.controller.f.b.f30919c);
            ck.p.i(string2, com.ironsource.sdk.controller.f.b.f30923g);
            return new Nb(string, string2, jSONObjectOptJSONObject);
        }
    }

    public final String a() {
        return this.f27101a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nb)) {
            return false;
        }
        Nb nb2 = (Nb) obj;
        return ck.p.e(this.f27101a, nb2.f27101a) && ck.p.e(this.f27102b, nb2.f27102b) && ck.p.e(this.f27103c, nb2.f27103c);
    }

    public Nb(String str, String str2, JSONObject jSONObject) {
        ck.p.j(str, com.ironsource.sdk.controller.f.b.f30919c);
        ck.p.j(str2, com.ironsource.sdk.controller.f.b.f30923g);
        this.f27101a = str;
        this.f27102b = str2;
        this.f27103c = jSONObject;
    }

    public final Nb a(String str, String str2, JSONObject jSONObject) {
        ck.p.j(str, com.ironsource.sdk.controller.f.b.f30919c);
        ck.p.j(str2, com.ironsource.sdk.controller.f.b.f30923g);
        return new Nb(str, str2, jSONObject);
    }

    public final String b() {
        return this.f27102b;
    }

    public final JSONObject c() {
        return this.f27103c;
    }

    public final String d() {
        return this.f27101a;
    }

    public final String e() {
        return this.f27102b;
    }

    public final JSONObject f() {
        return this.f27103c;
    }

    public int hashCode() {
        int iHashCode = ((this.f27101a.hashCode() * 31) + this.f27102b.hashCode()) * 31;
        JSONObject jSONObject = this.f27103c;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "MessageToNative(adId=" + this.f27101a + ", command=" + this.f27102b + ", params=" + this.f27103c + ")";
    }

    public static /* synthetic */ Nb a(Nb nb2, String str, String str2, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = nb2.f27101a;
        }
        if ((i10 & 2) != 0) {
            str2 = nb2.f27102b;
        }
        if ((i10 & 4) != 0) {
            jSONObject = nb2.f27103c;
        }
        return nb2.a(str, str2, jSONObject);
    }

    public static final Nb a(String str) throws JSONException {
        return f27100d.a(str);
    }
}
