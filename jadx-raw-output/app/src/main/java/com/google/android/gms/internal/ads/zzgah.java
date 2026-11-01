package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgah {
    private final String zza;
    private final long zzb;

    public zzgah() {
        this.zza = null;
        this.zzb = -1L;
    }

    public zzgah(String str, long j10) {
        this.zza = str;
        this.zzb = j10;
    }

    @Nullable
    public final String zza() {
        return this.zza;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zza != null && this.zzb > 0;
    }
}
