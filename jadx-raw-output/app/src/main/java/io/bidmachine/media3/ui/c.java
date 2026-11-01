package io.bidmachine.media3.ui;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import io.bidmachine.media3.common.util.Util;

/* JADX INFO: compiled from: HtmlUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c {
    private c() {
    }

    public static String toCssRgba(@ColorInt int i10) {
        return Util.formatInvariant("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(((double) Color.alpha(i10)) / 255.0d));
    }

    public static String cssAllClassDescendantsSelector(String str) {
        return "." + str + ",." + str + " *";
    }
}
