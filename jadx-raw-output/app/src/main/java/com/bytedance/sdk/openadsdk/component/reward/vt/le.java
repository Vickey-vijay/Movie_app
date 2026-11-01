package com.bytedance.sdk.openadsdk.component.reward.vt;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* JADX INFO: loaded from: classes7.dex */
public final class le {
    @NonNull
    public static vt ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        vpp vppVar = ouwVar.vt;
        if (ra.ouw(vppVar) && !lh.ouw(vppVar)) {
            return new ra(ouwVar);
        }
        if (pno.ouw(vppVar)) {
            return new pno(ouwVar);
        }
        if (yu.ouw(vppVar)) {
            return new yu(ouwVar);
        }
        return lh.ouw(vppVar) ? new lh(ouwVar) : new fkw(ouwVar);
    }
}
