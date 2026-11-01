package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzcvx {
    private final zzdeg zza;

    @Nullable
    private final zzdgl zzb;

    public zzcvx(zzdeg zzdegVar, @Nullable zzdgl zzdglVar) {
        this.zza = zzdegVar;
        this.zzb = zzdglVar;
    }

    public final zzdeg zza() {
        return this.zza;
    }

    @Nullable
    public final zzdgl zzc() {
        return this.zzb;
    }

    public final zzdje zzb() {
        zzdgl zzdglVar = this.zzb;
        return zzdglVar != null ? new zzdje(zzdglVar, zzcei.zzg) : new zzdje(new zzcvw(this), zzcei.zzg);
    }
}
