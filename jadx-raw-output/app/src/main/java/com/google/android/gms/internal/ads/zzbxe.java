package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzbxe extends zzbly {
    public final /* synthetic */ zzbxf zza;

    @Override // com.google.android.gms.internal.ads.zzblz
    public final void zze(zzblm zzblmVar) {
        zzbxf zzbxfVar = this.zza;
        zzbxfVar.zzd().onCustomFormatAdLoaded(zzbxfVar.zzc(zzblmVar));
    }

    public /* synthetic */ zzbxe(zzbxf zzbxfVar, byte[] bArr) {
        Objects.requireNonNull(zzbxfVar);
        this.zza = zzbxfVar;
    }
}
