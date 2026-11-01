package com.bytedance.sdk.openadsdk.ryl.ouw;

import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.uoy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ko extends com.bytedance.sdk.component.ouw.yu<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final bs f13329lh;

    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* synthetic */ JSONObject ouw(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = jSONObject;
        bs bsVar = this.f13329lh;
        com.bytedance.sdk.component.utils.ko.ouw("Android_jsb", "trigger common convert", jSONObject2);
        vpp vppVarOuw = com.bytedance.sdk.openadsdk.core.vt.ouw(jSONObject2);
        if (vppVarOuw == null) {
            return null;
        }
        boolean zRa = com.bytedance.sdk.openadsdk.core.model.th.ra(bsVar.bly);
        bsVar.ouw(vppVarOuw, zRa ? uoy.vt(bsVar.f12583le) : bsVar.ex, !zRa);
        return null;
    }

    public ko(bs bsVar) {
        this.f13329lh = bsVar;
    }
}
