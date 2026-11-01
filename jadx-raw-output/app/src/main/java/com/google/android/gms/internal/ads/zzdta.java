package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdta implements zzgzl {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzboh zzb;

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
    }

    public zzdta(zzdtk zzdtkVar, String str, zzboh zzbohVar) {
        this.zza = str;
        this.zzb = zzbohVar;
        Objects.requireNonNull(zzdtkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcjl) obj).zzab(this.zza, this.zzb);
    }
}
