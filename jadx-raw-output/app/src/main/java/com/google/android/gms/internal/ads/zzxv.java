package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzxv implements zzaam {
    public long zza;
    public long zzb;

    @Nullable
    public zzaal zzc;

    @Nullable
    public zzxv zzd;

    public final zzxv zzc() {
        this.zzc = null;
        zzxv zzxvVar = this.zzd;
        this.zzd = null;
        return zzxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    @Nullable
    public final zzaam zze() {
        zzxv zzxvVar = this.zzd;
        if (zzxvVar == null || zzxvVar.zzc == null) {
            return null;
        }
        return zzxvVar;
    }

    public final void zza(long j10, int i10) {
        zzgrc.zzi(this.zzc == null);
        this.zza = j10;
        this.zzb = j10 + PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }

    public final int zzb(long j10) {
        long j11 = j10 - this.zza;
        int i10 = this.zzc.zzb;
        return (int) j11;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final zzaal zzd() {
        zzaal zzaalVar = this.zzc;
        zzaalVar.getClass();
        return zzaalVar;
    }

    public zzxv(long j10, int i10) {
        zza(j10, 65536);
    }
}
