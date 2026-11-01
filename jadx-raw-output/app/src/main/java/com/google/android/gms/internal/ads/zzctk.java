package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public interface zzctk extends zzdal {
    @Override // com.google.android.gms.internal.ads.zzdal
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    zzctl zzh();

    zzctk zzb(@Nullable zzffr zzffrVar);

    zzctk zzc(@Nullable zzfgn zzfgnVar);

    zzctk zzd(zzdao zzdaoVar);

    zzctk zze(zzdhf zzdhfVar);

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
