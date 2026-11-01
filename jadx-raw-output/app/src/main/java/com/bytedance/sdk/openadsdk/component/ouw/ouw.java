package com.bytedance.sdk.openadsdk.component.ouw;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.tc.vt.fkw;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class ouw extends com.bytedance.sdk.openadsdk.core.lh.ouw {
    private final com.bytedance.sdk.openadsdk.component.pno.ouw ouw;

    public ouw(@NonNull Context context, @NonNull vpp vppVar, @NonNull String str, com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar) {
        super(context, vppVar, str, 4);
        this.ouw = ouwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lh.ouw, com.bytedance.sdk.openadsdk.core.lh.vt, com.bytedance.sdk.openadsdk.core.lh.lh
    public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z10) {
        if (view.getTag() == "open_ad_click_button_tag") {
            this.ex = "click_bar";
        } else {
            this.ex = "click_material";
        }
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(this.ouw.vt));
        ouw(map);
        super.ouw(view, f10, f11, f12, f13, sparseArray, z10);
        fkw.ouw(this.tlj, 9);
    }
}
