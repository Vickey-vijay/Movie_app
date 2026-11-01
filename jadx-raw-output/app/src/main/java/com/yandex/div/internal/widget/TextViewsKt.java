package com.yandex.div.internal.widget;

import android.os.Build;
import android.widget.TextView;
import androidx.annotation.ChecksSdkIntAtLeast;

/* JADX INFO: compiled from: TextViews.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class TextViewsKt {
    @ChecksSdkIntAtLeast(api = 26)
    public static final boolean checkHyphenationSupported() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static final float getFontHeight(TextView textView) {
        return textView.getPaint().getFontMetrics(null);
    }

    public static final int getFontHeightInt(TextView textView) {
        return textView.getPaint().getFontMetricsInt(null);
    }

    public static final boolean isHyphenationEnabled(TextView textView) {
        if (checkHyphenationSupported() && textView.getHyphenationFrequency() != 0) {
            return true;
        }
        return false;
    }

    public static final int lineAt(TextView textView, int i10) {
        if (textView.getLayout() == null) {
            return 0;
        }
        return textView.getLayout().getLineForVertical(i10);
    }

    public static final int textHeight(TextView textView, int i10) {
        if (textView.getLayout() == null) {
            return 0;
        }
        if (i10 <= 0) {
            return textView.getLayout().getHeight();
        }
        if (i10 > textView.getLayout().getLineCount()) {
            return textView.getLayout().getHeight();
        }
        return textView.getLayout().getLineTop(i10) - textView.getLayout().getLineTop(0);
    }
}
