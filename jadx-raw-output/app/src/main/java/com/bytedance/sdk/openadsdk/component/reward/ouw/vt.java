package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.od;
import com.safedk.android.internal.partials.PangleVideoBridge;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class vt {
    public static void ouw(ouw ouwVar, Intent intent, Bundle bundle) {
        ouw(intent, ouwVar);
        ouw(bundle, ouwVar);
    }

    public static vpp ouw(Intent intent, Bundle bundle, com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar) {
        vpp vppVarOuw = null;
        if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            com.bytedance.sdk.openadsdk.core.model.ouw ouwVarRemove = od.ouw().ouw.remove(Integer.valueOf(od.ouw(intent)));
            vppVarOuw = ouwVarRemove != null ? ouwVarRemove.ryl : null;
            if (vtVar != null) {
                vtVar.ouw(bundle);
            }
            od.ouw().vt();
        } else if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_AD_INFO);
                if (stringExtra != null) {
                    vppVarOuw = com.bytedance.sdk.openadsdk.core.model.ouw.ouw(PangleVideoBridge.jsonObjectInit(stringExtra)).ryl;
                }
            } catch (Exception e10) {
                qbp.ouw("TTAD.RFDM", "", e10);
            }
        }
        if (bundle != null) {
            try {
                int i10 = bundle.getInt("meta_index", -1);
                vppVarOuw = od.ouw().ouw(i10);
                com.bytedance.sdk.component.utils.ko.vt("BVA", "getMaterialMetaData metaIndex =" + i10 + ",materialMeta =" + vppVarOuw);
            } catch (Throwable th2) {
                qbp.ouw("TTAD.RFDM", "", th2);
            }
        }
        if (vppVarOuw != null) {
            vppVarOuw.ouw(vppVarOuw.bs, 7);
        }
        return vppVarOuw;
    }

    public static void ouw(Intent intent, ouw ouwVar) {
        if (intent == null) {
            return;
        }
        ouwVar.ex.yu = intent.getBooleanExtra("video_is_cached", false);
        ouwVar.f12388ub = intent.getStringExtra("multi_process_listener_key");
        ouwVar.mt = intent.getIntExtra("orientation_angle", 0) == 3;
    }

    private static void ouw(Bundle bundle, ouw ouwVar) {
        if (bundle == null) {
            return;
        }
        ouwVar.f12388ub = bundle.getString("multi_process_listener_key");
        ouwVar.ex.yu = bundle.getBoolean("video_is_cached", false);
        ouwVar.f12373cj = bundle.getBoolean("is_mute");
        if (bundle.getLong("video_current") > 0) {
            ouwVar.ex.ouw = bundle.getLong("video_current", 0L);
        }
        ouwVar.ouw(bundle.getBoolean("has_show_skip_btn"));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    public static void ouw(Intent intent, Activity activity, boolean z10, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, String str) {
        int rotation;
        JSONObject jSONObjectFkw;
        if (activity == null) {
            intent.addFlags(268435456);
        } else {
            try {
                rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            } catch (Exception e10) {
                qbp.ouw("TTAD.RFDM", "", e10);
                rotation = 0;
            }
            intent.putExtra("orientation_angle", rotation);
            intent.putExtra("video_is_cached", z10);
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                jSONObjectFkw = ouwVar.fkw();
                if (jSONObjectFkw == null) {
                    com.bytedance.sdk.component.utils.ko.yu("toJsonObj return null");
                    return;
                } else {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_AD_INFO, jSONObjectFkw.toString());
                    intent.putExtra("multi_process_listener_key", str);
                    return;
                }
            }
            od.ouw().vt();
            intent.putExtra("meta_index", od.ouw().ouw(ouwVar));
            intent.putExtra("single_process_listener_key", str);
        }
        rotation = 0;
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra("video_is_cached", z10);
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            jSONObjectFkw = ouwVar.fkw();
            if (jSONObjectFkw == null) {
                com.bytedance.sdk.component.utils.ko.yu("toJsonObj return null");
                return;
            } else {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_AD_INFO, jSONObjectFkw.toString());
                intent.putExtra("multi_process_listener_key", str);
                return;
            }
        }
        od.ouw().vt();
        intent.putExtra("meta_index", od.ouw().ouw(ouwVar));
        intent.putExtra("single_process_listener_key", str);
    }
}
