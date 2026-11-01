package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: TabTitleDelimitersController.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class TabTitleDelimitersController {
    private final Context context;
    private final BaseIndicatorTabLayout.OvalIndicators indicators;
    private Bitmap tabDelimiterBitmap;
    private int tabDelimiterHeight;
    private int tabDelimiterWidth;

    private final View createDelimiterView() {
        ImageView imageView = new ImageView(this.context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.tabDelimiterWidth, this.tabDelimiterHeight);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageBitmap(this.tabDelimiterBitmap);
        return imageView;
    }

    private final boolean getHasTabDelimiters() {
        return this.tabDelimiterBitmap != null;
    }

    private final void removeDelimiters() {
        if (this.indicators.hasDelimiters()) {
            for (int childCount = this.indicators.getChildCount() - 1; childCount > 0; childCount -= 2) {
                this.indicators.removeViewAt(childCount);
            }
        }
        this.indicators.setContainsDelimiters(false);
    }

    public final void updateTitleDelimiters(Bitmap bitmap, int i10, int i11) {
        this.tabDelimiterBitmap = bitmap;
        this.tabDelimiterHeight = i11;
        this.tabDelimiterWidth = i10;
        addDelimiters();
    }

    public TabTitleDelimitersController(Context context, BaseIndicatorTabLayout.OvalIndicators ovalIndicators) {
        this.context = context;
        this.indicators = ovalIndicators;
    }

    private final void addDelimiters() {
        removeDelimiters();
        if (!getHasTabDelimiters()) {
            return;
        }
        int childCount = this.indicators.getChildCount();
        for (int i10 = 1; i10 < childCount; i10++) {
            this.indicators.addView(createDelimiterView(), (i10 * 2) - 1);
        }
        this.indicators.setContainsDelimiters(true);
    }

    public final void tabAdded(int i10) {
        if (!getHasTabDelimiters() || this.indicators.getChildCount() == 1) {
            return;
        }
        if (i10 == 0) {
            this.indicators.addView(createDelimiterView(), 1);
        } else {
            this.indicators.addView(createDelimiterView(), i10);
        }
    }

    public final void tabRemoved(int i10) {
        if (!getHasTabDelimiters() || this.indicators.getChildCount() == 0) {
            return;
        }
        if (i10 == 0) {
            this.indicators.removeViewAt(0);
        } else {
            this.indicators.removeViewAt(i10 - 1);
        }
    }
}
