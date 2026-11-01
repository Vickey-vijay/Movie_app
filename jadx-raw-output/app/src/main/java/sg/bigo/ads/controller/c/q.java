package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements sg.bigo.ads.api.core.b.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f70712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f70713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f70714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f70715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f70716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f70717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f70718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String[] f70719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String[] f70720i;

    public q(@NonNull JSONObject jSONObject) {
        this.f70712a = jSONObject;
        this.f70713b = jSONObject.optInt("type", 0);
        this.f70714c = jSONObject.optString("value", "");
        this.f70715d = jSONObject.optString("name", "");
        this.f70716e = jSONObject.optString(CommonUrlParts.UUID, "");
        this.f70717f = jSONObject.optInt("replace", 0);
        this.f70718g = jSONObject.optInt("norepeat", 0);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reg");
        if (jSONArrayOptJSONArray == null) {
            this.f70719h = new String[0];
            this.f70720i = new String[0];
            return;
        }
        this.f70719h = new String[jSONArrayOptJSONArray.length()];
        this.f70720i = new String[jSONArrayOptJSONArray.length()];
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null) {
                this.f70719h[i10] = jSONObjectOptJSONObject.optString("token", "");
                this.f70720i[i10] = jSONObjectOptJSONObject.optString("value", "");
            }
        }
    }

    @Override // sg.bigo.ads.api.core.b.f
    public final JSONObject a() {
        return this.f70712a;
    }
}
