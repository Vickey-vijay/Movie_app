package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzgom extends zzgou {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzgou
    public final zzgou zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgou
    public final zzgou zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgou
    public final zzgov zzc() {
        return new zzgon(this.zza, this.zzb, null);
    }
}
