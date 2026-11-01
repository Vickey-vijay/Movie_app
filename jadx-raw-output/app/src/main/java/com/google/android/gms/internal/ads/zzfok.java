package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfok implements zzgzl {
    public final /* synthetic */ zzfoo zza;
    public final /* synthetic */ zzfoe zzb;
    public final /* synthetic */ boolean zzc;

    public zzfok(zzfoo zzfooVar, zzfoe zzfoeVar, boolean z10) {
        this.zza = zzfooVar;
        this.zzb = zzfoeVar;
        this.zzc = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzfoe zzfoeVar = this.zzb;
        if (zzfoeVar.zzb()) {
            zzfoo zzfooVar = this.zza;
            zzfoeVar.zzj(th2);
            zzfoeVar.zzd(false);
            zzfooVar.zza(zzfoeVar);
            if (this.zzc) {
                zzfooVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        zzfoe zzfoeVar = this.zzb;
        zzfoeVar.zzd(true);
        zzfoo zzfooVar = this.zza;
        zzfooVar.zza(zzfoeVar);
        if (this.zzc) {
            zzfooVar.zzh();
        }
    }
}
