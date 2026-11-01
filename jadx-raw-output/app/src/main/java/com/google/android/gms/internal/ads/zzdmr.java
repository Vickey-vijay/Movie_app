package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdmr implements zzikg {
    private final zzikp zza;

    private zzdmr(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdmr zza(zzikp zzikpVar) {
        return new zzdmr(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((zzdmo) this.zza).zza().zzd() != null ? Collections.singleton("banner") : Collections.emptySet();
        zziko.zzb(setSingleton);
        return setSingleton;
    }
}
