package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public interface vpp<T> {

    public interface ouw {
        void ouw(int i10, String str);

        void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar);
    }

    public interface vt {
        void ouw(int i10, String str);

        void ouw(jqy.vt vtVar);
    }

    com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouw();

    com.bytedance.sdk.openadsdk.yu.fkw ouw(JSONObject jSONObject, String str);

    JSONObject ouw(JSONObject jSONObject);

    void ouw(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ksc kscVar, int i10, qbp qbpVar);

    void ouw(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ksc kscVar, int i10, ouw ouwVar);

    void ouw(String str);

    void ouw(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3);

    void ouw(JSONObject jSONObject, vt vtVar);

    com.bytedance.sdk.openadsdk.yu.fkw vt(JSONObject jSONObject);

    void vt(JSONObject jSONObject, String str);
}
