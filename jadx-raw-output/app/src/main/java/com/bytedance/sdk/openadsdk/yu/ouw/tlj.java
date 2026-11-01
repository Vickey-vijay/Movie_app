package com.bytedance.sdk.openadsdk.yu.ouw;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class tlj implements com.bytedance.sdk.openadsdk.rn.vt {
    private final com.bytedance.sdk.component.le.ouw.le.yu ouw;
    private final boolean vt;

    @Override // com.bytedance.sdk.openadsdk.rn.vt
    @Nullable
    public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
        int i10;
        if (this.ouw == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.vt);
        jSONObject.put("url", this.ouw.vt);
        int i11 = this.ouw.yu;
        if (i11 <= 0) {
            i11 = 0;
        }
        jSONObject.put("retry_times", i11);
        jSONObject.put(CreativeInfo.f44321c, this.ouw.f11780le);
        jSONObject.put("track_type", this.ouw.fkw);
        if (this.vt) {
            com.bytedance.sdk.component.le.ouw.le.yu yuVar = this.ouw;
            i10 = yuVar.f11779cf ? 3 : yuVar.yu <= 0 ? 1 : 2;
        } else {
            i10 = 4;
        }
        jSONObject.put("upload_scene", i10);
        String str = this.ouw.f11782ra;
        if (!TextUtils.isEmpty(str)) {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : str.split(StringUtils.COMMA)) {
                jSONArray.put(str2);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String str3 = this.ouw.pno;
        if (!TextUtils.isEmpty(str3)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str4 : str3.split(StringUtils.COMMA)) {
                jSONArray2.put(str4);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar2 = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
        yuVar2.ouw = "track_link_result";
        yuVar2.bly = jSONObject.toString();
        return yuVar2;
    }

    public tlj(boolean z10, com.bytedance.sdk.component.le.ouw.le.yu yuVar) {
        this.ouw = yuVar;
        this.vt = z10;
    }
}
