package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
@Deprecated
public class zzceu {
    private final zzcen zza;
    private final AtomicInteger zzb;

    public final /* synthetic */ AtomicInteger zzj() {
        return this.zzb;
    }

    @Deprecated
    public final void zze(zzcer zzcerVar, zzcep zzcepVar) {
        zzgzo.zzr(this.zza, new zzcet(this, zzcerVar, zzcepVar), zzcei.zzg);
    }

    @Deprecated
    public final void zzf(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th2, String str) {
        this.zza.zzd(th2);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziK)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, str);
        }
    }

    @Deprecated
    public final int zzi() {
        return this.zzb.get();
    }

    public zzceu() {
        zzcen zzcenVar = new zzcen();
        this.zza = zzcenVar;
        this.zzb = new AtomicInteger(0);
        zzgzo.zzr(zzcenVar, new zzces(this), zzcei.zzg);
    }
}
