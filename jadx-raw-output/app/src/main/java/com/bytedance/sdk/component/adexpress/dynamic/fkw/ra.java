package com.bytedance.sdk.component.adexpress.dynamic.fkw;

import com.bytedance.sdk.component.adexpress.vt.mwh;
import com.bytedance.sdk.component.utils.ko;
import com.safedk.android.internal.partials.PangleVideoBridge;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class ra implements pno {
    private com.bytedance.sdk.component.adexpress.dynamic.le.vt ouw;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fkw.pno
    public final void ouw(com.bytedance.sdk.component.adexpress.dynamic.le.vt vtVar) {
        this.ouw = vtVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fkw.pno
    public final void ouw(final mwh mwhVar) {
        if (mwhVar.pno != 1) {
            com.bytedance.sdk.component.adexpress.yu.yu.ouw(new com.bytedance.sdk.component.pno.pno("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.fkw.ra.1
                @Override // java.lang.Runnable
                public final void run() {
                    ko.vt("DynamicNativeParser", "parse on non ui thread");
                    ra.this.vt(mwhVar);
                }
            }, 5);
        } else {
            ko.vt("DynamicNativeParser", "parse on ui thread");
            vt(mwhVar);
        }
    }

    public final void vt(mwh mwhVar) {
        try {
            JSONObject jSONObjectOuw = mwhVar.ouw();
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(jSONObjectOuw.optString("template_Plugin"));
            JSONObject jSONObjectOptJSONObject = jSONObjectOuw.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVarOuw = new le(jSONObjectJsonObjectInit, jSONObjectOptJSONObject, jSONObjectOuw.optJSONObject("AdSize"), PangleVideoBridge.jsonObjectInit(jSONObjectOuw.optString("diff_template_Plugin"))).ouw(mwhVar.f11601rn, mwhVar.f11596le, jSONObjectOptJSONObject.optDouble("score_exact_i18n"), jSONObjectOptJSONObject.optString("comment_num_i18n"), mwhVar);
            try {
                JSONObject jSONObjectJsonObjectInit2 = PangleVideoBridge.jsonObjectInit(jSONObjectOptJSONObject.optString("dynamic_creative"));
                pnoVarOuw.mwh = jSONObjectJsonObjectInit2.optString("color");
                pnoVarOuw.ouw(jSONObjectJsonObjectInit2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.ouw.ouw(pnoVarOuw);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
