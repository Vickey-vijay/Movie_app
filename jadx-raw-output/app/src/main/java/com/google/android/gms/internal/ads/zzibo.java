package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzibo implements zzibf {
    public final int zza;
    public final zzies zzb;
    public final boolean zzc;
    public final boolean zzd;

    public zzibo(zzibw zzibwVar, int i10, zzies zziesVar, boolean z10, boolean z11) {
        this.zza = i10;
        this.zzb = zziesVar;
        this.zzc = z10;
        this.zzd = z11;
    }

    @Override // com.google.android.gms.internal.ads.zzibf
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzibf
    public final zzies zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzibf
    public final boolean zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzibf
    public final boolean zze() {
        return this.zzd;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzibo) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzibf
    public final zziet zzc() {
        return this.zzb.zza();
    }
}
