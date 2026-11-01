package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzbru implements zzcer {
    public final /* synthetic */ zzbsk zza;
    public final /* synthetic */ zzfoe zzb;
    public final /* synthetic */ zzbsl zzc;

    public zzbru(zzbsl zzbslVar, zzbsk zzbskVar, zzfoe zzfoeVar) {
        this.zza = zzbskVar;
        this.zzb = zzfoeVar;
        Objects.requireNonNull(zzbslVar);
        this.zzc = zzbslVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcer
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        zzbsl zzbslVar = this.zzc;
        synchronized (zzbslVar.zzg()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
            zzbslVar.zzl(0);
            if (zzbslVar.zzi() != null && this.zza != zzbslVar.zzi()) {
                com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                zzbslVar.zzi().zzc();
            }
            zzbslVar.zzj(this.zza);
            if (((Boolean) zzbix.zzd.zze()).booleanValue() && zzbslVar.zzh() != null) {
                zzfor zzforVarZzh = zzbslVar.zzh();
                zzfoe zzfoeVar = this.zzb;
                zzfoeVar.zzd(true);
                zzforVarZzh.zzb(zzfoeVar.zzm());
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
