package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzikd {
    private static int zzd(int i10) {
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static List zza(int i10) {
        return i10 == 0 ? Collections.emptyList() : new ArrayList(i10);
    }

    public static HashSet zzb(int i10) {
        return new HashSet(zzd(i10));
    }

    public static LinkedHashMap zzc(int i10) {
        return new LinkedHashMap(zzd(i10));
    }
}
