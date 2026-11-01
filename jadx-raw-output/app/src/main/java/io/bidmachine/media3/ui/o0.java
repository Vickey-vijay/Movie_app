package io.bidmachine.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.text.LanguageFeatureSpan;
import io.bidmachine.media3.common.util.Assertions;

/* JADX INFO: compiled from: SubtitleViewUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class o0 {
    private o0() {
    }

    public static float resolveTextSize(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$removeAllEmbeddedStyling$0(Object obj) {
        return !(obj instanceof LanguageFeatureSpan);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$removeEmbeddedFontSizes$1(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static void removeAllEmbeddedStyling(Cue.Builder builder) {
        builder.clearWindowColor();
        if (builder.getText() instanceof Spanned) {
            if (!(builder.getText() instanceof Spannable)) {
                builder.setText(SpannableString.valueOf(builder.getText()));
            }
            removeSpansIf((Spannable) Assertions.checkNotNull(builder.getText()), new m5.m() { // from class: io.bidmachine.media3.ui.n0
                @Override // m5.m
                public final boolean apply(Object obj) {
                    return o0.lambda$removeAllEmbeddedStyling$0(obj);
                }
            });
        }
        removeEmbeddedFontSizes(builder);
    }

    public static void removeEmbeddedFontSizes(Cue.Builder builder) {
        builder.setTextSize(-3.4028235E38f, Integer.MIN_VALUE);
        if (builder.getText() instanceof Spanned) {
            if (!(builder.getText() instanceof Spannable)) {
                builder.setText(SpannableString.valueOf(builder.getText()));
            }
            removeSpansIf((Spannable) Assertions.checkNotNull(builder.getText()), new m5.m() { // from class: io.bidmachine.media3.ui.m0
                @Override // m5.m
                public final boolean apply(Object obj) {
                    return o0.lambda$removeEmbeddedFontSizes$1(obj);
                }
            });
        }
    }

    private static void removeSpansIf(Spannable spannable, m5.m<Object> mVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (mVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }
}
