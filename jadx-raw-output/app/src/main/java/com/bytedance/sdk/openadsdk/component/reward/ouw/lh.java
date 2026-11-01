package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.R;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.vm;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes11.dex */
public final class lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public TTAdDislikeToast f12362lh;
    public final ouw ouw;
    public vm vt;

    public final void ouw(com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar) {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        if (this.ouw.jvy.isFinishing()) {
            return;
        }
        ouw ouwVar = this.ouw;
        com.bytedance.sdk.openadsdk.activity.pno pnoVar2 = ouwVar.f12374gh;
        boolean z10 = (pnoVar2 instanceof com.bytedance.sdk.openadsdk.activity.fkw) && ((com.bytedance.sdk.openadsdk.activity.fkw) pnoVar2).ouw;
        if (ouwVar.ryl.get() || !((pnoVar = this.ouw.f12374gh) == null || !pnoVar.hun().f12127th || z10)) {
            if (this.f12362lh == null) {
                this.f12362lh = new TTAdDislikeToast(this.ouw.jvy);
                ((FrameLayout) this.ouw.jvy.findViewById(R.id.content)).addView(this.f12362lh);
            }
            this.f12362lh.show(TTAdDislikeToast.getDislikeTip());
            this.ouw.ryl.set(true);
            return;
        }
        if (this.vt == null) {
            try {
                vt(vtVar);
            } catch (Throwable th2) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th2);
            }
        }
        vm vmVar = this.vt;
        if (vmVar != null) {
            vmVar.ouw();
        }
    }

    private void vt(final com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar) {
        if (this.vt == null) {
            ouw ouwVar = this.ouw;
            vm vmVar = new vm(ouwVar.jvy, ouwVar.vt);
            this.vt = vmVar;
            vmVar.setCallback(new vm.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.lh.1
                @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                public final void ouw() {
                    lh.this.ouw.f12372cf.set(true);
                    String str = "landing_page";
                    if (!th.vt(lh.this.ouw.vt) && !th.yu(lh.this.ouw.vt) && !th.le(lh.this.ouw.vt) && !th.ra(lh.this.ouw.vt)) {
                        if (!lh.this.ouw.tlj.get()) {
                            str = "video_player";
                        } else if (od.vt(lh.this.ouw.vt)) {
                            str = "playable";
                        } else if (!lh.this.ouw.vt.vm()) {
                            str = CampaignEx.JSON_NATIVE_VIDEO_ENDCARD;
                        }
                    }
                    lh.this.vt.setDislikeSource(str);
                    ouw ouwVar2 = lh.this.ouw;
                    if (ouwVar2.ex.f12354le) {
                        com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar = ouwVar2.jae;
                        if (tljVar != null) {
                            tljVar.ouw(8, false);
                            return;
                        }
                        return;
                    }
                    vtVar.ko();
                    if (lh.this.ouw.ex.ouw()) {
                        lh.this.ouw.ex.ryl();
                    }
                    ouw ouwVar3 = lh.this.ouw;
                    if (ouwVar3.f12392xn) {
                        ouwVar3.f12374gh.hun().ouw(lh.this.ouw.f12374gh, 2);
                    }
                    com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(lh.this.ouw.vt, 8);
                    lh.this.ouw.ksc.yu();
                    lh.this.ouw.ksc.le();
                    com.bytedance.sdk.openadsdk.utils.jg jgVar = lh.this.ouw.f12385sd;
                    if (jgVar != null) {
                        jgVar.vt();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                public final void vt() {
                    lh.this.ouw.f12372cf.set(false);
                    ouw ouwVar2 = lh.this.ouw;
                    ko koVar = ouwVar2.ex;
                    if (koVar.f12354le) {
                        com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar = ouwVar2.jae;
                        if (tljVar != null) {
                            tljVar.ouw(0, true);
                            return;
                        }
                        return;
                    }
                    koVar.ouw(vtVar);
                    if (lh.this.ouw.ex.yu()) {
                        lh.this.ouw.ex.cf();
                    }
                    ouw ouwVar3 = lh.this.ouw;
                    if (ouwVar3.f12392xn) {
                        ouwVar3.f12374gh.hun().ouw(lh.this.ouw.f12374gh, 1);
                    }
                    com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(lh.this.ouw.vt, 4);
                    lh.this.ouw.ksc.ouw(0);
                    lh.this.ouw.ksc.lh();
                    com.bytedance.sdk.openadsdk.utils.jg jgVar = lh.this.ouw.f12385sd;
                    if (jgVar != null) {
                        jgVar.ouw();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                public final void ouw(FilterWord filterWord) {
                    if (lh.this.ouw.ryl.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    lh.this.ouw.ryl.set(true);
                    com.bytedance.sdk.openadsdk.activity.pno pnoVar = lh.this.ouw.f12374gh;
                    if (pnoVar != null) {
                        pnoVar.hun().f12127th = true;
                    }
                    TTAdDislikeToast tTAdDislikeToast = lh.this.f12362lh;
                    if (tTAdDislikeToast != null) {
                        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
                    }
                }
            });
            ((FrameLayout) this.ouw.jvy.findViewById(R.id.content)).addView(this.vt);
        }
        if (this.f12362lh == null) {
            this.f12362lh = new TTAdDislikeToast(this.ouw.jvy);
            ((FrameLayout) this.ouw.jvy.findViewById(R.id.content)).addView(this.f12362lh);
        }
    }

    public lh(ouw ouwVar) {
        this.ouw = ouwVar;
    }

    public final void ouw() {
        TTAdDislikeToast tTAdDislikeToast = this.f12362lh;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.hide();
        }
    }
}
