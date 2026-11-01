package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzeeo extends zzbzk {
    public final /* synthetic */ zzeeq zza;

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzeeq zzeeqVar = this.zza;
        zzeeqVar.zza.zzc(new zzefg(autoCloseInputStream, zzeeqVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zza.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbzu zzbzuVar) {
        this.zza.zza.zzc(new zzefg(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbzuVar));
    }

    public zzeeo(zzeeq zzeeqVar) {
        Objects.requireNonNull(zzeeqVar);
        this.zza = zzeeqVar;
    }
}
