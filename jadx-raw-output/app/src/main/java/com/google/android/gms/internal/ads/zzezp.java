package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzezp implements zzikg {
    private final zzikp zza;

    private zzezp(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzezp zza(zzikp zzikpVar) {
        return new zzezp(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzezn(((zzdar) this.zza).zza());
    }
}
