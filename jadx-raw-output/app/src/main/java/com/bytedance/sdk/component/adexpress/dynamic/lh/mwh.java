package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.le.jqy;

/* JADX INFO: loaded from: classes2.dex */
public final class mwh implements ra {
    private com.bytedance.sdk.component.adexpress.le.ko ouw;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final /* bridge */ /* synthetic */ ViewGroup lh() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void ouw() {
        this.ouw.f11506lh.start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void vt() {
        com.bytedance.sdk.component.adexpress.le.ko koVar = this.ouw;
        AnimatorSet animatorSet = koVar.f11506lh;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        jqy jqyVar = koVar.vt;
        if (jqyVar != null) {
            jqyVar.clearAnimation();
        }
        ImageView imageView = koVar.ouw;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    public mwh(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar) {
        this.ouw = new com.bytedance.sdk.component.adexpress.le.ko(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(fkwVar.getDynamicHeight(), fkwVar.getDynamicHeight());
        layoutParams.gravity = 8388629;
        this.ouw.setLayoutParams(layoutParams);
    }
}
