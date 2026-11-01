package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.le.qbp;
import com.bytedance.sdk.component.adexpress.le.vpp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class le extends zih<com.bytedance.sdk.component.adexpress.le.le> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.zih
    public final void yu() {
    }

    public le(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context, fkwVar, raVar);
        this.vt = context;
        this.yu = raVar;
        this.f11417lh = fkwVar;
        this.ouw = new com.bytedance.sdk.component.adexpress.le.le(this.vt, i10, i11, i12, jSONObject);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.vt, 300.0f));
        layoutParams.gravity = 81;
        Context context2 = this.vt;
        int i13 = raVar.yu.f11461xn;
        if (i13 <= 0) {
            if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                i13 = 0;
            } else {
                i13 = 120;
            }
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context2, i13);
        this.ouw.setLayoutParams(layoutParams);
        this.ouw.setClipChildren(false);
        this.ouw.setSlideText(this.yu.yu.f11460vm);
        vpp vppVar = this.ouw;
        if (vppVar instanceof com.bytedance.sdk.component.adexpress.le.le) {
            ((com.bytedance.sdk.component.adexpress.le.le) vppVar).setShakeText(this.yu.yu.mwe);
            final qbp shakeView = ((com.bytedance.sdk.component.adexpress.le.le) this.ouw).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new com.bytedance.sdk.component.adexpress.le.th.ouw() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lh.le.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.f11417lh.getDynamicClickListener());
            }
        }
    }
}
