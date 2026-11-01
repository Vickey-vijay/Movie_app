package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzcmi implements zzikg {
    private final zzikp zza;

    private zzcmi(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcmi zza(zzikp zzikpVar) {
        return new zzcmi(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = ((zzcmj) this.zza).zza().getApplicationInfo();
        zziko.zzb(applicationInfo);
        return applicationInfo;
    }
}
