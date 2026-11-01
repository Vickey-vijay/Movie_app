package jp.wasabeef.glide.transformations.internal;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes2.dex */
public final class Utils {
    private Utils() {
    }

    public static int toDp(int i10) {
        return i10 * ((int) Resources.getSystem().getDisplayMetrics().density);
    }
}
