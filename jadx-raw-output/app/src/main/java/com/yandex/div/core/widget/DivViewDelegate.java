package com.yandex.div.core.widget;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: compiled from: DivViewDelegate.kt */
/* JADX INFO: loaded from: classes6.dex */
public interface DivViewDelegate {
    void buildDrawingCache(boolean z10);

    Drawable invalidateDrawable(Drawable drawable);

    void onAttachedToWindow();

    void onDetachedFromWindow();

    boolean onVisibilityChanged(View view, int i10);

    void unscheduleDrawable(Drawable drawable);
}
