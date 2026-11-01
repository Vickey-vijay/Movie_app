package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
abstract class zzzs {
    public final int zza;
    public final zzbg zzb;
    public final int zzc;
    public final zzv zzd;

    public abstract int zza();

    public abstract boolean zzc(zzzs zzzsVar);

    public zzzs(int i10, zzbg zzbgVar, int i11) {
        this.zza = i10;
        this.zzb = zzbgVar;
        this.zzc = i11;
        this.zzd = zzbgVar.zza(i11);
    }
}
