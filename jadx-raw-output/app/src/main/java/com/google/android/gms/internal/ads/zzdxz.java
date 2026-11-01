package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdxz {
    private final zzdye zza;
    private final Executor zzb;
    private final Map zzc;

    public final /* synthetic */ zzdye zzc() {
        return this.zza;
    }

    public final /* synthetic */ Executor zzd() {
        return this.zzb;
    }

    public final /* synthetic */ Map zze() {
        return this.zzc;
    }

    public final zzdxy zza() {
        zzdxy zzdxyVar = new zzdxy(this);
        zzdxyVar.zzl();
        return zzdxyVar;
    }

    public final void zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznb)).booleanValue()) {
            zzdxy zzdxyVarZza = zza();
            zzdxyVarZza.zzc("action", "pecr");
            zzdxyVarZza.zzd();
        }
    }

    public zzdxz(zzdye zzdyeVar, Executor executor) {
        this.zza = zzdyeVar;
        this.zzc = zzdyeVar.zza();
        this.zzb = executor;
    }
}
