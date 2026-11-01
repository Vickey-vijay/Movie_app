package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class ryl implements ra {
    private com.bytedance.sdk.component.adexpress.le.jg ouw;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final ViewGroup lh() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void ouw() {
        this.ouw.vt.start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void vt() {
        com.bytedance.sdk.component.adexpress.le.jg jgVar = this.ouw;
        AnimatorSet animatorSet = jgVar.vt;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        com.bytedance.sdk.component.adexpress.le.yu yuVar = jgVar.ouw;
        if (yuVar != null) {
            yuVar.vt();
        }
    }

    public ryl(Context context, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar) {
        this.ouw = new com.bytedance.sdk.component.adexpress.le.jg(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, 180.0f));
        layoutParams.gravity = 17;
        this.ouw.setLayoutParams(layoutParams);
        this.ouw.setGuideText(raVar.yu.f11460vm);
    }
}
