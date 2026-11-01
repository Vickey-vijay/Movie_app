package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzayw implements zzfwf {
    public final /* synthetic */ zzfvh zza;

    public zzayw(zzfvh zzfvhVar) {
        this.zza = zzfvhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final void zza(int i10, long j10) {
        this.zza.zzb(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final void zzb(int i10, long j10, String str) {
        this.zza.zzf(i10, System.currentTimeMillis() - j10, str);
    }
}
