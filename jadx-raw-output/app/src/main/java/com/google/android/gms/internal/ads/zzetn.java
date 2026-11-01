package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzetn implements zzikg {
    private final zzikp zza;

    private zzetn(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzetn zza(zzikp zzikpVar) {
        return new zzetn(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzetm((Set) this.zza.zzb());
    }
}
