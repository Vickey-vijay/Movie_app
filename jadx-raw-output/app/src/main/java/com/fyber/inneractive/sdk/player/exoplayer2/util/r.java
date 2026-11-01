package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float f10 = ((s) obj).f17855c;
        float f11 = ((s) obj2).f17855c;
        if (f10 < f11) {
            return -1;
        }
        return f11 < f10 ? 1 : 0;
    }
}
