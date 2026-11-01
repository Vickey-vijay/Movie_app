package com.bytedance.adsdk.ugeno.le.vt;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class yu implements com.bytedance.adsdk.ugeno.pno.lh.fkw {
    public String ouw;

    @Override // com.bytedance.adsdk.ugeno.pno.lh.fkw
    public final void ouw(View view, float f10) {
        if (f10 < -1.0f || f10 > 1.0f) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(1.0f);
            view.setTranslationX(view.getWidth() * (-f10));
            view.setTranslationY(view.getHeight() * f10);
        }
        if (TextUtils.equals(this.ouw, "cube")) {
            float height = f10 < 0.0f ? view.getHeight() : 0.0f;
            view.setPivotX(view.getWidth() * 0.5f);
            view.setPivotY(height);
            view.setRotationX(f10 * (-90.0f));
        }
    }
}
