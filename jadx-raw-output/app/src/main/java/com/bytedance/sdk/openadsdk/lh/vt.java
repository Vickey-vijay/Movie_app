package com.bytedance.sdk.openadsdk.lh;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class vt {
    private static volatile vt ouw;
    private final vpp<com.bytedance.sdk.openadsdk.yu.ouw> vt = zih.lh();

    public static vt ouw() {
        if (ouw == null) {
            synchronized (vt.class) {
                if (ouw == null) {
                    ouw = new vt();
                }
            }
        }
        return ouw;
    }

    private vt() {
    }

    public final void ouw(@NonNull String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        this.vt.ouw(str, list, jSONObject, str2, str3);
    }
}
