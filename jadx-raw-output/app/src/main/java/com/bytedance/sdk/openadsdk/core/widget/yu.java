package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.openadsdk.utils.osn;

/* JADX INFO: loaded from: classes2.dex */
public final class yu {
    public static Drawable ouw() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(osn.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 1.0f), Color.parseColor("#33FFFFFF"));
        gradientDrawable.setColor(Color.parseColor("#99333333"));
        return gradientDrawable;
    }

    public static Drawable vt() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(osn.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 44.0f));
        gradientDrawable.setStroke(osn.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 1.0f), Color.parseColor("#33FFFFFF"));
        gradientDrawable.setColor(Color.parseColor("#99333333"));
        return gradientDrawable;
    }
}
