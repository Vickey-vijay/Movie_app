package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdqx implements zzgzl {
    public final /* synthetic */ zzdxh zza;
    public final /* synthetic */ zzdra zzb;

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
    }

    public zzdqx(zzdra zzdraVar, zzdxh zzdxhVar) {
        this.zza = zzdxhVar;
        Objects.requireNonNull(zzdraVar);
        this.zzb = zzdraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        this.zzb.zzd().zze().putLong(this.zza.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
    }
}
