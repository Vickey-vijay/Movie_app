package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfqy extends zzbez {
    public final /* synthetic */ zzhah zza;
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzft zzb;
    public final /* synthetic */ zzfqz zzc;

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzc(int i10) {
    }

    public zzfqy(zzfqz zzfqzVar, zzhah zzhahVar, com.google.android.gms.ads.internal.client.zzft zzftVar) {
        this.zza = zzhahVar;
        this.zzb = zzftVar;
        Objects.requireNonNull(zzfqzVar);
        this.zzc = zzfqzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzb(zzbex zzbexVar) {
        Objects.requireNonNull(this.zzc);
        zzfqt.zza(zzbexVar, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String string = zzeVar.zzb().toString();
        String str = this.zzb.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 60 + String.valueOf(str).length());
        sb2.append("Failed to load app open ad with error parcel: ");
        sb2.append(string);
        sb2.append(" for ad unit: ");
        sb2.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        zzfqz zzfqzVar = this.zzc;
        Objects.requireNonNull(zzfqzVar);
        zzfqzVar.zzD(zzeVar);
    }
}
