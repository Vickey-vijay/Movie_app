package com.bytedance.sdk.openadsdk.ryl.ouw;

import com.bytedance.sdk.openadsdk.core.bs;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class bly extends com.bytedance.sdk.component.ouw.yu<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final bs f13324lh;
    private String yu;

    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* synthetic */ JSONObject ouw(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = jSONObject;
        if ("endcardDynamicCreatives".equals(this.yu)) {
            return this.f13324lh.fkw();
        }
        if ("multiOpenCovert".equals(this.yu)) {
            this.f13324lh.yu(jSONObject2);
            return null;
        }
        if ("skipToNextAd".equals(this.yu)) {
            this.f13324lh.ouw(jSONObject2, this.yu);
            return null;
        }
        if ("speedVideoOrTimer".equals(this.yu)) {
            return this.f13324lh.lh(jSONObject2);
        }
        if ("openPlayable".equals(this.yu)) {
            return this.f13324lh.yu();
        }
        return null;
    }

    public bly(bs bsVar, String str) {
        this.f13324lh = bsVar;
        this.yu = str;
    }
}
