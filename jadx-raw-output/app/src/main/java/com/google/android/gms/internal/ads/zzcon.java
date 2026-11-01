package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzcon implements zzegd {
    private final zzcnp zza;
    private final zzcom zzb;
    private zzeek zzc;

    public /* synthetic */ zzcon(zzcnp zzcnpVar, zzcom zzcomVar, byte[] bArr) {
        this.zza = zzcnpVar;
        this.zzb = zzcomVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegd
    public final zzege zza() {
        zziko.zzc(this.zzc, zzeek.class);
        return new zzcoo(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzegd
    public final /* bridge */ /* synthetic */ zzegd zzb(zzeek zzeekVar) {
        this.zzc = zzeekVar;
        return this;
    }
}
