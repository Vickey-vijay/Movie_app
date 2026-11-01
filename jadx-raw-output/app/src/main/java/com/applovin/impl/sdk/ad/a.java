package com.applovin.impl.sdk.ad;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.util.Consumer;
import com.applovin.impl.g4;
import com.applovin.impl.h5;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f9136n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f9137o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f9138p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final g4 f9139q;

    public void a(List list) {
        String strG1 = g1();
        if (CollectionUtils.isEmpty(list) || TextUtils.isEmpty(strG1)) {
            return;
        }
        Map mapL = l();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String string = ((Uri) it.next()).toString();
            String str = (String) mapL.get(string);
            if (StringUtils.isValidString(str)) {
                strG1 = StringUtils.replace(strG1, string, str);
            }
        }
        d(strG1);
    }

    public Uri e1() {
        String stringFromAdObject = getStringFromAdObject("click_url", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    private String j1() {
        return getStringFromAdObject("stream_url", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(h5 h5Var) {
        h5Var.b(CreativeInfo.f44315al, this.f9136n);
        h5Var.b("stream_url", this.f9138p);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean C0() {
        return containsKeyForAdObject("stream_url");
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void E0() {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.a(new Consumer() { // from class: com.applovin.impl.sdk.ad.d
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.f9172b.s((h5) obj);
                }
            });
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, CreativeInfo.f44315al, this.f9136n);
            JsonUtils.putString(this.adObject, "stream_url", this.f9138p);
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String I() {
        return this.f9137o;
    }

    public void c(Uri uri) {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.b("video", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "video", uri.toString());
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri c0() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return StringUtils.isValidString(stringFromAdObject) ? Uri.parse(stringFromAdObject) : e1();
    }

    public void d(String str) {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.b(CreativeInfo.f44315al, str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, CreativeInfo.f44315al, str);
        }
    }

    public com.applovin.impl.adview.e.a f1() {
        return a(getIntFromAdObject("expandable_style", com.applovin.impl.adview.e.a.INVISIBLE.b()));
    }

    public String g1() {
        return getStringFromAdObject(CreativeInfo.f44315al, "");
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.e4
    public g4 getAdEventTracker() {
        return this.f9139q;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        JSONObject jSONObjectDeepCopy;
        JSONObject jSONObjectA;
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            jSONObjectA = h5Var.a();
        } else {
            synchronized (this.fullResponseLock) {
                jSONObjectDeepCopy = JsonUtils.deepCopy(this.fullResponse);
            }
            jSONObjectA = jSONObjectDeepCopy;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObjectA, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
            JsonUtils.putString(jSONObject, CreativeInfo.f44315al, this.f9136n);
            JsonUtils.putString(jSONObject, "video", this.f9137o);
            JsonUtils.putString(jSONObject, "stream_url", this.f9138p);
        }
        return jSONObjectA;
    }

    public float h1() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    public String i1() {
        return this.f9138p;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.e4
    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.e0().e()) {
            return true;
        }
        return getBooleanFromAdObject(UnifiedMediationParams.KEY_OM_SDK_ENABLED, Boolean.FALSE);
    }

    public String k1() {
        return getStringFromAdObject("video", "");
    }

    public boolean l1() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", Boolean.FALSE);
        }
        return true;
    }

    public void m1() {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.c("stream_url");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean y0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    public a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(jSONObject, jSONObject2, kVar);
        this.f9136n = g1();
        this.f9137o = k1();
        this.f9138p = j1();
        this.f9139q = new g4(this);
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        if (l0() != null) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri l0() {
        String strJ1 = j1();
        if (StringUtils.isValidString(strJ1)) {
            return Uri.parse(strJ1);
        }
        String strK1 = k1();
        if (StringUtils.isValidString(strK1)) {
            return Uri.parse(strK1);
        }
        return null;
    }

    public static a a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        if (jSONObject == null || (jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null)) == null || (jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray()), 0, (JSONObject) null)) == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject3, CreativeInfo.f44315al, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String string2 = JsonUtils.getString(jSONObject3, "video", "");
        JsonUtils.putString(jSONObject3, CreativeInfo.f44315al, JsonUtils.getString(jSONObject, "original_html_source", ""));
        JsonUtils.putString(jSONObject3, "video", JsonUtils.getString(jSONObject, "original_video_uri_string", ""));
        a aVar = new a(jSONObject3, jSONObject2, kVar);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject, "cached_ad_html_resources_urls", new JSONObject());
        Iterator<String> itKeys = jSONObject4.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string3 = JsonUtils.getString(jSONObject4, next, null);
            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string3)) {
                aVar.a(next, string3);
            }
        }
        aVar.d(string);
        if (StringUtils.isValidString(string2)) {
            aVar.c(Uri.parse(string2));
        }
        return aVar;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "original_html_source", this.f9136n);
        JsonUtils.putString(jSONObject, "original_video_uri_string", this.f9137o);
        JsonUtils.putString(jSONObject, "original_video_stream_uri_string", this.f9138p);
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : l().entrySet()) {
            JsonUtils.putString(jSONObject2, (String) entry.getKey(), (String) entry.getValue());
        }
        JsonUtils.putJSONObject(jSONObject, "cached_ad_html_resources_urls", jSONObject2);
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            JsonUtils.putJSONObject(jSONObject, "full_response", h5Var.a());
        } else {
            synchronized (this.fullResponseLock) {
                JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
            }
        }
        return jSONObject;
    }
}
