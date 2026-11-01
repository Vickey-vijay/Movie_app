package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfol implements zzgzl {
    public final /* synthetic */ zzfoo zza;
    public final /* synthetic */ zzfoe zzb;

    public zzfol(zzfoo zzfooVar, zzfoe zzfoeVar) {
        this.zza = zzfooVar;
        this.zzb = zzfoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzfoe zzfoeVar = this.zzb;
        zzfoeVar.zzj(th2);
        zzfoeVar.zzd(false);
        this.zza.zza(zzfoeVar);
    }
}
