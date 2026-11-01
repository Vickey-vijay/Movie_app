package com.bytedance.sdk.openadsdk.ryl.ouw;

import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.ksc;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ryl extends com.bytedance.sdk.component.ouw.vm<JSONObject, JSONObject> {
    private static final HashSet<String> yu = new HashSet<>(Arrays.asList("popupShow", "popupDismiss", "changeCountdownStatus", "getCurrentCountdownStatus", "popupRenderDidFinish"));
    private final bs fkw;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* synthetic */ Object ouw(String str, Object obj) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        str.hashCode();
        switch (str) {
            case "popupDismiss":
                ksc kscVar = this.fkw.f12586pd;
                if (kscVar != null) {
                    kscVar.vt();
                }
                return null;
            case "popupShow":
                ksc kscVar2 = this.fkw.f12586pd;
                if (kscVar2 != null) {
                    kscVar2.p_();
                }
                return null;
            case "getCurrentCountdownStatus":
                return this.fkw.le();
            case "popupRenderDidFinish":
                ksc kscVar3 = this.fkw.f12586pd;
                if (kscVar3 != null) {
                    kscVar3.t_();
                }
                return null;
            case "changeCountdownStatus":
                bs bsVar = this.fkw;
                int iOptInt = jSONObject.optInt("status");
                ksc kscVar4 = bsVar.f12586pd;
                if (kscVar4 != null) {
                    if (iOptInt == 1) {
                        kscVar4.r_();
                    } else if (iOptInt == 2) {
                        kscVar4.s_();
                    }
                }
                return null;
            default:
                return null;
        }
    }

    private ryl(bs bsVar) {
        this.fkw = bsVar;
    }

    public static void ouw(com.bytedance.sdk.component.ouw.ko koVar, bs bsVar) {
        koVar.ouw(yu, new ryl(bsVar));
    }
}
