package com.yandex.div.core.widget;

import android.os.Build;
import android.widget.TextView;
import com.yandex.div.internal.widget.TextViewsKt;

/* JADX INFO: compiled from: FixedLineHeightHelper.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class FixedLineHeightHelper {
    private int lineHeight = -1;
    private int textPaddingBottom;
    private int textPaddingTop;
    private final TextView view;

    private final void applyLineHeight(int i10) {
        if (i10 == -1) {
            resetLineHeight();
            return;
        }
        int fontHeightInt = i10 - TextViewsKt.getFontHeightInt(this.view);
        if (fontHeightInt < 0) {
            int i11 = fontHeightInt / 2;
            this.textPaddingTop = i11;
            this.textPaddingBottom = fontHeightInt - i11;
        } else {
            int i12 = fontHeightInt / 2;
            this.textPaddingBottom = i12;
            this.textPaddingTop = fontHeightInt - i12;
        }
        this.view.setLineSpacing(i10 - TextViewsKt.getFontHeight(this.view), 1.0f);
        setFallbackLineSpacing(false);
    }

    private final void resetLineHeight() {
        this.textPaddingTop = 0;
        this.textPaddingBottom = 0;
        this.view.setLineSpacing(0.0f, 1.0f);
        setFallbackLineSpacing(true);
    }

    private final void setFallbackLineSpacing(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.view.setFallbackLineSpacing(z10);
        }
    }

    public final int getExtraPaddingBottom() {
        return this.textPaddingBottom;
    }

    public final int getExtraPaddingTop() {
        return this.textPaddingTop;
    }

    public final int getLineHeight() {
        return this.lineHeight;
    }

    public final void onFontSizeChanged() {
        applyLineHeight(this.lineHeight);
    }

    public final void setLineHeight(int i10) {
        if (this.lineHeight == i10) {
            return;
        }
        this.lineHeight = i10;
        applyLineHeight(i10);
    }

    public FixedLineHeightHelper(TextView textView) {
        this.view = textView;
        textView.setIncludeFontPadding(false);
    }
}
