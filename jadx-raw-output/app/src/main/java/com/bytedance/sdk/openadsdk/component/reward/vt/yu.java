package com.bytedance.sdk.openadsdk.component.reward.vt;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.bly;
import com.bytedance.sdk.openadsdk.component.reward.view.ryl;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.jg;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;

/* JADX INFO: loaded from: classes6.dex */
public final class yu extends vt {
    public static boolean ouw(vpp vppVar) {
        return th.vt(vppVar) || th.yu(vppVar) || th.ra(vppVar);
    }

    private static LinearLayout vt(Context context) {
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar.setId(rn.zin);
        fkwVar.setOrientation(1);
        fkwVar.setVisibility(8);
        fkwVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return fkwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final boolean fkw() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final RFEndCardBackUpLayout pno() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final void ra() {
    }

    private static ImageView lh(Context context) {
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        yuVar.setScaleType(ImageView.ScaleType.FIT_XY);
        yuVar.setImageResource(com.bytedance.sdk.component.utils.vpp.yu(context, "tt_up_slide"));
        yuVar.setId(rn.vpp);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(osn.ouw(context, 18.0f), osn.ouw(context, 16.0f));
        layoutParams.gravity = 17;
        layoutParams.topMargin = osn.ouw(context, 45.0f);
        yuVar.setLayoutParams(layoutParams);
        return yuVar;
    }

    public static void ouw(FrameLayout frameLayout, vpp vppVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar.setOrientation(1);
        frameLayout.addView(fkwVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(context);
        lhVar.setId(rn.fvf);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        fkwVar.addView(lhVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.le.lh lhVar2 = new com.bytedance.sdk.openadsdk.core.le.lh(context);
        lhVar2.setId(rn.tlj);
        lhVar.addView(lhVar2, new FrameLayout.LayoutParams(-1, -1));
        lhVar2.addView(vt.ouw(context));
        com.bytedance.sdk.openadsdk.core.le.lh lhVar3 = new com.bytedance.sdk.openadsdk.core.le.lh(context);
        lhVar3.setId(rn.zih);
        lhVar3.setVisibility(8);
        lhVar3.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        lhVar2.addView(lhVar3, layoutParams2);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        yuVar.setId(rn.f13442vm);
        yuVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        lhVar3.addView(yuVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.le.ouw(lhVar);
        com.bytedance.sdk.openadsdk.core.le.lh lhVar4 = new com.bytedance.sdk.openadsdk.core.le.lh(context);
        lhVar4.setId(rn.f13436th);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 0.0f;
        fkwVar.addView(lhVar4, layoutParams3);
        lhVar4.addView(ouw(context, vppVar));
        LinearLayout linearLayoutVt = vt(context);
        linearLayoutVt.setBackgroundColor(Color.parseColor("#70161823"));
        lhVar4.addView(linearLayoutVt);
        linearLayoutVt.addView(lh(context));
        com.bytedance.sdk.openadsdk.component.reward.view.le.ouw(lhVar4, vppVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final boolean le() {
        if (th.vt(this.ouw.vt)) {
            return true;
        }
        return (th.yu(this.ouw.vt) || th.ra(this.ouw.vt)) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final void ryl() {
        ryl rylVar;
        th thVar;
        if (th.vt(this.ouw.vt) && (rylVar = this.ouw.ey) != null && (thVar = rylVar.f12468rn) != null) {
            if (thVar.vt()) {
                this.ouw.ey.vt(0);
                this.ouw.f12384rn.set(true);
            } else {
                this.ouw.zih.set(true);
                ouw(true, false, true, 80);
            }
        }
        if (th.yu(this.ouw.vt) || th.ra(this.ouw.vt)) {
            ouw(true, false, true, 70);
        }
    }

    public yu(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        super(ouwVar);
    }

    public static void vt(FrameLayout frameLayout, vpp vppVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(context);
        lhVar.setId(rn.f13436th);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = osn.ouw(zih.ouw(), 58.0f);
        frameLayout.addView(lhVar, layoutParams);
        lhVar.addView(ouw(context, vppVar));
        LinearLayout linearLayoutVt = vt(context);
        linearLayoutVt.setBackgroundColor(Color.parseColor("#99161823"));
        lhVar.addView(linearLayoutVt);
        linearLayoutVt.addView(lh(context));
        com.bytedance.sdk.openadsdk.component.reward.view.le.ouw(lhVar, vppVar);
        com.bytedance.sdk.openadsdk.core.le.lh lhVar2 = new com.bytedance.sdk.openadsdk.core.le.lh(context);
        lhVar2.setId(rn.fvf);
        frameLayout.addView(lhVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.le.lh lhVar3 = new com.bytedance.sdk.openadsdk.core.le.lh(context);
        lhVar3.setId(rn.tlj);
        lhVar2.addView(lhVar3, new FrameLayout.LayoutParams(-1, -1));
        lhVar3.addView(vt.ouw(context));
        com.bytedance.sdk.openadsdk.core.le.lh lhVar4 = new com.bytedance.sdk.openadsdk.core.le.lh(context);
        lhVar4.setId(rn.zih);
        lhVar4.setVisibility(8);
        lhVar4.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        lhVar3.addView(lhVar4, layoutParams2);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        yuVar.setId(rn.f13442vm);
        yuVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        lhVar4.addView(yuVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.le.ouw(lhVar2);
    }

    public static com.bytedance.sdk.component.bly.le ouw(Context context, vpp vppVar) {
        com.bytedance.sdk.component.bly.le leVarVt = com.bytedance.sdk.openadsdk.jg.ouw.ouw().vt(vppVar);
        if (leVarVt != null) {
            leVarVt.setLpPreRender(true);
            ko.vt("LPPreRenderManager", "createLoadingWebView, is pre render");
            ViewGroup viewGroup = (ViewGroup) leVarVt.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(leVarVt);
            }
        } else {
            ko.vt("LPPreRenderManager", "createLoadingWebView, not pre render");
            leVarVt = new com.bytedance.sdk.component.bly.le(context, true, com.bytedance.sdk.component.bly.le.lh.LANDING_PAGE_LOADING);
            leVarVt.setLayerType(2, null);
        }
        osn.ouw((View) leVarVt, 0);
        leVarVt.setId(rn.qbp);
        leVarVt.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return leVarVt;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final void ouw(bly blyVar) {
        vpp vppVar = this.vt;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        if (th.vt(vppVar)) {
            ouw(blyVar, vppVar);
        } else if (!th.yu(vppVar) && !th.ra(vppVar)) {
            vt.ouw(blyVar, ouwVar);
        } else {
            vt(blyVar, vppVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final void ouw(FrameLayout frameLayout) {
        jg jgVar;
        if (th.yu(this.ouw.vt)) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
            vpp vppVar = ouwVar.vt;
            if (vppVar.tpk || (jgVar = ouwVar.f12385sd) == null) {
                return;
            }
            jgVar.ouw(vppVar.kq.vt * 1000);
        }
    }
}
