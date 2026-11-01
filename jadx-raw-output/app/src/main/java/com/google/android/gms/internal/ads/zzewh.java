package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzewh implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzewh(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzewh zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzewh(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfiq((Clock) this.zza.zzb(), (zzdxz) this.zzb.zzb());
    }
}
