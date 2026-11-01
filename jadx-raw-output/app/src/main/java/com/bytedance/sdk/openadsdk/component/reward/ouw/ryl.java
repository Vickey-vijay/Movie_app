package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.app.Activity;

/* JADX INFO: loaded from: classes7.dex */
public final class ryl {
    public boolean fkw = false;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public boolean f12418le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.component.reward.top.lh f12419lh;
    public final Activity ouw;
    public final ouw vt;
    public com.bytedance.sdk.component.adexpress.dynamic.yu yu;

    public final void lh(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
        if (this.f12418le || (lhVar = this.f12419lh) == null) {
            return;
        }
        lhVar.setShowSound(z10);
    }

    public final void ouw(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
        if (this.f12418le || (lhVar = this.f12419lh) == null) {
            return;
        }
        lhVar.setShowDislike(z10);
    }

    public final void vt(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = this.f12419lh;
        if (lhVar != null) {
            lhVar.setSoundMute(z10);
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu yuVar = this.yu;
        if (yuVar != null) {
            yuVar.setSoundMute(z10);
        }
    }

    public final void yu(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
        if (this.f12418le || (lhVar = this.f12419lh) == null) {
            return;
        }
        lhVar.setShowSkip(z10);
    }

    public final void fkw(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
        if (this.f12418le || (lhVar = this.f12419lh) == null) {
            return;
        }
        lhVar.setSkipEnable(z10);
    }

    public ryl(ouw ouwVar) {
        this.ouw = ouwVar.jvy;
        this.vt = ouwVar;
    }

    public final void lh() {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = this.f12419lh;
        if (lhVar != null) {
            lhVar.clickSkip();
        }
    }

    public final void ouw(String str, CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
        if (this.f12418le || (lhVar = this.f12419lh) == null) {
            return;
        }
        lhVar.setTime(String.valueOf(str), charSequence);
    }

    public final void yu() {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
        if (this.f12418le || (lhVar = this.f12419lh) == null) {
            return;
        }
        lhVar.setSkipInvisiable();
    }

    public final void vt() {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
        if (this.f12418le || (lhVar = this.f12419lh) == null) {
            return;
        }
        lhVar.showSkipButton();
    }

    public final void ouw(CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
        if (this.f12418le || (lhVar = this.f12419lh) == null) {
            return;
        }
        lhVar.setSkipText(charSequence);
    }

    public final void ouw() {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
        if (this.f12418le || (lhVar = this.f12419lh) == null) {
            return;
        }
        lhVar.showCountDownText();
    }

    public final void ouw(com.bytedance.sdk.openadsdk.component.reward.top.vt vtVar) {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = this.f12419lh;
        if (lhVar != null) {
            lhVar.setListener(vtVar);
        }
    }
}
