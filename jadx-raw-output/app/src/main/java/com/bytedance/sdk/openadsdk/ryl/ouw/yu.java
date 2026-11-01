package com.bytedance.sdk.openadsdk.ryl.ouw;

import com.bytedance.sdk.openadsdk.core.bs;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class yu extends com.bytedance.sdk.component.ouw.yu<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final bs f13341lh;

    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* synthetic */ JSONObject ouw(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = jSONObject;
        bs bsVar = this.f13341lh;
        if (jSONObject2 == null) {
            return null;
        }
        int iOptInt = jSONObject2.optInt("zoom_type", 1);
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("videoInfo");
        com.bytedance.sdk.component.adexpress.vt.jg jgVar = new com.bytedance.sdk.component.adexpress.vt.jg();
        if (jSONObjectOptJSONObject != null) {
            double dOptDouble = jSONObjectOptJSONObject.optDouble(VastAttributes.HORIZONTAL_POSITION);
            double dOptDouble2 = jSONObjectOptJSONObject.optDouble(VastAttributes.VERTICAL_POSITION);
            double dOptDouble3 = jSONObjectOptJSONObject.optDouble("width");
            double dOptDouble4 = jSONObjectOptJSONObject.optDouble("height");
            jgVar.fkw = dOptDouble;
            jgVar.f11587le = dOptDouble2;
            jgVar.f11584cf = dOptDouble3;
            jgVar.ryl = dOptDouble4;
        }
        com.bytedance.sdk.openadsdk.core.bly.ko koVar = bsVar.f12579cf;
        if (koVar == null) {
            return null;
        }
        koVar.ouw(iOptInt, jgVar);
        return null;
    }

    public yu(bs bsVar) {
        this.f13341lh = bsVar;
    }
}
