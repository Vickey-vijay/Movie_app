package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdve implements zzikg {
    private final zzikp zza;

    private zzdve(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdve zzc(zzikp zzikpVar) {
        return new zzdve(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdvd zzb() {
        return new zzdvd((zzcjl) this.zza.zzb());
    }
}
