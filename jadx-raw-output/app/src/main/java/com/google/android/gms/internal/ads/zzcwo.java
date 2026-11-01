package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzcwo implements zzgzl {
    public final /* synthetic */ zzgzl zza;
    public final /* synthetic */ zzcwu zzb;

    public zzcwo(zzcwu zzcwuVar, zzgzl zzgzlVar) {
        this.zza = zzgzlVar;
        Objects.requireNonNull(zzcwuVar);
        this.zzb = zzcwuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        this.zza.zza(th2);
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zze(((zzcwn) obj).zza, this.zza);
    }
}
