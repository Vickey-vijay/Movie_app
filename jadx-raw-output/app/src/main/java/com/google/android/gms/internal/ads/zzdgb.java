package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdgb implements zzikg {
    private final zzikp zza;

    private zzdgb(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdgb zza(zzikp zzikpVar) {
        return new zzdgb(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdga(((zziks) this.zza).zzb());
    }
}
