package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzflq implements zzgzl {
    public final /* synthetic */ zzflt zza;
    public final /* synthetic */ zzflv zzb;

    public zzflq(zzflv zzflvVar, zzflt zzfltVar) {
        this.zza = zzfltVar;
        Objects.requireNonNull(zzflvVar);
        this.zzb = zzflvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzflv zzflvVar = this.zzb;
        synchronized (zzflvVar) {
            zzflvVar.zzf(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzflv zzflvVar = this.zzb;
        synchronized (zzflvVar) {
            zzflvVar.zzf(null);
            zzflvVar.zze().addFirst(this.zza);
            if (zzflvVar.zzg() == 1) {
                zzflvVar.zzd();
            }
        }
    }
}
