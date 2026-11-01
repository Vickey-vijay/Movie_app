package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdkc implements zzikg {
    private final zzikp zza;

    private zzdkc(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdkc zza(zzikp zzikpVar) {
        return new zzdkc(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdkb(((zziks) this.zza).zzb());
    }
}
