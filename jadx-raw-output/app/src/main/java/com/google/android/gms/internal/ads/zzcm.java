package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcm {
    public static final zzcm zza = new zzcm(0);
    public final long zzb;

    public zzcm(@IntRange(from = 0) long j10) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzgrc.zza(z10);
        this.zzb = j10;
    }
}
