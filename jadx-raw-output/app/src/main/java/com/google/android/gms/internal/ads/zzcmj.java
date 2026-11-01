package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzcmj implements zzikg {
    private final zzcmc zza;

    private zzcmj(zzcmc zzcmcVar) {
        this.zza = zzcmcVar;
    }

    public static zzcmj zzc(zzcmc zzcmcVar) {
        return new zzcmj(zzcmcVar);
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }

    public static Context zzd(zzcmc zzcmcVar) {
        Context contextZza = zzcmcVar.zza();
        zziko.zzb(contextZza);
        return contextZza;
    }
}
