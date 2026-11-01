package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdjr implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdjr(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdjr zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdjr(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdjq(((zzcww) this.zza).zza(), (zzfqk) this.zzb.zzb());
    }
}
