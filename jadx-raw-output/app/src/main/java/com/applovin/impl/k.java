package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import com.safedk.android.internal.partials.AppLovinVideoBridge;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7788b;

    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7793a;

        @Override // java.lang.Enum
        public String toString() {
            return this.f7793a;
        }

        a(String str) {
            this.f7793a = str;
        }
    }

    public JSONObject a() {
        if (c() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(AppLovinVideoBridge.stringInit(Base64.decode(this.f7788b.substring(d().length()), 0), "UTF-8"));
                this.f7787a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7787a.O().a("AdToken", "Decoded token into ad response: " + jSONObject);
                }
                return jSONObject;
            } catch (JSONException e10) {
                this.f7787a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7787a.O().a("AdToken", "Unable to decode token '" + this.f7788b + "' into JSON", e10);
                }
                this.f7787a.D().a("AdToken", "decodeFullAdResponseStr", e10);
                return null;
            }
        } catch (UnsupportedEncodingException e11) {
            this.f7787a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7787a.O().a("AdToken", "Unable to process ad response from token '" + this.f7788b + "'", e11);
            }
            this.f7787a.D().a("AdToken", "decodeFullAdResponse", e11);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        String str = this.f7788b;
        String str2 = ((k) obj).f7788b;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public String b() {
        return this.f7788b;
    }

    public a c() {
        if (a(x4.f10070x0) != null) {
            return a.REGULAR;
        }
        return a(x4.f10078y0) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    public String d() {
        String strA = a(x4.f10070x0);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strA2 = a(x4.f10078y0);
        if (TextUtils.isEmpty(strA2)) {
            return null;
        }
        return strA2;
    }

    public int hashCode() {
        String str = this.f7788b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AdToken{id=" + StringUtils.prefixToIndex(32, this.f7788b) + ", type=" + c() + '}';
    }

    public k(String str, com.applovin.impl.sdk.k kVar) {
        if (!TextUtils.isEmpty(str)) {
            if (kVar != null) {
                this.f7788b = str;
                this.f7787a = kVar;
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("Identifier is empty");
    }

    private String a(x4 x4Var) {
        for (String str : this.f7787a.c(x4Var)) {
            if (this.f7788b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
