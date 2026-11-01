package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzcyf implements com.google.android.gms.ads.internal.client.zza {
    private final zzcyj zza;
    private final zzfjk zzb;

    public zzcyf(zzcyj zzcyjVar, zzfjk zzfjkVar) {
        this.zza = zzcyjVar;
        this.zzb = zzfjkVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zza(this.zzb.zzg);
    }
}
