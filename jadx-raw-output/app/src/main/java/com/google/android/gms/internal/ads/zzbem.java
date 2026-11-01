package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbem {
    public final long zza;
    public final String zzb;
    public final int zzc;

    public zzbem(long j10, String str, int i10) {
        this.zza = j10;
        this.zzb = str;
        this.zzc = i10;
    }

    public final int hashCode() {
        return (int) this.zza;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzbem)) {
            return false;
        }
        zzbem zzbemVar = (zzbem) obj;
        return zzbemVar.zza == this.zza && zzbemVar.zzc == this.zzc;
    }
}
