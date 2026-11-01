package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzgos extends zzgpu {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzgpu
    public final zzgpu zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpu
    public final zzgpu zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpu
    public final zzgpv zzc() {
        return new zzgot(this.zza, this.zzb, null);
    }
}
