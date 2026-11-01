package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzcsb implements zzgzl {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzcsh zzb;

    public zzcsb(zzcsh zzcshVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzcshVar);
        this.zzb = zzcshVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzcsh zzcshVar = this.zzb;
        zzcshVar.zzu().zza(zzcshVar.zzt().zzb(zzcshVar.zzr(), zzcshVar.zzs(), false, this.zza, null, zzcshVar.zzp(), zzcshVar.zzw(), zzcshVar.zzx()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = this.zza;
        String str2 = (String) obj;
        zzcsh zzcshVar = this.zzb;
        zzcshVar.zzu().zza(zzcshVar.zzt().zzb(zzcshVar.zzr(), zzcshVar.zzs(), false, str, str2, zzcshVar.zzp(), zzcshVar.zzw(), zzcshVar.zzx()), zzcshVar.zzv());
    }
}
