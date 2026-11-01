package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class vm implements ra<com.bytedance.sdk.component.adexpress.le.cf> {
    private final com.bytedance.sdk.component.adexpress.le.cf ouw;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final /* bridge */ /* synthetic */ ViewGroup lh() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void ouw() {
        com.bytedance.sdk.component.adexpress.le.cf cfVar = this.ouw;
        if (cfVar != null) {
            cfVar.postDelayed(cfVar.getHaloAnimation(), 300L);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void vt() {
        com.bytedance.sdk.component.adexpress.le.cf cfVar = this.ouw;
        if (cfVar != null) {
            cfVar.ouw.cancel();
        }
    }

    public vm(Context context, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar) {
        com.bytedance.sdk.component.adexpress.le.cf cfVar = new com.bytedance.sdk.component.adexpress.le.cf(context);
        this.ouw = cfVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        int i10 = raVar.yu.f11461xn;
        if (i10 <= 0) {
            if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                i10 = 0;
            } else {
                i10 = 120;
            }
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, i10);
        cfVar.setLayoutParams(layoutParams);
        cfVar.setClipChildren(false);
        cfVar.setText(raVar.yu.f11460vm);
    }
}
