package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements sg.bigo.ads.api.core.b.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f70689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f70690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f70691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f70692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f70693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f70694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f70695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f70696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f70697i;

    public n(@NonNull JSONObject jSONObject) {
        this.f70689a = jSONObject.optString("icon");
        this.f70690b = jSONObject.optString("title");
        this.f70691c = jSONObject.optString("rate");
        this.f70692d = jSONObject.optString("comments");
        this.f70693e = jSONObject.optString("downloads");
        this.f70694f = jSONObject.optString(UnifiedMediationParams.KEY_DESCRIPTION);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("genre");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            this.f70695g = new String[jSONArrayOptJSONArray.length()];
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                this.f70695g[i10] = jSONArrayOptJSONArray.optString(i10);
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(ImpressionLog.f43644t);
        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
            this.f70696h = new String[jSONArrayOptJSONArray2.length()];
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                this.f70696h[i11] = jSONArrayOptJSONArray2.optString(i11);
            }
        }
        this.f70697i = jSONObject.optString("name");
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String a() {
        return this.f70689a;
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String b() {
        return this.f70690b;
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String c() {
        return this.f70694f;
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String[] d() {
        return this.f70695g;
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String[] e() {
        return this.f70696h;
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String f() {
        return this.f70697i;
    }
}
