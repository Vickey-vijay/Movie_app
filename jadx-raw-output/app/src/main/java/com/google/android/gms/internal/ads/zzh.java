package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzh {
    private int zza;
    private int zzb;
    private int zzc;

    @Nullable
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzh() {
        this.zza = -1;
        this.zzb = -1;
        this.zzc = -1;
        this.zze = -1;
        this.zzf = -1;
    }

    public /* synthetic */ zzh(zzi zziVar, byte[] bArr) {
        this.zza = zziVar.zzb;
        this.zzb = zziVar.zzc;
        this.zzc = zziVar.zzd;
        this.zzd = zziVar.zze;
        this.zze = zziVar.zzf;
        this.zzf = zziVar.zzg;
    }

    public final zzh zza(int i10) {
        this.zza = i10;
        return this;
    }

    public final zzh zzb(int i10) {
        this.zzb = i10;
        return this;
    }

    public final zzh zzc(int i10) {
        this.zzc = i10;
        return this;
    }

    public final zzh zzd(@Nullable byte[] bArr) {
        this.zzd = bArr;
        return this;
    }

    public final zzh zze(int i10) {
        this.zze = i10;
        return this;
    }

    public final zzh zzf(int i10) {
        this.zzf = i10;
        return this;
    }

    public final zzi zzg() {
        return new zzi(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
    }
}
