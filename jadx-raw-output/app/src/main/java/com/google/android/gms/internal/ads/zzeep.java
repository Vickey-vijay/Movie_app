package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzeep extends zzbzk {
    private final zzcen zza;
    private final zzbzu zzb;

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new zzefg(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbzu zzbzuVar) {
        this.zza.zzc(new zzefg(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbzuVar));
    }

    public zzeep(zzcen zzcenVar, zzbzu zzbzuVar) {
        this.zza = zzcenVar;
        this.zzb = zzbzuVar;
    }
}
