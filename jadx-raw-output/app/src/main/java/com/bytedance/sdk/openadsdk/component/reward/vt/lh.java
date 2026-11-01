package com.bytedance.sdk.openadsdk.component.reward.vt;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.component.reward.view.bly;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.google.android.material.badge.BadgeDrawable;

/* JADX INFO: loaded from: classes7.dex */
public final class lh extends vt {
    public static boolean ouw(vpp vppVar) {
        ko.ouw("RewardFullLPCeilingType", "match type:", Boolean.valueOf(th.lh(vppVar)));
        return th.lh(vppVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final boolean fkw() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final boolean le() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final void ouw(FrameLayout frameLayout) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final void ra() {
    }

    public lh(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        super(ouwVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final void ouw(bly blyVar) {
        if (blyVar != null) {
            Context context = blyVar.getContext();
            com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
            fkwVar.setOrientation(1);
            blyVar.addView(fkwVar, new FrameLayout.LayoutParams(-1, -1));
            com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(context);
            lhVar.setId(rn.fvf);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.weight = 100.0f;
            fkwVar.addView(lhVar, layoutParams);
            com.bytedance.sdk.openadsdk.core.le.lh lhVar2 = new com.bytedance.sdk.openadsdk.core.le.lh(context);
            lhVar2.setId(rn.tlj);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams2.gravity = 17;
            lhVar.addView(lhVar2, layoutParams2);
            lhVar2.addView(vt.ouw(context));
            int i10 = this.vt.ucs;
            if (i10 != 3 && i10 != 5) {
                com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
                yuVar.setId(rn.vby);
                yuVar.setVisibility(8);
                yuVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.yu.ouw());
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(osn.ouw(context, 28.0f), osn.ouw(context, 28.0f));
                layoutParams3.gravity = BadgeDrawable.BOTTOM_END;
                layoutParams3.rightMargin = osn.ouw(context, 20.0f);
                layoutParams3.bottomMargin = osn.ouw(context, 10.0f);
                lhVar.addView(yuVar, layoutParams3);
            }
            com.bytedance.sdk.openadsdk.core.le.lh lhVar3 = new com.bytedance.sdk.openadsdk.core.le.lh(context);
            lhVar3.setId(rn.f13436th);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
            layoutParams4.weight = 0.0f;
            fkwVar.addView(lhVar3, layoutParams4);
            lhVar3.addView(yu.ouw(context, this.ouw.vt));
            com.bytedance.sdk.openadsdk.component.reward.view.le.ouw(lhVar3, this.vt);
            com.bytedance.sdk.openadsdk.component.reward.view.le.ouw(lhVar);
        }
    }
}
