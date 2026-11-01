package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class lh implements ra {
    public com.bytedance.sdk.component.adexpress.le.fkw ouw;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final /* bridge */ /* synthetic */ ViewGroup lh() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void ouw() {
        AnimatorSet animatorSet = this.ouw.ouw;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void vt() {
        AnimatorSet animatorSet = this.ouw.ouw;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public lh(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar) {
        this.ouw = new com.bytedance.sdk.component.adexpress.le.fkw(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(fkwVar.getDynamicHeight(), fkwVar.getDynamicHeight());
        layoutParams.gravity = 17;
        this.ouw.setLayoutParams(layoutParams);
    }
}
