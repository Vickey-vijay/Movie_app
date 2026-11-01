package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzdkb;
import com.google.android.gms.internal.ads.zzgzl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaw implements zzgzl {
    public final /* synthetic */ zzdkb zza;

    public zzaw(zzdkb zzdkbVar) {
        this.zza = zzdkbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        this.zza.zzb(th2.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* synthetic */ void zzb(@Nullable Object obj) {
        this.zza.zza((zzbj) obj);
    }
}
