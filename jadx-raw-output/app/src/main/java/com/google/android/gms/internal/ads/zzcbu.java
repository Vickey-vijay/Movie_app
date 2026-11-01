package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzcbu implements zzgzl {
    public final /* synthetic */ q5.i zza;

    public zzcbu(zzcbz zzcbzVar, q5.i iVar) {
        this.zza = iVar;
        Objects.requireNonNull(zzcbzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcbz.zzc.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzcbz.zzc.remove(this.zza);
    }
}
