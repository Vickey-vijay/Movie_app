package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzbzz implements Callable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzcab zzb;

    public zzbzz(zzcab zzcabVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzcabVar);
        this.zzb = zzcabVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0038  */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbzy zzbzyVarZza;
        zzcab zzcabVar = this.zzb;
        WeakHashMap weakHashMapZzb = zzcabVar.zzb();
        Context context = this.zza;
        zzcaa zzcaaVar = (zzcaa) weakHashMapZzb.get(context);
        if (zzcaaVar != null) {
            if (zzcaaVar.zza + ((Long) zzbit.zzd.zze()).longValue() < com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()) {
                zzbzyVarZza = new zzbzx(context).zza();
            } else {
                zzbzyVarZza = new zzbzx(context, zzcaaVar.zzb).zza();
            }
        } else {
            zzbzyVarZza = new zzbzx(context).zza();
        }
        zzcabVar.zzb().put(context, new zzcaa(zzcabVar, zzbzyVarZza));
        return zzbzyVarZza;
    }
}
