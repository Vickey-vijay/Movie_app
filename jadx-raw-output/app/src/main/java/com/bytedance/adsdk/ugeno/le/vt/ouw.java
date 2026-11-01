package com.bytedance.adsdk.ugeno.le.vt;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class ouw implements com.bytedance.adsdk.ugeno.pno.lh.fkw {
    @Override // com.bytedance.adsdk.ugeno.pno.lh.fkw
    public final void ouw(View view, float f10) {
        float width = f10 < 0.0f ? view.getWidth() : 0.0f;
        float height = view.getHeight() * 0.5f;
        view.setPivotX(width);
        view.setPivotY(height);
        view.setRotationY(f10 * 90.0f);
    }
}
