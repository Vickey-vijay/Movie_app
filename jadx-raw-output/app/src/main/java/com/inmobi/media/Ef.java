package com.inmobi.media;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Ef {
    public static final Df a(byte b10) {
        if (b10 == 1) {
            return Df.PORTRAIT;
        }
        if (b10 == 2) {
            return Df.REVERSE_PORTRAIT;
        }
        if (b10 == 3) {
            return Df.LANDSCAPE;
        }
        return b10 == 4 ? Df.REVERSE_LANDSCAPE : Df.PORTRAIT;
    }

    public static final boolean b(Df df2) {
        ck.p.j(df2, "<this>");
        return df2 == Df.LANDSCAPE || df2 == Df.REVERSE_LANDSCAPE;
    }

    public static final int a(Df df2) {
        ck.p.j(df2, "<this>");
        int iOrdinal = df2.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 90;
        }
        if (iOrdinal == 2) {
            return BaseTransientBottomBar.ANIMATION_FADE_DURATION;
        }
        if (iOrdinal == 3) {
            return 270;
        }
        throw new NoWhenBranchMatchedException();
    }
}
