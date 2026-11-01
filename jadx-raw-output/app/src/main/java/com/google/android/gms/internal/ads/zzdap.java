package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdap implements zzikg {
    private final zzdao zza;
    private final zzikp zzb;

    private zzdap(zzdao zzdaoVar, zzikp zzikpVar) {
        this.zza = zzdaoVar;
        this.zzb = zzikpVar;
    }

    public static zzdap zza(zzdao zzdaoVar, zzikp zzikpVar) {
        return new zzdap(zzdaoVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return this.zza.zzg((String) this.zzb.zzb());
    }
}
