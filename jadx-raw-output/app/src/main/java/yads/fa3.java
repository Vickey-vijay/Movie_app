package yads;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes9.dex */
public abstract class fa3 {
    public static final int a(int i10) {
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        if (i10 >= 0) {
            return ek.b.c(i10 / f10);
        }
        return i10;
    }
}
