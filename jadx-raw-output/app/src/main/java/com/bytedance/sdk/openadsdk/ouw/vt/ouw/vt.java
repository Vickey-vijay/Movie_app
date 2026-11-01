package com.bytedance.sdk.openadsdk.ouw.vt.ouw;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.bly.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* JADX INFO: loaded from: classes7.dex */
public final class vt extends lh {
    @Override // com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh
    public final void ouw() {
        th thVar = new th(((lh) this).ouw, this.f13289lh, ((lh) this).bly, this.f13287cf, false);
        this.tlj = thVar;
        this.vt.ouw(thVar.getVideoController());
        lh();
    }

    public final com.bytedance.sdk.openadsdk.multipro.vt.ouw vt() {
        qbp qbpVar = this.tlj;
        if (qbpVar != null) {
            return ((th) qbpVar).getVideoModel();
        }
        return null;
    }

    public vt(@NonNull Context context, vpp vppVar, AdSlot adSlot) {
        super(context, vppVar, adSlot);
    }
}
