package com.bytedance.sdk.openadsdk.ryl.ouw;

import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class jg extends com.bytedance.sdk.component.ouw.lh<JSONObject, JSONObject> {
    private WeakReference<bs> fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private vpp f13327le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public long f13328lh;
    public HashSet<Integer> yu = new HashSet<>();

    @Override // com.bytedance.sdk.component.ouw.lh
    public final /* synthetic */ void ouw(JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = jSONObject;
        bs bsVar = this.fkw.get();
        if (bsVar == null || jSONObject2 == null) {
            vt();
            return;
        }
        bsVar.jqy = new com.bytedance.sdk.openadsdk.mwh.vt() { // from class: com.bytedance.sdk.openadsdk.ryl.ouw.jg.2
            @Override // com.bytedance.sdk.openadsdk.mwh.vt
            public final void ouw(int i10) {
                jg.this.yu.add(Integer.valueOf(i10));
                if (jg.this.yu.size() >= jg.this.f13328lh) {
                    try {
                        jg.this.vt(new JSONObject());
                        jg.this.yu.clear();
                    } catch (Exception e10) {
                        com.bytedance.sdk.component.utils.ko.fkw("requestVideoDelay", e10.getMessage());
                    }
                }
            }
        };
        int iOptInt = jSONObject2.optInt("delay", -1);
        if (iOptInt >= 0) {
            this.f13328lh = iOptInt / 1000;
        }
    }

    public jg(bs bsVar, vpp vppVar) {
        this.fkw = new WeakReference<>(bsVar);
        this.f13327le = vppVar;
    }
}
