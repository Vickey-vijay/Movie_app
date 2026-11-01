package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeug implements zzikg {
    private final zzikp zza;

    private zzeug(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzeug zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzeug(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeue zzb() {
        return new zzeue(zzfmk.zzc(), (zzcdu) this.zza.zzb());
    }
}
