package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzedn implements zzikg {
    private final zzikp zza;

    private zzedn(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzedn zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzedn(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeej zzb() {
        return new zzeej((Context) this.zza.zzb(), zzfmk.zzc());
    }
}
