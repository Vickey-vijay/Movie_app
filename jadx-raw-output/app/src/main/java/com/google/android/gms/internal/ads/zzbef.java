package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbef {
    private final float zza;
    private final float zzb;
    private final float zzc;
    private final float zzd;
    private final int zze;

    @VisibleForTesting
    public zzbef(float f10, float f11, float f12, float f13, int i10) {
        this.zza = f10;
        this.zzb = f11;
        this.zzc = f10 + f12;
        this.zzd = f11 + f13;
        this.zze = i10;
    }

    public final float zza() {
        return this.zza;
    }

    public final float zzb() {
        return this.zzb;
    }

    public final float zzc() {
        return this.zzc;
    }

    public final float zzd() {
        return this.zzd;
    }

    public final int zze() {
        return this.zze;
    }
}
