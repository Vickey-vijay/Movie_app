package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzena implements zzgzl {
    public final /* synthetic */ zzfir zza;
    public final /* synthetic */ zzenb zzb;

    public zzena(zzenb zzenbVar, zzfir zzfirVar) {
        this.zza = zzfirVar;
        Objects.requireNonNull(zzenbVar);
        this.zzb = zzenbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzenb zzenbVar = this.zzb;
        synchronized (zzenbVar) {
            zzenc zzencVarZzc = zzenbVar.zzc();
            zzfir zzfirVar = this.zza;
            zzencVarZzc.zzc(th2, zzfirVar);
            zzfir zzfirVarZza = zzenbVar.zzc().zza();
            if (zzfirVar.zzav) {
                while (zzfirVarZza != null) {
                    zzenbVar.zzb(zzfirVarZza);
                    zzfirVarZza = zzenbVar.zzc().zza();
                }
            } else if (zzfirVarZza != null) {
                zzenbVar.zzb(zzfirVarZza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzenb zzenbVar = this.zzb;
        zzens zzensVar = (zzens) obj;
        synchronized (zzenbVar) {
            zzenbVar.zzc().zzb(zzensVar, this.zza);
            zzfir zzfirVarZza = zzenbVar.zzc().zza();
            if (zzfirVarZza != null) {
                zzenbVar.zzb(zzfirVarZza);
            }
        }
    }
}
