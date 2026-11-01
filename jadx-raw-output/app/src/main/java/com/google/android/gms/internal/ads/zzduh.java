package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzduh implements zzikg {
    private final zzikp zza;

    private zzduh(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzduh zza(zzikp zzikpVar) {
        return new zzduh(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbgj.zza.EnumC0190zza enumC0190zza = ((zzdaw) this.zza).zza().zzp.zza == 3 ? zzbgj.zza.EnumC0190zza.REWARDED_INTERSTITIAL : zzbgj.zza.EnumC0190zza.REWARD_BASED_VIDEO_AD;
        zziko.zzb(enumC0190zza);
        return enumC0190zza;
    }
}
