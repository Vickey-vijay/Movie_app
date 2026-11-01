package com.bytedance.adsdk.ugeno.le.vt;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class lh implements com.bytedance.adsdk.ugeno.pno.lh.fkw {
    public final float ouw = 0.8f;
    public final float vt = 0.5f;

    @Override // com.bytedance.adsdk.ugeno.pno.lh.fkw
    public final void ouw(View view, float f10) {
        float f11 = ((f10 < 0.0f ? 0.19999999f : -0.19999999f) * f10) + 1.0f;
        float f12 = (f10 * (f10 < 0.0f ? 0.5f : -0.5f)) + 1.0f;
        if (f10 < 0.0f) {
            view.setPivotX(view.getWidth());
            view.setPivotY(view.getHeight() / 2);
        } else {
            view.setPivotX(0.0f);
            view.setPivotY(view.getHeight() / 2);
        }
        view.setScaleX(f11);
        view.setScaleY(f11);
        view.setAlpha(Math.abs(f12));
    }
}
