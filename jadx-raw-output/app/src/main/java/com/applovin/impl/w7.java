package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import io.bidmachine.iab.vast.tags.VastTagName;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class w7 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f9834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f9835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9836c;

    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    public static w7 a(p8 p8Var, w7 w7Var, com.applovin.impl.sdk.k kVar) {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (w7Var == null) {
            try {
                w7Var = new w7();
            } catch (Throwable th2) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastNonVideoResource", "Error occurred while initializing", th2);
                }
                kVar.D().a("VastNonVideoResource", th2);
                return null;
            }
        }
        if (w7Var.f9835b == null && !StringUtils.isValidString(w7Var.f9836c)) {
            String strA = a(p8Var, VastTagName.STATIC_RESOURCE);
            if (URLUtil.isValidUrl(strA)) {
                w7Var.f9835b = Uri.parse(strA);
                w7Var.f9834a = a.STATIC;
                return w7Var;
            }
            String strA2 = a(p8Var, VastTagName.I_FRAME_RESOURCE);
            if (StringUtils.isValidString(strA2)) {
                w7Var.f9834a = a.IFRAME;
                if (URLUtil.isValidUrl(strA2)) {
                    w7Var.f9835b = Uri.parse(strA2);
                } else {
                    w7Var.f9836c = strA2;
                }
                return w7Var;
            }
            String strA3 = a(p8Var, VastTagName.HTML_RESOURCE);
            if (StringUtils.isValidString(strA3)) {
                w7Var.f9834a = a.HTML;
                if (URLUtil.isValidUrl(strA3)) {
                    w7Var.f9835b = Uri.parse(strA3);
                } else {
                    w7Var.f9836c = strA3;
                }
            }
        }
        return w7Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj;
        if (this.f9834a != w7Var.f9834a) {
            return false;
        }
        Uri uri = this.f9835b;
        if (uri == null ? w7Var.f9835b != null : !uri.equals(w7Var.f9835b)) {
            return false;
        }
        String str = this.f9836c;
        String str2 = w7Var.f9836c;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public String b() {
        return this.f9836c;
    }

    public Uri c() {
        return this.f9835b;
    }

    public a d() {
        return this.f9834a;
    }

    public int hashCode() {
        a aVar = this.f9834a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f9835b;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f9836c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "VastNonVideoResource{type=" + this.f9834a + ", resourceUri=" + this.f9835b + ", resourceContents='" + this.f9836c + "'}";
    }

    private w7() {
    }

    private static String a(p8 p8Var, String str) {
        p8 p8VarC = p8Var.c(str);
        if (p8VarC != null) {
            return p8VarC.d();
        }
        return null;
    }

    public void a(Uri uri) {
        this.f9835b = uri;
    }

    public void a(String str) {
        this.f9836c = str;
    }

    public static w7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "type", null);
        a aVarValueOf = string == null ? null : a.valueOf(string);
        String string2 = JsonUtils.getString(jSONObject, "resource_uri", null);
        Uri uri = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        w7 w7Var = new w7();
        w7Var.f9834a = aVarValueOf;
        w7Var.f9835b = uri;
        w7Var.f9836c = JsonUtils.getString(jSONObject, "resource_contents", null);
        return w7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        a aVar = this.f9834a;
        JsonUtils.putString(jSONObject, "type", aVar == null ? null : aVar.toString());
        Uri uri = this.f9835b;
        JsonUtils.putString(jSONObject, "resource_uri", uri != null ? uri.toString() : null);
        JsonUtils.putString(jSONObject, "resource_contents", this.f9836c);
        return jSONObject;
    }
}
