package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.le.jqy;

/* JADX INFO: loaded from: classes11.dex */
public final class jg implements ra<com.bytedance.sdk.component.adexpress.le.rn> {
    private com.bytedance.sdk.component.adexpress.le.rn ouw;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final /* bridge */ /* synthetic */ ViewGroup lh() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void ouw() {
        this.ouw.f11526lh.start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void vt() {
        com.bytedance.sdk.component.adexpress.le.rn rnVar = this.ouw;
        AnimatorSet animatorSet = rnVar.f11526lh;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        jqy jqyVar = rnVar.vt;
        if (jqyVar != null) {
            jqyVar.clearAnimation();
        }
        ImageView imageView = rnVar.ouw;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    public jg(Context context, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar) {
        this.ouw = new com.bytedance.sdk.component.adexpress.le.rn(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, 180.0f));
        layoutParams.gravity = 17;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, 20.0f);
        this.ouw.setLayoutParams(layoutParams);
        this.ouw.setGuideText(raVar.yu.f11460vm);
    }
}
