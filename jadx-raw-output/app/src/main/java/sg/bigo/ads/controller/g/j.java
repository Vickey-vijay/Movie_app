package sg.bigo.ads.controller.g;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends b {
    public j(@NonNull sg.bigo.ads.api.a.h hVar, @NonNull sg.bigo.ads.common.g gVar, @NonNull sg.bigo.ads.controller.a.b bVar, @NonNull sg.bigo.ads.api.b bVar2, @NonNull sg.bigo.ads.api.a.l lVar, @NonNull sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.api.a.l> eVar) {
        super(hVar, gVar, bVar, bVar2, lVar, eVar);
    }

    @Override // sg.bigo.ads.controller.g.b, sg.bigo.ads.controller.g.a
    public final void a(@NonNull String str, @NonNull Map<String, Object> map) {
        sg.bigo.ads.controller.c.b bVarA;
        if (this.f70916m != null) {
            Object obj = map.get("logid");
            long jLongValue = obj instanceof Long ? ((Long) obj).longValue() : 0L;
            try {
                JSONObject jSONObject = new JSONObject(str);
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null && (bVarA = sg.bigo.ads.controller.c.b.a(jLongValue, k().f69326h, this.f70915l, jSONObjectOptJSONObject)) != null) {
                        arrayList.add(bVarA);
                    }
                }
                if (sg.bigo.ads.common.utils.k.a((Collection) arrayList)) {
                    a(1005, 0, "empty ad data.");
                } else {
                    this.f70916m.a(a(), this.f70914k, (sg.bigo.ads.controller.c.b[]) arrayList.toArray(new sg.bigo.ads.controller.c.b[arrayList.size()]));
                }
            } catch (JSONException unused) {
                a(1005, 0, "Invalid ad data.");
            }
        }
    }

    @Override // sg.bigo.ads.controller.g.b, sg.bigo.ads.controller.g.a
    public final void i() {
        sg.bigo.ads.common.x.a.A();
    }

    @Override // sg.bigo.ads.controller.g.b, sg.bigo.ads.controller.g.a
    public final boolean j() {
        return sg.bigo.ads.api.a.i.f69318a.e() && sg.bigo.ads.common.x.a.z();
    }

    @Override // sg.bigo.ads.controller.g.b, sg.bigo.ads.controller.g.a
    @NonNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final sg.bigo.ads.controller.a.f f() {
        return this.f70895c.b("/Ad/GetUniIconAds", null);
    }
}
