package com.bytedance.sdk.openadsdk.ryl.ouw;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.fak;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class qbp extends com.bytedance.sdk.component.ouw.vm<JSONObject, JSONObject> {
    public static final HashSet<String> yu = new HashSet<>(Arrays.asList("closeWebview", "makeVisible", "getCurrentVisibleState"));
    private com.bytedance.sdk.component.bly.le fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private bs f13334le;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private vpp f13335ra;

    public static void ouw(com.bytedance.sdk.component.ouw.ko koVar, com.bytedance.sdk.component.bly.le leVar, bs bsVar, vpp vppVar) {
        koVar.ouw(yu, new qbp(leVar, bsVar, vppVar));
    }

    private qbp(com.bytedance.sdk.component.bly.le leVar, bs bsVar, vpp vppVar) {
        this.fkw = leVar;
        this.f13334le = bsVar;
        this.f13335ra = vppVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* synthetic */ Object ouw(String str, Object obj) throws Exception {
        JSONObject jSONObject = new JSONObject();
        str.hashCode();
        switch (str) {
            case "getCurrentVisibleState":
                vpp vppVar = this.f13335ra;
                if (vppVar != null) {
                    jSONObject.put("visibleState", !fak.ouw(this.fkw, 20, vppVar.lna, false) ? 1 : 0);
                }
                return jSONObject;
            case "closeWebview":
                com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ryl.ouw.qbp.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (qbp.this.fkw != null) {
                            qbp.this.fkw.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) qbp.this.fkw.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(qbp.this.fkw);
                            }
                        }
                    }
                });
                jSONObject.put("success", true);
                return jSONObject;
            case "makeVisible":
                if (this.fkw != null) {
                    jSONObject.put("success", true);
                    com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ryl.ouw.qbp.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (qbp.this.fkw != null) {
                                qbp.this.fkw.setVisibility(0);
                            }
                        }
                    });
                } else {
                    jSONObject.put("success", false);
                }
                return jSONObject;
            default:
                return jSONObject;
        }
    }
}
