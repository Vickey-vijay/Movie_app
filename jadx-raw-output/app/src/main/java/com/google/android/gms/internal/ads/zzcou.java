package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzcou implements com.google.android.gms.ads.nonagon.signalgeneration.zzab {
    private final zzcnp zza;
    private zzdao zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzay zzc;

    public /* synthetic */ zzcou(zzcnp zzcnpVar, byte[] bArr) {
        this.zza = zzcnpVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzac zza() {
        zziko.zzc(this.zzb, zzdao.class);
        zziko.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzay.class);
        return new zzcov(this.zza, this.zzc, new zzcxl(), new zzczm(), new zzdyo(), this.zzb, null, null);
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzab zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzay zzayVar) {
        this.zzc = zzayVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzab zzc(zzdao zzdaoVar) {
        this.zzb = zzdaoVar;
        return this;
    }
}
