package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdjc implements zzikg {
    private final zzikp zza;

    private zzdjc(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdjc zza(zzikp zzikpVar) {
        return new zzdjc(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdjb(((zziks) this.zza).zzb());
    }
}
