package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements sg.bigo.ads.api.core.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f70648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f70649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Object> f70650c = new ArrayList();

    public f(@NonNull JSONObject jSONObject) {
        this.f70648a = jSONObject.optInt(CampaignEx.JSON_KEY_CLICK_MODE, 2);
        this.f70649b = jSONObject.optInt("wrong_click_time", 500);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reconfirm_click_region");
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    this.f70650c.add(new g(jSONObjectOptJSONObject));
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.core.b.a
    public final int a() {
        return this.f70648a;
    }

    @Override // sg.bigo.ads.api.core.b.a
    public final int b() {
        return this.f70649b;
    }
}
