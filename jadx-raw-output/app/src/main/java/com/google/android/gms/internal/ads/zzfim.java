package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfim implements zzese {
    public final /* synthetic */ zzfio zza;

    @Override // com.google.android.gms.internal.ads.zzese
    public final void zza() {
        zzfio zzfioVar = this.zza;
        synchronized (zzfioVar) {
            zzfioVar.zzx(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzese
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfio zzfioVar = this.zza;
        zzdtz zzdtzVar = (zzdtz) obj;
        synchronized (zzfioVar) {
            zzfioVar.zzx(zzdtzVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzet)).booleanValue()) {
                zzdtzVar.zzh().zza = zzfioVar.zzv();
            }
            zzfioVar.zzw().zzj();
        }
    }

    public zzfim(zzfio zzfioVar) {
        Objects.requireNonNull(zzfioVar);
        this.zza = zzfioVar;
    }
}
