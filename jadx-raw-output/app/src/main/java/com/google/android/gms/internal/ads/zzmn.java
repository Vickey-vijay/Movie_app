package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public interface zzmn {
    static boolean zzaa(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    String zzS();

    int zza();

    int zzab(zzv zzvVar) throws zziw;

    int zzu() throws zziw;

    default void zzv(zzmm zzmmVar) {
    }

    default void zzw() {
    }
}
