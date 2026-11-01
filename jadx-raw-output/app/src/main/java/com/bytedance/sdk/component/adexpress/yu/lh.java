package com.bytedance.sdk.component.adexpress.yu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class lh {
    private static Drawable ouw(Context context, int i10, int i11, int i12) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i10, i11);
        }
        gradientDrawable.setColor(i12);
        return gradientDrawable;
    }

    public static Drawable ouw(Context context, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar) {
        if (context == null || raVar == null) {
            return null;
        }
        return ouw(context, (int) ra.ouw(context, raVar.yu.vt), raVar.cf(), raVar.mwh());
    }
}
