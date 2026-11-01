package com.yandex.div.core.view2;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;

/* JADX INFO: compiled from: ViewVisibilityCalculator.kt */
/* JADX INFO: loaded from: classes2.dex */
public class ViewVisibilityCalculator {
    private final Rect visibleRect = new Rect();

    @IntRange(from = 0, to = 100)
    @MainThread
    public int calculateVisibilityPercentage(View view) {
        if (!view.isShown() || !view.getGlobalVisibleRect(this.visibleRect)) {
            return 0;
        }
        return ((this.visibleRect.width() * this.visibleRect.height()) * 100) / (view.getWidth() * view.getHeight());
    }

    @MainThread
    public boolean isViewFullyVisible(View view) {
        if (!view.isShown() || !view.getGlobalVisibleRect(this.visibleRect) || view.getWidth() != this.visibleRect.width() || view.getHeight() != this.visibleRect.height()) {
            return false;
        }
        return true;
    }
}
