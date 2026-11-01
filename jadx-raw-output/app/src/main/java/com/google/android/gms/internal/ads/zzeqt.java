package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzeqt implements zzese {
    public final /* synthetic */ zzequ zza;

    @Override // com.google.android.gms.internal.ads.zzese
    public final void zza() {
        zzequ zzequVar = this.zza;
        synchronized (zzequVar) {
            zzequVar.zzN(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzese
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzequ zzequVar = this.zza;
        zzctx zzctxVar = (zzctx) obj;
        synchronized (zzequVar) {
            if (zzequVar.zzM() != null) {
                if (zzctxVar.zzo() != null && zzequVar.zzM().zzo() != null) {
                    zzctxVar.zzo().zzb(zzequVar.zzM().zzo().zza());
                }
                zzequVar.zzM().zzd();
            }
            zzequVar.zzN(zzctxVar);
            zzequVar.zzM().zzj();
        }
    }

    public zzeqt(zzequ zzequVar) {
        Objects.requireNonNull(zzequVar);
        this.zza = zzequVar;
    }
}
