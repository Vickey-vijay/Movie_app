package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.component.reward.ouw.zih;
import com.bytedance.sdk.openadsdk.utils.osn;

/* JADX INFO: loaded from: classes10.dex */
public final class pno {
    public boolean fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f12461lh;
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouw;

    @Nullable
    public RFEndCardBackUpLayout vt;
    public zih yu;

    public final void ouw() {
        ko.vt("TTAD.RFBackUpEndCard", "show: ");
        this.fkw = true;
        osn.ouw((View) this.vt, 0);
    }

    public pno(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.ouw = ouwVar;
    }

    public final boolean ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ko koVar) {
        this.fkw = true;
        zih zihVar = this.yu;
        if (zihVar == null || !zihVar.ouw(koVar)) {
            return false;
        }
        osn.ouw((View) this.vt, 0);
        return true;
    }

    public final void ouw(int i10) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.vt;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        rFEndCardBackUpLayout.setShownAdCount(i10);
    }
}
