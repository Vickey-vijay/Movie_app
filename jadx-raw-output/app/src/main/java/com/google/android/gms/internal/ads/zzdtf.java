package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdtf {
    private final zzdbd zza;
    private final zzdcm zzb;
    private final zzdcz zzc;
    private final zzddq zzd;
    private final zzdgj zze;
    private final zzfir zzf;
    private final zzfiu zzg;
    private final zzcrv zzh;

    public zzdtf(zzdbd zzdbdVar, zzdcm zzdcmVar, zzdcz zzdczVar, zzddq zzddqVar, zzdgj zzdgjVar, zzfir zzfirVar, zzfiu zzfiuVar, zzcrv zzcrvVar) {
        this.zza = zzdbdVar;
        this.zzb = zzdcmVar;
        this.zzc = zzdczVar;
        this.zzd = zzddqVar;
        this.zze = zzdgjVar;
        this.zzf = zzfirVar;
        this.zzg = zzfiuVar;
        this.zzh = zzcrvVar;
    }

    public final void zza(zzdtk zzdtkVar) {
        final zzdcm zzdcmVar = this.zzb;
        zzdsy zzdsyVarZzk = zzdtkVar.zzk();
        Objects.requireNonNull(zzdcmVar);
        zzdsyVarZzk.zzm(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdte
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                zzdcmVar.zzb();
            }
        });
        zzdtkVar.zzg(this.zzf, this.zzg, this.zzh);
    }
}
