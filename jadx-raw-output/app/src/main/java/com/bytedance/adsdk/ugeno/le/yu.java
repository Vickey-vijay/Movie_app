package com.bytedance.adsdk.ugeno.le;

import java.util.Collection;

/* JADX INFO: loaded from: classes8.dex */
public final class yu {
    public static int ouw(boolean z10, int i10, int i11) {
        if (i11 == 0 || !z10) {
            return i10;
        }
        int i12 = i10 - 512;
        int iAbs = Math.abs(i12) % i11;
        return (i12 >= 0 || iAbs == 0) ? iAbs : i11 - iAbs;
    }

    public static boolean ouw(int i10, Collection<?> collection) {
        return i10 >= 0 && i10 < collection.size();
    }
}
