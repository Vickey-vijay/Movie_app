package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzcyh implements zzdha, zzdct {
    private final Clock zza;
    private final zzcyj zzb;
    private final zzfjk zzc;
    private final String zzd;

    public zzcyh(Clock clock, zzcyj zzcyjVar, zzfjk zzfjkVar, String str) {
        this.zza = clock;
        this.zzb = zzcyjVar;
        this.zzc = zzfjkVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdha
    public final void zza() {
        this.zzb.zzd(this.zzd, this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zzg() {
        Clock clock = this.zza;
        this.zzb.zze(this.zzc.zzg, this.zzd, clock.elapsedRealtime());
    }
}
