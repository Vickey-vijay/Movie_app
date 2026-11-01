package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzabx implements zzado {
    public final /* synthetic */ zzacc zza;

    @Override // com.google.android.gms.internal.ads.zzado
    public final void zzd(zzbv zzbvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void zza() {
        zzmk zzmkVarZzaY = this.zza.zzaY();
        if (zzmkVarZzaY != null) {
            zzmkVarZzaY.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void zzb() {
        zzacc zzaccVar = this.zza;
        if (zzaccVar.zzbk() != null) {
            zzaccVar.zzbj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void zzc() {
        zzacc zzaccVar = this.zza;
        if (zzaccVar.zzbk() != null) {
            zzaccVar.zzaw(0, 1);
        }
    }

    public zzabx(zzacc zzaccVar) {
        Objects.requireNonNull(zzaccVar);
        this.zza = zzaccVar;
    }
}
