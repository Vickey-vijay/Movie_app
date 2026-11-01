package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdlg implements zzikg {
    private final zzikp zza;

    private zzdlg(zzdkr zzdkrVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdlg zza(zzdkr zzdkrVar, zzikp zzikpVar) {
        return new zzdlg(zzdkrVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdje((zzczw) this.zza.zzb(), zzcei.zzg));
        zziko.zzb(setSingleton);
        return setSingleton;
    }
}
