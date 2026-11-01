package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzsq {
    private final zzv zza;
    private final zzv zzb;
    private final int zzc;
    private final int zzd;
    private final zzql zze;
    private final zzck zzf;

    private zzsq(zzv zzvVar, zzv zzvVar2, int i10, int i11, zzql zzqlVar, zzck zzckVar) {
        this.zza = zzvVar;
        this.zzb = zzvVar2;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = zzqlVar;
        this.zzf = zzckVar;
    }

    public /* synthetic */ zzsq(zzv zzvVar, zzv zzvVar2, int i10, int i11, zzql zzqlVar, zzck zzckVar, byte[] bArr) {
        this(zzvVar, zzvVar2, i10, i11, zzqlVar, zzckVar);
    }

    public final /* synthetic */ zzsq zza(zzql zzqlVar) {
        return new zzsq(this.zza, this.zzb, this.zzc, this.zzd, zzqlVar, this.zzf);
    }

    public final /* synthetic */ zzrd zze() {
        zzql zzqlVar = this.zze;
        return new zzrd(zzqlVar.zza, zzqlVar.zzb, zzqlVar.zzc, false, false, zzqlVar.zze);
    }

    public final /* synthetic */ zzv zzg() {
        return this.zza;
    }

    public final /* synthetic */ zzv zzh() {
        return this.zzb;
    }

    public final /* synthetic */ int zzi() {
        return this.zzc;
    }

    public final /* synthetic */ int zzj() {
        return this.zzd;
    }

    public final /* synthetic */ zzql zzk() {
        return this.zze;
    }

    public final /* synthetic */ zzck zzl() {
        return this.zzf;
    }

    public final /* synthetic */ boolean zzb(zzsq zzsqVar) {
        return zzsqVar.zze.equals(this.zze);
    }

    public final /* synthetic */ long zzc(long j10) {
        return zzfj.zzr(j10, this.zza.zzH);
    }

    public final /* synthetic */ long zzd(long j10) {
        return zzfj.zzr(j10, this.zze.zzb);
    }

    public final /* synthetic */ boolean zzf() {
        return Objects.equals(this.zza.zzo, "audio/raw");
    }
}
