package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzekh implements zzekg {

    @VisibleForTesting
    public final zzekg zza;
    private final zzgqt zzb;

    public zzekh(zzekg zzekgVar, zzgqt zzgqtVar) {
        this.zza = zzekgVar;
        this.zzb = zzgqtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        return this.zza.zza(zzfjcVar, zzfirVar);
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final q5.i zzb(zzfjc zzfjcVar, zzfir zzfirVar) {
        return zzgzo.zzk(this.zza.zzb(zzfjcVar, zzfirVar), this.zzb, zzcei.zza);
    }
}
