package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzcug implements zzikg {
    private final zzcue zza;

    private zzcug(zzcue zzcueVar) {
        this.zza = zzcueVar;
    }

    public static zzcug zzc(zzcue zzcueVar) {
        return new zzcug(zzcueVar);
    }

    public final View zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }

    public static View zzd(zzcue zzcueVar) {
        View viewZzb = zzcueVar.zzb();
        zziko.zzb(viewZzb);
        return viewZzb;
    }
}
