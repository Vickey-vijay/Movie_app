package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class c8 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f7133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f7134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f7135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f7136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f7139g;

    public enum a {
        Progressive,
        Streaming
    }

    public static c8 a(p8 p8Var, com.applovin.impl.sdk.k kVar) {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strD = p8Var.d();
            if (!URLUtil.isValidUrl(strD)) {
                kVar.O();
                if (!com.applovin.impl.sdk.o.a()) {
                    return null;
                }
                kVar.O().b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            }
            Uri uri = Uri.parse(strD);
            c8 c8Var = new c8();
            c8Var.f7133a = uri;
            c8Var.f7134b = uri;
            c8Var.f7139g = a(p8Var);
            c8Var.f7135c = a((String) p8Var.a().get("delivery"));
            c8Var.f7138f = StringUtils.parseInt((String) p8Var.a().get("height"));
            c8Var.f7137e = StringUtils.parseInt((String) p8Var.a().get("width"));
            c8Var.f7136d = ((String) p8Var.a().get("type")).toLowerCase(Locale.ENGLISH);
            return c8Var;
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastVideoFile", "Error occurred while initializing", th2);
            }
            kVar.D().a("VastVideoFile", th2);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        if (this.f7137e != c8Var.f7137e || this.f7138f != c8Var.f7138f || this.f7139g != c8Var.f7139g) {
            return false;
        }
        Uri uri = this.f7133a;
        if (uri == null ? c8Var.f7133a != null : !uri.equals(c8Var.f7133a)) {
            return false;
        }
        Uri uri2 = this.f7134b;
        if (uri2 == null ? c8Var.f7134b != null : !uri2.equals(c8Var.f7134b)) {
            return false;
        }
        if (this.f7135c != c8Var.f7135c) {
            return false;
        }
        String str = this.f7136d;
        String str2 = c8Var.f7136d;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public long b() {
        return this.f7139g;
    }

    public String c() {
        return this.f7136d;
    }

    public Uri d() {
        return this.f7133a;
    }

    public Uri e() {
        return this.f7134b;
    }

    public int hashCode() {
        Uri uri = this.f7133a;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f7134b;
        int iHashCode2 = (iHashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.f7135c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f7136d;
        return ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f7137e) * 31) + this.f7138f) * 31) + Long.valueOf(this.f7139g).hashCode();
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f7133a + ", videoUri=" + this.f7134b + ", deliveryType=" + this.f7135c + ", fileType='" + this.f7136d + "', width=" + this.f7137e + ", height=" + this.f7138f + ", bitrate=" + this.f7139g + '}';
    }

    private c8() {
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    private static long a(p8 p8Var) {
        Map mapA = p8Var.a();
        long j10 = StringUtils.parseLong((String) mapA.get(VastAttributes.BITRATE), 0L);
        return j10 != 0 ? j10 : (StringUtils.parseLong((String) mapA.get(VastAttributes.MIN_BITRATE), 0L) + StringUtils.parseLong((String) mapA.get(VastAttributes.MAX_BITRATE), 0L)) / 2;
    }

    public void a(Uri uri) {
        this.f7134b = uri;
    }

    public static c8 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "source_video_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Uri uri = Uri.parse(string);
        if (TextUtils.isEmpty(JsonUtils.getString(jSONObject, "video_uri", null))) {
            return null;
        }
        Uri uri2 = Uri.parse(string);
        String string2 = JsonUtils.getString(jSONObject, "file_type", null);
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        a aVarValueOf = a.valueOf(JsonUtils.getString(jSONObject, "delivery_type", a.Progressive.toString()));
        int i10 = JsonUtils.getInt(jSONObject, "width", 0);
        int i11 = JsonUtils.getInt(jSONObject, "height", 0);
        int i12 = JsonUtils.getInt(jSONObject, VastAttributes.BITRATE, 0);
        c8 c8Var = new c8();
        c8Var.f7133a = uri;
        c8Var.f7134b = uri2;
        c8Var.f7135c = aVarValueOf;
        c8Var.f7136d = string2;
        c8Var.f7137e = i10;
        c8Var.f7138f = i11;
        c8Var.f7139g = i12;
        return c8Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        Uri uri = this.f7133a;
        if (uri != null) {
            JsonUtils.putString(jSONObject, "source_video_uri", uri.toString());
        }
        Uri uri2 = this.f7134b;
        if (uri2 != null) {
            JsonUtils.putString(jSONObject, "video_uri", uri2.toString());
        }
        a aVar = this.f7135c;
        JsonUtils.putString(jSONObject, "delivery_type", aVar == null ? null : aVar.toString());
        JsonUtils.putString(jSONObject, "file_type", this.f7136d);
        JsonUtils.putInt(jSONObject, "width", this.f7137e);
        JsonUtils.putInt(jSONObject, "height", this.f7138f);
        JsonUtils.putLong(jSONObject, VastAttributes.BITRATE, this.f7139g);
        return jSONObject;
    }
}
