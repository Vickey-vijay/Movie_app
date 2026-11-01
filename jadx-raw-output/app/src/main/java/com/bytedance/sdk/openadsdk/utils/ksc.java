package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public final class ksc implements com.bytedance.sdk.component.fkw.rn {
    private final WeakReference<ImageView> ouw;

    @Override // com.bytedance.sdk.component.fkw.rn
    public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
        ImageView imageView = this.ouw.get();
        if (imageView == null) {
            return;
        }
        try {
            Object objVt = cfVar.vt();
            if (objVt instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objVt);
                return;
            }
            if (!(objVt instanceof Drawable)) {
                imageView.setVisibility(8);
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && (objVt instanceof AnimatedImageDrawable)) {
                ((AnimatedImageDrawable) objVt).start();
            }
            imageView.setImageDrawable((Drawable) objVt);
        } catch (Throwable unused) {
            imageView.setVisibility(8);
        }
    }

    public ksc(ImageView imageView) {
        this.ouw = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.fkw.rn
    public final void ouw(int i10, String str, @Nullable Throwable th2) {
        ImageView imageView = this.ouw.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
