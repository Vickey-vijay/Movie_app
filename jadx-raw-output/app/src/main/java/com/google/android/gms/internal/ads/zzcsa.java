package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzcsa implements zzgzl {
    public final /* synthetic */ zzcsh zza;

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcsh zzcshVar = this.zza;
        zzcshVar.zzu().zzb(zzcshVar.zzt().zzb(zzcshVar.zzr(), zzcshVar.zzs(), false, "", (String) obj, zzcshVar.zzs().zzc, null, null), true == com.google.android.gms.ads.internal.zzt.zzh().zzs(zzcshVar.zzq()) ? 2 : 1);
    }

    public zzcsa(zzcsh zzcshVar) {
        Objects.requireNonNull(zzcshVar);
        this.zza = zzcshVar;
    }
}
