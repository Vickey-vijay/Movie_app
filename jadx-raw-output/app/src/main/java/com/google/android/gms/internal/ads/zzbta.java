package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzbta implements zzcer {
    public final /* synthetic */ zzbsf zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ zzcen zzc;
    public final /* synthetic */ zzbtd zzd;

    public zzbta(zzbtd zzbtdVar, zzbsf zzbsfVar, Object obj, zzcen zzcenVar) {
        this.zza = zzbsfVar;
        this.zzb = obj;
        this.zzc = zzcenVar;
        Objects.requireNonNull(zzbtdVar);
        this.zzd = zzbtdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcer
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzcen zzcenVar = this.zzc;
        this.zzd.zzc(this.zza, (zzbsm) obj, obj2, zzcenVar);
    }
}
