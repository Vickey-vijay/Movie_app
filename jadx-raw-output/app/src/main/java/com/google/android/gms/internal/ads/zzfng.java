package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfng implements zzgzl {
    public final /* synthetic */ zzfnb zza;
    public final /* synthetic */ zzfnl zzb;

    public zzfng(zzfnl zzfnlVar, zzfnb zzfnbVar) {
        this.zza = zzfnbVar;
        Objects.requireNonNull(zzfnlVar);
        this.zzb = zzfnlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        this.zzb.zza.zzg().zzc(this.zza, th2);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        this.zzb.zza.zzg().zzd(this.zza);
    }
}
