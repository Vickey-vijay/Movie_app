package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class ko implements com.bytedance.sdk.openadsdk.oem.ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static boolean f13388lh;
    private static final ko ouw = new ko();
    private static com.bytedance.sdk.openadsdk.component.reward.ouw.ouw vt;

    public static void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        com.bytedance.sdk.openadsdk.core.model.jae jaeVar = ouwVar.vt.oiz;
        if (jaeVar != null) {
            if (jaeVar.ouw() || jaeVar.vt()) {
                vt = ouwVar;
                IPBroadcastReceiver iPBroadcastReceiverOuw = IPBroadcastReceiver.ouw(ouwVar.hun, ouwVar.vt);
                if (iPBroadcastReceiverOuw != null) {
                    iPBroadcastReceiverOuw.vt = ouw;
                }
            }
        }
    }

    public static void vt() {
        f13388lh = true;
    }

    public static void ouw() {
        if (vt == null) {
            return;
        }
        IPBroadcastReceiver iPBroadcastReceiverOuw = IPBroadcastReceiver.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), vt.vt);
        if (iPBroadcastReceiverOuw != null) {
            iPBroadcastReceiverOuw.vt = null;
        }
        vt = null;
        f13388lh = false;
    }

    @Override // com.bytedance.sdk.openadsdk.oem.ouw
    public final void ouw(String str, final int i10) {
        com.bytedance.sdk.openadsdk.core.model.le leVar;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = vt;
        if (ouwVar == null || (leVar = ouwVar.vt.wp) == null) {
            return;
        }
        String str2 = leVar.f12779lh;
        if (TextUtils.isEmpty(str2) || !str2.equals(str)) {
            return;
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.ko.1
            @Override // java.lang.Runnable
            public final void run() {
                int i11;
                boolean z10;
                if (ko.vt != null && (i11 = i10) > 0 && i11 <= 5) {
                    boolean z11 = true;
                    if (i11 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (ko.f13388lh) {
                        ko.vt.fqk.kn();
                        HashMap map = new HashMap();
                        map.put("click_scence", 4);
                        com.bytedance.sdk.openadsdk.yu.lh.ouw("click", ko.vt.vt, new com.bytedance.sdk.openadsdk.core.model.cf.ouw().ouw(), ko.vt.fkw, true, (Map<String, Object>) map, 1);
                    } else {
                        z11 = z10;
                    }
                    if (z11) {
                        ko.ouw();
                    }
                }
            }
        });
    }
}
