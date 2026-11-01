package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfew implements zzese {
    public final /* synthetic */ zzfez zza;

    @Override // com.google.android.gms.internal.ads.zzese
    public final void zza() {
        zzfez zzfezVar = this.zza;
        synchronized (zzfezVar) {
            zzfezVar.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzese
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzctr zzctrVar = (zzctr) obj;
        zzfez zzfezVar = this.zza;
        synchronized (zzfezVar) {
            zzctr zzctrVar2 = zzfezVar.zza;
            if (zzctrVar2 != null) {
                zzctrVar2.zzd();
            }
            zzfezVar.zza = zzctrVar;
            zzctrVar.zza(zzfezVar);
            zzfezVar.zzN().zzs(new zzcts(zzctrVar, zzfezVar, zzfezVar.zzN(), zzfezVar.zzO()));
            zzctrVar.zzj();
        }
    }

    public zzfew(zzfez zzfezVar) {
        Objects.requireNonNull(zzfezVar);
        this.zza = zzfezVar;
    }
}
