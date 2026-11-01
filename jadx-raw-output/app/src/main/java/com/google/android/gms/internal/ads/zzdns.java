package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdns implements zzgzl {
    public final /* synthetic */ String zza = "Google";
    public final /* synthetic */ zzdoc zzb;

    public zzdns(zzdoc zzdocVar, String str, boolean z10) {
        Objects.requireNonNull(zzdocVar);
        this.zzb = zzdocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgr)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdoc zzdocVar = this.zzb;
        zzdocVar.zzZ().zzo((zzcjl) obj);
        String str = this.zza;
        zzcen zzcenVarZzY = zzdocVar.zzZ().zzY();
        zzekb zzekbVarZzL = zzdocVar.zzL(str, true);
        if (zzekbVarZzL != null && zzcenVarZzY != null) {
            zzcenVarZzY.zzc(zzekbVarZzL);
        } else if (zzcenVarZzY != null) {
            zzcenVarZzY.cancel(false);
        }
    }
}
