package com.bytedance.sdk.openadsdk.ryl.ouw;

import com.bytedance.sdk.openadsdk.core.bs;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class tlj extends com.bytedance.sdk.component.ouw.vm<JSONObject, JSONObject> {
    public static final HashSet<String> yu = new HashSet<>(Arrays.asList("endcardDynamicCreatives", "multiOpenCovert", "speedVideoOrTimer", "openPlayable", "skipToNextAd"));
    private final bs fkw;

    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* synthetic */ Object ouw(String str, Object obj) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        if ("endcardDynamicCreatives".equals(str)) {
            return this.fkw.fkw();
        }
        if ("multiOpenCovert".equals(str)) {
            this.fkw.yu(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(str)) {
            this.fkw.ouw(jSONObject, str);
            return null;
        }
        if ("speedVideoOrTimer".equals(str)) {
            return this.fkw.lh(jSONObject);
        }
        if ("openPlayable".equals(str)) {
            return this.fkw.yu();
        }
        return null;
    }

    private tlj(bs bsVar) {
        this.fkw = bsVar;
    }

    public static void ouw(com.bytedance.sdk.component.ouw.ko koVar, bs bsVar) {
        koVar.ouw(yu, new tlj(bsVar));
    }
}
