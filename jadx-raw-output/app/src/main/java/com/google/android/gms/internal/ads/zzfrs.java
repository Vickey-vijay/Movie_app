package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfrs implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzb;
    public final /* synthetic */ zzfsa zzc;

    public zzfrs(zzfsa zzfsaVar, long j10, com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zza = j10;
        this.zzb = zzeaVar;
        Objects.requireNonNull(zzfsaVar);
        this.zzc = zzfsaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfsa zzfsaVar = this.zzc;
        if (zzfsaVar.zzI() != null) {
            zzfrf zzfrfVarZzI = zzfsaVar.zzI();
            long j10 = this.zza;
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            zzfrfVarZzI.zzi(j10, zzfsa.zzX(zzeaVar), zzfsaVar.zzK(), zzfsaVar.zze.zzd, zzfsaVar.zzp(), zzfsaVar.zzH());
        }
    }
}
