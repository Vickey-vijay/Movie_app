package com.bytedance.sdk.openadsdk.component.reward.view;

import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;

/* JADX INFO: loaded from: classes9.dex */
public final class cf extends ryl {
    @Override // com.bytedance.sdk.openadsdk.component.reward.view.ryl
    public final boolean ouw() {
        return false;
    }

    public cf(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        super(ouwVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.ryl
    public final void ouw(int i10, int i11) {
        super.ouw(i10, i11);
        if (vpp.fkw(this.yu)) {
            vpp vppVar = this.yu;
            if (vppVar.wbf == 3 && vppVar.zih() == 0) {
                try {
                    FrameLayout frameLayout = (FrameLayout) this.f12466lh.rrs.findViewById(rn.tlj);
                    frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                    if (this.yu.jqy() == 1) {
                        int iOuw = osn.ouw(zih.ouw(), 90.0f);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.bottomMargin = iOuw;
                        frameLayout.setLayoutParams(layoutParams);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }
}
