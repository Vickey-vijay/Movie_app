package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class r7 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f8979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w7 f8980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f8981e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f8982f = new HashMap();

    public static r7 a(p8 p8Var, r7 r7Var, s7 s7Var, com.applovin.impl.sdk.k kVar) {
        p8 p8VarC;
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (r7Var == null) {
            try {
                r7Var = new r7();
            } catch (Throwable th2) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastCompanionAd", "Error occurred while initializing", th2);
                }
                kVar.D().a("VastCompanionAd", th2);
                return null;
            }
        }
        if (r7Var.f8977a == 0 && r7Var.f8978b == 0) {
            int i10 = StringUtils.parseInt((String) p8Var.a().get("width"));
            int i11 = StringUtils.parseInt((String) p8Var.a().get("height"));
            if (i10 > 0 && i11 > 0) {
                r7Var.f8977a = i10;
                r7Var.f8978b = i11;
            }
        }
        r7Var.f8980d = w7.a(p8Var, r7Var.f8980d, kVar);
        if (r7Var.f8979c == null && (p8VarC = p8Var.c(VastTagName.COMPANION_CLICK_THROUGH)) != null) {
            String strD = p8VarC.d();
            if (StringUtils.isValidString(strD)) {
                r7Var.f8979c = Uri.parse(strD);
            }
        }
        a8.a(p8Var.a(VastTagName.COMPANION_CLICK_TRACKING), r7Var.f8981e, s7Var, kVar);
        a8.a(p8Var, r7Var.f8982f, s7Var, kVar);
        return r7Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7)) {
            return false;
        }
        r7 r7Var = (r7) obj;
        if (this.f8977a != r7Var.f8977a || this.f8978b != r7Var.f8978b) {
            return false;
        }
        Uri uri = this.f8979c;
        if (uri == null ? r7Var.f8979c != null : !uri.equals(r7Var.f8979c)) {
            return false;
        }
        w7 w7Var = this.f8980d;
        if (w7Var == null ? r7Var.f8980d != null : !w7Var.equals(r7Var.f8980d)) {
            return false;
        }
        Set set = this.f8981e;
        if (set == null ? r7Var.f8981e != null : !set.equals(r7Var.f8981e)) {
            return false;
        }
        Map map = this.f8982f;
        Map map2 = r7Var.f8982f;
        if (map != null) {
            return map.equals(map2);
        }
        return map2 == null;
    }

    public Set b() {
        return this.f8981e;
    }

    public Uri c() {
        return this.f8979c;
    }

    public Map d() {
        return this.f8982f;
    }

    public w7 e() {
        return this.f8980d;
    }

    public int hashCode() {
        int i10 = ((this.f8977a * 31) + this.f8978b) * 31;
        Uri uri = this.f8979c;
        int iHashCode = (i10 + (uri != null ? uri.hashCode() : 0)) * 31;
        w7 w7Var = this.f8980d;
        int iHashCode2 = (iHashCode + (w7Var != null ? w7Var.hashCode() : 0)) * 31;
        Set set = this.f8981e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f8982f;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f8977a + ", height=" + this.f8978b + ", destinationUri=" + this.f8979c + ", nonVideoResource=" + this.f8980d + ", clickTrackers=" + this.f8981e + ", eventTrackers=" + this.f8982f + '}';
    }

    private r7() {
    }

    public static r7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        int i10 = JsonUtils.getInt(jSONObject, "width", 0);
        int i11 = JsonUtils.getInt(jSONObject, "height", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        Uri uri = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        w7 w7VarA = w7.a(JsonUtils.getJSONObject(jSONObject, "non_video_resource", (JSONObject) null), kVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            y7 y7VarA = y7.a(JsonUtils.getJSONObject(jSONArray, i12, (JSONObject) null), kVar);
            if (y7VarA != null) {
                hashSet.add(y7VarA);
            }
        }
        r7 r7Var = new r7();
        r7Var.f8977a = i10;
        r7Var.f8978b = i11;
        r7Var.f8979c = uri;
        r7Var.f8980d = w7VarA;
        r7Var.f8981e.addAll(hashSet);
        return r7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "width", this.f8977a);
        JsonUtils.putInt(jSONObject, "height", this.f8978b);
        Uri uri = this.f8979c;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        w7 w7Var = this.f8980d;
        JsonUtils.putJSONObject(jSONObject, "non_video_resource", w7Var != null ? w7Var.a() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f8981e.iterator();
        while (it.hasNext()) {
            jSONArray.put(((y7) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        return jSONObject;
    }
}
