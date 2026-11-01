package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfih implements zzese {
    public final /* synthetic */ zzfii zza;

    @Override // com.google.android.gms.internal.ads.zzese
    public final void zza() {
        zzfii zzfiiVar = this.zza;
        synchronized (zzfiiVar) {
            zzfiiVar.zzw(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzese
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfii zzfiiVar = this.zza;
        zzdtz zzdtzVar = (zzdtz) obj;
        synchronized (zzfiiVar) {
            zzfiiVar.zzw(zzdtzVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzet)).booleanValue()) {
                zzdtzVar.zzh().zza = zzfiiVar.zzu();
            }
            zzfiiVar.zzv().zzj();
        }
    }

    public zzfih(zzfii zzfiiVar) {
        Objects.requireNonNull(zzfiiVar);
        this.zza = zzfiiVar;
    }
}
