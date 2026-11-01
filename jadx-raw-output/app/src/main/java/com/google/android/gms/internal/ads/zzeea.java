package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzeea implements zzgzl {
    public final /* synthetic */ zzeeg zza;

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfjc zzfjcVar = (zzfjc) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcP)).booleanValue()) {
            this.zza.zzf().zzdP(zzfjcVar);
        }
    }

    public zzeea(zzeeg zzeegVar) {
        Objects.requireNonNull(zzeegVar);
        this.zza = zzeegVar;
    }
}
