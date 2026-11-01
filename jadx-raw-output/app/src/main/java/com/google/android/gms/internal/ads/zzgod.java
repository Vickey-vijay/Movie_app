package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzgod implements zzgzl {
    public final /* synthetic */ zzgoc zza;

    public zzgod(zzgoe zzgoeVar, zzgoc zzgocVar) {
        this.zza = zzgocVar;
        Objects.requireNonNull(zzgoeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzgoc zzgocVar = this.zza;
        zzgocVar.zzb(th2);
        zzgocVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        this.zza.zzc();
    }
}
