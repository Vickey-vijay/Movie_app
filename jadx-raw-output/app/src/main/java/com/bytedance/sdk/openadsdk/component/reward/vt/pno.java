package com.bytedance.sdk.openadsdk.component.reward.vt;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* JADX INFO: loaded from: classes10.dex */
public final class pno extends vt {

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.component.reward.view.lh f12484ko;

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final void ouw(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.reward.view.lh lhVar = new com.bytedance.sdk.openadsdk.component.reward.view.lh(this.ouw.jvy, this.f12488cf);
        this.f12484ko = lhVar;
        lhVar.setDownloadListener(this.ryl);
        com.bytedance.sdk.openadsdk.component.reward.view.lh lhVar2 = this.f12484ko;
        vpp vppVar = this.vt;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        lhVar2.ouw(vppVar, ouwVar.f12389vh, ouwVar.ucs, this.f12482lh, this.yu);
        frameLayout.addView(this.f12484ko.getInteractionStyleRootView());
    }

    public final FrameLayout ex() {
        com.bytedance.sdk.openadsdk.component.reward.view.lh lhVar = this.f12484ko;
        if (lhVar != null) {
            return lhVar.getVideoContainer();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final boolean fkw() {
        return vpp.fkw(this.vt);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final boolean le() {
        return vpp.fkw(this.vt);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final void ra() {
        this.f12481le.yu(8);
        this.f12481le.vt(8);
        if (this.vt.rn() == 2) {
            this.pno.ouw(false);
            this.pno.lh(false);
            this.pno.yu(false);
            this.f12481le.le(8);
            return;
        }
        this.pno.ouw(this.vt.ksc());
        this.pno.lh(vpp.fkw(this.vt));
        this.pno.yu(vpp.fkw(this.vt));
        if (vpp.fkw(this.vt)) {
            this.f12481le.le(8);
        } else {
            this.pno.yu();
            this.f12481le.le(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final vt.ouw yu() {
        return new vt.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.vt.pno.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt.ouw
            public final void ouw(boolean z10) {
                com.bytedance.sdk.openadsdk.component.reward.view.lh lhVar = pno.this.f12484ko;
                if (lhVar != null) {
                    lhVar.setIsMute(z10);
                }
            }
        };
    }

    public pno(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        super(ouwVar);
    }

    public static boolean ouw(vpp vppVar) {
        return (vppVar.ey() || vppVar.ex() == 100.0f) ? false : true;
    }
}
