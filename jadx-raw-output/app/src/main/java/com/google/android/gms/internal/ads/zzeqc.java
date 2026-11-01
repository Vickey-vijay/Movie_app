package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzeqc implements com.google.android.gms.ads.internal.zzg {
    public final /* synthetic */ zzdko zza;

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
    }

    public zzeqc(zzeqd zzeqdVar, zzdko zzdkoVar) {
        this.zza = zzdkoVar;
        Objects.requireNonNull(zzeqdVar);
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        this.zza.zzc().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        zzdko zzdkoVar = this.zza;
        zzdkoVar.zzd().zza();
        zzdkoVar.zze().zza();
    }
}
