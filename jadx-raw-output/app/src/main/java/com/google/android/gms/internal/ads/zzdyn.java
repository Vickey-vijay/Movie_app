package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdyn implements zzikg {
    private final zzikp zza;

    private zzdyn(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdyn zza(zzikp zzikpVar) {
        return new zzdyn(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdym((Clock) this.zza.zzb());
    }
}
