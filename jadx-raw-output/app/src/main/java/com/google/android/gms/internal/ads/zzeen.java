package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzeen implements zzgzl {
    public final /* synthetic */ Context zza;

    public zzeen(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        if (((Boolean) zzbiw.zzh.zze()).booleanValue() && (th2 instanceof com.google.android.gms.ads.internal.util.zzaz)) {
            zzbgp.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbiw.zzj.zze()).booleanValue()) {
            zzbgp.zze(this.zza);
        }
    }
}
