package com.bytedance.sdk.openadsdk.ryl.ouw;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.fak;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class th extends com.bytedance.sdk.component.ouw.yu<JSONObject, JSONObject> {
    private vpp fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private String f13338le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.component.bly.le f13339lh;
    private bs yu;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* synthetic */ JSONObject ouw(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.f13338le;
        str2.hashCode();
        switch (str2) {
            case "getCurrentVisibleState":
                vpp vppVar = this.fkw;
                if (vppVar != null) {
                    jSONObject2.put("visibleState", !fak.ouw(this.f13339lh, 20, vppVar.lna, false) ? 1 : 0);
                }
                return jSONObject2;
            case "closeWebview":
                com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ryl.ouw.th.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bytedance.sdk.component.bly.le leVar = th.this.f13339lh;
                        if (leVar != null) {
                            leVar.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) th.this.f13339lh.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(th.this.f13339lh);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                return jSONObject2;
            case "makeVisible":
                if (this.f13339lh != null) {
                    jSONObject2.put("success", true);
                    com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ryl.ouw.th.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.bytedance.sdk.component.bly.le leVar = th.this.f13339lh;
                            if (leVar != null) {
                                leVar.setVisibility(0);
                            }
                        }
                    });
                } else {
                    jSONObject2.put("success", false);
                }
                return jSONObject2;
            default:
                return jSONObject2;
        }
    }

    public th(com.bytedance.sdk.component.bly.le leVar, String str, bs bsVar, vpp vppVar) {
        this.f13339lh = leVar;
        this.f13338le = str;
        this.yu = bsVar;
        this.fkw = vppVar;
    }
}
