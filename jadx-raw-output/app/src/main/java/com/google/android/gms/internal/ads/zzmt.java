package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzmt {
    public static final zzmt zza;
    public static final zzmt zzb;
    public static final zzmt zzc;
    public final long zzd;
    public final long zze;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmt.class == obj.getClass()) {
            zzmt zzmtVar = (zzmt) obj;
            if (this.zzd == zzmtVar.zzd && this.zze == zzmtVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzd) * 31) + ((int) this.zze);
    }

    static {
        zzmt zzmtVar = new zzmt(0L, 0L);
        zza = zzmtVar;
        new zzmt(Long.MAX_VALUE, Long.MAX_VALUE);
        zzb = new zzmt(Long.MAX_VALUE, 0L);
        new zzmt(0L, Long.MAX_VALUE);
        zzc = zzmtVar;
    }

    public zzmt(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzgrc.zza(z10);
        zzgrc.zza(j11 >= 0);
        this.zzd = j10;
        this.zze = j11;
    }
}
