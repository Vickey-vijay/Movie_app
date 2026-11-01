package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzdmp extends zzdal {
    @Override // com.google.android.gms.internal.ads.zzdal
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    zzdmq zzh();

    zzdmp zzb(@Nullable zzffr zzffrVar);

    zzdmp zzc(@Nullable zzfgn zzfgnVar);

    zzdmp zzd(zzctu zzctuVar);

    zzdmp zze(zzdml zzdmlVar);

    zzdmp zzf(zzdao zzdaoVar);

    zzdmp zzg(zzdhf zzdhfVar);

    @Override // com.google.android.gms.internal.ads.zzdal
    /* bridge */ /* synthetic */ default zzdal zzi(@Nullable zzffr zzffrVar) {
        zzb(zzffrVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdal
    /* bridge */ /* synthetic */ default zzdal zzj(@Nullable zzfgn zzfgnVar) {
        zzc(zzfgnVar);
        return this;
    }
}
